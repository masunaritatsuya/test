package com.internousdev.ecsite.action;

import java.util.Map;
import org.apache.struts2.interceptor.SessionAware;
import com.opensymphony.xwork2.ActionSupport;


public class itemCreateConfirmAction extends ActionSupport implements SessionAware{

	private String itemName;
	private String itemPrice;
	private String itemStock;
	public Map<String,Object>session;
	private String errorMessage;



	public String execute() {
		String result=SUCCESS;

		if(!(itemName.equals(""))&&!(itemPrice.equals(""))&&!(itemStock.equals(""))){
			session.put("itemName",itemName);
			session.put("itemPrice", itemPrice);
			session.put("itemStock", itemStock);
		}else{
			setErrorMessage("未入力項目があります。");
			result=ERROR;
		}
		return result;
		}

	public String

}
