package com.lcwd.springmvc.dao;

import com.lcwd.springmvc.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class UserDaoImpl implements UserDao{
    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    @Transactional
    public int saveUser(User user) {
        System.out.println("save user called");
        return (int) hibernateTemplate.save(user);
    }
}
