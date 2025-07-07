package com.manytomany.manytomanyexample.dto;

import java.util.List;

public class StudentDto {
    private String name;
    private List<Long> courseIds;

    // Getter ve Setterlar

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Long> getCourseIds() {
        return courseIds;
    }

    public void setCourseIds(List<Long> courseIds) {
        this.courseIds = courseIds;
    }
}
