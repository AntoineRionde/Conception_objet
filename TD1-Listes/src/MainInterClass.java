import java.util.ArrayList;
import java.util.List;

public class MainInterClass {

    public static void main(String[] args) {
        List<Integer> l1 = new ArrayList<>();
        List<Integer> l2 = new ArrayList<>();

        int i1 = 15;
        int i2 = 10;

        for (int i = 0; i < i1 ; i++) {
            l1.add(i);
        }

        l2.add(7);
        l2.add(9);
        l2.add(12);


        List<Integer> lResFinal = InterClassement.lentierInterclasser(l1, l2);

        System.out.println(l1.toString());
        System.out.println(l2.toString());
        System.out.println(lResFinal.toString());



    }
}
