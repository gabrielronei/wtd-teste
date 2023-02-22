package br.com.gabriels.webplayground.syncro;

import java.time.LocalDateTime;

public class User {

    private Long id;
    private String name;
    private boolean hasAny;
    private LocalDateTime createdAt = LocalDateTime.now();

    public User(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void updateHasAny() {
        this.hasAny = !hasAny;
    }

    public Boolean hasAny() {
        return hasAny;
    }
}
