package com.xiguaapp.Srevice;

import java.util.List;

import com.xiguaapp.javaBean.BBSUsers;

public interface BBSUserService {
	List<BBSUsers> hasOne(BBSUsers bbsUsers);
	int reg(BBSUsers bbsUsers);
}
