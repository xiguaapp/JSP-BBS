package com.xiguaapp.Srevice.Impl;

import java.util.List;

import com.xiguaapp.Srevice.BBSTopicsService;
import com.xiguaapp.dao.BBSTopicsDao;
import com.xiguaapp.dao.impl.BBSTopicsDaoImpl;
import com.xiguaapp.javaBean.BBSTopics;

public class BBSTopicsServiceImpl implements BBSTopicsService {
	BBSTopicsDao bd=new BBSTopicsDaoImpl();
	@Override
	public List<BBSTopics> getAll() {
		// TODO Auto-generated method stub
		return bd.getAll();
	}

	@Override
	public int addTopic(BBSTopics bbsTopics) {
		// TODO Auto-generated method stub
		return bd.addTopic(bbsTopics);
	}

	@Override
	public List<BBSTopics> getOne(int tid) {
		// TODO Auto-generated method stub
		return bd.getOne(tid);
	}

}
