package level6;

public class HowManyPagesInABook {

    public static int amountOfPages(int summary) {
        double target = 0;
        int i = 0;
        int k = 1;
        double preResult = 0;
        if (summary < 10) {
            return summary;
        }
        while (target < summary) {
            double v = 9 * Math.pow(10, i);
            target = target + v * k;
            preResult = preResult + v;
            i++;
            k++;
        }
        double diff = (target - summary) / (k-1);
        return (int) (preResult - diff);
    }

}