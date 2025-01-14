package com.example.crud.Controller;

import com.example.crud.Model.News; // Подразумевается, что у вас есть модель News
import com.example.crud.Service.NewsService; // Подразумевается, что у вас есть сервис для новостей
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/news")
public class NewsController {

    @Autowired
    private NewsService newsService;

    @GetMapping
    public String getNews(Model model) {
        model.addAttribute("newsList", newsService.getAllNews());
        return "news";
    }

    @PostMapping("/like/{id}")
    public String likeNews(@PathVariable Long id) {
        newsService.likeNews(id);
        return "redirect:/news";
    }
}
