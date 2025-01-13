package com.example.crud.Repository;

import com.example.crud.Model.FavouriteNews;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FavouriteNewsRepository extends JpaRepository<FavouriteNews, Long> {
    List<FavouriteNews> findByUserId(Long userId); // Метод для получения избранных новостей по ID пользователя
}
