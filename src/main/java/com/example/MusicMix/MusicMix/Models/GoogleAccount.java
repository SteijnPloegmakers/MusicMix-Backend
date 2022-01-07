package com.example.MusicMix.MusicMix.Models;

import com.sun.istack.NotNull;
import javax.persistence.*;
import java.util.UUID;

@Entity
public class GoogleAccount {

    @Id
    @GeneratedValue
    private UUID id;

    @Column
    @NotNull
    private String username;

    @Column
    @NotNull
    private String email;

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
