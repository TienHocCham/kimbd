package Model;

public class TinhTrangP {
	private String idTinhTrang;
	private String tenTinhTrang;
	
	public TinhTrangP() {
		super();
	}

	public TinhTrangP(String idTinhTrang, String tenTinhTrang) {
		super();
		this.idTinhTrang = idTinhTrang;
		this.tenTinhTrang = tenTinhTrang;
	}

	public String getIdTinhTrang() {
		return idTinhTrang;
	}

	public void setIdTinhTrang(String idTinhTrang) {
		this.idTinhTrang = idTinhTrang;
	}

	public String getTenTinhTrang() {
		return tenTinhTrang;
	}

	public void setTenTinhTrang(String tenTinhTrang) {
		this.tenTinhTrang = tenTinhTrang;
	}

	@Override
	public String toString() {
		return "TinhTrangP [idTinhTrang=" + idTinhTrang + ", tenTinhTrang=" + tenTinhTrang + "]";
	}
	
}
