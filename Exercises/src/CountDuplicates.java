import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class CountDuplicates {
    /*
    Given an integer array nums of length n where all the integers of nums are in the range [1, n]
    and each integer appears once or twice, return an array of all the integers that appears twice.
    You must write an algorithm that runs in O(n) time and uses only constant extra space.
     */
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(20);
        list.add(20);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(90);
        list.add(80);
        list.add(90);
        list.add(100);
        System.out.println("Total Number having duplicate Count:" + CountDuplicatesStatic.countDuplicates(list));

    }

    private static class CountDuplicatesStatic {
        static int countDuplicates(List<Integer> numbers) {
            HashSet<Integer> set = new HashSet<Integer>();
            HashSet<Integer> duplicateSet = new HashSet<Integer>();

            for(int i=0;i<numbers.size();i++){
                if(set.contains(numbers.get(i))){
                    duplicateSet.add(numbers.get(i));
                }else{
                    set.add(numbers.get(i));
                }
            }
            return duplicateSet.size();
        }


    }
}
