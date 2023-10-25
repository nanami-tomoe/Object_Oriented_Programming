- [배열](https://www.notion.so/34e2148c3c5d4fce879cd8f5d0e3d723?pvs=4)
- 효율 = 마일/갤런

# Contents
[1. Fundermental Data types](#Fundermental-Data-types) <br>
[2. Decisions](#Decisions) <br>
[3. Loops](#Loops) <br>

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
- `if(boolean variable)` 에서 괄호 안에 부울식이 true인 경우만 실행
```java
boolaen failed = true;

if (falild) // failed 가 true인 경우만 실행
{
  // ...
}
```
- 정수만 입력받고 싶을 때
```java
if (in.hasNextInt) // 정수인 경우만 true
{
  a = in.nextInt();
  System.out.println(a);
}
else
{
  System.out.println("Error: Not an Integer.");
}
```
```
입력: 2
출력: 2
```
# Loops
## while 
- `while (condition)`
- condition에 들어가는 변수는 외부에서 선언되고 반복문 안에서 업데이트됨
### 흔한 오류
- 무한 루프
- Off-by-one Errors: 너무 적거나 많이 반복
## for Loop
- `while` 문과 다르게 괄호 안에서 변수 초기화 가능 (루프 돌기 전에만 초기화 되면 됨)
- `while`
```java
int counter = 1;
while(counter <= 10)
{
  System.out.println(counter);
  counter++;
}
```
- `for`
```java
for (int counter = 1; counter <= 10; counter++)
{
  System.out.println(counter);
}
```
- `++`, `--` 뿐만 아니라 `counter = counter + 2` 등 다양한 연산 가능
- 문자열의 모든 문자를 돌고 싶을 때
```java
for (int i = 0; i < str.length(); i++)
{
  char ch = str.charAt(i);
}
```
## Do Loop
- 루프의 본문을 한 번 시행한 다음에 루프 테스트 수행
```java
int value;
do
{
  System.out.print("Enter an integer < 100: ");
  value = in.nextInt();
}
while (value >= 100);
```
## Sentinel Value
- 루프를 종료하게 하는 값 정의 -> 보통 -1
- 부울식 활용
```java
boolean done = flase;
while (!done)
{
  value = in.nextDouble();
  if (value == -1)
  {
    done = true;
  )
  // ...
}
```
- 숫자만 입력할 때 -> 숫자가 아닌 센티널 값 사용
```java
while (in.hasNextDouble())
{
  value = in.nextDouble();
  // ...
}
```
- 루프 중간에서 빠져나갈 때 `return` 사용
## Common Loop Algorithhm
- 올바른 값 입력할 때 까지 반복
```java
boolean valid = false;
double input = 0;
while (!valid)
{
  System.our.print("100보다 작은 양수를 입력하세요");
  input = in.nextDouble();
  if (input > 0 && input < 100) { valid = true; }
  else { System.out.println("Invalid input.") };
}
```
