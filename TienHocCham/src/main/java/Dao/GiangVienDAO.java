package Dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import Database.JDBCUtil;
import Model.GiangVien;

public class GiangVienDAO implements DaoInterface<GiangVien>{
	
	public static GiangVienDAO GetInstance() {
		return new GiangVienDAO();
	}

	@Override
	public int Insert(GiangVien t) {	
		int EU = 0;
		try {
			
			Connection con = JDBCUtil.getConnection();
			Statement st = con.createStatement();
			String sql = "INSERT INTO GiangVien(IDGiangVien, IDKhoaQL, TenGiangVien)" + 
			"VALUES("+ t.getIdGiangVien()+", "+ t.getIdKhoaQL()+", "+ t.getTenGV()+", "+ ")";
			
			EU = st.executeUpdate(sql);
			
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
	public int Delete(GiangVien t) {
		int EU = 0;
		try {
			
			Connection con = JDBCUtil.getConnection();
			Statement st = con.createStatement();
			String sql = "DELETE FROM GIANG_VIEN WHERE ID =" + t.getIdGiangVien();
			
			EU = st.executeUpdate(sql);
			
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
	public int Update(GiangVien t) {
		int EU = 0;
		try {
			
			Connection con = JDBCUtil.getConnection();
			Statement st = con.createStatement();
			String sql = "UPDATE GIANG_VIEN" + "SET" +
					"IDGiangVien ='"+ t.getIdGiangVien()+"'"+ 
					"IDKhoaQL ='"+ t.getIdKhoaQL()+"'"+ 
					"TenGiangVien ="+ t.getTenGV()+ 
					"WHERE IDGiangVien ="+ t.getIdGiangVien();
			
			EU = st.executeUpdate(sql);
			
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
	public ArrayList<GiangVien> SelectAll() {
		ArrayList<GiangVien> EQ = new ArrayList<GiangVien>();
		try {
			
			Connection con = JDBCUtil.getConnection();
			Statement st = con.createStatement();
			String sql = "SELECT * FROM GIANG_VIEN";
			System.out.print(sql);
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				String id = rs.getString("IDGiangVien");
				String khoaql = rs.getString("IDKhoaQL");
				String ten = rs.getString("TenGiangVien");
				
				GiangVien Gvien = new GiangVien(id, khoaql, ten);
				EQ.add(Gvien);
			}
			
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EQ;
	}

	@Override
	public GiangVien SelectByID(GiangVien t) {
		GiangVien EQ = null;
		try {
			
			Connection con = JDBCUtil.getConnection();
			Statement st = con.createStatement();
			String sql = "SELECT * FROM GIANG_VIEN";
			System.out.print(sql);
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				String id = rs.getString("IDGiangVien");
				String khoaql = rs.getString("IDKhoaQL");
				String ten = rs.getString("TenGiangVien");
				
				EQ = new GiangVien(id, khoaql, ten);
				
			}
			
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EQ;
	}

	@Override
	public ArrayList<GiangVien> SelectCondition(String condition) {
		ArrayList<GiangVien> EQ = new ArrayList<GiangVien>();
		try {
			
			Connection con = JDBCUtil.getConnection();
			Statement st = con.createStatement();
			String sql = "SELECT * FROM GIANG_VIEN WHERE" + condition;
			System.out.print(sql);
			ResultSet rs = st.executeQuery(sql);
			
			while(rs.next()) {
				String id = rs.getString("IDGiangVien");
				String khoaql = rs.getString("IDKhoaQL");
				String ten = rs.getString("TenGiangVien");
				
				GiangVien Gvien = new GiangVien(id, khoaql, ten);
				EQ.add(Gvien);
			}
			
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EQ;
	}


}
