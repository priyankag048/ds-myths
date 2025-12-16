package main

import (
	"fmt"
	timer "github.com/priyankag048/ds-myths/utils/timer_utils/golang"
)

const initialSize = 1000000
const insertOperation = 10000

func prefillSlice(slice []int) []int {
	for i := 0; i < initialSize; i++ {
		slice = append(slice, i)
	}
	fmt.Printf("Initial size: %d\n", len(slice))
	return slice
}

func appendToSlice(slice []int) []int {
	t := timer.NewTimer()
	t.Start()
	for i := 0; i < insertOperation; i++ {
		slice = append(slice, i)
	}
	t.Stop("Appending operation took")
	fmt.Printf("Final size after appending: %d\n", len(slice))
	return slice
}

func prependToSlice(slice []int) []int {
	t := timer.NewTimer()
	t.Start()
	for i := 0; i < insertOperation; i++ {
		slice = append([]int{i}, slice...)
	}
	t.Stop("Prepending operation took")
	fmt.Printf("Final size after prepending: %d\n", len(slice))
	return slice
}

func main() {
	slice := make([]int, 0, initialSize)
	slice = prefillSlice(slice)
	slice = appendToSlice(slice)
	prependToSlice(slice)
}
