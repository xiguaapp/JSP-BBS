package com.xiguaapp.dao;

import java.util.List;

import com.xiguaapp.javaBean.BBSReplys;

public interface BBSReplysDao
{
	List<BBSReplys> getReplys(int rtid);
	int replys(BBSReplys bbsReplys);
	
}
