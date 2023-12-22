package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Database.JDBCUtil;
import Model.Login;

public class LoginDAO implements DaoInterface<Login>{
	
	public static LoginDAO GetInstance() {
		return new LoginDAO();
	}

	@Override
	public int Insert(Login t) {	
		int EU = 0;
		try {
			
			Connection con = JDBCUtil.getConnection();
			String sql = "INSERT INTO Login(Username, Password)" + 
					"VALUES(?, ?, ?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getUsername());
			pst.setString(2, t.getPassword());
			
			EU = pst.executeUpdate();
			
			System.out.print("Bạn Đã Thực Thi: "+ sql);
			System.out.print("Có "+ EU +" Dòng Bị Thay Đổi!");
			
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EU;
	}

	@Override
	public int Delete(Login t) {
		int EU = 0;
		try {
			
			Connection con = JDBCUtil.getConnection();
			String sql = "DELETE FROM Login WHERE Username =?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getUsername());
			EU = pst.executeUpdate();
			
			System.out.print("Bạn Đã Thực Thi: "+ sql);
			System.out.print("Có "+ EU +" Dòng Bị Thay Đổi!");
			
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EU;
	}

	@Override
	public int Update(Login t) {
		int EU = 0;
		try {
			
			Connection con = JDBCUtil.getConnection();
			String sql = "UPDATE Login" + "SET" + 
					"Password =?"+ 
					"WHERE ID =?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getPassword());
			pst.setString(2, t.getUsername());
			
			EU = pst.executeUpdate();
			
			System.out.print("Bạn Đã Thực Thi: "+ sql);
			System.out.print("Có "+ EU +" Dòng Bị Thay Đổi!");
			
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EU;
	}

	@Override
	public ArrayList<Login> SelectAll() {
		ArrayList<Login> EQ = new ArrayList<Login>();
		try {
			
			Connection con = JDBCUtil.getConnection();
			String sql = "SELECT * FROM Login";
			PreparedStatement pst = con.prepareStatement(sql);
			System.out.print(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				String username = rs.getString("Username");
				String password = rs.getString("Password");
				
				Login Login = new Login(username, password);
				EQ.add(Login);
			}
			
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EQ;
	}

	@Override
	public Login SelectByID(Login t) {
		Login EQ = null;
		try {
			
			Connection con = JDBCUtil.getConnection();
			String sql = "SELECT * FROM Login WHERE Username =?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getUsername());
			System.out.print(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				String username = rs.getString("Username");
				String password = rs.getString("Password");
				
				EQ = new Login(username, password);
				
			}
			
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EQ;
	}

	@Override
	public ArrayList<Login> SelectCondition(String condition) {
		ArrayList<Login> EQ = new ArrayList<Login>();
		try {
			
			Connection con = JDBCUtil.getConnection();
			String sql = "SELECT * FROM Login WHERE" + "?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, condition);
			//System.out.print(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				String username = rs.getString("Username");
				String password = rs.getString("Password");
				Login Login = new Login(username, password);
				EQ.add(Login);
			}
			
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EQ;
	}
	public Login CheckLogin(String Username, String Password) {
		try {
			
			Connection con = JDBCUtil.getConnection();
			String sql = "SELECT * FROM Logins WHERE Username=? and Password=?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, Username);
			pst.setString(2, Password);
			//System.out.print(sql);
			ResultSet rs = pst.executeQuery();
			while(rs.next()) {
				Login c = new Login(rs.getString(1), rs.getString(2));
				return c;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
}
