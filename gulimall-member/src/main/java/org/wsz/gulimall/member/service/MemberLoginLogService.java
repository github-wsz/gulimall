package org.wsz.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.wsz.gulimall.common.utils.PageUtils;
import org.wsz.gulimall.member.entity.MemberLoginLogEntity;

import java.util.Map;

/**
 * 会员登录记录
 *
 * @author wsz
 * @email 2506266391@qq.com
 * @date 2022-01-17 17:21:31
 */
public interface MemberLoginLogService extends IService<MemberLoginLogEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

