package com.pattern.singleton.ball;

public class App{
    public static void main(String[] args) {
        Ball ball = Ball.getInstance("red");
        Ball ball1 = Ball.getInstance("green");
        System.out.println(ball == ball1);
        System.out.println(ball1.getColor());
        System.out.println(ball.getColor());
    }
}
