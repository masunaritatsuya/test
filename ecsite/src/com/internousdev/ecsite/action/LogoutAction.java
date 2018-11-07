package com.internousdev.ecsite.action;

import java.util.Map;
public class LogoutAction extends ActionSupport implements SessionAware{
	public Map<String,Object>session;
	public String execute(){
		session.clear();
		return SUCCESS;
	}
	@Override
	public void setSession(Map<String,Object> session){
		this.session=session;
	}
}
