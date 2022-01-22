package org.wsz.gulimall.product.service.impl;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.wsz.gulimall.common.utils.PageUtils;
import org.wsz.gulimall.common.utils.Query;

import org.wsz.gulimall.product.dao.CategoryDao;
import org.wsz.gulimall.product.entity.CategoryEntity;
import org.wsz.gulimall.product.service.CategoryService;


@Service("categoryService")
public class CategoryServiceImpl extends ServiceImpl<CategoryDao, CategoryEntity> implements CategoryService {

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        IPage<CategoryEntity> page = this.page(
                new Query<CategoryEntity>().getPage(params),
                new QueryWrapper<CategoryEntity>()
        );

        return new PageUtils(page);
    }

    @Override
    public List<CategoryEntity> listWithTree() {
        List<CategoryEntity> entities = baseMapper.selectList(null);
        return entities.stream()
                .filter(c1 -> c1.getParentCid() == 0).sorted((m1, m2) -> m1.getSort() - m2.getSort()).map(c1 -> {
                    c1.setChildren(entities.stream().filter(c2 -> c2.getParentCid() == c1.getCatId()).sorted((m1, m2) -> m1.getSort() - m2.getSort()).map(c2 -> {
                        c2.setChildren(entities.stream().filter(c3 -> c3.getParentCid() == c2.getCatId()).sorted((m1, m2) -> m1.getSort() - m2.getSort()).map(c3 -> {
                            c3.setChildren(null);
                            return c3;
                        }).collect(Collectors.toList()));
                        return c2;
                    }).collect(Collectors.toList()));
                    return c1;
                }).collect(Collectors.toList());
    }
}
