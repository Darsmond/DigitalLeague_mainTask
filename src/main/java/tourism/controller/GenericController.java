package tourism.controller;

import tourism.entity.User;
import tourism.entity.Tour;
import tourism.dao.GenericDao;
import tourism.rowmappers.UserRowMapper;
import tourism.rowmappers.TourRowMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.*;
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
    public String getResult(Model model) {
          List<T> tours = dao.selectAll(new TourRowMapper());         
          model.addAttribute("tours", tours);
            return "hello";
    }

}