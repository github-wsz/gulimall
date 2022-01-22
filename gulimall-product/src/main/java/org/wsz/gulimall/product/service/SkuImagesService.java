package org.wsz.gulimall.product.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.wsz.gulimall.common.utils.PageUtils;
import org.wsz.gulimall.product.entity.SkuImagesEntity;

import java.util.Map;

/**
 * sku图片
 *
 * @author wsz
 * @email 2506266391@qq.com
 * @date 2022-01-16 05:42:39
 */
public interface SkuImagesService extends IService<SkuImagesEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

