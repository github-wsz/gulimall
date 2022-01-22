package org.wsz.gulimall.member.service;

import com.baomidou.mybatisplus.extension.service.IService;
import org.wsz.gulimall.common.utils.PageUtils;
import org.wsz.gulimall.member.entity.MemberLevelEntity;

import java.util.Map;

/**
 * 会员等级
 *
 * @author wsz
 * @email 2506266391@qq.com
 * @date 2022-01-17 17:21:31
 */
public interface MemberLevelService extends IService<MemberLevelEntity> {

    PageUtils queryPage(Map<String, Object> params);
}

