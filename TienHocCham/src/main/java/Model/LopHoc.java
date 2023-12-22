package Model;

public class LopHoc {
	private String idLop;
	private String idKhoaQL;
	private String tenLop;
	private int Siso;
	
	public LopHoc() {
		super();
	}

	public LopHoc(String idLop, String idKhoaQL, String tenLop, int siso) {
		super();
		this.idLop = idLop;
		this.idKhoaQL = idKhoaQL;
		this.tenLop = tenLop;
		Siso = siso;
	}

	public String getIdLop() {
		return idLop;
	}

	public void setIdLop(String idLop) {
		this.idLop = idLop;
	}

	public String getIdKhoaQL() {
		return idKhoaQL;
	}

	public void setIdKhoaQL(String idKhoaQL) {
		this.idKhoaQL = idKhoaQL;
	}

	public String getTenLop() {
		return tenLop;
	}

	public void setTenLop(String tenLop) {
		this.tenLop = tenLop;
	}

	public int getSiso() {
		return Siso;
	}

	public void setSiso(int siso) {
		Siso = siso;
	}

	@Override
	public String toString() {
		return "LopHoc [idLop=" + idLop + ", idKhoaQL=" + idKhoaQL + ", tenLop=" + tenLop + ", Siso=" + Siso + "]";
	}
	
}
