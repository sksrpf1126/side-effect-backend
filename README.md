<div style="display: flex;justify-content: center"><img src="./server/docs/images/logo.png" width="300px" alt="사이드이펙트로고"></div>

<h3>열정을 함께할 동료가 필요할 때, 사이드 이펙트</h3>
<p>개발자, 디자이너 등 누구나 쉽게 프로젝트를 시작하고, 네트워킹할 수 있는 커뮤니티 플랫폼입니다</p>

***AWS 프리티어 만료로 현재는 운영하지 않습니다!!***

[팀 소개](https://github.com/Side-Effect-Team)

[프론트 레포](https://github.com/Side-Effect-Team/side-effect-frontend)

[API 문서](https://sideeffectproject.com/docs/swagger-ui/index.html)

<br>

## 🛠️ 기술 스택

<div>

![SpringBoot](https://img.shields.io/static/v1?style=for-the-badge&color=6DB33F&message=spring+boot&logo=springboot&logoColor=white&label=)
![SpringSecurity](https://img.shields.io/static/v1?style=for-the-badge&color=6DB33F&message=spring+security&logo=springSecurity&logoColor=white&label=)
![SpringRestDocs](https://img.shields.io/static/v1?style=for-the-badge&color=6DB33F&message=spring+rest+docs&logo=readthedocs&logoColor=white&label=)
![Swagger](https://img.shields.io/static/v1?style=for-the-badge&color=85EA2D&message=swagger&logo=swagger&logoColor=black&label=)
![Java](https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white)
![JpaHibernate](https://img.shields.io/static/v1?style=for-the-badge&color=59666C&message=JPA+hibernate&logo=hibernate&logoColor=white&label=)
![QueryDsl](https://img.shields.io/static/v1?style=for-the-badge&color=2496ED&message=querydsl&logo=querydsl&logoColor=black&label=)
![MariaDB](https://img.shields.io/static/v1?style=for-the-badge&color=003545&message=mariaDB&logo=mariaDB&logoColor=white&label=)
![Redis](https://img.shields.io/static/v1?style=for-the-badge&color=DC382D&message=redis&logo=redis&logoColor=white&label=)
![Docker](https://img.shields.io/static/v1?style=for-the-badge&color=2496ED&message=docker&logo=docker&logoColor=white&label=)
![Jenkins](https://img.shields.io/static/v1?style=for-the-badge&color=D24939&message=jenkins&logo=jenkins&logoColor=black&label=)
![EC2](https://img.shields.io/static/v1?style=for-the-badge&color=FF9900&message=aws+ec2&logo=amazonec2&logoColor=black&label=)

</div>
<br>

![사이드 이펙트 앱 흐름](server/docs/images/side-effect-app-flow.png)

## 🌳 폴더 구조

```
src─|
    java
    ├─common : Exception관련 파일이나 공통 클레스(aop, validation, converter, image upload) 파일로 구성
    ├─config : 각종 설정파일 구성
    ├─controller : 컨트롤러 파일 보관
    ├─domain
    │  ├─[domain name] : 각 도메인마다 엔티티파일과 연관 enum 파일로 구성
    ├─dto
    │  ├─[domain name] : 각 도메인의 dto 파일 보관
    ├─redis : redis 레파지토리 파일 보관
    ├─repository : 레파지토리 파일 보관
    ├─security : spring security 파일 구성
    ├─service : 서비스 파일 보관
    resources
    ├─mail-templates : 알림 메일 템플릿 파일 보관

test─|
    java
    ├─common
    │  ├─docs : Rest Docs 관련 유틸파일과 공통 클래스
    │  ├─jpa : jpa(query dsl) 테스트 관련 설정
    │  ├─securty : custom mock user 관련 파일
    ├─controller : 컨트롤러 테스트 파일 보관
    ├─convertor  : 컨버터 테스트 파일 보관
    ├─dto : dto 테스트 파일 보관
    ├─redis  : redis 레파지토리 테스트 파일 보관
    ├─repository : 레파지토리 테스트 파일 보관
    ├─security : spring security 관련 테스트 파일 보관
    ├─service : 서비스 테스트 파일 보관
```

## 💻 주요 기능

### 모집 게시판

- 사이드 프로젝트나 포트폴리오를 위한 프로젝트 팀원을 구하는 게시판 구현
- 댓글, 추천 기능 구현
- 키워드 및 기술 태그 검색 및 무한 스크롤 기능 구현
- 게시글 모집 포지션 지원 기능 구현
- 지원자 및 팀원 관리 기능 구현
- 지원 취소 기능 구현

### 자랑 게시판

- 만든 프로젝트를 자랑하는 게시판 구현
- 댓글, 추천 기능 구현
- 키워드에 따른 검색 조회 기능 구현
- 댓글수, 조회수, 최신순, 좋아요수에 따른 무한 스크롤 기능 구현
- 이미지 업로드 기능 구현

### 유저

- JWT(Access Token, Refresh Token) 구현
- Spring Security를 통한 보안 설정
- SNS 로그인 구현
- 알림 기능 구현

## 📃 ERD

  <p align = "center">
  <img src="https://github.com/sksrpf1126/study/assets/62879192/7386cfb9-bcae-4fd1-8cc3-112ca877e55e" width = 100%>  
	  
![사이드 이펙트 ERD](server/docs/images/erd.png)

## 부딪힌 기술적 이슈 해결 과정

### [QueryDSL 도입을 통한 동적 쿼리 개선](https://github.com/sksrpf1126/study/blob/main/%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8/QueryDSL%EC%9D%84%20%ED%86%B5%ED%95%9C%20%EB%8F%99%EC%A0%81%20%EC%BF%BC%EB%A6%AC%20%EA%B0%9C%EC%84%A0.md)

처음부터 QueryDSL을 도입하지 않고, JPQL과 Spring Data JPA로 개발을 하다 필요성이 느껴질 때 도입함으로써 QueryDSL의 사용 이유를 체감하였습니다.

JPQL로 작성되어 있던 동적 쿼리를 QueryDSL을 통해 리팩토링함으로써, 코드의 가독성과 조인쿼리나 조건에 들어갈 쿼리들을 메서드로 분리함으로써 재사용성을 향상시켰습니다.  
또한, 문자열로 쿼리를 작성하는 JPQL의 문제점을 해결할 수 있었습니다.

### [Count VS Exists 쿼리 선택](https://github.com/sksrpf1126/study/blob/main/JPA/Count%20%EC%BF%BC%EB%A6%AC%EC%99%80%20Exists%20%EC%BF%BC%EB%A6%AC.md)

Count 쿼리는 조건에 맞는 데이터를 전부 카운팅을 한 뒤에 그 수를 반환하기 때문에 조건에 맞는 데이터의 존재 여부만을 판단할 때 사용한다면 성능 문제가 발생합니다.

이러한 성능 문제를 Exists쿼리나 Limit 1을 통해 조건에 맞는 데이터가 있을 때 바로 반환되게 함으로써 해결하였습니다.

### [좋아요 기능 인덱스 적용](https://github.com/sksrpf1126/study/blob/main/%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8/side-effect%20INDEX%20%EC%A0%81%EC%9A%A9.md)

팀원분의 조언으로 게시글과 사용자의 아이디를 통해 좋아요 여부를 판단하여 토글 방식으로 동작하게 되는 기능에 인덱스를 적용하였습니다.  
게시글 아이디와 사용자의 아이디에 복합 인덱스를 추가하였으며, 150만건의 데이터를 넣어서 테스트를 해보았을 때 약 11 ~ 12배의 성능이 향상된 것을 확인할 수 있었습니다.

### [게시글 조회수 동시성 문제](https://github.com/sksrpf1126/study/blob/main/%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8/%EC%A1%B0%ED%9A%8C%EC%88%98%20%EB%8F%99%EC%8B%9C%EC%84%B1%20%EB%AC%B8%EC%A0%9C.md)

JMeter를 통해 500개의 쓰레드로 동일한 게시글에 대해 조회API를 동시 요청을 하였을 때, 84의 조회수만 증가하였습니다.  
문제를 해결하기 위해 JPA의 비관적 락을 도입하였으며, 정상적으로 500의 조회수 값이 증가가 되는 것을 확인할 수 있었습니다.

### [ENUM 대소문자 처리](https://github.com/sksrpf1126/study/blob/main/%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8/ENUM%20%EB%8C%80%EC%86%8C%EB%AC%B8%EC%9E%90%20%EC%B2%98%EB%A6%AC.md)

@RequestParam, @ModelAttribute로 ENUM 타입을 받을 때 타입 컨버터를 커스텀해서 해결하였습니다.

@RequestBody의 경우 ENUM 클래스에 대소문자를 처리하는 전역 메서드를 정의하고 해당 메서드에 @JsonCreator를 적용하였습니다.  
그러면 ENUM 타입에 대해 역직렬화를 할 때 해당 메서드의 로직이 실행이 되기 때문에 @RequestBody에 대해서도 대소문자 구분없이 ENUM값을 처리할 수 있게 되었습니다.

### <u>[Spring Security 필터에서 @ExceptionHandler 적용](https://github.com/sksrpf1126/study/blob/main/%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8/Side%20Effect%20%ED%94%84%EB%A1%9C%EC%A0%9D%ED%8A%B8%20%ED%95%84%ED%84%B0%20%EC%98%88%EC%99%B8%20%EC%B2%98%EB%A6%AC.md)</u>

기존 방식은 Spring Security의 커스텀한 필터들에서 예외가 발생하면 해당 예외를 따로 처리하는 필터를 정의하여 해당 필터에서 예외마다 적절한 응답을 보내주었습니다.

변경된 방식은 필터에서 발생한 예외 또한 @RestControllerAdvice의 @ExceptionHandler를 통해 예외를 처리하도록 하여 분리되었던 예외 처리를 하나의 클래스에 집중시키도록 하였습니다.

### **_AWS EC2 스왑 메모리와 Jenkins를 통한 자동 배포_**

기존에는 AWS EC2에 접속하여 수동으로 배포를 하였습니다.  
또한, Free Tier라서 RAM 공간이 1GB였으며, 주기적으로 서버가 멈추는 현상이 발생하였습니다.

그래서 "스왑 메모리"를 설정함으로써 서버가 멈추는 현상을 해결하였으며, 수동으로 배포함에 있어 불편함을 겪던 문제를 팀원분들과 함께 Jenkins를 도입하여 Github의 dev 브랜치에 push하면 자동으로 배포되게 하였습니다.

## 🧑‍💻 만든 사람들

이름순

<table>
	<tbody>
		<tr>
			<th><img width="150px" src="https://github.com/xjfcnfw3.png" alt="김민수"/></th>
			<th><img width="150px" src="https://github.com/sksrpf1126.png" alt="임성현"/></th>
			<th><img width="150px" src="https://github.com/tlsrl6427.png" alt="홍신기"/></th>
		</tr>		
		<tr>
			<th><a href="https://github.com/xjfcnfw3" target="_blank">김민수</a></th>
			<th><a href="https://github.com/sksrpf1126" target="_blank">임성현</a></th>
			<th><a href="https://github.com/tlsrl6427" target="_blank">홍신기</a></th>
		</tr>	
	</tbody>
</table>
