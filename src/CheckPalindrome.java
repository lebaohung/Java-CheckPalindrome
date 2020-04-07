import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class CheckPalindrome {
    private String str;

    public CheckPalindrome(String str) {
        this.str = str.toLowerCase();
    }

    public boolean check() {
        Stack stack = new Stack();
        Queue queue = new LinkedList();

        for (int i = 0; i <str.length(); i++) {
            stack.push(str.charAt(i));
            queue.add(str.charAt(i));
        }

        for (int i = 0; i < str.length(); i++) {
            while (!stack.empty()) {
                if (!stack.pop().equals(queue.poll())) {
                    return false;
                }
            }
        }
        return true;
    }
}
