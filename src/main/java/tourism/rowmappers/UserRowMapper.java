package tourism.rowmappers;

import tourism.entity.User;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

public class UserRowMapper extends BeanPropertyRowMapper {

    @Override
    public User mapRow(ResultSet rs, int rowNum) throws SQLException {
        User user = new User();
        user.setUserId(rs.getInt("user_id"));
        user.setName(rs.getString("first_name"));
        user.setDate(rs.getDate("birthday"));
        user.setMark(rs.getBoolean("active"));
        return user;
    }

}