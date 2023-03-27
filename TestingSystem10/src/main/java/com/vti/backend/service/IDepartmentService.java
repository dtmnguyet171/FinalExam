package com.vti.backend.service;

import com.vti.entity.Department;

import java.util.List;

public interface IDepartmentService  {
    List<Department> getAllDepartment();
    Department findDepartmentById(int departmentId);
    List<Department> findDepartmentByName(String key);
    void deleteDepartment(int departmentId);
    void changeDepartmentName(int departmentId, String departmentName);
    void createDepartment(String departmentName);
}
