package _18_Singleton.layer;

import java.io.*;

// 데이터베이스 연결(+쿼리)
// DB대신 텍스트 파일을 이용
public class UserRepository implements UserRepo {
    public static UserRepository instance = new UserRepository();
    private UserRepository() {};
    public static UserRepository getInstance() {
        return instance;
    }

    private final String FILE_NAME = "user.txt";
    private final int MAX_USER_COUNT = 10;

    // 쿼리로 대체될 코드들

    // 파일에서 유저 목록을 읽어와서 배열로 리턴
    // select * from users;
    public User[] findAll() throws Exception {
        User[] users = new User[MAX_USER_COUNT];

        File file = new File(FILE_NAME);
        if (!file.exists()) {
            file.createNewFile();
        }

        // 파일을 문자열로 읽어오세요
        FileReader fr = new FileReader(FILE_NAME);
        // 읽은걸 버퍼에 넣으세요
        BufferedReader br = new BufferedReader(fr);

        String line;
        int index = 0;
        while (true) {
            // 파일에서 한줄 읽기(user 하나)
            // 만약 빈줄이면 null반환
            line = br.readLine();

            if (line == null) {
                break;
            }

            // "홍길동,1234" -> ["홍길동", "1234"]
            String[] data = line.split(",");
            String username = data[0];
            String password = data[1];

            // 객체만들어서 0번부터 차곡차곡 넣기
            users[index] = new User(username, password);
            index++;

        }

        br.close();

        return users;
    }

    // 파일에 유저정보들 덮어쓰기
    public void saveAll(User[] users) throws Exception {
        // 파일쓰기
        FileWriter fw = new FileWriter(FILE_NAME);
        // 버퍼에 있는것 써주세요
        BufferedWriter bw = new BufferedWriter(fw);

        for (User user : users) {
            // null인 index는 건너뛰자
            if (user == null) {
                continue;
            }

            // user객체 -> "아이디, 패스워드"
            String line = user.getLine();
            bw.write(line);

            bw.newLine(); // 줄바꿈
        }

        bw.close();

    }

}
