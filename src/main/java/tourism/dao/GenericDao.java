package tourism.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import java.io.Serializable;

import java.util.List;

@Repository
public class GenericDao<T extends Serializable> {

    @Autowired
    JdbcTemplate jdbcTemplate;

    String SQLSelectAll = "select * from myschema.users";

    public List<T> selectAll(BeanPropertyRowMapper mapper) {
        return jdbcTemplate.query(SQLSelectAll, mapper);
    }

}