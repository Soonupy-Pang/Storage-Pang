package com.example.storagepang.project.controller;


import com.example.storagepang.project.dto.ProjectRequestDto;
import com.example.storagepang.project.dto.ProjectResponseDto;
import com.example.storagepang.project.entity.Project;
import com.example.storagepang.project.service.ProjectService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/project")
public class ProjectController {

    private final ProjectService projectService;

    // 전체 project 조회

    @GetMapping
    public ResponseEntity<List<ProjectResponseDto>> getAllProjects() {
        List<Project> projectList = projectService.getAllProjects();
        List<ProjectResponseDto> projectResponseDtoList = projectList.stream()
                .map(ProjectResponseDto::new)
                .toList();
        ResponseEntity<List<ProjectResponseDto>> response = new ResponseEntity<>(projectResponseDtoList, HttpStatus.OK);
        return response;
//        return new ResponseEntity<>(projectResponseDtoList, HttpStatus.OK);
    }
    // 단일 Project 조회

    @GetMapping("/{id}")
    public ResponseEntity<ProjectResponseDto> getProject(@PathVariable Long id) {
        Project project = projectService.getProject(id);
        ProjectResponseDto projectResponseDto = new ProjectResponseDto(project);
        ResponseEntity<ProjectResponseDto> response = new ResponseEntity<>(projectResponseDto, HttpStatus.OK);
        return response;
    }

    // project 생성
    @PostMapping
    public ResponseEntity<ProjectResponseDto> createProject(@RequestBody ProjectRequestDto projectRequestDto) {
        Project project = projectService.createProject(projectRequestDto);
        ProjectResponseDto projectResponseDto = new ProjectResponseDto(project);
        ResponseEntity<ProjectResponseDto> response = new ResponseEntity<>(projectResponseDto, HttpStatus.CREATED);
        return response;
    }

    // Project 수정
    @PutMapping("/{id}")
    public ResponseEntity<ProjectResponseDto> updateProject(@PathVariable Long id, @RequestBody ProjectRequestDto projectRequestDto) {
        Project project = projectService.updateProject(id, projectRequestDto);
        ProjectResponseDto projectResponseDto = new ProjectResponseDto(project);
        ResponseEntity<ProjectResponseDto> response = new ResponseEntity<>(projectResponseDto, HttpStatus.ACCEPTED);
        return response;
    }

    // Project 삭제
    @DeleteMapping("/{id}")
    public ResponseEntity<Map<String, String>> deleteBoard(@PathVariable Long id) {
        projectService.deleteBoard(id);
        Map<String, String> response = new HashMap<>();
        response.put("msg", "삭제완료");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }


}
