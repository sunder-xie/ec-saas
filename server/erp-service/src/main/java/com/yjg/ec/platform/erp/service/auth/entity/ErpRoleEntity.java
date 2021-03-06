package com.yjg.ec.platform.erp.service.auth.entity;

import java.util.Date;

public class ErpRoleEntity {

	private String role_name;

	private String description;

	/**
	 * 是否绑定，页面使用，1：绑定，0：未绑定
	 */
	private Integer bindFlag;

	/**
	 * 有效状态（页面显示）
	 */
	private String statusName;

	private Integer id;

	private String code;

	private Integer create_id;

	private Date create_time;

	private Integer modify_id;

	private Date modify_time;

	private Integer status = 1;

	public String getRole_name() {
		return role_name;
	}

	public void setRole_name(String role_name) {
		this.role_name = role_name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getBindFlag() {
		return bindFlag;
	}

	public void setBindFlag(Integer bindFlag) {
		this.bindFlag = bindFlag;
	}

	public String getStatusName() {
		return statusName;
	}

	public void setStatusName(String statusName) {
		this.statusName = statusName;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public Integer getCreate_id() {
		return create_id;
	}

	public void setCreate_id(Integer create_id) {
		this.create_id = create_id;
	}

	public Date getCreate_time() {
		return create_time;
	}

	public void setCreate_time(Date create_time) {
		this.create_time = create_time;
	}

	public Integer getModify_id() {
		return modify_id;
	}

	public void setModify_id(Integer modify_id) {
		this.modify_id = modify_id;
	}

	public Date getModify_time() {
		return modify_time;
	}

	public void setModify_time(Date modify_time) {
		this.modify_time = modify_time;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

}
