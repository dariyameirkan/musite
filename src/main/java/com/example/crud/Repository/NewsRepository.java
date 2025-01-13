package com.example.crud.Repository;

import com.example.crud.Model.News; // Подразумевается, что у вас есть модель News
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NewsRepository extends JpaRepository<News, Long> {
    // Дополнительные методы запроса могут быть определены здесь
}
