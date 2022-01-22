package org.wsz.gulimall.coupon.dao;

import org.wsz.gulimall.coupon.entity.MemberPriceEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品会员价格
 *
 * @author wsz
 * @email 2506266391@qq.com
 * @date 2022-01-17 17:18:36
 */
@Mapper
public interface MemberPriceDao extends BaseMapper<MemberPriceEntity> {

}
