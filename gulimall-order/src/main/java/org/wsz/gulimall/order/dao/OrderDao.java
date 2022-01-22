package org.wsz.gulimall.order.dao;

import org.wsz.gulimall.order.entity.OrderEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 订单
 *
 * @author wsz
 * @email 2506266391@qq.com
 * @date 2022-01-17 17:04:38
 */
@Mapper
public interface OrderDao extends BaseMapper<OrderEntity> {

}
