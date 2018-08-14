package tourism.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import java.util.Date;

public class Order {

    private Integer order_id;
    private Integer user_id;
    private Integer tour_id;
    private Boolean confirmed;
    private Date time_key;

    public Integer getOrderId() {
        return order_id;
    }

    public void setOrderId(Integer order_id) {
        this.order_id=order_id;
    }

    public Integer getUserId() {
        return user_id;
    }

    public void setUserId(Integer user_id) {
        this.user_id=user_id;
    }

    public Integer getTourId() {
        return tour_id;
    }

    public void setTourId(Integer tour_id) {
        this.tour_id=tour_id;
    }

    public Date getTimeKey() {
        return time_key;
    }

    public void setTimeKey(Date time_key) {
        this.time_key=time_key;
    }

    public Boolean getConfirmation() {
        return confirmed;
    }

    public void setConfirmation(Boolean confirmed) {
        this.confirmed=confirmed;
    }

}

