package com.example.crud.Service;

import com.example.crud.Model.FavouriteNews;
import com.example.crud.Repository.FavouriteNewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FavouriteNewsService {

    @Autowired
    private FavouriteNewsRepository favouriteNewsRepository;

    public void addFavouriteNews(FavouriteNews favouriteNews) {
        favouriteNewsRepository.save(favouriteNews); // Сохранение избранной новости
    }

    public List<FavouriteNews> getFavouriteNews(Long userId) {
        return favouriteNewsRepository.findByUserId(userId); // Получение избранных новостей
    }
}
