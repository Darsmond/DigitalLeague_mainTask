package hello;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

class UserRowMapper implements RowMapper<User> {

@Override
public User mapRow(ResultSet rs, int rowNum) throws SQLException {
User user = new User();
user.setId(rs.getInt("user_id"));
user.setName(rs.getString("user_name"));
user.setDate(rs.getDate("user_birthday"));
user.setMark(rs.getBoolean("user_active"));

return user;
}
}