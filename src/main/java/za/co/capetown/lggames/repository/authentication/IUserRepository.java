package za.co.capetown.lggames.repository.authentication;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.Optional;
import za.co.capetown.lggames.domain.authentication.User;

@Repository
public interface IUserRepository extends JpaRepository<User, String> {
    Optional<User> findByUserName(String userName);
    Optional<User> findByEmail(String email);
}
