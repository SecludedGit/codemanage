package com.codemanage.controller;

import com.codemanage.mapper.Stu;
import com.codemanage.mapper.StuDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class stuHandler {
    @Autowired
    StuDao dao;

    @RequestMapping("/query")
    public Stu queryAll(){
        return dao.selectByPrimaryKey(1);
    }
}
