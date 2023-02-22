package org.example;

import java.lang.reflect.Member;

public class objectTest {
    static String a = "abs";
    static String b = "abs";
    static Object oe = new Object();
    public static void eq(){
        System.out.println(a.equals(b));
    }

    public static void ts(){
        System.out.println(oe.toString());
    }

//    public Member getMember() {
//        Member cloned = null;
//        try {
//            cloned = (Member) clone();  // s 타입과 동일하게 캐스팅 必, 얕은 복제
//            // cloned = (Member) super.clone();  // 깊은 복제
//        } catch (CloneNotSupportedException e) { }
//        return cloned;
//    }
}

