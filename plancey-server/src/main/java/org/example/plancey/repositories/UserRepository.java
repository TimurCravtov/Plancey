package org.example.plancey.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.plancey.models.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
