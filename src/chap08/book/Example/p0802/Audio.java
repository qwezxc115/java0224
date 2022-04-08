package chap08.book.Example.p0802;

public class Audio implements RemoteControl {
	// 필드
	private int volum;
	private boolean mute;

	// turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}

	//turnOff() 추상 메소드의 실체 메소드
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}

	// setVolum() 추상 메소드의 실체 메소드
	public void setVolum(int volum) {
		if (volum > RemoteControl.MAX_VOLUM) {
			this.volum = RemoteControl.MAX_VOLUM;
		} else if(volum < RemoteControl.MIN_VOLUM) {
			this.volum = RemoteControl.MIN_VOLUM;
		} else {
			this.volum = volum;
		}
		System.out.println("현재 Audio 볼륨: " + this.volum);
	}
	
	@Override
	public void setMute(boolean mute) {
		this.mute = mute;
		if(mute) {
			System.out.println("Audio 무음 처리합니다.");
		} else {
			System.out.println("Audio 무음 해제합니다.");
		}
	}
}
