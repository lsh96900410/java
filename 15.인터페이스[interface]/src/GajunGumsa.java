
public class GajunGumsa {
	private GajunOnOff[] gajuns;

	public GajunOnOff[] getGajuns() {
		return gajuns;
	}

	public void setGajuns(GajunOnOff[] gajuns) {
		this.gajuns = gajuns;
	}
	
	public void gaumsa() {
		if(gajuns!=null) {
			for (GajunOnOff gajunOnOff : gajuns) {
				gajunOnOff.on();
				GajunVolume gajunVolume=(GajunVolume)gajunOnOff;
				gajunVolume.up();
				gajunVolume.down();
				gajunOnOff.off();
				System.out.println("검사끝 출고");
			}
		}else {
			System.out.println("가전제품 한개도없다");
		}
		
	}
}
