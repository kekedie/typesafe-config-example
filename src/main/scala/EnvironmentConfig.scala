import java.net.URL

import com.typesafe.config.ConfigFactory
import com.typesafe.scalalogging.StrictLogging

object EnvironmentConfig extends StrictLogging {

  def main(args: Array[String]): Unit = {
    URL.setURLStreamHandlerFactory(new EnvironmentURLStreamHandlerFactory)
    System.setProperty("environment", args.headOption.getOrElse("development"))
    val config = ConfigFactory.load()
    logger.info(config.getString("app.env.message"))
  }
}
