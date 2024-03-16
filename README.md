# 자동차 경주 게임
## 진행 방법
* 자동차 경주 게임 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 기능 요구사항 
- [x] 사용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지 입력할 수 있다.
- [x] 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다. 
- [x] 전진하는 조건은 0~9 사이 랜덤한 값을 구한 후 해당 값이 4 이상일 경우다. 
- [x] 자동차의 상태를 화면에 출력한다. 이때, 어느 시점에 출력할 것인지에 대한 제약은 없다. 
- [x] 각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다.
- [x] 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- [x] 자동차 이름은 쉼표(,)를 기준으로 구분한다.
- [x] 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.

## 리팩토링 요구사항 
- [x] view 패키지는 domain 패키지를 의존할 수 있지만, domain 패키지는 view 패키지를 몰라야 한다. 