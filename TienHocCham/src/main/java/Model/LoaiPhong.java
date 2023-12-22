package Model;

public class LoaiPhong {
	private String idLoaiPhong;
	private String tenLoaiPhong;
	
	public LoaiPhong() {
		super();
	}

	public LoaiPhong(String idLoaiPhong, String tenLoaiPhong) {
		super();
		this.idLoaiPhong = idLoaiPhong;
		this.tenLoaiPhong = tenLoaiPhong;
	}

	public String getIdLoaiPhong() {
		return idLoaiPhong;
	}

	public void setIdLoaiPhong(String idLoaiPhong) {
		this.idLoaiPhong = idLoaiPhong;
	}

	public String getTenLoaiPhong() {
		return tenLoaiPhong;
	}

	public void setTenLoaiPhong(String tenLoaiPhong) {
		this.tenLoaiPhong = tenLoaiPhong;
	}

	@Override
	public String toString() {
		return "LoaiPhong [idLoaiPhong=" + idLoaiPhong + ", tenLoaiPhong=" + tenLoaiPhong + "]";
	}
	
}
