package za.co.capetown.lggames.service.authentication.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.capetown.lggames.domain.authentication.User;
import za.co.capetown.lggames.repository.authentication.IUserRepository;
import za.co.capetown.lggames.service.authentication.IUserService;

import java.util.List;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    @Override
    public User create(User user) {
        return userRepository.save(user);
    }

    @Override
    public User read(String s) {
        return null;
    }

    @Override
    public List<User> getAll() {
        return userRepository.findAll();
    }

    @Override
    public User update(String userId, User user) {
        return null;
    }
}
