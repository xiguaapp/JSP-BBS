package com.xiguaapp.Srevice.Impl;

import java.util.List;

import com.xiguaapp.Srevice.BBSReplysSrevice;
import com.xiguaapp.dao.BBSReplysDao;
import com.xiguaapp.dao.impl.BBSReplysDaoImpl;
import com.xiguaapp.javaBean.BBSReplys;

public class BBSReplysSreviceImpl implements BBSReplysSrevice{
BBSReplysDao bd=new BBSReplysDaoImpl();
	@Override
	public List<BBSReplys> getReplys(int rtid) {
		// TODO Auto-generated method stub
		return bd.getReplys(rtid);
	}

	@Override
	public int replys(BBSReplys bbsReplys) {
		// TODO Auto-generated method stub
		return bd.replys(bbsReplys);
	}

}
