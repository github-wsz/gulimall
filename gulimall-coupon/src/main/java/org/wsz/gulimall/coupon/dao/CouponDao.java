package org.wsz.gulimall.coupon.dao;

import org.wsz.gulimall.coupon.entity.CouponEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 优惠券信息
 *
 * @author wsz
 * @email 2506266391@qq.com
 * @date 2022-01-17 17:18:36
 */
@Mapper
public interface CouponDao extends BaseMapper<CouponEntity> {

}
