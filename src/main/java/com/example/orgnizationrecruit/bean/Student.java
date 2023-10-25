package com.example.orgnizationrecruit.bean;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("stu_info")
public class Student {

    String name;
    @TableId
    String stuNum;
    String qqNum;
    String school;
    String college;
    String field;
    String group1;
    String group0;

}
