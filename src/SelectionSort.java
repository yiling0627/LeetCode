import java.util.ArrayList;
import java.util.Collections;

public class SelectionSort {

    private ArrayList<Integer> arr;
    public SelectionSort(){
        arr = new ArrayList<>();
        arr.add(2);
        arr.add(12);
        arr.add(7);
        arr.add(4);
        arr.add(11);
        arr.add(9);
        arr.add(3);
        arr.add(5);
    }

    public ArrayList<Integer> selectSort(ArrayList<Integer> arr){
        if(arr.size() == 0) return null;
        for (int i = 0; i < arr.size(); i++){
            int global = arr.get(i);
            for (int j = i+1; j < arr.size(); j++){
                if (global > arr.get(j)){
                    global = arr.get(j);
                    Collections.swap(arr,i,j);
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        SelectionSort selectionSort = new SelectionSort();
        System.out.println(selectionSort.selectSort(selectionSort.arr));
    }
}
