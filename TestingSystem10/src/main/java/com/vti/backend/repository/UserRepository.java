package com.vti.backend.repository;

import com.vti.entity.Department;
import com.vti.entity.Role;
import com.vti.entity.User;
import com.vti.utils.JdbcUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;


public class UserRepository{
    public User login (String username, String password){
        String sql = "SELECT * FROM `user` WHERE user_name = ? AND password = ?";
        Connection connection = JdbcUtils.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                User user = new User();
                user.setUsername(username);
                user.setEmail(resultSet.getString("email"));
                String roleString = resultSet.getString("role");
                user.setRole(Role.valueOf(roleString));
                return user;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JdbcUtils.closeConnection();
        }
        return null;
    }
    public List<User> getAllUsers(){
        List<User> userList = new ArrayList<>();
        String sql = "SELECT * FROM assignment10.user \n" + " LEFT JOIN Department D ON D.department_id = `User`.department_id";
        Connection connection = JdbcUtils.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                User user = new User();
                Department department = new Department();
                user.setId(resultSet.getInt("id"));
                String roleString = resultSet.getString("role");
                user.setRole(Role.valueOf(roleString));
                user.setUsername(resultSet.getString("user_name"));
                user.setEmail(resultSet.getString("email"));
                user.setDateOfBirth(resultSet.getString("date_of_birth"));
                department.setDepartmentName(resultSet.getString("department_name"));
                user.setDepartment(department);
                userList.add(user);
            }

        } catch (SQLException e){
            System.out.println(e.getMessage());
        } finally {
            JdbcUtils.closeConnection();
        }
        return userList;
    }

    public User findById(int id){
        String sql = "SELECT * FROM assignment10.user U "
                + " LEFT JOIN Department D ON D.department_id = U.department_id WHERE U.id = ?";;
        Connection connection = JdbcUtils.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                User user = new User();
                Department department = new Department();
                user.setId(id);
                String roleString = resultSet.getString("role");
                user.setRole(Role.valueOf(roleString));
                user.setUsername(resultSet.getString("user_name"));
                user.setEmail(resultSet.getString("email"));
                user.setDateOfBirth(resultSet.getString("date_of_birth"));
                department.setDepartmentName(resultSet.getString("department_name"));
                user.setDepartment(department);
                return user;
            }
        } catch (SQLException throwables) {
            System.err.println(throwables.getMessage());
        } finally {
            JdbcUtils.closeConnection();
        }
        return null;
    }

    public List<User> findUser(String key){
        List<User> userList = new ArrayList<>();
        key = "%" + key + "%";
        String sql = "SELECT * FROM assignment10.user U" +
                " LEFT JOIN Department D on D.department_id = U.department_id WHERE U.user_name like ? or u.email like ?";
        Connection connection = JdbcUtils.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, key);
            preparedStatement.setString(2,key);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                User user = new User();
                Department department = new Department();
                user.setId(resultSet.getInt("id"));
                String roleString = resultSet.getString("role");
                user.setRole(Role.valueOf(roleString));
                user.setUsername(resultSet.getString("user_name"));
                user.setEmail(resultSet.getString("email"));
                user.setDateOfBirth(resultSet.getString("date_of_birth"));
                department.setDepartmentName(resultSet.getString("department_name"));
                user.setDepartment(department);
                userList.add(user);
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JdbcUtils.closeConnection();
        }
        return userList;
    }

    public void deleteUser(int id){
        String sql = "DELETE FROM assignment10.user WHERE id=?";
        Connection connection = JdbcUtils.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, id);
            int resultSet = preparedStatement.executeUpdate();
            if (resultSet == 0){
                System.err.println("Xóa không thành công");
            } else {
                System.out.println("Đã xóa " + resultSet + " bản ghi");
            }
        } catch (SQLException throwables) {
            System.err.println(throwables.getMessage());;
        } finally {
            JdbcUtils.closeConnection();
        }
    }

    public void changePassword(String username, String oldPassword, String newPassword) {
        String sql = "UPDATE assignment10.user SET password = ? WHERE user_name = ? AND password = ?";
        Connection connection = JdbcUtils.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newPassword);
            preparedStatement.setString(2, username);
            preparedStatement.setString(3, oldPassword);
            int resultSet = preparedStatement.executeUpdate();
            if (resultSet == 0) {
                System.err.println("Cập nhật thất bại");
            } else {
                System.out.println("Cập nhật thành công");
            }
        } catch (SQLException throwables) {
            System.err.println(throwables.getMessage());
        } finally {
            JdbcUtils.closeConnection();
        }
    }

    public void createUser(String username, String email, String birthDay, int departmentId){
        String sql = "INSERT INTO `assignment10`.`User` (`role`, `user_name`, `password`, `email`, `date_of_birth`, department_id)\n" +
                "VALUES ('USER', ?, '123456', ?, ?, ?);";
        Connection connection = JdbcUtils.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, birthDay);
            preparedStatement.setInt(4, departmentId);
            int resultSet = preparedStatement.executeUpdate();
            if (resultSet == 0){
                System.out.println("Thêm mới không thành công");
            } else {
                System.out.println("Đã thêm mới " + resultSet + " user");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JdbcUtils.closeConnection();
    }
    }
}
