
import java.util.Arrays;

public class Solution {

    public long maximumHappinessSum(int[] happiness, int numberToSelect) {
        Arrays.sort(happiness);
        int decreaseInHappinessOfUnselected = 0;
        long maxHappinessOfSelected = 0;

        for (int i = happiness.length - 1; i >= happiness.length - numberToSelect; --i) {
            maxHappinessOfSelected += Math.max(happiness[i] - decreaseInHappinessOfUnselected, 0);
            ++decreaseInHappinessOfUnselected;
        }
        return maxHappinessOfSelected;
    }
}
