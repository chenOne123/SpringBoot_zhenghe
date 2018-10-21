package com.baizhi.service.impl;

import com.baizhi.dao.StudentDao;
import com.baizhi.entity.Student;
import com.baizhi.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentDao studentDao;

    @Override
    public Map getAll(int page , int rows) {
        System.out.println("service"+page+" "+rows);
        Map map = new HashMap();

        //计算出开始条数
        int start = (page-1)*rows;
        //根据开始条数和每页展示多少条数据查询出数据
        List<Student> list = studentDao.getAll(start,rows);
        //计算出有多少条数据
        int count = studentDao.getCount();
        //把数据存储到map中
        map.put("rows",list);
        map.put("total",count);
        return map;
    }
}
