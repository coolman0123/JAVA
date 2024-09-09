package com.example.lotto;

//인터페이스를 구현하게 되면 반드시 인터페이스가 가지고 있는 메소드를 오버라이딩 해야됨
public class LottoMachineImpl implements LottoMachine{
    private Ball[] balls;

    @Override
    public void setBalls(Ball[] balls) {
        this.balls = balls;

    }

    //Math.random() ==> 0.0 <= x < 1.0
    @Override
    public void mix() {
        for(int i = 0; i< 10000; i++){
            int x1 = (int)(Math.random() * LottoMachine.MAX_BALL_COUNT);
            int x2 = (int)(Math.random()* LottoMachine.MAX_BALL_COUNT);

            if(x1 != x2){
                Ball tmp = balls[x1];
                balls[x1] = balls[x2];
                balls[x2] = tmp;
                //서로 바꿀때는 임시변수 tmp가 반드시 필요
            }
        }


    }

    @Override
    public Ball[] getBalls() {

        Ball[] result = new Ball[LottoMachine.RETURN_BALL_COUNT];
        for(int i = 0; i < LottoMachine.RETURN_BALL_COUNT; i++){
            result[i] = balls[i];
        }
        return result;
    }
}
