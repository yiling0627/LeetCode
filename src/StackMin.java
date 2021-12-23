import java.util.Stack;

public class StackMin {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();
    private int min;
    public StackMin(){}

    public void pushElement(int e){
        if (stack1.empty()) min = e;
        stack1.push(e);
        if (e < min){
            min = e;
            stack2.push(e);
        } else {
            stack2.push(min);
        }
    }

    public void popElement(){
        stack1.pop();
        stack2.pop();
    }

    public int stackMin(){
        return stack2.pop();
    }

    public static void main(String[] args) {
        StackMin stackMin = new StackMin();
        stackMin.pushElement(4);
        stackMin.pushElement(2);
        stackMin.pushElement(6);
        stackMin.pushElement(7);
        stackMin.pushElement(12);
        stackMin.pushElement(9);
        stackMin.pushElement(1);
        System.out.println(stackMin.stackMin());

        stackMin.popElement();
        System.out.println(stackMin.stackMin());

    }
}
