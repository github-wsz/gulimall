package org.wsz.gulimall.coupon.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.wsz.gulimall.common.utils.PageUtils;
import org.wsz.gulimall.coupon.entity.SkuBoundsEntity;

import java.util.Map;

/**
 * 商品sku积分设置
 *
 * @author wsz
 * @email 2506266391@qq.com
 * @date 2022-01-17 17:18:36
 */
public interface SkuBoundsService extends IService<SkuBoundsEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

