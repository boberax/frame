package com.yscredit.modules.app.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;

import java.io.Serializable;
import java.util.Date;
import io.swagger.annotations.ApiModelProperty;


/**
 * 数据源表
 * 
 * @author buwei
 * @email jiangyun@yscredit.com
 * @date 2019-01-02 17:36:14
 */
@TableName("dc_database_msg")
public class DcDatabaseMsgEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	/**
	 * 数据源id
	 */
	@TableId
	@ApiModelProperty(value="数据源id",name="databaseId")
	private Long databaseId;
	/**
	 * 服务器IP地址
	 */
	@ApiModelProperty(value="服务器IP地址",name="databaseIp")
	private String databaseIp;
	/**
	 * 数据库名称
	 */
	@ApiModelProperty(value="数据库名称",name="databaseName")
	private String databaseName;
	/**
	 * 部门ID
	 */
	@ApiModelProperty(value="部门ID",name="departmentId")
	private String departmentId;
	/**
	 * 部门名称
	 */
	@ApiModelProperty(value="部门名称",name="departmentName")
	private String departmentName;
	/**
	 * 数据库类型
	 */
	@ApiModelProperty(value="数据库类型",name="databaseType")
	private String databaseType;
	/**
	 * 数据库用户名
	 */
	@ApiModelProperty(value="数据库用户名",name="databaseUsername")
	private String databaseUsername;
	/**
	 * 数据库密码
	 */
	@ApiModelProperty(value="数据库密码",name="databasePassword")
	private String databasePassword;
	/**
	 * 数据库端口
	 */
	@ApiModelProperty(value="数据库端口",name="databasePort")
	private String databasePort;
	/**
	 * 数据库URL
	 */
	@ApiModelProperty(value="数据库URL",name="databaseUrl")
	private String databaseUrl;
	/**
	 * 源数据源Y，目标数据源M
	 */
	@ApiModelProperty(value="源数据源Y，目标数据源M",name="type")
	private String type;
	/**
	 * 创建时间
	 */
	@ApiModelProperty(value="创建时间",name="createTime")
	private Date createTime;
	/**
	 * 数据库类型,MYSQL,ORACLE
	 */
	@ApiModelProperty(value="数据库类型,MYSQL,ORACLE",name="databaseTypecon")
	private String databaseTypecon;
	/**
	 * 是否有效Y有效,N无效
	 */
	@ApiModelProperty(value="是否有效Y有效,N无效",name="status")
	private String status;
	/**
	 * 别名
	 */
	@ApiModelProperty(value="别名",name="name")
	private String name;

	/**
	 * 设置：数据源id
	 */
	public void setDatabaseId(Long databaseId) {
		this.databaseId = databaseId;
	}
	/**
	 * 获取：数据源id
	 */
	public Long getDatabaseId() {
		return databaseId;
	}
	/**
	 * 设置：服务器IP地址
	 */
	public void setDatabaseIp(String databaseIp) {
		this.databaseIp = databaseIp;
	}
	/**
	 * 获取：服务器IP地址
	 */
	public String getDatabaseIp() {
		return databaseIp;
	}
	/**
	 * 设置：数据库名称
	 */
	public void setDatabaseName(String databaseName) {
		this.databaseName = databaseName;
	}
	/**
	 * 获取：数据库名称
	 */
	public String getDatabaseName() {
		return databaseName;
	}
	/**
	 * 设置：部门ID
	 */
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	/**
	 * 获取：部门ID
	 */
	public String getDepartmentId() {
		return departmentId;
	}
	/**
	 * 设置：部门名称
	 */
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	/**
	 * 获取：部门名称
	 */
	public String getDepartmentName() {
		return departmentName;
	}
	/**
	 * 设置：数据库类型
	 */
	public void setDatabaseType(String databaseType) {
		this.databaseType = databaseType;
	}
	/**
	 * 获取：数据库类型
	 */
	public String getDatabaseType() {
		return databaseType;
	}
	/**
	 * 设置：数据库用户名
	 */
	public void setDatabaseUsername(String databaseUsername) {
		this.databaseUsername = databaseUsername;
	}
	/**
	 * 获取：数据库用户名
	 */
	public String getDatabaseUsername() {
		return databaseUsername;
	}
	/**
	 * 设置：数据库密码
	 */
	public void setDatabasePassword(String databasePassword) {
		this.databasePassword = databasePassword;
	}
	/**
	 * 获取：数据库密码
	 */
	public String getDatabasePassword() {
		return databasePassword;
	}
	/**
	 * 设置：数据库端口
	 */
	public void setDatabasePort(String databasePort) {
		this.databasePort = databasePort;
	}
	/**
	 * 获取：数据库端口
	 */
	public String getDatabasePort() {
		return databasePort;
	}
	/**
	 * 设置：数据库URL
	 */
	public void setDatabaseUrl(String databaseUrl) {
		this.databaseUrl = databaseUrl;
	}
	/**
	 * 获取：数据库URL
	 */
	public String getDatabaseUrl() {
		return databaseUrl;
	}
	/**
	 * 设置：源数据源Y，目标数据源M
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * 获取：源数据源Y，目标数据源M
	 */
	public String getType() {
		return type;
	}
	/**
	 * 设置：创建时间
	 */
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	/**
	 * 获取：创建时间
	 */
	public Date getCreateTime() {
		return createTime;
	}
	/**
	 * 设置：数据库类型,MYSQL,ORACLE
	 */
	public void setDatabaseTypecon(String databaseTypecon) {
		this.databaseTypecon = databaseTypecon;
	}
	/**
	 * 获取：数据库类型,MYSQL,ORACLE
	 */
	public String getDatabaseTypecon() {
		return databaseTypecon;
	}
	/**
	 * 设置：是否有效Y有效,N无效
	 */
	public void setStatus(String status) {
		this.status = status;
	}
	/**
	 * 获取：是否有效Y有效,N无效
	 */
	public String getStatus() {
		return status;
	}
	/**
	 * 设置：别名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：别名
	 */
	public String getName() {
		return name;
	}
}
