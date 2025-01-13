package com.example.crud.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "music") // Название таблицы в базе данных
public class Music {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false) // Поле для названия песни
    private String title;

    @Column(nullable = false) // Поле для ссылки на аудиофайл
    private String audioUrl;

    @Column(nullable = false) // Поле для продолжительности песни
    private String duration;

    // Связь с альбомом
    @ManyToOne
    @JoinColumn(name = "album_id", nullable = false) // Внешний ключ для связи с таблицей Album
    private Album album;

    // Геттеры и сеттеры

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAudioUrl() {
        return audioUrl;
    }

    public void setAudioUrl(String audioUrl) {
        this.audioUrl = audioUrl;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Album getAlbum() {
        return album;
    }

    public void setAlbum(Album album) {
        this.album = album;
    }
}
