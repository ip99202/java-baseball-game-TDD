# 문자열 계산기

### 조건
1. 사용자가 입력한 문자열에 따라 사칙연산을 수행
2. 사칙연산 우선순위가 아닌 입력 순서에 따라 계

---

### 구현
이펙티브 자바의 [아이템 38](https://beginfill.tistory.com/39)을 참고하여 열거 타입의 인터페이스를 사용하여 구현 

---


# 숫자야구게임구현 with TDD

### TDD 팁
- 좀 더 작은 단위로 테스르 할 수 없을까 생각해야 함
    - 처음부터 너무 큰 단위로 생각하면 테스트코드를 짤 수 없다.

### 조건
1. 들여쓰기는 2depth를 넘지 않게 한다.
    - 예를 들어 for문 안에 if문은 2depth라 안됨
2. else 예약어를 사용하지 않는다. swith-case도 안됨.
3. 모든 로직에 단위 테스트를 구현한다.
4. 3항 연산자 사용 금지.
5. 함수/메서드는 하나의 일만 하도록 최대한 작게 만든다.

---
### 구현해야하는 것들

- 숫자를 입력받는 부분
- 입력받은 숫자를 검증(숫자 범위, 중복된 숫자)
- 볼, 스트라이크, noting 판별  
  - 볼 객체를 생성
  - 볼 객체는 (위치 인덱스, 숫자)로 구성
- 랜덤하게 정답을 생성
- 볼, 스트라이크를 판별
- 게임 종료, 다시시작 판별