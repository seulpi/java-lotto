# 로또
## 진행 방법 리뷰 피드백에 대한 개선 작업을 하고 다시 PUSH한다.
* 로또 요구사항을 파악한다.
* 요구사항에 대한 구현을 완료한 후 자신의 github 아이디에 해당하는 브랜치에 Pull Request(이하 PR)를 통해 코드 리뷰 요청을 한다.
* 코드
* 모든 피드백을 완료하면 다음 단계를 도전하고 앞의 과정을 반복한다.

## 온라인 코드 리뷰 과정
* [텍스트와 이미지로 살펴보는 온라인 코드 리뷰 과정](https://github.com/next-step/nextstep-docs/tree/master/codereview)

## 기능

- 로또 구입 금액을 입력하면 구입 금액에 해당하는 로또를 발급해야 한다.
- 로또 1장의 가격은 1000원이다.

### - 화면
- [x] 로또 구입금액 입력한다.
    - 공백 및 숫자인지 검증한다.
    - 로또 구매 금액은 10만원을 초과할 수 없다.
- [x] 순위별로 당첨 갯수를 출력한다.
- [x] 수익률을 출력한다.
---
### - 비즈니스로직
- [x] 구입금액을 확인한다.
- [x] 로또를 구매한다.
- [x] 번호가 몇개 일치하는지 확인한다.
- [x] 당첨여부를 확인한다.
- [x] 구매 금액 대비 수익률을 확인한다.
- [x] 로또 당첨 번호를 뽑는다
  - 로또는 1-45까지의 숫자이다.
  - 로또는 6개의 번호로 구성되어있다.
  - 로또의 6개의 번호는 랜덤으로 추출한다.
  - 로또 당첨 순위 
    - 1등 : 6개일치 = 2,000,000,000원 </br>
    - 2등 : 5개일치 = 1,500,000원 </br>
    - 3등 : 4개일치 = 50,000원 </br>
    - 4등 : 3개일치 = 5,000원 </br>
