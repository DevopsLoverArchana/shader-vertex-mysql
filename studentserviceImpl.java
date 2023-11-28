package com.example.studentdatabase.serviceImpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.exampl.studentdatabase.DBUtil.DBUtil;
import com.example.studentdatabase.model.student;
import com.example.studentdatabase.service.studentservice;

@Service
public class studentserviceImpl implements studentservice{

	@Autowired
	static List<student> studentlist=new ArrayList();
	
	
	Connection connection;
	public studentserviceImpl() throws SQLException
	{
		connection=DBUtil.getConnection();
	}
	
	@Override
	public List<student> getStudentData() {
		
		try {
			PreparedStatement stmt=connection.prepareStatement("SELECT * FROM studentdata");
			
			ResultSet rs=stmt.executeQuery();
			while(rs.next()) {
				student stud=new student();
				stud.setId(rs.getInt(1));
				stud.setName(rs.getString(2));
				stud.setAddress(rs.getString(3));
				stud.setemailid(rs.getString(4));
				stud.setBranch(rs.getString(5));
				studentlist.add(stud);
				
				
			}
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		return studentlist;
		
	}

	
	
}
