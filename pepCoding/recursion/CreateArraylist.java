package pepCoding.recursion;

import java.util.ArrayList;

public class CreateArraylist {
    public static void main(String[] args) {


        String str = "hello";
//
//
//
//        String sc=str.substring(1,4);
//        System.out.println(sc);
//        for(int i=0; i<str.length();i++){
//            char ch=str.charAt(i);
//            System.out.println(ch);


        ArrayList<Integer> chitti = new ArrayList<>();
        chitti.add(23);
        chitti.add(34);
        System.out.println(chitti + " " + chitti.size());
        for (int i = 0; i < chitti.size(); i++) {
            int cha = chitti.get(i);
            System.out.println(cha);
        }
    }
}