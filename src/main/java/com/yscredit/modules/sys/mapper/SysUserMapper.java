package com.yscredit.modules.sys.mapper;

import com.yscredit.datasources.MyBatis;
import com.yscredit.modules.sys.entity.SysUserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@MyBatis
@Mapper
public interface SysUserMapper {

    List<SysUserEntity> query();



}
