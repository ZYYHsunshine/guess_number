package com.twschool.practice;

import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

public class GuessNumberTest {
    @Test
    public void should_return_4A0B_when_answer_1234_given_input_1234(){
        //given
        TheGame theGame = new TheGame();
        ArrayList<Integer> rightAnswer = new ArrayList<Integer>(4);
        ArrayList<Integer> input = new ArrayList<Integer>(4);
        rightAnswer.add(1);
        rightAnswer.add(2);
        rightAnswer.add(3);
        rightAnswer.add(4);
        input.add(1);
        input.add(2);
        input.add(3);
        input.add(4);

        //when
        String result = theGame.getResult(rightAnswer, input);

        //then
        assertEquals("4A0B", result);

    }

    @Test
    public void should_return_1A0B_when_answer_1234_given_input_1567(){
        //given
        TheGame theGame = new TheGame();
        ArrayList<Integer> rightAnswer = new ArrayList<Integer>(4);
        ArrayList<Integer> input = new ArrayList<Integer>(4);
        rightAnswer.add(1);
        rightAnswer.add(2);
        rightAnswer.add(3);
        rightAnswer.add(4);
        input.add(1);
        input.add(5);
        input.add(6);
        input.add(7);

        //when
        String result = theGame.getResult(rightAnswer, input);

        //then
        assertEquals("1A0B", result);

    }

    @Test
    public void should_return_0A2B_when_answer_1234_given_input_2478(){
        //given
        TheGame theGame = new TheGame();
        ArrayList<Integer> rightAnswer = new ArrayList<Integer>(4);
        ArrayList<Integer> input = new ArrayList<Integer>(4);
        rightAnswer.add(1);
        rightAnswer.add(2);
        rightAnswer.add(3);
        rightAnswer.add(4);
        input.add(2);
        input.add(4);
        input.add(7);
        input.add(8);

        //when
        String result = theGame.getResult(rightAnswer, input);

        //then
        assertEquals("0A2B", result);

    }

    @Test
    public void should_return_1A2B_when_answer_1234_given_input_0324(){
        //given
        TheGame theGame = new TheGame();
        ArrayList<Integer> rightAnswer = new ArrayList<Integer>(4);
        ArrayList<Integer> input = new ArrayList<Integer>(4);
        rightAnswer.add(1);
        rightAnswer.add(2);
        rightAnswer.add(3);
        rightAnswer.add(4);
        input.add(0);
        input.add(3);
        input.add(2);
        input.add(4);

        //when
        String result = theGame.getResult(rightAnswer, input);

        //then
        assertEquals("1A2B", result);

    }

    @Test
    public void should_return_0A0B_when_answer_1234_given_input_5678(){
        //given
        TheGame theGame = new TheGame();
        ArrayList<Integer> rightAnswer = new ArrayList<Integer>(4);
        ArrayList<Integer> input = new ArrayList<Integer>(4);
        rightAnswer.add(1);
        rightAnswer.add(2);
        rightAnswer.add(3);
        rightAnswer.add(4);
        input.add(5);
        input.add(6);
        input.add(7);
        input.add(8);

        //when
        String result = theGame.getResult(rightAnswer, input);

        //then
        assertEquals("0A0B", result);

    }

    @Test
    public void should_return_0A4B_when_answer_1234_given_input_4321(){
        //given
        TheGame theGame = new TheGame();
        ArrayList<Integer> rightAnswer = new ArrayList<Integer>(4);
        ArrayList<Integer> input = new ArrayList<Integer>(4);
        rightAnswer.add(1);
        rightAnswer.add(2);
        rightAnswer.add(3);
        rightAnswer.add(4);
        input.add(4);
        input.add(3);
        input.add(2);
        input.add(1);

        //when
        String result = theGame.getResult(rightAnswer, input);

        //then
        assertEquals("0A4B", result);

    }

    @Test
    public void should_return_wrong_input_when_answer_1234_given_input_1123(){
        //given
        String result = "";
        TheGame theGame = new TheGame();
        ArrayList<Integer> rightAnswer = new ArrayList<Integer>(4);
        ArrayList<Integer> input = new ArrayList<Integer>(4);
        rightAnswer.add(1);
        rightAnswer.add(2);
        rightAnswer.add(3);
        rightAnswer.add(4);
        input.add(1);
        input.add(1);
        input.add(2);
        input.add(3);

        //when
        Boolean temp = theGame.verifyDeplicateInput(input);
        if (temp){
            result = theGame.getResult(rightAnswer, input);
        }else {
            result = "Wrong Input,Input again";
        }

        //then
        assertEquals("Wrong Input,Input again", result);

    }

    @Test
    public void should_return_wrong_input_when_answer_1234_given_input_12(){
        //given
        String result = "";
        TheGame theGame = new TheGame();
        ArrayList<Integer> rightAnswer = new ArrayList<Integer>(4);
        ArrayList<Integer> input = new ArrayList<Integer>();
        rightAnswer.add(1);
        rightAnswer.add(2);
        rightAnswer.add(3);
        rightAnswer.add(4);
        input.add(1);
        input.add(2);

        //when
        Boolean isDeplicateInput = theGame.verifyDeplicateInput(input);
        Boolean isLessInput = theGame.verifyLessInput(input);
        if (isLessInput || isDeplicateInput){
            result = theGame.getResult(rightAnswer, input);
        }else {
            result = "Wrong Input,Input again";
        }

        //then
        assertEquals("Wrong Input,Input again", result);

    }

}
