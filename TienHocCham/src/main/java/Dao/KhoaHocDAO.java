package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import Database.JDBCUtil;
import Model.KhoaHoc;


public class KhoaHocDAO implements DaoInterface<KhoaHoc>{

	@Override
	public int Insert(KhoaHoc t) {
		int EU = 0;
		try {
			
			Connection con = JDBCUtil.getConnection();
			String sql = "INSERT INTO KHOA_HOC(IDKhoaLop, IDLop, IDMonHoc, IDGiangVien, NamHoc)" + 
					"VALUES(?, ?, ?, ?, ?)";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getIdKhoa());
			pst.setString(2, t.getIdLop());
			pst.setString(3, t.getIdMonHoc());
			pst.setString(4, t.getIdGiangVien());
			pst.setString(5, t.getNamHoc());
			
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
	public int Delete(KhoaHoc t) {
		int EU = 0;
		try {
			
			Connection con = JDBCUtil.getConnection();
			String sql = "DELETE FROM KHOA_HOC WHERE IDKhoaLop =?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getIdKhoa());
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
	public int Update(KhoaHoc t) {
		int EU = 0;
		try {
			
			Connection con = JDBCUtil.getConnection();
			String sql = "UPDATE KHOA_HOC" + "SET" + 
					"IDLop =?"+ 
					"IDMonHoc =?"+ 
					"IDGiangVien =?"+ 
					"NamHoc =?"+
					"WHERE IDKhoaLop =?";
			PreparedStatement pst = con.prepareStatement(sql);
			pst.setString(1, t.getNamHoc());
			pst.setString(2, t.getIdLop());
			pst.setString(3, t.getIdMonHoc());
			pst.setString(4, t.getIdGiangVien());
			pst.setString(5, t.getIdKhoa());
			
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
	public ArrayList<KhoaHoc> SelectAll() {
		ArrayList<KhoaHoc> EQ = new ArrayList<KhoaHoc>();
		try {
			
			Connection con = JDBCUtil.getConnection();
			String sql = "SELECT * FROM KHOA_HOC";
			PreparedStatement pst = con.prepareStatement(sql);
			System.out.print(sql);
			ResultSet rs = pst.executeQuery();
			
			while(rs.next()) {
				String idKhoa = rs.getString("IDKhoaLop");
				String idLop = rs.getString("IDLop");
				String idMonHoc = rs.getString("IDMonHoc");
				String idGiangVien = rs.getString("IDGiangVien");
				String Namhoc = rs.getString("NamHoc");
				
				KhoaHoc kh = new KhoaHoc(idKhoa, idLop, idMonHoc, idGiangVien, Namhoc);
				EQ.add(kh);
			}
			
			JDBCUtil.closeConnection(con);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return EQ;
	}

	@Override
	public KhoaHoc SelectByID(KhoaHoc t) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<KhoaHoc> SelectCondition(String condition) {
		// TODO Auto-generated method stub
		return null;
	}

}
