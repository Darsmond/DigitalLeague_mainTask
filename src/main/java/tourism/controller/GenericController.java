package tourism.controller;

import tourism.entity.User;
import tourism.entity.Tour;
import tourism.dao.GenericDao;
import tourism.rowmappers.UserRowMapper;
import tourism.rowmappers.TourRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.List;
import java.io.Serializable;

@Controller
public class GenericController<T extends Serializable> {

    @Autowired
    User user;

    @Autowired
    Tour tour;

    @Autowired
    GenericDao dao;

    @RequestMapping(value={"/"}, 
 	    method = RequestMethod.GET)

    @ResponseBody
    public List<T> getResult() {
        List<T> result = dao.selectAll(new UserRowMapper());
            return result;
    }

}