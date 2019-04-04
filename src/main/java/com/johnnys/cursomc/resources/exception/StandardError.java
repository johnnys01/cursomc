package com.johnnys.cursomc.resources.exception;

import java.io.Serializable;

public class StandardError implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	private Integer status;
	private String msng;
	private Long timeStamp;
	
	public StandardError(Integer status, String msng, Long timeStamp) {
		super();
		this.status = status;
		this.msng = msng;
		this.timeStamp = timeStamp;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMsng() {
		return msng;
	}
	public void setMsng(String msng) {
		this.msng = msng;
	}
	public Long getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Long timeStamp) {
		this.timeStamp = timeStamp;
	}
}
