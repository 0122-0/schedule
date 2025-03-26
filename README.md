> # 일정관리 프로그램 만들기!

<h1>🖥️ 프로젝트 소개</h1>

---

- JAVA로 일정관리 프로그램을 만들어보자!<br>

---

<h1>🕰️ 개발 기간</h1>

---
- 25.03.17일 - 25.03.26일

---
<h1>⚙️ 개발 환경</h1>

- `JAVA`
- `JDK 17.0.14`
- `Spring`
- `build.gradle`
- `Mysql`
- `JDBC`
  
---

<h1>📌 주요 기능</h1>

- 일정 기록
- 일정 목록 전체 조회
- 단일 일정 조회
- 일정 내용 변경 (비밀 번호 필요)
- 일정 삭제 (비밀 번호 필요)

---

<h1>일정관리 프로그램 프로젝트 구상</h1>

- 이름 일정 비밀번호를 넣어서 일정 만들기

- 일정을 전체와 (id)를 입력하여 단일 일정 조회

- 비밀 번호를 넣어서 일정 내용 변경과 일정 삭제

---

0️⃣ Lv 0. API와 ERD 만들기 !

![API 1](https://github.com/user-attachments/assets/0d9d254c-30e5-46f4-8bba-983442f43de0)

![ERD 1](https://github.com/user-attachments/assets/1d2cb641-aac3-479b-b95b-3b9b7b8aaebb)

---

1️⃣ Lv 1. 일정 생성 및 조회

- 데이터베이스에 자동 저장되는 식별자
  - 할일, 작성자명, 비밀번호, 작성,수정일 저장
 
- 전체 일정 조회.

- 단일 일정 조회.
  -  id 값을 입력하여 단일 일정 조회 가능

2️⃣ Lv 2. 일정 수정 및 삭제

- 선택한 일정 수정
  - 일정내용 변경시 비밀번호 필요
 
- 일정 삭제
  - 일정 삭제시 비밀번호 필요

<h2>트러블 슈팅⚽</h2>

- DB를 연결 하는 작업은 처음이여서 DB와 JAVA 문법에서 작성을 할때 아직은 이름 설정 해둔 것이 헷갈려서 DB의 정확한 이름으로 안써서 오타 오류가 발생.
- 오타 수정후 해결.

