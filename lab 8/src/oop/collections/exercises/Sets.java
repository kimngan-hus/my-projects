package oop.collections.exercises;
import java.util.*;
public class Sets {
    public static Set<Integer> intersectionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersection = new HashSet<>();
        for (int element1 : first) {
            for (int element2 : second) {
                if (element1 == element2) {
                    intersection.add(element1);
                }
            }
        }
        return intersection;
    }

    public static Set<Integer> unionManual(Set<Integer> first, Set<Integer> second) {
        Set<Integer> intersection = new HashSet<>();
        for (int element1 : first) {
            for (int element2 : second) {
                if (element1 == element2) {
                    intersection.add(element1);
                }
            }
        }
        for (int i:second) {
            for (int j:intersection) {
                if (i != j){
                    first.add(i);
                }
            }
        }
        return first;
    }

    public static Set<Integer> intersection(Set<Integer> first, Set<Integer> second) {
        first.retainAll(second);
        return first;
    }

    public static Set<Integer> union(Set<Integer> first, Set<Integer> second) {
        first.addAll(second);
        return first;
    }

    public static List<Integer> toList(Set<Integer> soure) {
        List<Integer> arr = new ArrayList<>();
        for (int i : soure) {
            arr.add(i);
        }
        return arr;
    }

    public static List<Integer> removeDuplicates(List<Integer> soure) {
        List<Integer> newList = new ArrayList<>();
        for (int element : soure) {
            if (!newList.contains(element)) {
                newList.add(element);
            }
        }
        return newList;
    }

    public static List<Integer> removeDuplicatesManual(List<Integer> soure) {
        Set<Integer> set = new LinkedHashSet<>();
        set.addAll(soure);
        soure.clear();
        soure.addAll(set);
        return soure;
    }

    public static Character firstRecurringCharacter(String s) {
        for (int i = 0; i < s.length(); i++) {
            Character ch1 = s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                Character ch2 = s.charAt(i);
                if (ch1 == ch2) {
                    return ch1;
                }
            }
        }
        return 0;
    }

    public static Set<Character> allRecurringChars(String s) {
        Set<Character> recurringChar = new HashSet<>();
        for (int i = 0; i < s.length() - 1; i++) {
            Character ch1 = s.charAt(i);
            for (int j = i + 1; j < s.length(); j++) {
                Character ch2 = s.charAt(j);
                if (ch1 == ch2) {
                    recurringChar.add(ch1);
                }
            }
        }
        return recurringChar;
    }

    public static Integer[] toArray(Set<Integer> soure) {
        return soure.toArray(new Integer[0]);
    }

    public static int getFirst(TreeSet<Integer> soure) {
        return soure.first();
    }

    public static int getLast(TreeSet<Integer> soure) {
        return soure.last();
    }

    public static int getGreater(TreeSet<Integer> soure, int value) {
        return soure.higher(value);
    }

}