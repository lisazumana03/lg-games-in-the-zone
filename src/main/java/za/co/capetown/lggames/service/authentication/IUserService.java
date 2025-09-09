package za.co.capetown.lggames.service.authentication;

import za.co.capetown.lggames.domain.authentication.User;
import za.co.capetown.lggames.service.IService;
import java.util.Optional;

public interface IUserService {
    User registerUser(User user);
    boolean authenticateUser(String email, String password);
    Optional<User> findByEmail(String email);
}
