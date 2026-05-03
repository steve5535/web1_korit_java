package _18_Singleton.layer;

// 비즈니스로직 처리하는 객체
public class UserService {
    private static UserService instance;
    private UserRepo userRepository;

    private UserService(UserRepo userRepository) {
        this.userRepository = userRepository;
    }

    public static UserService getInstance(UserRepo userRepository) {
        if (instance == null) {
            instance = new UserService(userRepository);
        }
        return instance;
    }

    // 회원가입
    // 실제 스프링에서는 객체로 묶어서 받음
    public void signUp(SingUpReqDto dto) throws Exception {
        User[] users = userRepository.findAll();
        String id = dto.getUsername();
        String password = dto.getPassword();

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
            return;
        }

        System.out.println("회원이 가득 찼습니다.");

    }

    // 전체 회원 조회
    public void showAllUsers() throws Exception {
        User[] users = userRepository.findAll();

        System.out.println("== 회원 명단 ==");
        int count = 0;
        for (User user : users) {
            if (user == null) {
                continue;
            }
            count++;

            String username = user.getUsername();
            System.out.println(count + "." + username);
        }
    }

    public String signIn(String username, String password) throws Exception {
        // 유저들 받아와서
        // for 순회하면서 아이디, 패스워드 모두 동일한지 탐색
        // 성공시 -> "로그인성공!" 리턴
        // 실패시 -> "아이디 혹은 비밀번호가 틀렸습니다." 리턴
        User[] users = userRepository.findAll();
        for (User user : users) {
            if (user == null) {
                continue;
            }
            boolean isValidUser = user.getUsername().equals(username) && user.getPassword().equals(password);
            if (isValidUser) {
                return "로그인 성공!";
            }
        }

        // for문 순회중에 매칭되는 케이스가 단 하나도 없는 경우
        return "아이디 혹은 비밀번호가 틀렸습니다.";
    }

}
