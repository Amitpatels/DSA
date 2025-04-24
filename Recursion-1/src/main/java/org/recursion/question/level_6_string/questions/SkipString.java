package org.recursion.question.level_6_string.questions;

public class SkipString {

    public static void main(String[] args){
        //skip("","baccdah");
        //System.out.println(skip("baccadh"));
        //System.out.println(skipApple("bacapplecadh"));
        System.out.println(skipAppleNotApple("bacapplecaappdh"));
    }

    static void skip(String p, String up){
        if(up.isEmpty()){
            System.out.print(p);
            return;
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            skip(p,up.substring(1));
        }else{
            skip(p+ch, up.substring(1));
        }
    }

    //skipMethod with return type string
    static String skip(String up){
        if(up.isEmpty()){
            return "";
        }

        char ch = up.charAt(0);

        if(ch == 'a'){
            return skip(up.substring(1));
        }else{
            return ch + skip(up.substring(1));
        }
    }

    //skip particular string like apple from given string:
    static String skipApple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("apple")){
            return skipApple(up.substring(5));
        }else{
            return up.charAt(0) + skipApple(up.substring(1));
        }
    }

    //skip app but not apple from given String:
    static String skipAppleNotApple(String up){
        if(up.isEmpty()){
            return "";
        }

        if(up.startsWith("app") && !up.startsWith("apple")){
            return skipAppleNotApple(up.substring(3));
        }else{
            return up.charAt(0) + skipAppleNotApple(up.substring(1));
        }
    }
}
