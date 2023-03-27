package com.vti.backend.repository;

import com.vti.entity.Department;
import com.vti.utils.JdbcUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentRepository {
    public List<Department> getAllDepartment() {
        List<Department> departmentList = new ArrayList<>();
        String sql = "SELECT * FROM assignment10.Department";
        Connection connection = JdbcUtils.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                Department department = new Department();
                department.setDepartmentId(resultSet.getInt("department_id"));
                department.setDepartmentName(resultSet.getString("department_name"));
                departmentList.add(department);
            }
        } catch (SQLException throwables) {
            System.out.println(throwables.getMessage());
        } finally {
            JdbcUtils.closeConnection();
        }
        return departmentList;
    }

    public Department findDepartmentById(int departmentId) {
        String sql = "SELECT * FROM assignment10.department WHERE department_id = ?";
        Connection connection = JdbcUtils.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, departmentId);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                Department department = new Department();
                department.setDepartmentId(departmentId);
                department.setDepartmentName(resultSet.getString("department_name"));
                return department;
            }
        } catch (SQLException throwables) {
            System.err.println(throwables.getMessage());
        } finally {
            JdbcUtils.closeConnection();
        }
        return null;
    }

    public List<Department> findDepartmentByName(String key) {
        List<Department> departmentList = new ArrayList<>();
        String sql = "SELECT * FROM assignment10.department WHERE department_name LIKE ?";
        Connection connection = JdbcUtils.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "%" + key + "%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Department department = new Department();
                department.setDepartmentId(resultSet.getInt("department_id"));
                department.setDepartmentName(resultSet.getString("department_name"));
                departmentList.add(department);
            }
        } catch (SQLException throwables) {
            System.err.println(throwables.getMessage());
        } finally {
            JdbcUtils.closeConnection();
        }
        return departmentList;
    }

    public void deleteDepartment(int departmentId) {
        String sql = "DELETE FROM assignment10.department WHERE department_id = ?";
        Connection connection = JdbcUtils.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, departmentId);
            int resultSet = preparedStatement.executeUpdate();
            if (resultSet == 0) {
                System.err.println("Xóa Department thất bại");
            } else {
                System.out.println("Đã xóa " + resultSet + " bản ghi");
            }
        } catch (SQLException throwables) {
            System.err.println(throwables.getMessage());
        } finally {
            JdbcUtils.closeConnection();
        }
    }

    public void changeDepartmentName(int departmentId, String departmentName) {
        String sql = "UPDATE assignment10.department SET department_name = ? WHERE department_id = ?";
        Connection connection = JdbcUtils.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, departmentName);
            preparedStatement.setInt(2, departmentId);
            int resultSet = preparedStatement.executeUpdate();
            if (resultSet == 0) {
                System.out.println("Thay đổi department Name thất bại");
            } else {
                System.out.println("Đã thay đổi " + resultSet + " bản ghi");
            }
        } catch (SQLException throwables) {
            System.err.println(throwables.getMessage());
        } finally {
            JdbcUtils.closeConnection();
        }
    }

    public void createDepartment(String departmentName) {
        String sql = "INSERT INTO assignment10.department (department_name)" +
                "VALUES (?)";
        Connection connection = JdbcUtils.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, departmentName);
            int resultSet = preparedStatement.executeUpdate();
            if (resultSet == 0) {
                System.out.println("Thêm mới không thành công");
            } else {
                System.out.println("Đã thêm mới " + resultSet + " user");
            }
        } catch (SQLException throwables) {
            System.err.println(throwables.getMessage());
        } finally {
            JdbcUtils.closeConnection();
        }
    }
}
