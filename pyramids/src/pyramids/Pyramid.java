package pyramids;

public class Pyramid {
	
	String pharaoh;
	String modernName;
	String site;
	double height; 
	
	public Pyramid(String pharaoh, String modernName, String site, double height) {
		this.pharaoh = pharaoh;
		this.modernName = modernName;
		this.site = site;
		this.height = height;
	}

	public String getPharaoh() {
		return pharaoh;
	}

	public void setPharaoh(String pharaoh) {
		this.pharaoh = pharaoh;
	}

	public String getModernName() {
		return modernName;
	}

	public void setModernName(String modernName) {
		this.modernName = modernName;
	}

	public String getSite() {
		return site;
	}

	public void setSite(String site) {
		this.site = site;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public String toString() {
		return " Pyramid [pharaoh = " + pharaoh + ", modernName = " + modernName + ", site = " 
				+ site + ", height = " + (height !=0 ? height : "-") + "]";
	}

}
