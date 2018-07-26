package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;
import java.util.LinkedList;

@Controller
public class UserController {

@Autowired
User user;

@Autowired
UserDao userDao;

@RequestMapping(value={"/task"}, method = RequestMethod.GET)

@ResponseBody
public List<User> getName() {
List<User> users = userDao.selectActiveUsers();
//List<User> usersFinal = new LinkedList<>();
//	for (User current : users) {
//User user = new User();
//Integer id = current.getId();
//String name = current.getName();
//user.setId(id);
//user.setName(name);
//usersFinal.add(user);
//}
//return usersFinal;
return users;
}
}