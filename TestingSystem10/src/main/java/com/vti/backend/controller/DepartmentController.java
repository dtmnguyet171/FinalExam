package com.vti.backend.controller;

import com.vti.backend.service.DepartmentService;
import com.vti.entity.Department;

import java.util.List;

public class DepartmentController {
    DepartmentService departmentService = new DepartmentService();
    public List<Department> getAllDepartment() {
        return departmentService.getAllDepartment();
    }
    public Department findDepartmentById(int departmentId) {
        return departmentService.findDepartmentById(departmentId);
    }
    public List<Department> findDepartmentByName(String key) {
        return departmentService.findDepartmentByName(key);
    }
    public void deleteDepartment(int departmentId) {
        departmentService.deleteDepartment(departmentId);
    }
    public void changeDepartmentName(int departmentId, String departmentName) {
        departmentService.changeDepartmentName(departmentId,departmentName);
    }
    public void createDepartment(String departmentName) {
        departmentService.createDepartment(departmentName);
    }
}
