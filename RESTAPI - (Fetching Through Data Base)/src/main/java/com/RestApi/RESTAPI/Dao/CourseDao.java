package com.RestApi.RESTAPI.Dao;

import com.RestApi.RESTAPI.Entities.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseDao extends JpaRepository<Course,Long> {

}
