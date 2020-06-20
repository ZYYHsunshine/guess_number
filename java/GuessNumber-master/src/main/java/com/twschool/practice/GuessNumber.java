package com.twschool.practice;

import java.util.ArrayList;

public class GuessNumber {
    public static void main(String[] args) {
        String result = "";
        TheGame theGame = new TheGame();
        ArrayList<Integer> rightAnswer = new ArrayList<Integer>(4);
        ArrayList<Integer> input = new ArrayList<Integer>();
        rightAnswer.addAll(theGame.getRandomNumber());
        input = theGame.commandInput(input);

        Boolean isDeplicateInput = theGame.verifyDeplicateInput(input);
        Boolean isLessInput = theGame.verifyLessInput(input);
        if (isLessInput || isDeplicateInput){
            result = theGame.getResult(rightAnswer, input);
        }else {
            result = "Wrong Input,Input again";
        }
        System.out.println("答案是"+rightAnswer.toString());
        System.out.println(result);

    }
}
