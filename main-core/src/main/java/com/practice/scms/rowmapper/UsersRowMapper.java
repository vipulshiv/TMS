package com.practice.scms.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.practice.scms.model.User;
/**
 * UserRowMapper class implements RowMapper to fetch the records from the database 
 * @author Vipul-win
 *
 */

public class UsersRowMapper implements RowMapper<User>{

	public User mapRow(ResultSet rs, int rowNum) throws SQLException {
		User user = new User();
		user.setId(rs.getInt("id"));
		user.setName(rs.getString("name"));
		user.setContact(rs.getString("contact"));
		user.setAddress(rs.getString("address"));
		user.setEmail(rs.getString("email"));
		user.setLoginname(rs.getString("loginname"));
		user.setStatus(rs.getInt("status"));
		user.setPassword(rs.getString("password"));
		
		return user;
		
	}

}
