package com.example.crud.Repository;

import com.example.crud.Model.Album; // Подразумевается, что у вас есть модель Album
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlbumRepository extends JpaRepository<Album, Long> {
    // Дополнительные методы запроса могут быть определены здесь
}
