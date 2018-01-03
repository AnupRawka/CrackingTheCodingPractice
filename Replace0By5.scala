package main.scala

object replace0By5 {
  def main(args: Array[String]): Unit ={
println(replace0By5Func(1002))
  }
def replace0By5Func(num: Int): Int={
  if (num == 0) return 0

  // Extraxt the last digit and change it if needed
  var digit = num % 10
  if (digit == 0) digit = 5

  // Convert remaining digits and append the
  // last digit
  replace0By5Func(num / 10) * 10 + digit
  }

}
