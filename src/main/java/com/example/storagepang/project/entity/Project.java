package com.example.storagepang.project.entity;


import jakarta.persistence.*;
import lombok.Getter;

@Entity
@Getter

public class Project {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "project_title", nullable = false)
    private String title;

    @Column(name = "project_content", nullable = false, length = 500)
    private String content;



    public Project() {

    }

    public Project(String title, String content) {
        this.title = title;
        this.content = content;
    }


    public void update(String title, String content) {
        if (title != null) {
            this.title = title;
        }
        if (content != null) {
            this.content = content;
        }
    }
}
