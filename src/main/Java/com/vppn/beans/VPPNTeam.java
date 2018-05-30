package com.vppn.beans;

import java.util.ArrayList;
import java.util.List;

public class VPPNTeam {
	private String teamName;//组名							
	private String teamDes;//组描述
	private String proxyIp="";//代理ip
	private String subnet="";//子网
	private String userId;//用户
	private int siteCount;//router个数
	private int terminalCount;//终端个数
	private String teamId="";//组id
	
	private List<VPPNTeamMember> members=new ArrayList<VPPNTeamMember>();
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public String getTeamDes() {
		return teamDes;
	}
	public void setTeamDes(String teamDes) {
		this.teamDes = teamDes;
	}
	public String getProxyIp() {
		return proxyIp;
	}
	public void setProxyIp(String proxyIp) {
		this.proxyIp = proxyIp;
	}
	public String getSubnet() {
		return subnet;
	}
	public void setSubnet(String subnet) {
		this.subnet = subnet;
	}
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public int getSiteCount() {
		return siteCount;
	}
	public void setSiteCount(int siteCount) {
		this.siteCount = siteCount;
	}
	public int getTerminalCount() {
		return terminalCount;
	}
	public void setTerminalCount(int terminalCount) {
		this.terminalCount = terminalCount;
	}

	public String getTeamId() {
		return teamId;
	}
	public void setTeamId(String teamId) {
		this.teamId = teamId;
	}
	public List<VPPNTeamMember> getMembers() {
		return members;
	}
	public void setMembers(List<VPPNTeamMember> members) {
		this.members = members;
	}
}
