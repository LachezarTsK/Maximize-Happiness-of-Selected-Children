
#include <vector>
#include <ranges>
#include <algorithm>
using namespace std;

class Solution {

public:
    long long maximumHappinessSum(vector<int>& happiness, int numberToSelect) const {
        ranges::sort(happiness);
        int decreaseInHappinessOfUnselected = 0;
        long long maxHappinessOfSelected = 0;

        for (size_t i = happiness.size() - 1; i != variant_npos && i >= happiness.size() - numberToSelect; --i) {
            maxHappinessOfSelected += max(happiness[i] - decreaseInHappinessOfUnselected, 0);
            ++decreaseInHappinessOfUnselected;
        }
        return maxHappinessOfSelected;
    }
};
