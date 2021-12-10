import java.util.Stack;

public class QueueStack {
    private Stack<Integer> stack1 = new Stack<>();
    private Stack<Integer> stack2 = new Stack<>();
    public QueueStack(){
    }

    public void pushElement(int e){
        stack1.push(e);
    }

    public int popElement() {
        if (stack2.empty()) {
            while (!stack1.empty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }


    public static void main(String[] args) {
        QueueStack queueStack = new QueueStack();
        queueStack.pushElement(1);
        queueStack.pushElement(2);
        queueStack.pushElement(3);
        queueStack.pushElement(4);
        queueStack.pushElement(5);
        queueStack.pushElement(6);

        System.out.println(queueStack.popElement());
        System.out.println(queueStack.popElement());
        System.out.println(queueStack.popElement());
        System.out.println(queueStack.popElement());

        queueStack.pushElement(7);
        queueStack.pushElement(8);
        queueStack.pushElement(9);


        System.out.println(queueStack.popElement());
        System.out.println(queueStack.popElement());
        System.out.println(queueStack.popElement());

        queueStack.pushElement(10);
        queueStack.pushElement(11);

        System.out.println(queueStack.popElement());
        System.out.println(queueStack.popElement());
        System.out.println(queueStack.popElement());
        System.out.println(queueStack.popElement());



    }
}
