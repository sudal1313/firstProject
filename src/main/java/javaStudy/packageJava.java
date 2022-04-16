package javaStudy;

/***
 *
 * #Package
 * 패키지의 종류에는 사용자정의 패키지와 Built-in 패키지 두종류로 나뉜다.
 * Built-in패키지종류
 * java.lang : language support클래스들을 포함하는 패키지 (자동으로 import 되기 때문에 바로 사용 가능 ex String 클래스 System 클래스)
 * java.io : 입출력 기능 지원하는 클래스
 * java.util : 자료구조 구현을 위한 유틸 클래스 (Linked List, Dictionary...)
 * java.awt : gui컴포넌트 구현을 귀한 클래스
 * java.net : 네트워킹을 지원하기 위한 클래스
 * JAVA는 패키지의 가장 상위 디렉토리(root)에서 실행해야한다는 약속이 있기 때문에 해당 패키지로 가서 컴파일 하지 않는다.
 * 소스의 가장 첫 줄에 있어야하고, 패키지 선언은 소스 하나에 하나만 있어야 한다.
 * 패키지 이름을 java로 시작하면 안된다
 * 모든 클레스는 정의된 클래스 이름과 패키지 이름이 있다. 이 둘을 합쳐야만 완전하게 클래스를 표현한다고 할 수 있으며 FQCN이라고 한다(Full Qualified class name)
 * 모두 소문자여야 한다.
 * 즉 자바에서 java.lang패키지는 기본적인 것들이라 자바가 알아서 java.lang클래스를 불러온다
 * 
 * 접근제어자
 * public 누구나 접근가능
 * protected 같은패키지 혹은 상속
 * defalut(package-private) 같은패키지
 * private 같은 클레스 안에서만
 *
 * 참고로 하나의 소스파일 내에서 2개 이상의 클래스를 정의하는 경우(권장X), 파일 이름과 같은 클래스명을 제외한 클레스는
 * package private여서 같은 페키지 내에 있는 클래스들만, 이 클래스의 객체를 생성하고, 이용할 수 있다.
 *
 * #클레스패스
 * 클래스를 찾기 위한 경로
 * jvm이(누가) 프로그램을 실행할 때(언제), 클래스파일을 찾는 데(왜) 클래스 패스(기준이되는 파일 경로)(무엇을)을 사용한다.
 * 즉 Jvm은 classpath의 경로를 확인하여 라이브러리 클래스들의 위치를 참조하게 된다.
 * java 파일은 java 컴파일러에 의해 소스코드가 바이트코드로 변환 -> jre(java runtime)으로 .class파일에 포함된 명령을 실행하려면 이 파일을 찾을 수 있어야된다.
 * 이때 클래스패스에 지정된 경로를 사용한다.
 * classpath는 .class파일이 포함된 디렉토리와 파일을 콜론(;)으로 구분한 목록이다.
 *
 */
public class packageJava {
}
