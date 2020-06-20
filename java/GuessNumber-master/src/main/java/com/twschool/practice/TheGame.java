package com.twschool.practice;

import java.util.*;

public class TheGame {

    public Set<Integer> getRandomNumber() {
        Set<Integer> set = new HashSet<Integer>();
        Random random = new Random();

        while (set.size() < 4) {
            set.add(random.nextInt(10));
        }
        return set;
    }

    public ArrayList<Integer> commandInput(ArrayList<Integer> input){
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入你要输入几个数字：");
        int totalNum = Integer.parseInt(sc.nextLine());
        System.out.println("请依次输入一个数字：");
        for(int i=0; i<totalNum; i++){
            int num = Integer.parseInt(sc.nextLine());
            input.add(num);
        }
        return input;
    }

    public int getCount(ArrayList<Integer> rightAnswer, ArrayList<Integer> input) {
        int count = 0;
        for (int i = 0; i < rightAnswer.size(); i++) {
            for (int j = 0; j < input.size(); j++) {
                if (rightAnswer.get(i) == input.get(j)) {
                    count++;
                }
            }
        }
        return count;
    }

    public int getCountA(ArrayList<Integer> rightAnswer, ArrayList<Integer> input){
        int countA = 0;
        for (int i=0; i<rightAnswer.size(); i++){
            if (rightAnswer.get(i) == input.get(i)){
                countA++;
            }
        }
        return countA;
    }
    public int getCountB(ArrayList<Integer> rightAnswer, ArrayList<Integer> input){
        int countB = getCount(rightAnswer, input) - getCountA(rightAnswer, input);
        return countB;
    }

    public String getResult(ArrayList<Integer> rightAnswer, ArrayList<Integer> input){
        int countA = getCountA(rightAnswer, input);
        int countB = getCountB(rightAnswer, input);
        String result = String.valueOf(countA) + "A" + String.valueOf(countB) + "B";
        return result;
    }

    public Boolean verifyDeplicateInput(ArrayList<Integer> input){
        for (int i=0; i<input.size(); i++){
            for (int j=i; j<input.size(); j++){
                if(input.get(i) == input.get(j)){
                    return false;
                }
            }
        }
        return true;
    }

    public Boolean verifyLessInput(ArrayList<Integer> input){
        if(input.size() < 4){
            return false;
        }
        return true;
    }
}
