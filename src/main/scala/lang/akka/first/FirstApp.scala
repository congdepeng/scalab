package lang.akka.first

import akka.actor.{ActorSystem, Props}
import akka.dispatch.MessageDispatcher

object FirstApp extends App {

  println("------------------ hello actor ---------------------------------")

  val system = ActorSystem("myActorSystem")

  private val lookup: MessageDispatcher = system.dispatchers.defaultGlobalDispatcher
  println(lookup)


  private val firstActor = system.actorOf(Props[FirstActor],"FirstActor")
  for (i <- "123456789") {
    firstActor.toString()
    firstActor.tell("test", firstActor)
    firstActor.tell(i, firstActor)
  }

}
