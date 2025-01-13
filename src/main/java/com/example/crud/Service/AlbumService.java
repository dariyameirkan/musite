package com.example.crud.Service;

import com.example.crud.Model.Album; // Подразумевается, что у вас есть модель Album
import com.example.crud.Repository.AlbumRepository; // Подразумевается, что у вас есть репозиторий для альбомов
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlbumService {

    @Autowired
    private AlbumRepository albumRepository;

    // Получение всех альбомов
    public List<Album> getAllAlbums() {
        return albumRepository.findAll(); // Предполагается, что findAll() возвращает все альбомы
    }
}
