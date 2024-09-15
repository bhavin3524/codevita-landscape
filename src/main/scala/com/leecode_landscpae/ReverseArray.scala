package com.leecode_landscpae

class ReverseArrayTest {
  def reverseArrUsingExistingMethod(arr: Array[Int]): Array[Int] = {
    arr.reverse
  }

  def reverseArrUsingRecursion(arr: Array[Int]): Array[Int] = {
    if (arr.isEmpty) {
      return arr
    }
    reverseArrUsingRecursion(arr.tail) :+ arr.head
  }

  def reverseArrUsingForLoop(arr: Array[Int]): Array[Int] = {
    val reversedArray = new Array[Int](arr.length)
    for (i <- arr.indices) {
      reversedArray(i) = arr(arr.length - 1 - i)
    }
    reversedArray
  }
}

object ReverseArray {
  def main(args: Array[String]): Unit = {

    val reverseArrayTestObj = new ReverseArrayTest();

    val arr = Array(1, 2, 3, 4, 5, 6, 7)
    println(s"Before reverse:" + arr.mkString(", "))

    println("Using inbuilt method: " + reverseArrayTestObj.reverseArrUsingExistingMethod(arr).mkString(", "))

    println("Using recursion: " + reverseArrayTestObj.reverseArrUsingRecursion(arr).mkString(", "))

    println("Using for-loop: " + reverseArrayTestObj.reverseArrUsingForLoop(arr).mkString(", "))

  }
}
