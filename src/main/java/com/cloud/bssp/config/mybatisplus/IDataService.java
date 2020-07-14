package com.cloud.bssp.config.mybatisplus;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.service.IService;
import com.cloud.bssp.constants.SystemConstant;

import java.util.List;

/**
 * Description: mybatis plus IService封装
 * Create Date: 2020/7/14
 * Modified By：
 * Modified Date：
 * Why &amp; What is modified：
 * Copyright (C) 2020 mvtech.com.cn All Right Reserved.
 * @author weirx
 * @version 1.0
 */
public interface IDataService<T> extends IService<T> {

    /**
     * Description: 对分页查询过滤已删除的
     * Created date: 2020/7/14
     * @param page
     * @param queryWrapper
     * @return E
     * @author weirx
     */
    default <E extends IPage<T>> E page(E page, QueryWrapper<T> queryWrapper) {
        queryWrapper.eq("is_delete", SystemConstant.ZERO);
        return getBaseMapper().selectPage(page, queryWrapper);
    }

    /**
     * Description: 对查询过滤已删除的
     * Created date: 2020/7/14
     * @param queryWrapper
     * @return java.util.List<T>
     * @author weirx
     */
    default List<T> list(QueryWrapper<T> queryWrapper) {
        queryWrapper.eq("is_delete", SystemConstant.ZERO);
        return getBaseMapper().selectList(queryWrapper);
    }
}
