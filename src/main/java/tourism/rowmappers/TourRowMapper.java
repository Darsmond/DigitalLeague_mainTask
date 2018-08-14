package tourism.rowmappers;

import tourism.entity.Tour;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.BeanPropertyRowMapper;

public class TourRowMapper extends BeanPropertyRowMapper {

    @Override
    public Tour mapRow(ResultSet rs, int rowNum) throws SQLException {
        Tour tour = new Tour();
        tour.setTourId(rs.getInt("tour_id"));
        tour.setName(rs.getString("name"));
        tour.setLocation(rs.getString("location"));
        tour.setDescription(rs.getString("description"));
        tour.setStartDate(rs.getDate("start_date"));
        tour.setEndDate(rs.getDate("end_date"));
        tour.setCount(rs.getInt("count_limit"));
        return tour;
    }

}