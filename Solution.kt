
import kotlin.math.max

class Solution {
    fun maximumHappinessSum(happiness: IntArray, numberToSelect: Int): Long {
        happiness.sort();
        var decreaseInHappinessOfUnselected = 0;
        var maxHappinessOfSelected: Long = 0;

        for (i in happiness.size - 1 downTo happiness.size - numberToSelect) {
            maxHappinessOfSelected += max(happiness[i] - decreaseInHappinessOfUnselected, 0);
            ++decreaseInHappinessOfUnselected;
        }
        return maxHappinessOfSelected;
    }
}
