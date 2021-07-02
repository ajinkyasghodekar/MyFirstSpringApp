package in.demo.d1;

public class Product {
	private String pcode;
	private double pcost;
	private String vendor;

	public Product() {
		super();
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public double getPcost() {
		return pcost;
	}

	public void setPcost(double pcost) {
		this.pcost = pcost;
	}

	public String getVendor() {
		return vendor;
	}

	public void setVendor(String vendor) {
		this.vendor = vendor;
	}

	@Override
	public String toString() {
		return "Product [pcode=" + pcode + ", pcost=" + pcost + ", vendor=" + vendor + "]";
	}
}
