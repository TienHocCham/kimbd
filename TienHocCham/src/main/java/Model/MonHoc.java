package Model;

public class MonHoc {
	private String idMonHoc;
	private String idKhoaQL;
	private String tenMonHoc;
	private int TinchiLT;
	private int TinchiTH;
	
	public MonHoc() {
		super();
	}

	public MonHoc(String idMonHoc, String idKhoaQL, String tenMonHoc, int tinchiLT, int tinchiTH) {
		super();
		this.idMonHoc = idMonHoc;
		this.idKhoaQL = idKhoaQL;
		this.tenMonHoc = tenMonHoc;
		TinchiLT = tinchiLT;
		TinchiTH = tinchiTH;
	}

	public String getIdMonHoc() {
		return idMonHoc;
	}

	public void setIdMonHoc(String idMonHoc) {
		this.idMonHoc = idMonHoc;
	}

	public String getIdKhoaQL() {
		return idKhoaQL;
	}

	public void setIdKhoaQL(String idKhoaQL) {
		this.idKhoaQL = idKhoaQL;
	}

	public String getTenMonHoc() {
		return tenMonHoc;
	}

	public void setTenMonHoc(String tenMonHoc) {
		this.tenMonHoc = tenMonHoc;
	}

	public int getTinchiLT() {
		return TinchiLT;
	}

	public void setTinchiLT(int tinchiLT) {
		TinchiLT = tinchiLT;
	}

	public int getTinchiTH() {
		return TinchiTH;
	}

	public void setTinchiTH(int tinchiTH) {
		TinchiTH = tinchiTH;
	}

	@Override
	public String toString() {
		return "MonHoc [idMonHoc=" + idMonHoc + ", idKhoaQL=" + idKhoaQL + ", tenMonHoc=" + tenMonHoc + ", TinchiLT="
				+ TinchiLT + ", TinchiTH=" + TinchiTH + "]";
	}
	
}
