package _18_Singleton.layer;

// 사용자 정보를 담는 클래스
// entity -> database 테이블 컬럼과 필드가 1:1 매칭되는 클래스
public class User {
    String username;
    String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public String getLine() {
        return username + "," + password;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
