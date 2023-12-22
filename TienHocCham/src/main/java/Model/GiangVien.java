package Model;

public class GiangVien {
	private String idGiangVien;
	private String idKhoaQL;
	private String TenGV;
	
	public GiangVien() {
		super();
	}

	public GiangVien(String idGiangVien, String idKhoaQL, String tenGV) {
		super();
		this.idGiangVien = idGiangVien;
		this.idKhoaQL = idKhoaQL;
		TenGV = tenGV;
	}

	public String getIdGiangVien() {
		return idGiangVien;
	}

	public void setIdGiangVien(String idGiangVien) {
		this.idGiangVien = idGiangVien;
	}

	public String getIdKhoaQL() {
		return idKhoaQL;
	}

	public void setIdKhoaQL(String idKhoaQL) {
		this.idKhoaQL = idKhoaQL;
	}

	public String getTenGV() {
		return TenGV;
	}

	public void setTenGV(String tenGV) {
		TenGV = tenGV;
	}

	@Override
	public String toString() {
		return "GiangVien [idGiangVien=" + idGiangVien + ", idKhoaQL=" + idKhoaQL + ", TenGV=" + TenGV + "]";
	}

	
	
}
