package com.example.crud.Service;

import com.example.crud.Model.User; // Подразумевается, что у вас есть модель User
import com.example.crud.Repository.UserRepository; // Подразумевается, что у вас есть репозиторий для пользователей
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    // Регистрация пользователя
    public User registerUser(User user) {
        // Валидация и сохранение пользователя
        return userRepository.save(user); // Сохраняем пользователя в репозитории
    }

    // Аутентификация пользователя
    public boolean authenticateUser(String username, String password) {
        // Логика аутентификации
        return true; // Реализуйте свою логику аутентификации
    }

    // Получение пользователя по ID
    public User getUserById(Long id) {
        return userRepository.findById(id).orElse(null); // Получаем пользователя по ID
    }

    // Другие методы управления пользователями могут быть добавлены здесь
}
