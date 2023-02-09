package workshop;

import com.sun.security.jgss.GSSUtil;

public class Main {
    public static void main(String[] args) throws NoSuchFieldException {

        CustomStack stack = new CustomStack();

        stack.push(5);
        stack.push(4);
        stack.push(7);
        stack.push(1);
        stack.push(17);

        stack.pop();
        stack.forEach(s -> System.out.print(" " + s));

    }
}
