
/**
 * @param {number[]} happiness
 * @param {number} numberToSelect
 * @return {number}
 */
var maximumHappinessSum = function (happiness, numberToSelect) {
    happiness.sort((x, y) => x - y);
    let decreaseInHappinessOfUnselected = 0;
    let maxHappinessOfSelected = 0;

    for (let i = happiness.length - 1; i >= happiness.length - numberToSelect; --i) {
        maxHappinessOfSelected += Math.max(happiness[i] - decreaseInHappinessOfUnselected, 0);
        ++decreaseInHappinessOfUnselected;
    }
    return maxHappinessOfSelected;
};
