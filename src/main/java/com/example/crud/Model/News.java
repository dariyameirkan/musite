package com.example.crud.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "news") // Название таблицы в базе данных
public class News {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) // Поле для изображения
    private String image;

    @Column(nullable = false) // Поле для заголовка
    private String title;

    @Column(nullable = false, length = 500) // Поле для текста новости, с ограничением в 500 символов
    private String text;

    // Геттеры и сеттеры

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }
}
