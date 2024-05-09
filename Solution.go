
package main

import "sort"

func maximumHappinessSum(happiness []int, numberToSelect int) int64 {
	sort.Ints(happiness)
	decreaseInHappinessOfUnselected := 0
	var maxHappinessOfSelected int64 = 0

	for i := len(happiness) - 1; i >= len(happiness)-numberToSelect; i-- {
		maxHappinessOfSelected += int64(max(happiness[i]-decreaseInHappinessOfUnselected, 0))
		decreaseInHappinessOfUnselected++
	}
	return maxHappinessOfSelected
}
