package Model;

public class Lich {
	private String idLop;
	private String idMonHoc;
	private String idGiangVien;
	private String idPhong;
	private String Thu;
	private int TietBD;
	private int TietKT;
	
	public Lich() {
		super();
	}

	public Lich(String idLop, String idMonHoc, String idGiangVien, String idPhong, String thu, int tietBD, int tietKT) {
		super();
		this.idLop = idLop;
		this.idMonHoc = idMonHoc;
		this.idGiangVien = idGiangVien;
		this.idPhong = idPhong;
		Thu = thu;
		TietBD = tietBD;
		TietKT = tietKT;
	}

	public String getIdLop() {
		return idLop;
	}

	public void setIdLop(String idLop) {
		this.idLop = idLop;
	}

	public String getIdMonHoc() {
		return idMonHoc;
	}

	public void setIdMonHoc(String idMonHoc) {
		this.idMonHoc = idMonHoc;
	}

	public String getIdGiangVien() {
		return idGiangVien;
	}

	public void setIdGiangVien(String idGiangVien) {
		this.idGiangVien = idGiangVien;
	}

	public String getIdPhong() {
		return idPhong;
	}

	public void setIdPhong(String idPhong) {
		this.idPhong = idPhong;
	}

	public String getThu() {
		return Thu;
	}

	public void setThu(String thu) {
		Thu = thu;
	}

	public int getTietBD() {
		return TietBD;
	}

	public void setTietBD(int tietBD) {
		TietBD = tietBD;
	}

	public int getTietKT() {
		return TietKT;
	}

	public void setTietKT(int tietKT) {
		TietKT = tietKT;
	}

	@Override
	public String toString() {
		return "Lich [idLop=" + idLop + ", idMonHoc=" + idMonHoc + ", idGiangVien=" + idGiangVien + ", idPhong="
				+ idPhong + ", Thu=" + Thu + ", TietBD=" + TietBD + ", TietKT=" + TietKT + "]";
	}
	
}
