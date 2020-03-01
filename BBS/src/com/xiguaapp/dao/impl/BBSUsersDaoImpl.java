package com.xiguaapp.dao.impl;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.xiguaapp.dao.BBSUsersDao;
import com.xiguaapp.dao.BaseDao;
import com.xiguaapp.javaBean.BBSUsers;

public class BBSUsersDaoImpl extends BaseDao implements BBSUsersDao{

	@Override
	public List<BBSUsers> hasOne(BBSUsers bbsUsers) {
		String sql="select * from BBSUsers where upassword=? and uname=?";
		Object[] objects= {bbsUsers.getUpassword(),bbsUsers.getUname()};
		resultSet= getAll(sql, objects);
		List<BBSUsers> list=new ArrayList<BBSUsers>();
		try {
			while(resultSet.next()) {
				list.add(new BBSUsers(resultSet.getInt("uid"),resultSet.getString("uname"),resultSet.getString("upassword"),resultSet.getString("uemail"),resultSet.getBoolean("usex"),resultSet.getDate("uregdate")));
			}
			
		} catch (SQLException e) {
			// TODO: handle exception
		}finally {
			closeAll(connection, preparedStatement, resultSet);
		}
		return list;
	}

	@Override
	public int reg(BBSUsers bbsUsers) {
		String sql="INSERT INTO `bbs`.`bbsusers` (uname,upassword,uemail,usex,uregdate)VALUES(?,?,?,?,?);";
		Object[]objects= {bbsUsers.getUname(),bbsUsers.getUpassword(),bbsUsers.getUeamil(),bbsUsers.isUsex(),bbsUsers.getUregDate()};
		return update(sql, objects);
	}

}
