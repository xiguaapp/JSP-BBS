package com.xiguaapp.dao;

import java.util.List;

import com.xiguaapp.javaBean.BBSTopics;

public interface BBSTopicsDao 
{
	List<BBSTopics> getAll();
	int addTopic(BBSTopics bbsTopics);
	List<BBSTopics> getOne(int tid);
}
