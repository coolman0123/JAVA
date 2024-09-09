package com.example.lotto;
/*
* 1. 1~45 까지 써있는 Ball을 로또 기계에 넣는다.
* 2. 로또 기계에 있는 Ball들을 섞는다.
* 3. 섞인 Ball중 6개를 꺼낸다.
* */

//interface는 껍데기에 불과함. 선언만 > 구현은 필요 x
public interface LottoMachine {
    //어차피 interface메소드 전부 abstract이기 때문에 생략 가능
    //field들은 다 public하기 때문에 또한 생략 가능
    int MAX_BALL_COUNT = 47;
    int RETURN_BALL_COUNT = 9;

    public abstract void setBalls(Ball[] balls); //ball[] 배열, ball 여러개를 받겠다.
    public void mix(); // ball 섞기
    public Ball[] getBalls(); // 6개 ball 반환
    
    
}
