package test;

public class College {
	
	

	public String getCollege() {
		return college;
	}
	public void setCollege(String college) {
		this.college = college;
	}
	public String getDistrict() {
		return district;
	}
	public void setDistrict(String district) {
		this.district = district;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	public int getOC_B() {
		return OC_B;
	}
	public void setOC_B(int oC_B) {
		OC_B = oC_B;
	}
	public int getOC_G() {
		return OC_G;
	}
	public void setOC_G(int oC_G) {
		OC_G = oC_G;
	}
	public int getBCA_B() {
		return BCA_B;
	}
	public void setBCA_B(int bCA_B) {
		BCA_B = bCA_B;
	}
	public int getBCA_G() {
		return BCA_G;
	}
	public void setBCA_G(int bCA_G) {
		BCA_G = bCA_G;
	}
	public int getBCB_B() {
		return BCB_B;
	}
	public void setBCB_B(int bCB_B) {
		BCB_B = bCB_B;
	}
	public int getBCB_G() {
		return BCB_G;
	}
	public void setBCB_G(int bCB_G) {
		BCB_G = bCB_G;
	}
	public int getBCC_B() {
		return BCC_B;
	}
	public void setBCC_B(int bCC_B) {
		BCC_B = bCC_B;
	}
	public int getBCC_G() {
		return BCC_G;
	}
	public void setBCC_G(int bCC_G) {
		BCC_G = bCC_G;
	}
	public int getBCD_B() {
		return BCD_B;
	}
	public void setBCD_B(int bCD_B) {
		BCD_B = bCD_B;
	}
	public int getBCD_G() {
		return BCD_G;
	}
	public void setBCD_G(int bCD_G) {
		BCD_G = bCD_G;
	}
	public int getBCE_B() {
		return BCE_B;
	}
	public void setBCE_B(int bCE_B) {
		BCE_B = bCE_B;
	}
	public int getBCE_G() {
		return BCE_G;
	}
	public void setBCE_G(int bCE_G) {
		BCE_G = bCE_G;
	}
	public int getSC_B() {
		return SC_B;
	}
	public void setSC_B(int sC_B) {
		SC_B = sC_B;
	}
	public int getSC_G() {
		return SC_G;
	}
	public void setSC_G(int sC_G) {
		SC_G = sC_G;
	}
	public int getST_B() {
		return ST_B;
	}
	public void setST_B(int sT_B) {
		ST_B = sT_B;
	}
	public int getST_G() {
		return ST_G;
	}
	public void setST_G(int sT_G) {
		ST_G = sT_G;
	}
	String college;
	String district;
	String branch;
	int OC_B;
	int OC_G;
	int BCA_B;
	int BCA_G;
	int BCB_B;
	int BCB_G;
	int BCC_B;
	int BCC_G;
	int BCD_B;
	int BCD_G;
	int BCE_B;
	int BCE_G;
	int SC_B;
	int SC_G;
	int ST_B;
	int ST_G;
	public College(String college, String district, String branch, int oC_B, int oC_G, int bCA_B, int bCA_G, int bCB_B,
			int bCB_G, int bCC_B, int bCC_G, int bCD_B, int bCD_G, int bCE_B, int bCE_G, int sC_B, int sC_G, int sT_B,
			int sT_G) {
		super();
		this.college = college;
		this.district = district;
		this.branch = branch;
		OC_B = oC_B;
		OC_G = oC_G;
		BCA_B = bCA_B;
		BCA_G = bCA_G;
		BCB_B = bCB_B;
		BCB_G = bCB_G;
		BCC_B = bCC_B;
		BCC_G = bCC_G;
		BCD_B = bCD_B;
		BCD_G = bCD_G;
		BCE_B = bCE_B;
		BCE_G = bCE_G;
		SC_B = sC_B;
		SC_G = sC_G;
		ST_B = sT_B;
		ST_G = sT_G;
	}
	@Override
	public String toString() {
		return "College [college=" + college + ", district=" + district + ", branch=" + branch + ", OC_B=" + OC_B
				+ ", OC_G=" + OC_G + ", BCA_B=" + BCA_B + ", BCA_G=" + BCA_G + ", BCB_B=" + BCB_B + ", BCB_G=" + BCB_G
				+ ", BCC_B=" + BCC_B + ", BCC_G=" + BCC_G + ", BCD_B=" + BCD_B + ", BCD_G=" + BCD_G + ", BCE_B=" + BCE_B
				+ ", BCE_G=" + BCE_G + ", SC_B=" + SC_B + ", SC_G=" + SC_G + ", ST_B=" + ST_B + ", ST_G=" + ST_G + "]";
	}
	
}
