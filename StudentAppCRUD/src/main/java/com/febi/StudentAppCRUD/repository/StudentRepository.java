package com.febi.StudentAppCRUD.repository;

import com.febi.StudentAppCRUD.api.model.StudentModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<StudentModel, Integer> {
}
