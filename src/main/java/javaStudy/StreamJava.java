package main.java.javaStudy;


import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamJava {
    public static void main(String[] args) {
        /**
         * stream은 원본을 변경하지 않는다.
         * 스트림은 최종연산이 끝나면 다시 사용하지 못한다.
         */
        List<Integer> list = Arrays.asList(3,2,1,2,5);
        List<Integer> sortedList = list.stream().filter(v->v==1 || v==3).sorted().collect(Collectors.toList());
        System.out.println(list);
        System.out.println(sortedList);
        /**
         * stream은 지연된 연산 즉 중간연산이 한번 호출될떄마다 바로바로 하는게 아니라 표시만하고 있다가 나중에 수행한다.
         * Lazy Evaluation https://dororongju.tistory.com/137 (꼭 참조!!!)
         */
        IntStream intStream = new Random().ints(1,46); //무한 연산인데
        intStream.distinct().limit(6).sorted().forEach(i->System.out.println()); //중복을 제거하고 6개만 출력이 가능 why? 지연된 연산을 하므로
    }
}
