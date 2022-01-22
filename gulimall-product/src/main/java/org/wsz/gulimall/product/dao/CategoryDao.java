package org.wsz.gulimall.product.dao;

import org.wsz.gulimall.product.entity.CategoryEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品三级分类
 *
 * @author wsz
 * @email 2506266391@qq.com
 * @date 2022-01-16 05:42:39
 */
@Mapper
public interface CategoryDao extends BaseMapper<CategoryEntity> {

}
