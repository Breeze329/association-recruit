package com.example.orgnizationrecruit.controller;

import com.example.orgnizationrecruit.bean.Student;
import com.example.orgnizationrecruit.mapper.InformationMapper;
import com.example.orgnizationrecruit.service.impl.InformationServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class Information {

    @Autowired
    InformationServiceImpl informationService;

//    @Autowired
//    InformationMapper informationMapper;

    @PostMapping("/information")
    public void saveInfo(@RequestBody Student student){
        informationService.save(student);
//        informationMapper.insert(student);
    }

}
