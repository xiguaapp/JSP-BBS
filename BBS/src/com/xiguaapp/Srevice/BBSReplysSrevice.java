package com.xiguaapp.Srevice;

import java.util.List;

import com.xiguaapp.javaBean.BBSReplys;

public interface BBSReplysSrevice {
	List<BBSReplys> getReplys(int rtid);
	int replys(BBSReplys bbsReplys);
}
