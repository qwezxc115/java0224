package chap08.book.Example.p0802;

public interface RemoteControl {

	// 상수 필드 선언(public static final 특성을 가짐)
	public int MAX_VOLUM = 10;
	public int MIN_VOLUM = 0;

	// 추상 메소드 선언
	public void turnOn();

	public void turnOff();

	public void setVolume(int volum);

	// 디폴트 메소드
	// 실행 내용까지 작성
	default void setMute(boolean mute) {
		if (mute) {
			System.out.println("무음 처리합니다.");
		} else {
			System.out.println("무음 해제합니다.");
		}
	}

	// 정적 메소드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
