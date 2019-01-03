package com.yscredit.modules.app.service;

import com.github.pagehelper.PageInfo;
import com.yscredit.common.page.Page;
import com.yscredit.common.util.Effect;
import com.yscredit.modules.app.entity.DcDatabaseMsgEntity;

import java.util.Map;

/**
 * 数据源表
 *
 * @author buwei
 * @email jiangyun@yscredit.com
 * @date 2019-01-02 17:36:14
 */
public interface DcDatabaseMsgService {

    PageInfo queryPage(Page page);

    void insert(DcDatabaseMsgEntity dcDatabaseMsgEntity);

    void update(DcDatabaseMsgEntity dcDatabaseMsgEntity);

    void delete(Integer id);

}

