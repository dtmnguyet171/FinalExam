package com.vti.backend.service;

import com.vti.backend.repository.DepartmentRepository;
import com.vti.entity.Department;

import java.util.List;

public class DepartmentService implements IDepartmentService{
    DepartmentRepository departmentRepository = new DepartmentRepository();
    @Override
    public List<Department> getAllDepartment() {
        return departmentRepository.getAllDepartment();
    }

    @Override
    public Department findDepartmentById(int departmentId) {
        return departmentRepository.findDepartmentById(departmentId);
    }

    @Override
    public List<Department> findDepartmentByName(String key) {
        return departmentRepository.findDepartmentByName(key);
    }

    @Override
    public void deleteDepartment(int departmentId) {
        departmentRepository.deleteDepartment(departmentId);
    }

    @Override
    public void changeDepartmentName(int departmentId, String departmentName) {
        departmentRepository.changeDepartmentName(departmentId,departmentName);
    }

    @Override
    public void createDepartment(String departmentName) {
        departmentRepository.createDepartment(departmentName);
    }
}
