package com.mymock.mvc;

import com.mymock.Service.ILoginService;
import com.mymock.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;


/**
 * Created by rkavya on 3/19/2015.
 */

@Controller
public class MainClass{

    @Autowired
    private ILoginService iLoginService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String printHello(ModelMap model) {
        // model.put("account", new User());
        return "welcome";
    }

    @RequestMapping(value = "/loginForm", method = RequestMethod.POST)
    public  @ResponseBody User login( @RequestBody User user,ModelMap model,HttpSession session)
    {
        System.out.println("Entered Controller");
        if(iLoginService.login(user))
          return user;
        else
            return new User("user doesnot exists","");
    }

    @RequestMapping(value ="/login",method = RequestMethod.GET)
    public @ResponseBody
    User getStudent() {
        return new User("kavya", "ranga");
    }

}