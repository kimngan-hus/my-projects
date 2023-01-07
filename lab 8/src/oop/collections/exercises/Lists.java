package oop.collections.exercises;

import java.util.*;
public class Lists {
    public static void insertFirst(ArrayList<Integer> list, int value){
        list.add(0,value);
        System.out.println(list);
    }
    public static void insertLast(ArrayList<Integer> list, int value){
        list.add(value);
        System.out.println(list);
    }
    public static void replace(ArrayList<Integer> list, int value){
        list.set(2,value);
        System.out.println(list);
    }
    public static void removeThird(ArrayList<Integer> list){
        list.remove(2);
        System.out.println(list);
    }
    public static void removeEvil(ArrayList<Integer> list){
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == 666){
                list.remove(i);
            }
        }
        System.out.println(list);
    }
    public static ArrayList<Integer> generateSquare(){
        ArrayList<Integer> containing = new ArrayList<>();
        for (int i = 1; i <=10 ; i++) {
            int hold = i*i;
            containing.add(hold);
        }
        return containing;
    }
    public static boolean contains(ArrayList<Integer> list, int value){
        return list.contains(value);
    }
    public static void copy(ArrayList<Integer> soure, ArrayList<Integer> target){
        for (int i = 0; i < soure.size(); i++) {
            target.add(soure.get(i));
        }
        System.out.println(target);
    }
    public static void reverse(ArrayList<Integer> list){
        Collections.reverse(list);
        System.out.println(list);
    }
    public static void reverseManual(ArrayList<Integer> list){
        ArrayList<Integer> reverselist = new ArrayList<>();
        for (int i = list.size()-1; i >=0; i--) {
            reverselist.add(list.get(i));
        }
        System.out.println(reverselist);
    }
    public static void insertBeginningEnd(LinkedList<Integer> list, int value){
        list.addFirst(value);
        list.addLast(value);
        System.out.println(list);
    }
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Lists.insertFirst(list, 1);
        System.out.println(list);
        Lists.insertLast(list, 2);
        Lists.insertLast(list, 2);
        Lists.insertLast(list, 666);
        System.out.println(list);
        Lists.replace(list, 3);
        System.out.println(list);
        Lists.removeThird(list);
        System.out.println(list);
        Lists.removeEvil(list);
        System.out.println(list);
        ArrayList<Integer> listSquare = Lists.generateSquare();
        System.out.println(listSquare);
        System.out.println(Lists.contains(list, 1));
        System.out.println(Lists.contains(list, 10));
        Lists.copy(list, listSquare);
        System.out.println(listSquare);
        Lists.reverse(list);
        System.out.println(list);
        Lists.reverseManual(list);
        System.out.println(list);
        LinkedList<Integer> linkedList = new LinkedList<>(list);
        Lists.insertBeginningEnd(linkedList, 0);
        System.out.println(linkedList);
    }
}