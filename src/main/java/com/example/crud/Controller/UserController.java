package com.example.crud.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/api/users")
public class UserController {

    // Страница welcome
    @GetMapping("/welcome")
    public String welcomePage() {
        return "welcome"; // Возвращаем шаблон "welcome.html"
    }

    // Страница входа
    @GetMapping("/sign-in")
    public String signInPage() {
        return "sign-in"; // Возвращаем шаблон "sign-in.html"
    }

    // Страница регистрации
    @GetMapping("/sign-up")
    public String signUpPage() {
        return "sign-up"; // Возвращаем шаблон "sign-up.html"
    }

    // Перенаправление на welcome для всех других запросов
    @GetMapping("/**")
    public String redirectToWelcome() {
        return "redirect:/api/users/welcome"; // Перенаправляем на страницу welcome для всех других запросов
    }
}
