package com.example.todo.controller;

import com.example.todo.dto.CategoryDTO;
import com.example.todo.dto.TodoDTO;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("category")
public class CategoryController {

    @PostMapping("/create")
    public String createCategory(@AuthenticationPrincipal String userId, @RequestBody CategoryDTO dto) {

        return "임시 반환값 userId";
    }
}
