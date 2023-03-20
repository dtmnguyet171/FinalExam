package com.vti.backend.repository;

import com.vti.entity.Account;
import com.vti.utils.JdbcUtils;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AccountRepository {
        public void createAccount(String username, String email, String password){
            // Tạo một câu query tương ứng với chức năng sử dung
            String sql = "INSERT INTO jdbc.Account (full_name, email, password) VALUES(?, ?, ?)";
            // Kết nối với DB để tạo 1 phiên làm việc
            Connection connection = JdbcUtils.getConnection();
            // Tạo statement tương ứng với câu query (có biến truyền vào: PreparedStatement;
            // không có biến truyền vào: Statement
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(sql);
                preparedStatement.setString(1,username);
                preparedStatement.setString(2,email);
                preparedStatement.setString(3,password);
                // Execute câu query và lấy kết quả (result)
                int resultSet = preparedStatement.executeUpdate();
                // Kiểm tra sự thành công và thông báo
                if (resultSet == 0) {
                    System.out.println("Thêm mới thất bại");
                } else {
                    System.out.println("Thêm mới thành công");
                }
            } catch (SQLException e) {
                System.err.println(e.getMessage());;
            } finally {
                JdbcUtils.closeConnection();
            }
        }

    public void updateAccount(int accountId, String oldPassword, String newPassword){
        String sql = "UPDATE Jdbc.Account SET password = ? WHERE account_id = ? AND password = ?";
        Connection connection = JdbcUtils.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, newPassword);
            preparedStatement.setInt(2, accountId);
            preparedStatement.setString(3, oldPassword);
            int resultSet = preparedStatement.executeUpdate();
            // Kiểm tra sự thành công và thông báo
            if (resultSet == 0) {
                System.out.println("Cập nhật thất bại");
            } else {
                System.out.println("Cập nhật thành công");
            }
        } catch (Exception e) {
            System.err.println(e.getMessage());
        } finally {
            JdbcUtils.closeConnection();
        }
    }

    public void deleteAccount(int accountId){
        String sql = "DELETE FROM Account WHERE account_id = ?";
        Connection connection = JdbcUtils.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1,accountId);
            int resultSet = preparedStatement.executeUpdate();
            if (resultSet == 0){
                System.out.println("Xóa bản ghi thất bại");
            } else {
                System.out.println("Xóa bản ghi thành công");
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JdbcUtils.closeConnection();
        }
    }

    public List<Account> findByEmail(String email){
        List<Account> accounts = new ArrayList<>();
        String sql = "SELECT * FROM Account WHERE email LIKE ?";
        Connection connection = JdbcUtils.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, "%" + email +"%");
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                Account account = new Account();
                account.setAccountId(resultSet.getInt("account_id"));
                account.setFullName(resultSet.getString("full_name"));
                account.setEmail(resultSet.getString("email"));
                account.setPassword(resultSet.getString("password"));
                accounts.add(account);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JdbcUtils.closeConnection();
        }
        return accounts;
    }
    public List<Account> getAllAccount(){
        List<Account> accounts = new ArrayList<>();
        String sql = "SELECT * FROM Account";
        Connection connection = JdbcUtils.getConnection();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery(sql);
            while (resultSet.next()) {
                // Lấy giá trị từng hàng gán vào đối tượng Account tương ứng
                Account account = new Account();
                int accountID = resultSet.getInt("account_id");
                account.setAccountId(accountID);
                account.setFullName(resultSet.getString("full_name"));
                account.setEmail(resultSet.getString("email"));
                account.setPassword(resultSet.getString("password"));
                accounts.add(account);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            JdbcUtils.closeConnection();
        }
        return accounts;
    }
    public boolean login(String email, String password){
        String sql = "SELECT * FROM Account WHERE email = ? AND password = ?";
        Connection connection = JdbcUtils.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            ResultSet resultSet = preparedStatement.executeQuery();
            return resultSet.next();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
            return false;
        } finally {
            JdbcUtils.closeConnection();
        }
    }
}
