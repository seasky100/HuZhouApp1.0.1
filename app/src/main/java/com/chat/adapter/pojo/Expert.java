package com.chat.adapter.pojo;

import java.io.Serializable;

import com.database.pojo.ExpertTable;
import com.database.pojo.UserInfoTable;
import com.database.pojo.UserTable;

public class Expert implements Serializable
{
	private static final long serialVersionUID = 3571271783225845399L;
	
	private ExpertTable expert;
	private UserTable expertInfo;
	private UserInfoTable expertUserInfo;
	
	public Expert(ExpertTable expert, UserTable expertInfo, UserInfoTable expertUserInfo)
	{
		setExpert(expert);
		setExpertInfo(expertInfo);
		setExpertUserInfo(expertUserInfo);
	}
	
	public ExpertTable getExpert()
	{
		return expert;
	}
	public void setExpert(ExpertTable expert)
	{
		this.expert = expert;
	}
	public UserTable getExpertInfo()
	{
		return expertInfo;
	}
	public void setExpertInfo(UserTable expertInfo)
	{
		this.expertInfo = expertInfo;
	}
	public UserInfoTable getExpertUserInfo()
	{
		return expertUserInfo;
	}
	public void setExpertUserInfo(UserInfoTable expertUserInfo)
	{
		this.expertUserInfo = expertUserInfo;
	}
}