
public class MarblePoketController {
	private MarblePoketView marblePoketView=new MarblePoketView();
	
	public void initMarblePoket() {
		//구슬 주머니 생성
		MarblePoketDto marblePoketDto=new MarblePoketDto();
		marblePoketView.putMarblePoket(marblePoketDto);
		//콘솔 출력
		marblePoketView.getMarblePoket(marblePoketDto);
	}

}
