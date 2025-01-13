package com.example.crud.Controller;

import com.example.crud.Model.Album; // Подразумевается, что у вас есть модель Album
import com.example.crud.Service.AlbumService; // Подразумевается, что у вас есть сервис для альбомов
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping; // Импортируем RequestMapping

import java.util.List;

@Controller
@RequestMapping("/albums")
public class AlbumController {

    @Autowired
    private AlbumService albumService;

    // Страница со всеми альбомами
    @GetMapping
    public String getAllAlbums(Model model) {
        List<Album> albums = albumService.getAllAlbums(); // Получаем все альбомы
        model.addAttribute("albums", albums);
        return "albums"; // Возвращает шаблон "albums.html"
    }
}
