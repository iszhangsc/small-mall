package com.small.pms.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.small.pms.entity.CommentReplayEntity;
import com.small.core.vo.PageVO;
import com.small.core.bean.QueryCondition;


/**
 * <p>
 *   商品评价回复关系
 * </p>
 *
 * @author zhangshichang
 * @email iszhangsc@gamil.com
 * @date 2020-02-13 22:28:29
 */
public interface CommentReplayService extends IService<CommentReplayEntity> {

    PageVO<CommentReplayEntity> queryPage(QueryCondition params);
}
