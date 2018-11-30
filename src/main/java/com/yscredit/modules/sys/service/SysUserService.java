package com.yscredit.modules.sys.service;

import com.github.pagehelper.PageInfo;
import com.yscredit.common.page.Page;
import com.yscredit.modules.sys.entity.SysUserEntity;

public interface SysUserService {
    SysUserEntity queryByUserName();
    PageInfo<SysUserEntity> queryPage(Page page);


}
