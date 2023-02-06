package com.user.repo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.user.model.UserDetail;

@Repository
public class UserRepo {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	// JDBCTEmplte internally work
	public List<UserDetail> findAll() {
		// JDBC service
		return jdbcTemplate.query("SELECT * FROM user_detail", new BeanPropertyRowMapper<UserDetail>(UserDetail.class));
	}

	public UserDetail findById(int id) {
		int count = jdbcTemplate.queryForObject("SELECT COUNT(*) FROM user_detail WHERE id=" + id, Integer.class);

		if (count > 0)
			return jdbcTemplate.queryForObject("SELECT * FROM `user_detail` WHERE id=" + id,
					new BeanPropertyRowMapper<UserDetail>(UserDetail.class));
		else {
			return new UserDetail();
		}
	}

	public int save(UserDetail userDetail) {
		// TODO Auto-generated method stub
		return jdbcTemplate.update("INSERT INTO `user_detail` (`first_name`, `last_name`, `email`, `dob`) VALUES ('"
				+ userDetail.getFirstName() + "', '" + userDetail.getLastName() + "','" + userDetail.getEmail() + "', '"
				+ userDetail.getDob() + "');" + "");

	}

	public int update(int id, UserDetail userDetail) {
		String sql = "update `user_detail` SET first_name='" + userDetail.getFirstName() + "',last_name='"
				+ userDetail.getLastName() + "',email='" + userDetail.getEmail() + "',dob='" + userDetail.getDob()
				+ "' WHERE id=" + id;
		return jdbcTemplate.update(sql);

	}

	public int delete(int id) {
		return jdbcTemplate.update("delete from user_detail WHERE id=" + id);
	}

}
