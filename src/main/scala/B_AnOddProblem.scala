object Main extends App {
  val sc = new java.util.Scanner(System.in)
  val numLength = sc.nextInt
  val numSeq = Seq.fill(numLength)(sc.nextInt).zipWithIndex
    val resultSeq = for{
    n   <- numSeq
    n1  =  if(n._1 % 2 != 0) n._1 else 0
    n2  =  if(n._2 % 2 == 0 || n._2 == 0)n._2  else 0
    res =  if(n1 > 0 && n2 > 0) 1 else 0
  } yield res
  val result = resultSeq.filter(_ > 0).sum
  println(result)
}
