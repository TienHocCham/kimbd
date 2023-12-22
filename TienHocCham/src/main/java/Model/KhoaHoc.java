package Model;

public class KhoaHoc {
	private String idKhoa;
	private String idLop;
	private String idMonHoc;
	private String idGiangVien;
	private String NamHoc;
	
	public KhoaHoc() {
		super();
	}

	public KhoaHoc(String idKhoa, String idLop, String idMonHoc, String idGiangVien, String namHoc) {
		super();
		this.idKhoa = idKhoa;
		this.idLop = idLop;
		this.idMonHoc = idMonHoc;
		this.idGiangVien = idGiangVien;
		NamHoc = namHoc;
	}

	public String getIdKhoa() {
		return idKhoa;
	}

	public void setIdKhoa(String idKhoa) {
		this.idKhoa = idKhoa;
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

	public String getNamHoc() {
		return NamHoc;
	}

	public void setNamHoc(String namHoc) {
		NamHoc = namHoc;
	}

	@Override
	public String toString() {
		return "KhoaHoc [idKhoa=" + idKhoa + ", idLop=" + idLop + ", idMonHoc=" + idMonHoc + ", idGiangVien="
				+ idGiangVien + ", NamHoc=" + NamHoc + "]";
	}
	
	
}
