package com.yscredit.modules.app.dao;

import com.yscredit.modules.app.entity.DcDatabaseMsgEntity;
import org.apache.ibatis.annotations.Mapper;
import com.yscredit.datasources.MyBatis;

import java.util.List;


/**
 * 数据源表
 * 
 * @author buwei
 * @email jiangyun@yscredit.com
 * @date 2019-01-02 17:36:14
 */
@Mapper
@MyBatis
public interface DcDatabaseMsgMapper {

	List<DcDatabaseMsgEntity> query();

	Integer insert(DcDatabaseMsgEntity dcDatabaseMsgEntity);

	Integer update(DcDatabaseMsgEntity dcDatabaseMsgEntity);

	Integer delete(Integer id);

}
