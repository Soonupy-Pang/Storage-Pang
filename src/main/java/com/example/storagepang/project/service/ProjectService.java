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

    public Project updateProject(Long id, ProjectRequestDto projectRequestDto) {
        Project project = projectRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("수정할 프로젝트가 없습니다.")
        );
        project.update(
                projectRequestDto.getTitle(),
                projectRequestDto.getContent()
        );

        Project updatedProject = projectRepository.save(project);
        return updatedProject;
    }

    public void deleteBoard(Long id) {
        Project project = projectRepository.findById(id).orElseThrow(
                () -> new IllegalArgumentException("삭제하고자 하는 프로젝트가 없습니다.")
        );
        projectRepository.delete(project);
    }
}
