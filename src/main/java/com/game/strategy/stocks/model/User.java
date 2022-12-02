package com.game.strategy.stocks.model;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String username;
    private String name;
    private String email;


    @OneToMany(mappedBy = "user" , orphanRemoval = true)
    @JsonIgnore
    private List<SMMTrade> smmTrade ;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

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

    public List<SMMTrade> getSmmTrade() {
        return smmTrade;
    }

    public void setSmmTrade(List<SMMTrade> smmTrade) {
        this.smmTrade = smmTrade;
    }
}
