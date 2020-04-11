package com.codemanage.mapper;

import java.io.Serializable;
import lombok.Data;
import org.springframework.stereotype.Component;

/**
 * stu
 * @author 
 */
@Component
@Data
public class Stu implements Serializable {
    private Integer id;

    private String name;

    private Integer age;

    private String sex;

    private String grade;

    private static final long serialVersionUID = 1L;
}