package ua.somedomen.IBelive.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.somedomen.IBelive.dao.UserDAO;
import ua.somedomen.IBelive.entity.User;
import ua.somedomen.IBelive.service.UserService;

@Service
@Transactional
public class UserServiceImpl implements UserService, UserDetailsService {

    @Autowired
    private UserDAO dao;

    @Override
    public void save(User user) {
        dao.save(user);
    }

    @Override
    public User findByUser(String name) {
        return dao.findByUsername(name);
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return findByUser(username);
    }
}
