package com.yscredit.modules.sys.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.yscredit.common.page.Page;
import com.yscredit.modules.sys.entity.SysUserEntity;
import com.yscredit.modules.sys.mapper.SysUserMapper;
import com.yscredit.modules.sys.service.SysUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserServiceImpl implements SysUserService {

    @Autowired
    private SysUserMapper sysUserMapper;

    @Override
    public SysUserEntity queryByUserName() {
        return sysUserMapper.query().get(0);
    }

    @Override
    public PageInfo<SysUserEntity> queryPage(Page page) {
        PageHelper.startPage(1, 3);//改写语句实现分页查询
        List<SysUserEntity> sysUserEntities = sysUserMapper.query();
        PageInfo<SysUserEntity> pages = new PageInfo<>(sysUserEntities);
        return pages;
    }

}
