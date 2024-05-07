import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MinimumProcessingTime {
    public int minProcessingTime(List<Integer> processorTime, List<Integer> tasks) {
        Collections.sort(tasks, (a, b) -> Integer.compare(b,a));
        Collections.sort(processorTime);
        int p = 0;
        List<Integer> out = new ArrayList<>();
        for(int i=0; i<tasks.size()-3; i=i+4){
            int a =  processorTime.get(p)+tasks.get(i);
            int b =  processorTime.get(p)+tasks.get(i+1);
            int c =  processorTime.get(p)+tasks.get(i+2);
            int d =  processorTime.get(p)+tasks.get(i+3);
            a = Math.max(a,b);
            c = Math.max(c,d);
            a = Math.max(a,c);
            out.add(a);
            p++;
        }
        Collections.sort(out);
        return out.get(out.size()-1);
    }
}
