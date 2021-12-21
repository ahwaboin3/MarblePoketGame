
public class MarblePoketDto {
	
	private String ownerName;
	private int marbleNumber;
	
	public String getOwnerName() {
		return ownerName;
	}
	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}
	public int getMarbleNumber() {
		return marbleNumber;
	}
	public void setMarbleNumber(int marbleNumber) {
		this.marbleNumber = marbleNumber;
	}
	
	@Override
	public String toString() {
		return "MarblePoketDto [ownerName=" + ownerName + ", marbleNumber=" + marbleNumber + "]";
	}
}
