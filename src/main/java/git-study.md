# git
- 파일 버전 관리 툴

## git 명령어
### 로컬환경 셋팅
1. 내 프로젝트 변경사항을 git이 추적하게 만드는 것 - git init
2. 현재 작성자의 서명 등록
- git config user.name 나의github아이디
- git config user.email 나의github이메일

3. 변경사항에 대하여 임시저장 - git add
4. 임시저장된 것들을 하나의 버전으로 포장 - git commit -m"커밋메세지"
5. 로컬에 저장된 commit들을 원격레포지토리(github repository)로 보낸다 - git push

### github환경 셋팅
1. repository 생성
2. 내 repository접근가능한 token발급

### 로컬 - github repository 연결
1. 원격저장소 주소를 저장 - git remote add origin 레포지토리주소
2. 최초 push시, 원격저장소와 로컬을 동기화
- git push -u origin main

### 추가내용

1. git repository 다운받기
- git clone 레포지토리 주소
2. 원격 저장소가 버전이 더 높을 경우
- git fetch (원격저장소와 통신해서 최신내역 확인)
- git pull (원격저장소의 버전으로 로컬 덮어쓰기)

