package timer

import (
	"time"
	"fmt"
)

type Timer struct {
	start time.Time
} 

func NewTimer() *Timer {
    return &Timer{}
}

func (t *Timer) Start() {
	t.start = time.Now()
}

func (t *Timer) Stop(message string) {
	elapsed := time.Since(t.start).Milliseconds()
	fmt.Printf("%s: %d ms \n", message, elapsed)
}