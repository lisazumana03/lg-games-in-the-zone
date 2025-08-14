package za.co.capetown.lggames.repository.product;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import za.co.capetown.lggames.domain.product.Console;

@Repository
public interface IConsoleRepository extends JpaRepository<Console, String> {
}
