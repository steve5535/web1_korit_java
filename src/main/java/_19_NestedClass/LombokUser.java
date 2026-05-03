package _19_NestedClass;

// 롬복(lombok)라이브러리
// 1. 인텔리제이 설정 -> 롬복 플러그인 설치
// 2. 메이븐 레파지토리에서 lombok 검색 후 pom.xml에 기입
// 3. maven 동기화

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

// 알아서 컴파일할때 코드를 추가해줌
@Builder // 빌더
@AllArgsConstructor // 모든필드 받아주는 생성자
@Data // 게터, 세터, toString, equals, hashCode 작성
public class LombokUser {
    private String username;
    private String password;
}
