package com.xiguaapp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class BaseDao
{
	private String driver="com.mysql.jdbc.Driver";
	private String url="jdbc:mysql://localhost:3306/bbs";
	private String name="root";
	private String pwd="l123456";
	protected Connection connection=null;
	protected PreparedStatement preparedStatement=null;
	protected ResultSet resultSet=null;
	public Connection getConnection() {
		try {
			if(connection==null||connection.isClosed()) {
				Class.forName(driver);
				connection=DriverManager.getConnection(url,name,pwd);
			}
		} catch (SQLException | ClassNotFoundException e) {
			// TODO: handle exception
		}
		return connection;
	}
	public void closeAll(Connection connection,PreparedStatement preparedStatement,ResultSet resultSet) {
	
			try {
				if(resultSet!=null) resultSet.close();
				if(preparedStatement!=null) preparedStatement.close();
				if(connection!=null) connection.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
	}
	public int update(String sql,Object[] objects) {
		int num=-1;
		try {
			connection=getConnection();
			preparedStatement=connection.prepareStatement(sql);
			if(objects!=null) {
				for(int i=0;i<objects.length;i++) {
					preparedStatement.setObject((i+1), objects[i]);
				}
			}
			num=preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO: handle exception
		}finally {
			closeAll(connection, preparedStatement, resultSet);
		}
		return num;
	}
	public ResultSet getAll(String sql,Object[]objects) {
		try {
			connection=getConnection();
			preparedStatement=connection.prepareStatement(sql);
			if(objects!=null) {
				for(int i=0;i<objects.length;i++) {
				preparedStatement.setObject((i+1), objects[i]);
			}
			}
			resultSet=preparedStatement.executeQuery();
		} catch (SQLException e) {
			// TODO: handle exception
		}
		return resultSet;
	}
}
