/**
 * Clock 클래스는 나의 위치에서 현재 시간을 표현합니다.
 * 시간과 분 정보를 문자열로 저장하고, 필요에 따라 정수 형태로 반환하는 메소드를 제공합니다.
 */
public class Clock {
    private String stringHours;
    private String stringMinutes;

    /**
     * Clock 클래스의 생성자입니다.
     * 현재 시간을 얻어 문자열 형태로 저장합니다.
     */
    public Clock() {
        stringHours = java.time.LocalTime.now().toString();
        stringMinutes = java.time.LocalTime.now().toString();
    }

    /**
     * 현재 시간의 '시' 부분을 정수 형태로 반환하는 메소드입니다.
     * @return 현재 시간의 '시' 부분
     */
    public int getHours() {
        return Integer.parseInt(stringHours.substring(0, 2));
    }

    /**
     * 현재 시간의 '분' 부분을 정수 형태로 반환하는 메소드입니다.
     * @return 현재 시간의 '분' 부분
     */
    public int getMinutes() {
        return Integer.parseInt(stringMinutes.substring(3, 5));
    }

    /**
     * 현재 시간을 "시:분" 형태의 문자열로 반환하는 메소드입니다.
     * @return "시:분" 형태의 현재 시간
     */
    public String getTime() {
        return getHours() + ":" + getMinutes();
    }
}
