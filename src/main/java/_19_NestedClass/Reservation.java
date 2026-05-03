package _19_NestedClass;

// 예약클래스
// 내부클래스 - static 내부클래스(빌더패턴으로)
public class Reservation {
    private String username;
    private String date;
    private int personCount;
    private int price;

    // 일반내부클래스 안쓰는이유
    // -> 메모리 누수 때문
    /*
        내부클래스의 객체는 바깥클래스의 객체가 존재해야 생성가능
        -> 내부객체는 항상 바깥객체를 참조하고 있다.
        -> 내부객체는 사용되는데 바깥객체는 사용되지 않는상황
        -> GC가 바깥객체를 회수대상으로 생각x -> 메모리 누수
     */

    // 빌터패턴 - 생성자를 대체하는 패턴
    // 필드가 많은상황에서 - 오버로딩으로는 경우의 수가 너무 많음

    // 1. private로 외부 생성을 막는다
    private Reservation(Builder builder) {
        // 4. 빌더객체의 필드값을 복사해옴
        this.username = builder.username;
        this.date = builder.date;
        this.personCount = builder.personCount;
        this.price = builder.price;
    }

    // 외부에서 Builder를 접근하기 쉽게
    public static Builder builder() {
        return new Builder(); // 빌더의 기본생성자(필드 초기화 안되어있음)
    }


    // 스태틱 내부 클래스는 별개의 클래스 취급(사실상 다른파일)
    public static class Builder {
        // 2. 바깥 클래스의 필드구성을 동일하게 가져간다
        private String username;
        private String date;
        private int personCount;
        private int price;

        // 3. setter들을 정의
        public Builder username(String username){
            // 여기서 this는 ? Builder 객체
            this.username = username;
            return this;
        }

        public Builder date(String date) {
            this.date = date;
            return this;
        }

        public Builder personCount(int personCount){
            // 여기서 this는 ? Builder 객체
            this.personCount = personCount;
            return this;
        }

        public Builder price(int price) {
            this.price = price;
            return this;
        }

        // 5. 바깥클래스의 private생성자를 빌더가 호출
        // static 내부클래스는 다른클래스 취급이지만,
        // private 필드, 메서드 접근이 가능하다
        public Reservation build() {
            Reservation r = new Reservation(this);
            return r;
        }
    }

}
