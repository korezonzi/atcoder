object Main extends App{
  val sc = new java.util.Scanner(System.in)
  val num = sc.nextInt()
  val result = (10000 - num ) % 1000
  println(result)
}
