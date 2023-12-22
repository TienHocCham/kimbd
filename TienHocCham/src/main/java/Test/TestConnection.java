package Test;

import java.util.ArrayList;
import Dao.GiangVienDAO;
import Model.GiangVien;


public class TestConnection {
	public static void main(String[] args) {
		ArrayList<GiangVien> list = GiangVienDAO.GetInstance().SelectAll();
		for(GiangVien gvien : list) {
			System.out.println(gvien.toString());
		}
		
	}
}
