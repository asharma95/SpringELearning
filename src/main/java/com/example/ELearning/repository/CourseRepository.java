package com.example.ELearning.repository;

import com.example.ELearning.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, String> {
    @Query("Select c from Course c where c.name like %:name%")
    public List<Course> findByNameCont(String name);
}
