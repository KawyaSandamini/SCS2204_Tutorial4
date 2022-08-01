import scala.io.StdIn.readInt
@main
def run():Unit={
    println("Enter integer input: ")
    var number=readInt();
    findNumberType(number)
}

def findNumberType(n:Int):Unit=n match {
    case n if n <= 0 => println("Negitive/Zero")
    case n if n%2 == 0 => println("Even Number")
    case n if n%2 != 0 => println("Odd Number")
}

