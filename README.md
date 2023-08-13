
#### 협업 규칙 ####
1. 아래의 규칙들을 지키면서 작업하기!
2. Slf4j 를 사용하여 최대한 log 를 자주 찍어 놓기. (유지 보수를 용이하게 하기 위함)
3. 이름을 지을 땐 파일이나 변수명만 보고도 이해하기 쉽게 짓기.
4. 패키지나 파일 생성 위치는 구조를 보고 구조에 맞게 생성 하는 것이 원칙. 모르겠으면 조장에게 질문!
5. 푸쉬 전 꼭 풀 받기! (중요)
6. 남의 코드는 상의 없이 수정하지 말기! (수정 해야 하는 경우 상의 후 수정!)


#### JPA 데이터 전달 방식 ####
0. Client -> Controller
1. Controller -> Service
2. Service -> Repository
3. Repository -> DB

4. 요약 : Client <-> Controller <-> Service <-> Repository <-> DB
# repository 가 결국 dao 입니다.




