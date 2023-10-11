import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;

public class Homework {

    public int countOccurance(String[] arr, String word) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals(word)) {
                count++;
            }
        }
        return count;
    }

    public List<Integer> toList(Integer[] arr) {
        List<Integer> arrList = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            arrList.add(arr[i]);
        }
        return arrList;
    }


    public LinkedHashSet<String> findUnique(String[] arr) {
        LinkedHashSet<String> set = new LinkedHashSet<String>();
        for (int i = 0; i < arr.length; i++) {
            set.add(arr[i]);
        }
        return set;
    }


    public void calcOccurrance(String[] arr) {
        HashMap<String, Integer> calcOccurrance = new HashMap<>();
        Iterator<String> it = findUnique(arr).iterator();
        int counter = 0;

        while (it.hasNext()) {
            String word = it.next();

            for (int j = 0; j < arr.length; j++) {
                if (word.equals(arr[j])) {
                    counter++;
                }
            }
            calcOccurrance.put(word, counter);
            counter = 0;
        }

        calcOccurrance.forEach(
                (key, value)
                        -> System.out.println(key + " : " + value));


    }


    public ArrayList<HashMap[]> findOccurance(String[] arr) {
        HashMap<String, String> firstPart = new HashMap<>();
        HashMap<String, Integer> secondPart = new HashMap<>();
        HashMap[] array = new HashMap[2];
        ArrayList<HashMap[]> pairs = new ArrayList<HashMap[]>();
        Iterator<String> it = findUnique(arr).iterator();
        int counter = 0;

        while (it.hasNext()) {
            String word = it.next();

            for (int j = 0; j < arr.length; j++) {
                if (word.equals(arr[j])) {
                    counter++;
                }
            }
            firstPart.put("Name", word);
            secondPart.put("occurrence", counter);
            array[0] = firstPart;
            array[1] = secondPart;
            pairs.add(array);
            firstPart = new HashMap<>();
            secondPart = new HashMap<>();
            array = new HashMap[2];
            counter = 0;
        }


        return pairs;

    }

    public static void main(String[] args) {


    }
}
