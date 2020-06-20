package ru.job4j.oop;

public class BallStory {
    public static void main(String[] args) {
        Ball ball = new Ball();
        Hare zayac = new Hare();
        Fox fox = new Fox();
        Wolf wolf = new Wolf();
        zayac.tryEat(ball);
        wolf.tryEat(ball);
        fox.tryEat(ball);
        ball.wasEaten(fox);
    }
}
