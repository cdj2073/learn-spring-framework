package com.example.learnspringframework;

import com.example.learnspringframework.game.*;

public class AppGamingBasicJava {
    public static void main(String[] args) {
        // var game = new MarioGame();
        // var game = new SuperContraGame();

        // 1. Object Creation
        var game = new PacmanGame();
        // 2. Object Creation + Wiring of Dependencies
        //     Game is a Dependency of GameRunner
        var gameRunner = new GameRunner(game);
        gameRunner.run();
    }
}
