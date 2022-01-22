package org.wsz.gulimall.order.dao;

import org.wsz.gulimall.order.entity.OrderItemEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单项信息
 *
 * @author wsz
 * @email 2506266391@qq.com
 * @date 2022-01-17 17:04:38
 */
@Mapper
public interface OrderItemDao extends BaseMapper<OrderItemEntity> {

}
