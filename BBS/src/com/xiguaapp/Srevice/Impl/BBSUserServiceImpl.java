package com.xiguaapp.Srevice.Impl;

import java.util.List;

import com.xiguaapp.Srevice.BBSUserService;
import com.xiguaapp.dao.BBSUsersDao;
import com.xiguaapp.dao.impl.BBSUsersDaoImpl;
import com.xiguaapp.javaBean.BBSUsers;

public class BBSUserServiceImpl implements BBSUserService {
BBSUsersDao bd=new BBSUsersDaoImpl();
	@Override
	public List<BBSUsers> hasOne(BBSUsers bbsUsers) {
		// TODO Auto-generated method stub
		return bd.hasOne(bbsUsers);
	}

	@Override
	public int reg(BBSUsers bbsUsers) {
		// TODO Auto-generated method stub
		return bd.reg(bbsUsers);
	}

}
