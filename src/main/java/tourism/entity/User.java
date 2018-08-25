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
    private Integer userId;
    @Column(name="first_name")
    private String firstName;
    @Column(name="birthday")
    private Date birthdate;
    @Column(name="active")
    private Boolean activeMark;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer id) {
        this.userId=id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName=firstName;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setDate(Date date) {
        this.birthdate=date;
    }

    public Boolean getActiveMark() {
        return activeMark;
    }

    public void setMark(Boolean mark) {
        this.activeMark=mark;
    }

}

