package org.wsz.gulimall.product.dao;

import org.wsz.gulimall.product.entity.CommentReplayEntity;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;

/**
 * 商品评价回复关系
 *
 * @author wsz
 * @email 2506266391@qq.com
 * @date 2022-01-16 05:42:40
 */
@Mapper
public interface CommentReplayDao extends BaseMapper<CommentReplayEntity> {

}
