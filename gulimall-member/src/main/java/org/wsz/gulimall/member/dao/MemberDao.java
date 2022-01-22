package org.wsz.gulimall.member.dao;

import org.wsz.gulimall.member.entity.MemberEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 会员
 *
 * @author wsz
 * @email 2506266391@qq.com
 * @date 2022-01-17 17:21:31
 */
@Mapper
public interface MemberDao extends BaseMapper<MemberEntity> {

}
