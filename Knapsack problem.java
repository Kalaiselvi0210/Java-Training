
        import java.util.*;

public class Main {

    static class Items {
        int val;
        int wt;

        Items(int val, int wt) {
            this.val = val;
            this.wt = wt;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int W = sc.nextInt();

        Items[] items = new Items[n];

        for (int i = 0; i < n; i++) {
            int val = sc.nextInt();
            int wt = sc.nextInt();
            items[i] = new Items(val, wt); 
        }

        Arrays.sort(items, (a, b) ->
            Double.compare((double) b.val / b.wt, (double) a.val / a.wt)
        );

        double totalvalue = 0.0;

        for (Items it : items) {
            if (W >= it.wt) {
                W -= it.wt;
                totalvalue += it.val;
            } else {
                totalvalue += (double) it.val * W / it.wt;
                break;
            }
        }

        System.out.println(totalvalue);
    }
}





        
