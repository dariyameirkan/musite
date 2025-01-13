package com.example.crud.Repository;

import com.example.crud.Model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {
    // Метод для поиска пользователя по имени
    Optional<User> findByUsername(String username);
}
