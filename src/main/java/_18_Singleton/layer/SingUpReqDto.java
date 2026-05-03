package _18_Singleton.layer;

// dto: data transfer object
public class SingUpReqDto {
    private String username;
    private String password;

    // dto -> entity
    public User toUser() {
        return new User(this.username, this.password);
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public SingUpReqDto(String username, String password) {
        // 검증 로작
        this.username = username;
        this.password = password;
    }
}
