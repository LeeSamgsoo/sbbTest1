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
- Model, View, Controller로 이루어진 패턴
- Model은 데이터, View는 UI, Controller는 Model에서 View로 데이터를 조작한다.
- Article - Article Repository - Article Service - Article Controller
- 위 순서로 db에 접근합니다.

## 스프링에서 의존성 주입(DI) 방법 3가지 방법
- 객체를 직접 생성하는 게 아니라, 외부로부터 받아오는 것
- 필드 주입 : 필드에 @Autowired를 붙이면 된다.
- 수정자 주입 : Setter 메소드에 @Autiwired를 붙이면 됨.
- 생성자 주입 : 생성자 호출 시점에 의존성 주입.

## JPA의 장점과 단점
- 장점
- 코드를 간단하게 쓸 수 있다.
- 여러 db와 호환되어서 코드를 수정할 필요가 없다.
- 단점
- 자바 코드를 sql로 변환하는 것이라 성능 저하가 있다.

## HTTP GET 요청과 POST 요청의 차이
- GET은 데이터를 읽는 요청, POST는 데이터를 변경하는 요청
- GET은 status 200(ok), POST는 201(created)
- 데이터 전달할 때, GET은 쿼리로, POST는 HTTP Body로 전
