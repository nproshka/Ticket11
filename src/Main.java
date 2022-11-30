import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println(exercise(1000));
    }

    public static List<Integer> exercise(Integer integer) {
        List<Integer> list = new ArrayList<>();
        for (int i = 1; i <= integer; i++) {
            if (integer % i == 0) {
                list.add(i);
            }
        }
        return list;
    }

}