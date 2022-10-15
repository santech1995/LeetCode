package main

import (
	"fmt"
)

var array []int
var res []int

func main() {
	fmt.Println("enter the elements of array")
	result := nextGreaterNum(array)()
	fmt.Println(result)
}

func (int []a ) nextGreaterNum(int []res) {
	for i := 0; i < array.length; i++ {
		if array[i+1] > array[i] {
			res[i] = array[i+1]
		} else {
			res[i] = -1
		}
	}
	return []res

}
