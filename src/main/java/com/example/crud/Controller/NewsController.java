package com.example.crud.Controller;

import com.example.crud.Model.News; // Подразумевается, что у вас есть модель News
import com.example.crud.Service.NewsService; // Подразумевается, что у вас есть сервис для новостей
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping; // Импортируем RequestMapping

import java.util.List;

@Controller
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    // Страница со всеми новостями
    @GetMapping
    public String getAllNews(Model model) {
        List<News> newsList = newsService.getAllNews(); // Получаем все новости
        model.addAttribute("news", newsList);
        return "news"; // Возвращает шаблон "news.html"
    }
}
