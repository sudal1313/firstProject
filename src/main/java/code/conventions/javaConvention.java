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

    //보이스카우트 원칙 : 처음에 작성된 코드보다 항상 더 나은 코드로 수정한다.

    public String guardClause() {
        //bad example
        String name = "jhKim";
        if (name.equals("lee")) {
            if(name.equals("choi")) {
                return "fail";
            }
        }

        //guardClause
        if(name.equals("lee")) {
            return "fail";
        }

        if(name.equals("choi")) {
            return "fail";
        }

        //null반환을 하지 않도록하여 null 체크 줄이기
        //Syntax Sugar : 문법을 더욱 간결하게 사용하기
        //짧은코드는 삼항연산자로
        //메서드는 행동을 이름의 맨 앞에.. ex findUsers , checkUsers , doUsers 등
        //언더바가 들어가는 스네이크케이스 user_name ,  카멜케이스 userName , 파스칼케이스 UserNmae
        //주석이 필요한 복잡한 로직은 함수로 분리하고, 주석 대신 함수명으로 사용
        //3줄이상이 중복되는 경우는 함수로 분리
        //클레스와 함수에 너무 많은 기능은 자제, 많은 기능이 묶인 함수면 기능별로 함수 분리
        //인수는 되도록 4개를 넘지 않도록
        //복잡한 조건은 캡슐화

     return "";
    }
}
