package chap08.book.Example.p0802;

public class SmartTelevision implements RemoteControl, Searchable {
	// 필드
	private int volum;
	
	// turnOn() 추상 메소드의 실체 메소드
	public void turnOn() {
		System.out.println("TV를 켭니다.");
	}
	
	// turnOff() 추상 메소드의 실체 메소드
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	// setVolum() 추상 메소드의 실체 메소드
	// 인터페이스 상수를 이용해서 volum필드의 값을 제한
	public void setVolum(int volum) {
		if (volum > RemoteControl.MAX_VOLUM) {
			this.volum = RemoteControl.MAX_VOLUM;
		} else if(volum < RemoteControl.MIN_VOLUM) {
			this.volum = RemoteControl.MIN_VOLUM;
		} else {
			this.volum = volum;
		}
		System.out.println("현재 TV 볼륨: " + this.volum);
	}
	
	public void search(String url) {
		System.out.println(url + "을 검색합니다.");
	}
}
