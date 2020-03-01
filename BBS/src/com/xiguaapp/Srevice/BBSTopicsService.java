package com.xiguaapp.Srevice;

import java.util.List;

import com.xiguaapp.javaBean.BBSTopics;

public interface BBSTopicsService {
	List<BBSTopics> getAll();
	int addTopic(BBSTopics bbsTopics);
	List<BBSTopics> getOne(int tid);
}
