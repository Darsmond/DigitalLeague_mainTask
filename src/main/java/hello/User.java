package hello;

import java.util.Date;

public class User {

private Integer id;
private String name;
private Date birthdate;
private Boolean activeMark;

public Integer getId() {
return id;
}

public void setId(Integer id) {
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

