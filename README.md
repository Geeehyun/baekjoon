# 🧠 Baekjoon Java Practice

백준 온라인 저지 문제를 **Java + IntelliJ IDEA**로 풀이하며  
코딩 테스트 대비 및 알고리즘 연습을 위한 저장소입니다.

- IDE: IntelliJ IDEA Community
- Language: Java11
- 목적: 코딩 테스트 대비, 문제 해결 감각 유지
- 풀이 방식: 문제 1개 = Main 클래스 1개 (독립 실행)

---

## 📂 프로젝트 구조
```yaml
baekjoon/
├─ src/
│ ├─ bronze/
│ │ ├─ P1546/
│ │ │ └─ Main.java
│ │ └─ P11720/
│ │ └─ Main.java
├─ README.md
└─ .gitignore
```
- 문제 번호별로 디렉토리 분리
- 각 문제는 `Main.java` 단일 파일로 구성
- 백준 제출 시 **코드 그대로 복사 가능**

---

## 🏃 실행 방법

1. IntelliJ에서 `Main.java` 열기
2. `main()` 왼쪽 ▶ 버튼 클릭 또는 `Shift + F10`
3. 콘솔에 입력값 직접 입력하여 테스트

> ⚠️ 백준 제출 시
> - 클래스명은 반드시 `Main`
> - `package` 선언 제거

---

## 📘 문제 목록

### Bronze

| 번호 | 문제명 | 상태 |
|----|----|----|
| 1546 | 평균 | ✅ |
| 11720 | 숫자의 합 | ✅ |

---

## ✍️ 커밋 규칙

```yaml
Solve BOJ [문제번호] - 문제명 (Java)
```
예시
```yaml
Solve BOJ 1546 - 평균 (Java)
```


---

## 📝 참고 사항

- 공통 유틸 클래스는 사용하지 않음  
  (실전 코딩 테스트 환경과 동일하게 유지)
- 입력 처리는 `BufferedReader`, 출력은 `StringBuilder` 사용
- 디버깅은 IntelliJ 디버거 적극 활용

---

## 🎯 목표

- 꾸준한 문제 풀이를 통한 코딩 테스트 실력 향상
- GitHub 기록을 통한 학습 이력 관리



