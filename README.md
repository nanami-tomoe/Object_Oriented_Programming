# Object_Oriented_Programming
This repository is for organizing object_oriented_programming.
---
- [배열](https://www.notion.so/34e2148c3c5d4fce879cd8f5d0e3d723?pvs=4)
- 효율 = 마일/갤런

# Contents
[1.Fundermental Data types](#Fundermental-Data-types)
[2.Decisions](#Decisions)

# Fundermental Data types
## String
- `str.substring(start, end)`
  - end는 포함x
## Constant(상수)
- `final`(메소드), `public static final`(클래스)
- https://sapphire-minute-107.notion.site/Constant-68ecf393b9c94bf4acbaf1aa73a17a79?pvs=4
# Decisions
- `if` 문에서 부동소수점을 비교할때는 반올림 오류가 있기 때문에 `==` 사용x
  - 대신 충분히 가까이 있는지 확인
  ```java
  final double EPSILON = 1E-14;
  if (Math.abs(x - y) <= EPSILON)
  {
    // x와 y는 거의 같다.
  }
  ```
  - EPSILON은 일반적으로 10^-14
## 문자열 비교
- `==`은 같은 메모리 위치에 있는지 비교
```java
if (string1.equals(string2)) ...
// == 은 적합하지 않음
```
- `compareTo`
- 모든 대문자는 소문자 앞에 온다
```java
// string1이 사전상 앞에 있는지
string1.compareTo(string2) < 0

// string1이 사전상 뒤에 있는지
string1.compareTo(string2) > 0

// 동일한지
string1.compareTo(string2) == 0
```
## 객체 비교
- 객체도 참조이기 때문에 같은지 비교하려면 `equals()`를 써야한다.
## Testing for null
- `null` 참조는 객체가 없음을 의미한다.
- `null` 은 `""`와 같지 않다.
- `null`을 테스트 할 때는 `equals()` 가 아니라 `==` 을 사용한다.
## Multiple Alternatives
```java
// 범위가 맞음
if (a >= 8.0)
{
  // ...
}
else if (a >= 7.0)
{
  // ...
}
else if (a >= 6.0)
{
  // ...
}
.
.
.

// 에러
if (a >= 4.0)
{
  // ...
}
else if (a >= 5.0)
{
  // ...
}
else if (a >= 6.0)
{
  // ...
}
.
.
.
```
## Problem Solving: Flowcharts
- https://sapphire-minute-107.notion.site/Problem-Solving-Flowcharts-2fe1a12352134917946282183d350335?pvs=4
## Boolean Variables and Operators

