package com.baizhi.dao;

import com.baizhi.entity.Student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentDao {
    //查询全部
    public List<Student> getAll(@Param("start") int start, @Param("rows") int rows);
    //查看条数
    public int getCount();
}
