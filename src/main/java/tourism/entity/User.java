package tourism.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Column;
import java.util.Date;

@Entity
@Table(name="users")
public class User {

    @Id
    @Column(name="user_id")
    private Integer id;
    @Column(name="first_name")
    private String name;
    @Column(name="birthday")
    private Date birthdate;
    @Column(name="active")
    private Boolean activeMark;

    public Integer getUserId() {
        return id;
    }

    public void setUserId(Integer id) {
        this.id=id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name=name;
    }

    public Date getDate() {
        return birthdate;
    }

    public void setDate(Date date) {
        this.birthdate=date;
    }

    public Boolean getMark() {
        return activeMark;
    }

    public void setMark(Boolean mark) {
        this.activeMark=mark;
    }

}

