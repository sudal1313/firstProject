package javaStudy;


import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exceptionJava {
    //Checked Exception Example
    void test() throws IOException {
        File file = new File("/test.txt");
        boolean b = file.createNewFile();
    }

    public static void slee(int millisecond) {
        try {
            Thread.sleep(millisecond);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
    }

    //UnChecked Exception Example
    void test2() {
        int a = 16;

        try {
            int b = a / 0;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /*예외처리 방식
    1.예외가 발생하면 다른 작업 흐름으로 유도하는 예외복구
    2.예외를 처리하지 않고 호출한쪽으로 던지는 예외회피
    3.예외를 더욱 자세한 예외로 전환하여 던지는 예외전환
    */

    //예외복구 - 예외가 발생해도 어플리케이션은 정상 진행
    private void doSomething() throws retryException {
        int MAX_RETRY = 6;
        int maxRetry = MAX_RETRY;
        while (maxRetry-- > 0) {
            try {
                // 예외가 발생할 가능성이 있는 시도
                // 작업 성공 시 리턴
                return;
            } catch (Exception e) {
                // 로그 출력, 정해진 시간 만큼 대기
            } finally {
                // 리소스 반납 및 정리 작업
            }
        }
        throw new retryException(); // 최대 재시도 횟수를 넘기면 직접 예외 발생
    }

    class retryException extends Throwable {
    }

    ;

    /*
    예외처리 회피
    간단해 보이지만 신중해야 하는 로직이다.
    예외가 발생하면 **throws**를 통해 호출한 쪽으로 예외를 던지고 그 처리를 회피하는 것이다.
    하지만 무책임하게 던지는 것은 위험하다.
    호출한 쪽에서 다시 예외를 받아 처리하도록 하거나, 해당 메소드에서 이 예외를 던지는 것이 최선의 방법이라는 확신이 있을 때만 사용해야 한다.
    */
    public boolean add() throws SQLException {
        return false;
    }

    /*
    예외 전환
    예외를 잡아서(catch) 다른 예외를 던지는 것이다.
    호출한 쪽에서 예외를 받아서 처리할 때 조금 더 명확히 인지할 수 있도록 돕기 위한 방법이다.
    어떤 예외인지 분명해야 처리가 수월해지기 때문이다.
    예를 들어 Checked Exception중 복구가 불가능한 예외가 잡혔다면, 이를 Unchecked Exception으로 전환하여 다른 계층에서 일일이 예외를 선언할 필요가 없도록 할 수도 있다.
    */
    public void slee2(int millisecond) {
        try {
            File file = new File("/test.txt");
            boolean b = add();
            List<String> listAge = new ArrayList<>();
            listAge.stream().map(c->c.toLowerCase()).collect(Collectors.joining());

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
