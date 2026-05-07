package _24_Lambda;

// 컴파일러가 인터페이스에 메서드 하나만 있는지 검사
@FunctionalInterface
public interface StringChecker {
    boolean check(String s);
}
