package com.vti.backend.repository;

import com.vti.entity.User;
import com.vti.utils.JdbcUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserRepository {
    public User login(String email, String password){
        String sql = "SELECT * FROM finalexam2.user WHERE email = ? AND password = ?";
        Connection connection = JdbcUtils.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1,email);
            preparedStatement.setString(2,password);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()){
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setFullName(resultSet.getString("fullname"));
                user.setEmail(email);
                user.setProjectId(resultSet.getInt("projectid"));
                return user;
            }
        } catch (SQLException throwables) {
            System.err.println(throwables.getMessage());
        }
        return null;
    }
    public List<User> userListInProject(int projectId){
        List<User> userList = new ArrayList<>();
        String sql = "SELECT DISTINCT * FROM finalexam2.user WHERE projectid = ?";
        Connection connection = JdbcUtils.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, projectId);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()){
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setFullName(resultSet.getString("fullname"));
                user.setEmail(resultSet.getString("email"));
                userList.add(user);
            }
            return userList;
        } catch (SQLException throwables) {
            System.err.println(throwables.getMessage());
        } finally {
            JdbcUtils.closeConnection();
        }
        return null;
    }
    public List<User> getManager(){
        List<User> userList = new ArrayList<>();
        String sql = "SELECT * FROM finalexam2.user U" +
                " JOIN manager M ON U.id = M.id";
        Connection connection = JdbcUtils.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()){
                User user = new User();
                user.setId(resultSet.getInt("id"));
                user.setFullName(resultSet.getString("fullname"));
                user.setEmail(resultSet.getString("email"));
                userList.add(user);
            }
            return userList;
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JdbcUtils.closeConnection();
        }
        return null;
    }
}
