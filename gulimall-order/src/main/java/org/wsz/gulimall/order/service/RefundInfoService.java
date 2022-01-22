package org.wsz.gulimall.order.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.wsz.gulimall.common.utils.PageUtils;
import org.wsz.gulimall.order.entity.RefundInfoEntity;

import java.util.Map;

/**
 * 退款信息
 *
 * @author wsz
 * @email 2506266391@qq.com
 * @date 2022-01-17 17:04:38
 */
public interface RefundInfoService extends IService<RefundInfoEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

