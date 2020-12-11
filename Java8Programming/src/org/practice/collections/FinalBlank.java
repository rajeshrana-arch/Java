package org.practice.collections;

public class FinalBlank {
    public int addMe(int i, int j, final int bonusAmt) {
        return i+j+bonusAmt;
    }
    public static void main(String[] args) {
        FinalBlank blank= new FinalBlank();
        System.out.println(blank.addMe(1,2,9));

    }
}
