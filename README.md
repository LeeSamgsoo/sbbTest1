## 1차 요구사항 구현
- [x] 유저가 루트 url로 접속시에 게시글 리스트 페이지(http://주소:포트/article/list)가 나온다.
- [x] 리스트 페이지에서는 등록 버튼이 있고 버튼을 누르면 http://주소:포트/article/create 경로로 이동하고 등록 폼이 나온다.
- [x] 게시글 등록을 하면 http://주소:포트/article/create로 POST 요청을 보내어 DB에 해당 내용을 저장한다.
- [x] 게시글 등록이 되면 해당 게시글 리스트 페이지로 리다이렉트 된다. 페이지 URL 은 http://주소:포트/article/list 이다.
- [x] 리스트 페이지에서 해당 게시글을 클릭하면 상세페이지로 이동한다. 해당 경로는 http://주소:포트/article/detail/{id} 가 된다.
- [x] 게시글 상세 페이지에는 id에 맞는 게시글 데이터와 목록 버튼이 있다. 목록 버튼을 누르면 게시글 리스트 페이지로 이동하게 된다.

- (추가 기능이나 구현기능설명이 필요한 경우 서술)

## 미비사항 or 막힌 부분
- 빈칸 등록 예외처리 안했습니다.

## MVC 패턴
- Article - Article Repository - Article Service - Article Controller
- 위 순서로 db에 접근합니다.

## 스프링에서 의존성 주입(DI) 방법 3가지 방법
- Autowired : 의존성 자동 주입
- AllArgsConstructor : 생성자 함수에 모든 파라미터가 있으면 의존성 주입
- NoArgsConstructor : 생성자 함수에 파라미터가 없으면 의존성 주입
- RequiredArgsConstructor : final인 파라미터만 의존성 주입

## JPA의 장점과 단점
- ...

## HTTP GET 요청과 POST 요청의 차이
- 큰 차이는 없지만 GET은 데이터 열람, POST는 데이터 전송을 명시 