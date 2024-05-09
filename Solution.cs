
using System;

public class Solution
{
    public long MaximumHappinessSum(int[] happiness, int numberToSelect)
    {
        Array.Sort(happiness);
        int decreaseInHappinessOfUnselected = 0;
        long maxHappinessOfSelected = 0;

        for (int i = happiness.Length - 1; i >= happiness.Length - numberToSelect; --i)
        {
            maxHappinessOfSelected += Math.Max(happiness[i] - decreaseInHappinessOfUnselected, 0);
            ++decreaseInHappinessOfUnselected;
        }
        return maxHappinessOfSelected;
    }
}
