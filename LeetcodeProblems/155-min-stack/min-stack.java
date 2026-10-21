import java.util.Stack;

class MinStack {
    private static class Pair {
        int val;
        int minVal;

        Pair(int val, int minVal) {
            this.val = val;
            this.minVal = minVal;
        }
    }

    private Stack<Pair> st;

    public MinStack() {
        st = new Stack<>();
    }

    public void push(int value) {
        int minVal = st.isEmpty()
                ? value
                : Math.min(value, st.peek().minVal);

        st.push(new Pair(value, minVal));
    }

    public void pop() {
        st.pop();
    }

    public int top() {
        return st.peek().val;
    }

    public int getMin() {
        return st.peek().minVal;
    }
}