package Model;

public class Khu {
	private String idKhu;
	private String tenKhu;
	
	public Khu() {
		super();
	}

	public Khu(String idKhu, String tenKhu) {
		super();
		this.idKhu = idKhu;
		this.tenKhu = tenKhu;
	}

	public String getIdKhu() {
		return idKhu;
	}

	public void setIdKhu(String idKhu) {
		this.idKhu = idKhu;
	}

	public String getTenKhu() {
		return tenKhu;
	}

	public void setTenKhu(String tenKhu) {
		this.tenKhu = tenKhu;
	}

	@Override
	public String toString() {
		return "Khu [idKhu=" + idKhu + ", tenKhu=" + tenKhu + "]";
	}
	
}
