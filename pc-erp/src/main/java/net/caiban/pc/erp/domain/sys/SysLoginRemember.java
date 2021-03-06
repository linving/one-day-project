/**
 * 
 */
package net.caiban.pc.erp.domain.sys;

import java.util.Date;

import net.caiban.pc.erp.domain.BaseDomain;

/**
 * @author mays
 *
 */
public class SysLoginRemember extends BaseDomain {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer uid;
	private Date gmtExpired;
	private String rememberToken;
	private Date gmtRefresh;
	
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public Date getGmtExpired() {
		return gmtExpired;
	}
	public void setGmtExpired(Date gmtExpired) {
		this.gmtExpired = gmtExpired;
	}
	public String getRememberToken() {
		return rememberToken;
	}
	public void setRememberToken(String rememberToken) {
		this.rememberToken = rememberToken;
	}
	public Date getGmtRefresh() {
		return gmtRefresh;
	}
	public void setGmtRefresh(Date gmtRefresh) {
		this.gmtRefresh = gmtRefresh;
	}

}
