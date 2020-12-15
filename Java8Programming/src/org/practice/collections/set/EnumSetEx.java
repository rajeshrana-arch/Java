package org.practice.collections.set;
import java.util.*;

enum Gfg {
    CODE,
    LEARN,
    CONTRIBUTE,
    QUIZ,
    MCQ
}

public class EnumSetEx {
    public static void main(String[] args) {
        Set<Gfg> set1;
        set1=EnumSet.of(Gfg.QUIZ,
                Gfg.CONTRIBUTE,
                Gfg.LEARN,
                Gfg.CODE,
                Gfg.MCQ);
        System.out.println("Set 1: " + set1);
    }
}
