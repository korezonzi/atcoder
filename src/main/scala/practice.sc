val num1 = 1
val num2 = 2
val num3 = 12
val numSeq = Seq(num1, num2, num3)

//for{
//  numSeq <- num1 to num3
//} yield

var res = 0
for(x <- 1 to 12 if(x % 13 == 0)) {
  res += 1
}
res

//Q2
val numSeq2: Seq[(Int, Int)] = Seq(1,2,3,4,5,6).zipWithIndex
val a = "13 76 46 15 50 98 93 77 31 43 84 90 6 24 14".split(" ").map(_.toInt).zipWithIndex
  val resultSeq = for{
    n   <- a
    n1  =  if(n._1 % 2 != 0)        n._1 else 101
    n2  =  if(n._2 % 2 == 0 )       n._2 else 101
    res =  if(n1 <= 100 && (2 <= 100))           1    else 101
  } yield res
val result2 = resultSeq.toSeq.filter(_ <= 100).sum

13 % 2 != 0
0 % 2 == 0