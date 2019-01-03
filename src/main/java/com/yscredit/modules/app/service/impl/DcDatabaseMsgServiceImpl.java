package com.yscredit.modules.app.service.impl;

import com.yscredit.common.util.Effect;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yscredit.common.page.Page;

import com.yscredit.modules.app.dao.DcDatabaseMsgMapper;
import com.yscredit.modules.app.entity.DcDatabaseMsgEntity;
import com.yscredit.modules.app.service.DcDatabaseMsgService;


@Service("dcDatabaseMsgService")
public class DcDatabaseMsgServiceImpl  implements DcDatabaseMsgService {

    @Autowired
    private DcDatabaseMsgMapper  DcDatabaseMsgMapper;

    @Override
    public PageInfo queryPage(Page page) {
        PageHelper.startPage(page.getPageNum(), page.getPageSize());//改写语句实现分页查询
        List<DcDatabaseMsgEntity> list = DcDatabaseMsgMapper.query();
        PageInfo<DcDatabaseMsgEntity> pages= new  PageInfo<>(list);
        return pages;
    }

    @Override
    public void insert(DcDatabaseMsgEntity dcDatabaseMsgEntity) {
        DcDatabaseMsgMapper.insert(dcDatabaseMsgEntity);
    }

    @Override
    public void update(DcDatabaseMsgEntity dcDatabaseMsgEntity) {
        DcDatabaseMsgMapper.update(dcDatabaseMsgEntity);
    }

    @Override
    public void delete(Integer id) {
        DcDatabaseMsgMapper.delete(id);
    }
}
