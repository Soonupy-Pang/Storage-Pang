package com.example.storagepang.project.service;

import com.example.storagepang.project.dto.ProjectRequestDto;
import com.example.storagepang.project.entity.Project;
import com.example.storagepang.project.repository.ProjectRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ProjectService {

    private final ProjectRepository projectRepository;


    public Project createProject(ProjectRequestDto projectRequestDto) {
        Project project = new Project(projectRequestDto.getTitle(), projectRequestDto.getContent());
        Project savedProject = projectRepository.save(project);
        return savedProject;
    }

    public List<Project> getAllProjects() {
        List<Project> projectList = projectRepository.findAll();
        return projectList;
    }

    public Project getProject(Long id) {
        Project project = projectRepository.findById(id).orElseThrow(
                () -> new RuntimeException("Project not found")
        );
        return project;
    }
}
