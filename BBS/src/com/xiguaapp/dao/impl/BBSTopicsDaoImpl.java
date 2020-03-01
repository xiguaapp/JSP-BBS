package com.xiguaapp.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.xiguaapp.dao.BBSTopicsDao;
import com.xiguaapp.dao.BaseDao;
import com.xiguaapp.javaBean.BBSTopics;
import com.xiguaapp.javaBean.BBSUsers;

public class BBSTopicsDaoImpl extends BaseDao implements BBSTopicsDao {

	@Override
	public List<BBSTopics> getAll() {
		String sql="SELECT * FROM bbstopics t,bbsusers s WHERE t.tuid=s.uid";
		List<BBSTopics> list=new ArrayList<BBSTopics>();
		resultSet=getAll(sql, null);
		try {
			while(resultSet.next()) {
				int id=resultSet.getInt("tid");
				int tuid=resultSet.getInt("tuid");
				String ttiString=resultSet.getString("ttitle");
				String tinfo=resultSet.getString("tinfo");
				Date ttime=resultSet.getDate("ttime");
				String unameString=resultSet.getString("uname");
			list.add(new BBSTopics(id,tuid,ttiString,tinfo,ttime,new BBSUsers(unameString)));
			}
			} catch (SQLException e) {
			// TODO: handle exception
		}finally {
			closeAll(connection, preparedStatement, resultSet);
		}
		return list;
	}

	@Override
	public int addTopic(BBSTopics bbsTopics) {
		String sql="INSERT INTO `bbs`.`bbstopics` ( `tuid`, `ttitle`, `tinfo`)VALUES(?,?,?)";
		Object[]objects= {bbsTopics.getTuid(),bbsTopics.getTtitlle(),bbsTopics.getTinfo()};
		
		return update(sql, objects);
	}

	@Override
	public List<BBSTopics> getOne(int tid) {
		String sql="SELECT * FROM bbstopics WHERE tid=?";
		Object [] objects= {tid};
		List<BBSTopics> list=new ArrayList<BBSTopics>();
		resultSet=getAll(sql, objects);
		try {
			while(resultSet.next()) {
				list.add(new BBSTopics(resultSet.getInt("tid"),resultSet.getInt("tuid"),resultSet.getString("ttitle"),resultSet.getString("tinfo")));
			}
		} catch (SQLException e) {
			// TODO: handle exception
		}finally {
			closeAll(connection, preparedStatement, resultSet);
		}
		return list;
	}

}
