package HRISproject.HRISproject.service;


import HRISproject.HRISproject.dao.BaseDAO;

import HRISproject.HRISproject.dao.UserDAO;

import HRISproject.HRISproject.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService extends BaseService<User> {

    @Autowired
    private UserDAO dao;

    @Override
    protected BaseDAO<User> getDAO() {
        return dao;
    }
}
