package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

import java.util.List;

@Repository
public class UserDao {

@Autowired
JdbcTemplate jdbcTemplate;

String SQLSelectAll = "select * from cms.users";
String SQLSelectActive = "select * from cms.users where user_active=true";

public List<User> selectAll() {

return jdbcTemplate.query(SQLSelectAll, new UserRowMapper());

}

public List<User> selectActiveUsers() {

return jdbcTemplate.query(SQLSelectActive, new UserRowMapper());

}

}
