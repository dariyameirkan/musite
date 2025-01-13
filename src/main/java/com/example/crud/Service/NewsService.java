package com.example.crud.Service;

import com.example.crud.Model.News; // Подразумевается, что у вас есть модель News
import com.example.crud.Repository.NewsRepository; // Подразумеется, что у вас есть репозиторий для новостей
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NewsService {

    @Autowired
    private NewsRepository newsRepository;

    // Получение всех новостей
    public List<News> getAllNews() {
        return newsRepository.findAll(); // Предполагается, что findAll() возвращает все новости
    }
}
