package com.baizhi.controller;

import com.baizhi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/student")
public class StudentController {
    @Autowired
    private StudentService studentService;

    @RequestMapping("/selectAllDate")
    public @ResponseBody Map getselectAllDate(int page ,int rows){
        System.out.println("进来了"+page+" "+rows);
        return studentService.getAll(page,rows);
    }
}
