
public class MarblePoketController {
	private MarblePoketView marblePoketView=new MarblePoketView();
	
	public void initMarblePoket() {
		//���� �ָӴ� ����
		MarblePoketDto marblePoketDto=new MarblePoketDto();
		marblePoketView.putMarblePoket(marblePoketDto);
		//�ܼ� ���
		marblePoketView.getMarblePoket(marblePoketDto);
	}

}
