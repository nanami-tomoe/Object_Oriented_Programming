/**
 * WorldClock 클래스는 Clock 클래스를 확장하여 특정 시간대의 시간을 표현합니다.
 * 시간대는 UTC에서의 오프셋을 정수로 표현합니다.
 */
public class WorldClock extends Clock {
    private int offset;

    /**
     * WorldClock 클래스의 생성자입니다.
     * 시간대 오프셋을 인수로 받아 저장합니다.
     * @param offset 시간대 오프셋
     */
    public WorldClock(int offset) {
        super();
        this.offset = offset;
    }

    /**
     * 현재 시간의 '시' 부분을 시간대 오프셋을 반영하여 정수 형태로 반환하는 메소드입니다.
     * @return 시간대 오프셋을 반영한 '시' 부분
     */
    @Override
    public int getHours() {
        int intHours = super.getHours() + offset;

        if(intHours < 0) {
            intHours += 24;
        } else if(intHours >= 24) {
            intHours -= 24;
        }

        return intHours;
    }
}
