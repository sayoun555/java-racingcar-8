# java-racingcar-precourse

# 자동차 경주

## 과제 내용
- 쉼표를 기준으로 n개의 5글자 이하 자동차 이름을 입력하고 라운드 횟수를 기입해서 자동차 경주를 하는 게임

## 구현할 기능 목록
- [x] 입출력 기능
- [x] 자동차 이름 기능
- [x] 자동차 위치 체크 기능
- [x] 자동차 이동 기능
- [x] 여러대 자동차 관리 기능
- [x] 난수 기능
- [x] 자동차 이동 횟수 관리 기능 구현
- [x] 라운드 기능
- [x] 우승자 판별 기능
- [x] 이동 횟수 0과 음수 예외처리
- [x] 자동차 이름 길이 예외처리

## 리팩터링 목록
- [x] 조립 로직 클래스로 분리
- [x] Car 클래스에 데이터와 행동을 묶음
- [x] Cars 클래스 메서드 분리
- [x] for문을 stream으로 전환(가독성 생각하며 비교해서)
- [x] service 로직에 Factory 클래스 의존성 주입 방식 변경
- [x] Application 클래스에 과도한 객체 생성 책임을 config로 분리

## 예외처리 목록
- 시도 횟수 음수, 0, 오버플로우 검사
- 자동차 이름 5자리 이하로 예외처리
- 자동차 이름 빈 문자열 예외처리

## 패키지 구조
```
racingcar
├── Application.java              # 프로그램 진입점
├── config
│   └── AppConfig.java            # 의존성 설정
├── controller
│   └── RacingcarController.java  # 전체 흐름 제어
├── service
│   ├── RacingcarService.java     # 인터페이스
│   └── RacingcarServiceImpl.java # 비즈니스 로직 (경주 진행)
├── domain
│   ├── Car.java                  # 자동차 개체
│   ├── Cars.java                 # 자동차 목록 관리
│   ├── CarName.java              # 자동차 이름 (검증)
│   └── CarMoveCount.java         # 이동 횟수 (검증)
├── factory
│   └── CarFactory.java           # 자동차 생성
└── view
    ├── InputView.java            # 사용자 입력
    └── OutputView.java           # 결과 출력
```