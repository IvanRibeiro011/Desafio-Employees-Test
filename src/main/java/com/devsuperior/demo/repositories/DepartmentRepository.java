package com.devsuperior.demo.repositories;

import com.devsuperior.demo.entities.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DepartmentRepository extends JpaRepository<Department,Long> {

    @Query(nativeQuery = true , value = "SELECT * FROM tb_department ORDER BY name ASC")
    List<Department> findDepartmentByName();
}
