package lang.akka.first

import akka.actor.{Actor, Props}
import akka.event.Logging

object FirstActor {

}

class FirstActor extends Actor {
  val log = Logging(context.system, this)

  override def receive: Receive = {
    case "test" =>
      log.info("get test")
      sender() ! ""
    case _ => log.info("get wtf")
  }
}





