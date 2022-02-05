package leetcode;

public class Container {

    public int mostWater(int[] x){
        int result = 0, temp;
        if (x.length <= 1) return 0;
        if (x.length == 2) return Math.min(x[0], x[1]);
        for(int i = 0; i < x.length; i++){
            for(int j = i + 1; j < x.length; j++){
                temp = Math.min(x[i],x[j])*(j-i);
                if (temp > result) result = temp;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Container container = new Container();
        int[] water = {1,8,6,2,5,4,8,3,7};
        System.out.println(container.mostWater(water));
    }
}
