package kl.api;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class UserCertificate {
	
	private String certId;
	private String certCN;
	private String certStatus;
	private String userCertType;
	private String userSname;
	private String certNotBefore;
	private String certNotAfter;
	public UserCertificate() {
	}
	
	public UserCertificate(String certId, String certCN,String certStatus) {
		this.certId = certId;
		this.certCN = certCN;
		this.certStatus = certStatus;
	}
	public String getCertId() {
		return certId;
	}
	public void setCertId(String certId) {
		this.certId = certId;
	}
	public String getCertCN() {
		return certCN;
	}

	public void setCertCN(String certCN) {
		this.certCN = certCN;
	}

	public String getCertStatus() {
		return certStatus;
	}

	public void setCertStatus(String certStatus) {
		this.certStatus = certStatus;
	}

	public String getUserCertType() {
		return userCertType;
	}

	public void setUserCertType(String userCertType) {
		this.userCertType = userCertType;
	}

	public String getUserSname() {
		return userSname;
	}

	public void setUserSname(String userSname) {
		this.userSname = userSname;
	}

	public String getCertNotBefore() {
		return certNotBefore;
	}

	public void setCertNotBefore(String certNotBefore) {
		this.certNotBefore = certNotBefore;
	}

	public String getCertNotAfter() {
		return certNotAfter;
	}

	public void setCertNotAfter(String certNotAfter) {
		this.certNotAfter = certNotAfter;
	}
	
}
