package com.mymock.dao;

import com.mymock.domain.User;
import org.hibernate.Query;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by rkavya on 3/24/2015.
 */
@Repository
public class LoginDAO  implements ILoginDAO{

    @Autowired
    private SessionFactory sessionFactory;


    @Override
    public boolean login(User user) {

        Query query = sessionFactory.getCurrentSession().createQuery("from User u where u.username=:username and u.password=:password");

        query.setString("username",user.getUsername());
        query.setString("password",user.getPassword());

        User us = (User)query.uniqueResult();
        if(us == null)
            return false;

        if((us.getUsername().equals(user.getUsername()))&&(us.getPassword().equals(user.getPassword())))
        {
          return true;
        }

            return false;
        /*sessionFactory.getCurrentSession().save(user);
        return true;*/


    }

}
