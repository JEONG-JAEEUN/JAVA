## Stack

<hr>

- 밑이 막힌 상자
- 마지막에 저장한 것을 먼저 꺼냄
- LIFO (List in First Out)
- 저장(push) & 추출(pop)
- 배열이 효율적(순차적 추가/순차적 삭제)

### Stack의 메서드

`Stack st = new Stack();`
|메서드|설명|
|:---:|:---:|
|boolean empty()|Stack이 비어있는지 알려준다.|
|Object peek()|Stack의 맨 위에 저장된 객체를 반환한다. / 꺼내지 않고 보기만 하기|
|➖ Object pop()|Stack의 맨 위에 저장된 객체를 꺼낸다. / 삭제|
|➕ Object push(Object item)|Stack에 객체(item)를 저장한다. / 추가|
|int search(Object o)|Stack에서 주어진 객체(o)를 찾아서 그 위치를 반환한다. <br>(못찾으면 -1 반환, 위치는 0이 아닌 1부터 시작한다) / 배열에서의 indexof()|

## Queue

<hr>

- 밑이 뚫린 상자
- 먼저 저장한 것을 먼저 꺼냄
- FIFO (First In First Out)
- 저장/제공(offer) & 추출(poll)
- LinkedList이 효율적(요소를 삭제해도 자리이동이 필요하지 않음)

### Queue의 메서드

Queue = 인터페이스 = 객체 생성⛔  
`Queue q = new Queue();`⛔  
`Queue q = new LinkedLisf();`⭕
|메서드|설명|
|:---:|:---:|
|boolean add(object o)|지정된 객체를 Queue에 추가한다.|
|Object peek()|삭제없이 요소를 읽어 온다. / 보기만 하기 <br> Queue가 비어있으면 null 반환|
|Object element()|삭제없이 요소를 읽어 온다. <br> Queue가 비어있으면 NoSuchElementException 발생|
|➕ boolean offer(Object o)|Queue에 객체를 저장 (성공 시 true 실패 시 false)|
|➖ Object poll()|Queue에서 객체를 꺼내서 반환 (비어있으면 null 반환)|
|Object remove()|Queue에서 객체를 꺼내서 반환 <br> 비어있으면 NoSuchElementException 발생 / 예외발생|

- NoSuchElementException와 같이 예외를 발생시킬 때에는 try-catch문 응용
- 예외 발생 없이 null을 반환할 때에는 if(obj==null)과 같은 응용
