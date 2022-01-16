package leetcode;

public class ReverseInt {
    // Given a signed 32-bit integer x, return x with its digits reversed.

    public int reverseInt(int x){
        int result = 0;
        while (x != 0) {
            int a = x % 10;
            if (result > Integer.MAX_VALUE/10 ) return 0;
            if (result < Integer.MIN_VALUE/10 ) return 0;
            result = result*10 + a;
            x = x / 10;
        }
        return  result;
    }

    public static void main(String[] args) {
        ReverseInt reverseInt = new ReverseInt();
        int rev = reverseInt.reverseInt(123456);
        int rev1 = reverseInt.reverseInt(15230);
        int rev2 = reverseInt.reverseInt(96145);
        int rev3 = reverseInt.reverseInt(87654);

        System.out.println(rev);
        System.out.println(rev1);
        System.out.println(rev2);
        System.out.println(rev3);
    }
}
