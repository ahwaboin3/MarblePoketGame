import java.util.Scanner;

public class MarblePoketView {
	
	private Scanner scanner=new Scanner(System.in);
	
	public MarblePoketDto putMarblePoket(MarblePoketDto marblePoketDto) {
		System.out.print("���� ������ �Է�:");
		String ownerName=scanner.nextLine();
		marblePoketDto.setOwnerName(ownerName);
		marblePoketDto.setMarbleNumber(20);
		return marblePoketDto;
	}
	
	public void getMarblePoket(MarblePoketDto marblePoketDto) {
		System.out.println(marblePoketDto.toString());
	}
}
