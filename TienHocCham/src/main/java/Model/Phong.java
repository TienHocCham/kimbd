package Model;

public class Phong {
	private String idPhong;
	private String idLoaiPhong;
	private String idTinhTrang;
	private String idKhu;
	private int Succhua;
	
	public Phong() {
		super();
	}

	public Phong(String idPhong, String idLoaiPhong, String idTinhTrang, String idKhu, int succhua) {
		super();
		this.idPhong = idPhong;
		this.idLoaiPhong = idLoaiPhong;
		this.idTinhTrang = idTinhTrang;
		this.idKhu = idKhu;
		Succhua = succhua;
	}

	public String getIdPhong() {
		return idPhong;
	}

	public void setIdPhong(String idPhong) {
		this.idPhong = idPhong;
	}

	public String getIdLoaiPhong() {
		return idLoaiPhong;
	}

	public void setIdLoaiPhong(String idLoaiPhong) {
		this.idLoaiPhong = idLoaiPhong;
	}

	public String getIdTinhTrang() {
		return idTinhTrang;
	}

	public void setIdTinhTrang(String idTinhTrang) {
		this.idTinhTrang = idTinhTrang;
	}

	public String getIdKhu() {
		return idKhu;
	}

	public void setIdKhu(String idKhu) {
		this.idKhu = idKhu;
	}

	public int getSucchua() {
		return Succhua;
	}

	public void setSucchua(int succhua) {
		Succhua = succhua;
	}

	@Override
	public String toString() {
		return "Phong [idPhong=" + idPhong + ", idLoaiPhong=" + idLoaiPhong + ", idTinhTrang=" + idTinhTrang
				+ ", idKhu=" + idKhu + ", Succhua=" + Succhua + "]";
	}
	
}
