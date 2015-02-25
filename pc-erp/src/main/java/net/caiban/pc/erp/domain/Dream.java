/**
 * 
 */
package net.caiban.pc.erp.domain;

import java.util.Date;

/**
 * @author parox
 *
 */
public class Dream extends BaseDomain{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private String email;
	private Integer uid;
	private String details;
	private String sendResult;
	private Date gmtSend;
	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Integer getUid() {
		return uid;
	}
	public void setUid(Integer uid) {
		this.uid = uid;
	}
	public String getDetails() {
		return details;
	}
	public void setDetails(String details) {
		this.details = details;
	}
	public String getSendResult() {
		return sendResult;
	}
	public void setSendResult(String sendResult) {
		this.sendResult = sendResult;
	}
	public Date getGmtSend() {
		return gmtSend;
	}
	public void setGmtSend(Date gmtSend) {
		this.gmtSend = gmtSend;
	}
	
	
}
