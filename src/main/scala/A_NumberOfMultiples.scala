object Main extends App{
  val sc = new java.util.Scanner(System.in)
  val numR = sc.nextInt
  val numL = sc.nextInt
  val numD = sc.nextInt

  var result = 0
  for(num <- numR to numL if(num % numD == 0)){
    result += 1
  }
  println(result)
}
