package _18_Singleton.layer;

// 비즈니스로직 처리하는 객체
public class UserService {
    private static UserService instance;
    private UserRepository userRepository;

    private UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public static UserService getInstance(UserRepository userRepository) {
        if (instance == null) {
            instance = new UserService(userRepository);
        }
        return instance;
    }

    // 회원가입
    // 실제 스프링에서는 객체로 묶어서 받음
    public void signUp(String id, String password) throws Exception {
        User[] users = userRepository.findAll();

        // 중복 아이디 검사
        // for문 돌면서 username 동일한가 체크
        for (User user : users) {
            if (user == null) {
                continue; // 빈칸은 건너뛰기
            }

            if (user.getUsername().equals(id)) {
                System.out.println("이미 존재하는 아이디입니다");
                return;
            }
        }

        // user 빈칸에 신규 유저를 삽입
        // for문 돌면서 null찾으면 user객체 만들어 넣기
        for (int i = 0; i < users.length; i++) {
            if(users[i] != null) {
                continue;
            }

            users[i] = new User(id, password);
            userRepository.saveAll(users);
            System.out.println("회원가입 성공");

        }

        System.out.println("회원이 가득 찼습니다.");

    }

}
