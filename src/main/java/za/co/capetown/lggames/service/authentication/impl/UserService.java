package za.co.capetown.lggames.service.authentication.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import za.co.capetown.lggames.domain.authentication.User;
import za.co.capetown.lggames.repository.authentication.IUserRepository;
import za.co.capetown.lggames.service.authentication.IUserService;

import java.util.Optional;

@Service
public class UserService implements IUserService {

    @Autowired
    private IUserRepository userRepository;

    private BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();

    @Override
    public User registerUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        return userRepository.save(user);
    }

    @Override
    public boolean authenticateUser(String email, String password) {
        Optional<User> findByEmail = userRepository.findByEmail(email);
        if (findByEmail.isPresent()){
            User user = findByEmail.get();
            return user.getPassword().equals(password);
        }
        return false;
    }

    @Override
    public Optional<User> findByEmail(String email) {
        return userRepository.findByEmail(email);
    }
}
