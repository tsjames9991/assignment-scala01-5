import com.sun.istack.internal.logging.Logger

class Assignment {

  def sequenceCollatz(number: Int, visited: List[Int]): List[Int] = {
    number match {
      case _ if(visited contains(number)) => visited
      case _ if(number % 2) == 0 => sequenceCollatz(number/2, number :: visited)
      case _ if(number % 2) !=0 => sequenceCollatz(3*number + 1, number :: visited)
    }
  }
}

object Assignment extends App {
  val obj = new Assignment
  val log = Logger.getLogger(this.getClass)
  val sequence: List[Int] = List(1)
  for(i <- 1 to 100)
    log.info(s"${obj.sequenceCollatz(i,sequence)}")
}
