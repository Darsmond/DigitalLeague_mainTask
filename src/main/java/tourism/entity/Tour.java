package tourism.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import java.util.Date;

public class Tour {

    private Integer tour_id;
    private String name;
    private String description;
    private String location;
    private Date start_date;
    private Date end_date;
    private Integer count_limit;

    public Integer getTourId() {
        return tour_id;
    }

    public void setTourId(Integer tour_id) {
        this.tour_id=tour_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description=description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location=location;
    }

    public Date getStartDate() {
        return start_date;
    }

    public void setStartDate(Date start_date) {
        this.start_date=start_date;
    }

    public Date getEndDate() {
        return end_date;
    }

    public void setEndDate(Date end_date) {
        this.end_date=end_date;
    }

    public Integer getCount() {
        return count_limit;
    }

    public void setCount(Integer count_limit) {
        this.count_limit=count_limit;
    }

}

