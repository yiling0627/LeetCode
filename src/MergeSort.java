import java.util.ArrayList;

public class MergeSort {
    // sort from small to big
    private ArrayList<Integer> arr;
    public MergeSort(){
        arr = new ArrayList<>();
        arr.add(2);
        arr.add(10);
        arr.add(5);
        arr.add(9);
        arr.add(13);
        arr.add(1);
        arr.add(4);
        arr.add(20);
        arr.add(6);
    }

    public ArrayList<Integer> merge(ArrayList<Integer> arr, int left, int right){
        ArrayList<Integer> result = new ArrayList<>();
        if(left == right) {
            result.add(arr.get(left));
            return result;
        }

        int mid = left + (right - left) / 2;
        ArrayList<Integer> arrLeft = merge(arr,left,mid);
        ArrayList<Integer> arrRight = merge(arr,mid+1,right);
        result = combine(arrLeft, arrRight);
        return result;
    }


    public ArrayList<Integer> combine(ArrayList<Integer> left, ArrayList<Integer> right){
        ArrayList<Integer> result = new ArrayList<>();
        if(left.size() == 0)
            return right;
        if(right.size() == 0)
            return left;
        int i = 0, j = 0;
        while (i < left.size() || j < right.size()){
            if(i == left.size()){
                for(int n = j; n < right.size(); n++){
                    result.add(right.get(n));
                }
                return result;
            }
            if (j == right.size()){
                for(int n = i; n < left.size(); n++){
                    result.add(left.get(n));
                }
                return result;
            }
            if(left.get(i) < right.get(j)){
                result.add(left.get(i++));
            } else {
                result.add(right.get(j++));
            }
        }
        return result;
    }

    public static void main(String[] args) {
        MergeSort m = new MergeSort();
        System.out.println(m.arr);
        ArrayList<Integer> result = m.merge(m.arr,0,m.arr.size()-1);
        System.out.println(result);
    }
}
