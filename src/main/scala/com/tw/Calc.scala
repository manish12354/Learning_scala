package com.tw

class Calc {

  def add(num1: Int, num2: Int) : Int = {
    num1 + num2
  }

  def sub(num1: Int, num2: Int) : Int = {
    num1 - num2
  }

  def isEven(num : Int) : Boolean = {
    num%2==0
  }

  def factorial(number: Int) : Int ={
    if (number == 0){
      1
    } else {
      number * factorial(number-1)
    }

//     number > 1 ? factorial(number) * (number-1) : 0
  }

}
