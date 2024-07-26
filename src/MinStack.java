import java.util.ArrayList;
import java.util.List;

public class MinStack {
    private List<Integer> data;
    public MinStack() {
        data = new ArrayList<>();
    }
    
    public void push(int val) {
        data.add(val);
    }
    
    public void pop() {
        data.remove(data.size() - 1);
    }
    
    public int top() {
        return data.get(data.size() - 1);
    }
    
    public int getMin() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < data.size(); i++) {
            if (data.get(i) < min) {
                min = data.get(i);
            }
        }
        return min;
    }
}