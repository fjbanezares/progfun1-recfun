package configurations

import scala.collection.Map
import java.io.File
import com.typesafe.config.ConfigFactory


/**
  * Created by Usuario on 04/12/2018.
  */
object Main {
  def main(args: Array[String]): Unit = {
    val value = ConfigFactory.load().getString("my.secret.value")
    println(s"My secret value is $value")
  }
}
