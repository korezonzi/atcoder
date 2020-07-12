object Main extends App{
  val sc = new java.util.Scanner(System.in)

  val inputInt1 = sc.nextInt()
  val inputSumNum = sc.next.split(" ").map(_.toInt).sum
  val inputStr  = sc.next
  println(s"${inputSumNum+inputInt1}+ ${inputStr}")
  /*def main(args: Array[String]): Unit = {
    println(sumStrNum(1)(59)("lemon"))
  }

  def sumStrNum(num1: Int)(num2: Int)(str: String) : String= {
    s"${(num1+num2).toString} ${str}"
  }*/
}
