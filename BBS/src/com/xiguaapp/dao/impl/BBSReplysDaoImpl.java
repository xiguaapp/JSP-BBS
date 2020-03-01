package com.xiguaapp.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xiguaapp.dao.BBSReplysDao;
import com.xiguaapp.dao.BaseDao;
import com.xiguaapp.javaBean.BBSReplys;
import com.xiguaapp.javaBean.BBSUsers;

public class BBSReplysDaoImpl  extends BaseDao implements BBSReplysDao{

	@Override
	public List<BBSReplys> getReplys(int rtid) {
		String sql="\r\n" + 
				"SELECT * FROM bbsreplys rep JOIN bbsusers users ON users.uid=rep.ruid\r\n" + 
				" WHERE rep.rtid=?";
		Object[]objects= {rtid};
		resultSet=getAll(sql, objects);
		List<BBSReplys> list=new ArrayList<BBSReplys>();
		try {
			while(resultSet.next()) {
				
				list.add(new BBSReplys(resultSet.getInt("rid"),resultSet.getInt("rtid"),new BBSUsers(resultSet.getInt("ruid"),resultSet.getString("uname")),resultSet.getString("rinfo")));
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}finally {
			closeAll(connection, preparedStatement, resultSet);
		}
		return list;
	}

	@Override
	public int replys(BBSReplys bbsReplys) {
	String sql="INSERT INTO `bbs`.`bbsreplys`(`rtid`,`ruid`,`rinfo`)VALUES(?,?,?)";
	Object[] objects= {bbsReplys.getRtid(),bbsReplys.getRuid(),bbsReplys.getRinfo()};
		return update(sql, objects);
	}

	
}
