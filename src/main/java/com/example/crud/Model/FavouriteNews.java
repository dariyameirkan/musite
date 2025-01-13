package com.example.crud.Model;

import jakarta.persistence.*;

@Entity
@Table(name = "favourite_news")
public class FavouriteNews {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user; // Связь с моделью User

    @ManyToOne
    @JoinColumn(name = "news_id", nullable = false)
    private News news; // Связь с моделью News

    // Геттеры и сеттеры

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
    }
}
