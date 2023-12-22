package Model;

public class KhoaQL {
	private String idKhoaQL;
	private String khoaQL;
	
	public KhoaQL() {
		super();
	}

	public KhoaQL(String idKhoaQL, String khoaQL) {
		super();
		this.idKhoaQL = idKhoaQL;
		this.khoaQL = khoaQL;
	}

	public String getIdKhoaQL() {
		return idKhoaQL;
	}

	public void setIdKhoaQL(String idKhoaQL) {
		this.idKhoaQL = idKhoaQL;
	}

	public String getKhoaQL() {
		return khoaQL;
	}

	public void setKhoaQL(String khoaQL) {
		this.khoaQL = khoaQL;
	}

	@Override
	public String toString() {
		return "KhoaQL [idKhoaQL=" + idKhoaQL + ", khoaQL=" + khoaQL + "]";
	}
	
}
