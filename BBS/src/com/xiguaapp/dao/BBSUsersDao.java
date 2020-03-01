package com.xiguaapp.dao;

import java.util.List;

import com.xiguaapp.javaBean.BBSUsers;

public interface BBSUsersDao {
	List<BBSUsers> hasOne(BBSUsers bbsUsers);
	int reg(BBSUsers bbsUsers);
}
