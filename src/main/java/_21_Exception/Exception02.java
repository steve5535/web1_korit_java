package _21_Exception;

public class Exception02 {
    // 디스패처: 분배한다, servlet: 요청을
    public static void dispatcherServlet(){
        // 예외를 처리하는 곳을 한군데로 격리
        try {
            // service에서 catch x -> controller에서 catch x
            // -> dispatcher catch o
            controller();
        } catch (MyRuntimeException e) {
            System.out.println(e.getMessage());
        }

    }

    public static void controller(){
        System.out.println("컨트롤러 호출 됨!");
        service();
    }

    // trows: 나를 호출한 쪽에서 try-catch 해라
    public static void service(){
        System.out.println("서비스 호출 됨!");

        // throw 의도적으로 예외를 발생시키겠다는 문법
        throw new MyRuntimeException("언체크예외 발생");
    }

    public static void main(String[] args) {
        /*
            서버의 코드들은 대부분 메서드단위
            Exception도 2가지 종류가 존재
            1. Checked Exception - 컴파일시점에 try-catch 강제 o
            2. Unchecked Exception - 컴파일시점에 try-catch 강제 x
         */

        dispatcherServlet();
    }
}
