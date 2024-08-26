/*
    Lab 23
    Jason Chen
    112515450
 */
import java.util.ArrayList;
import java.util.Scanner;
public class Task2 {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        // Test case
        ArrayList<String> list1 = new ArrayList<String>();
        ArrayList<String> list2 = new ArrayList<String>();
        list1.add("Austin");
        list1.add("Dallas");
        list1.add("San Fransisco");
        list2.add("Boston");
        list2.add("Chicago");
        list2.add("Denver");
        list2.add("Seattle");

        // Print results
        System.out.println(mergeList(list1, list2));

        in.close();
    }
    public static ArrayList<String> mergeList(ArrayList<String> list1, ArrayList<String> list2){
        for(int i = 0; i < list1.size(); i++){
            for(int j = 0; j < list2.size(); j++){
                if(list1.get(i).compareTo(list2.get(j)) > 0){
                    list1.add(i, list2.get(j));
                    list2.remove(j);
                }
            }
        }
        return list1;
    }
}
