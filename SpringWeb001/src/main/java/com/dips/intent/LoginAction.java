package com.dips.intent;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

import org.springframework.validation.BindException;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.SimpleFormController;

public class LoginAction extends SimpleFormController {
	private String fail_view;
	private String success_view;
	protected ModelAndView onSubmit(Object cmd,	BindException ex)throws Exception{
		LoginInfo loginfo=(LoginInfo)cmd;
		if(login(loginfo)==0){
			HashMap result_map=new HashMap();
			result_map.put("loginfo",loginfo);
			List msgList=new LinkedList();
			msgList.add("msg1");
			msgList.add("msg2");
			msgList.add("msg3");
			result_map.put("messages", msgList);
			return new ModelAndView(this.getSuccess_view(),result_map);
		}else{
			return new ModelAndView(this.getFail_view());
		}
		
	}
	private int login(LoginInfo loginInfo){
		if("Erica".equals(loginInfo.getUsername())&&"mypass".equals(loginInfo.getPassword())){
			return 0;
		}
		return 1;
	}
	public String getFail_view() {
		return fail_view;
	}
	public void setFail_view(String fail_view) {
		this.fail_view = fail_view;
	}
	public String getSuccess_view() {
		return success_view;
	}
	public void setSuccess_view(String success_view) {
		this.success_view = success_view;
	}

}
