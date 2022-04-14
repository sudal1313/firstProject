/**
 * Class name
 *
 * Vsersion information
 *
 * Date
 *
 * Copyright notice(저작권 표시)
 *
 */

//페키지 정보
package code.conventions;

//improt 정보
import java.util.*;

/**
 *
 * Class Description(클레스 정보)
 *
 * @author jhKim
 *
 * @version 1.0.0
 *
 */
public class javaConvention {
    //클레스 구현 코멘트 주석
    //static 변수가 먼저 선언. 동일한 레벨일 경우 public -> protected -> default -> private 순서
    public static int age;
    protected static  int phone;
    static int coffeeSize;
    private static int cokeSize;

    public int age2;
    protected int phone2;
    int coffeeSize2;
    private int cokeSize2;

    /**
     * 생성자 관련 코멘트
     */
    public void mothod1(){}

    /**
     *
     * 메소드 관련 코멘트
     * @param param1 description
     * @param param2 description
     */
    public String method2(int param1, Object param2) {
        //return은 명확하게 return에서 하위 메소드 호출 방식으로 반환은 자제
        String name = "test";
        return name.length() > 3 ? name : "test2";
    }
}
