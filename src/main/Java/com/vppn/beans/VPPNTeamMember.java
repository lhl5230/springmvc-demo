package com.vppn.beans;

public class VPPNTeamMember {
	private String teamId;//组id							
	private String mac;//设备唯一标示
	private String ip;//分配ip
	private String lan="";//LAN
	private String wan="";//WAN
	private String proxyIp;//代理ip
	
	private String labelName="";
	
	private int status=0;//在线状态

	public String getTeamId() {
		return teamId;
	}
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getIp() {
		return ip;
	}
	public void setIp(String ip) {
		this.ip = ip;
	}
	public String getLan() {
		return lan;
	}
	public void setLan(String lan) {
		this.lan = lan;
	}
	public String getWan() {
		return wan;
	}
	public void setWan(String wan) {
		this.wan = wan;
	}
	public String getProxyIp() {
		return proxyIp;
	}
	public void setProxyIp(String proxyIp) {
		this.proxyIp = proxyIp;
	}
	public int getStatus() {
		return status;
	}
	public void setStatus(int status) {
		this.status = status;
	}
	public String getLabelName() {
		if(labelName==null||labelName.length()==0)
			setLabelName(mac);
		return labelName;
	}
	public void setLabelName(String labelName) {
		if(labelName==null||labelName.length()==0)
			labelName = mac;
		this.labelName = labelName;
	}
}
