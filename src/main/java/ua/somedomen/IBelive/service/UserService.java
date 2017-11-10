package ua.somedomen.IBelive.service;

import org.springframework.data.repository.query.Param;
import ua.somedomen.IBelive.entity.User;

public interface UserService {

    void save(User user);

    User findByUser(String name);
}
