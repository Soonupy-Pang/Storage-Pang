package com.example.storagepang.project.dto;


import com.example.storagepang.project.entity.Project;
import lombok.Getter;

@Getter
public class ProjectResponseDto {

    private final Long id;
    private final String title;
    private final String content;


    public ProjectResponseDto(Project project) {
        this.id = project.getId();
        this.title = project.getTitle();
        this.content = project.getContent();
    }
}
