import scala.io.StdIn.readInt
@main
def run():Unit={
    println("Enter deposit amount: ")
    val amount=readInt()
    println(interest(amount))
}

def interest(x:Double):Double=x match {
    case x if x < 0 => 0
    case x if x < 20000 => x*.02
    case x if x < 200000 => x*.04
    case x if x < 2000000 => x*.035
    case x if x>= 2000000 => x*.065
}