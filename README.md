# 문자열 사칙 연산 계산기
## 입력
### 공백으로 문자열 나누기
### 빈 문자열일 경우 예외
### 숫자, 사칙 연산 기호(+, -, *, /)가 아닐 경우 예외
## 연산
### 기호별 연산 진행

---

# 로또(step2)
## 로직
### 로또 개수 확인(6개)
### 로또 구입 장수 계산
### 로또 번호 발급
### 일치 개수 세기
### 수익률 계산

## 화면 구성
### 문장 출력
#### - 구입금액
#### - 몇장 구매
#### - 구매한 로또 번호
#### - 당첨 번호
#### - 당첨 통계, 수익률
### 입력
#### - 구입금액 입력
#### - 당첨번호 입력

---

# 로또(step3)
## 로직
### *당첨자 확인 클래스(WinningLotto)에 보너스 볼 요소 추가*
### *보너스 볼이 로또 당첨 번호에 중복되지 않는지*
### enum에 2등 요소 추가
### 5개 당첨 유저일 경우 2등인지 확인.
## 화면 추가 요소
### *보너스볼 입력*
### 5개 일치, 보너스 볼 일치(30000000원) - 개수

---

# 로또(step4)
### 로또는 로또 팩토리에서만 생성될 수 있도록 패키지 분리하기
### 수동 로또 추가
### 로또 번호 매치 로직 수정
### UI에 수동 로또 관련 추가
