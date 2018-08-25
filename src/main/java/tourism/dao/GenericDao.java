package tourism.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import java.io.Serializable;

import java.util.*;

@Repository
public class GenericDao<T extends Serializable> {

    @Autowired
    JdbcTemplate jdbcTemplate;

    String SQLSelectAll = "select tours.* from ((myschema.users inner join myschema.orders on users.user_id = orders.user_id) left join myschema.tours on orders.tour_id = tours.tour_id) where users.user_id = 18";

    public List<T> selectAll(BeanPropertyRowMapper mapper) {
        return jdbcTemplate.query(SQLSelectAll, mapper);
    }

}
