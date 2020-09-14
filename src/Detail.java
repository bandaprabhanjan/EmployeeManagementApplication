import java.util.List;

public class Detail {

	private Integer detailId;
	private List<String> parts;

	public Detail(Integer detailId, List<String> parts) {
		super();
		this.detailId = detailId;
		this.parts = parts;
	}

	public Integer getDetailId() {
		return detailId;
	}

	public void setDetailId(Integer detailId) {
		this.detailId = detailId;
	}

	public List<String> getParts() {
		return parts;
	}

	public void setParts(List<String> parts) {
		this.parts = parts;
	}

}
