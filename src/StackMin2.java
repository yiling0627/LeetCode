import java.util.Stack;

public class StackMin2 {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<int[]> stack2 = new Stack<>();
    public StackMin2(){}

    public void pushElement(int e){ 
        if (stack1.empty()) {
            stack2.push(new int[] {e,1});
        }
        stack1.push(e);
        if (e < stack2.peek()[0]){
            stack2.push(new int[] {e,stack1.size()});
        }
    }

    public void popElement(){
        if (stack1.size() > stack2.peek()[1]) {
            stack1.pop();
        } else {
            stack1.pop();
            stack2.pop();
        }
    }

    public int stackMin(){
        return stack2.peek()[0];
    }

    public static void main(String[] args) {
        StackMin2 stackMin2 = new StackMin2();
        stackMin2.pushElement(2);
        stackMin2.pushElement(2);
        stackMin2.pushElement(1);
        stackMin2.pushElement(1);
        stackMin2.pushElement(2);
        stackMin2.pushElement(1);
        stackMin2.pushElement(3);
        stackMin2.pushElement(4);
        stackMin2.pushElement(4);
        stackMin2.pushElement(-1);
        System.out.println(stackMin2.stackMin());

        stackMin2.popElement();
        System.out.println(stackMin2.stackMin());

        stackMin2.popElement();
        stackMin2.popElement();
        System.out.println(stackMin2.stackMin());

        stackMin2.popElement();
        stackMin2.popElement();
        stackMin2.popElement();
        stackMin2.popElement();
        stackMin2.popElement();
        System.out.println(stackMin2.stackMin());

    }
}
