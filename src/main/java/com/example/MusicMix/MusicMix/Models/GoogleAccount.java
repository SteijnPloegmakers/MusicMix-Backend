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
    private String googleId;

    @Column
    @NotNull
    private String name;

    @Column
    @NotNull
    private String email;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getGoogleId() {
        return googleId;
    }

    public void setGoogleId(String googleId) {
        this.googleId = googleId;
    }
}

