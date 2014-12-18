import java.net.URL

import com.typesafe.config.ConfigFactory
import com.typesafe.scalalogging.StrictLogging

object EnvironmentConfigMain extends StrictLogging {

  /**
   * {{
   * sbt run
   * sbt 'run development'
   * sbt 'run staging'
   * sbt 'run production'
   * }}
   * @param args environment value[development|staging|production]
   */
  def main(args: Array[String]): Unit = {
    URL.setURLStreamHandlerFactory(new EnvironmentURLStreamHandlerFactory)
    System.setProperty("environment", args.headOption.getOrElse("development"))
    val config = ConfigFactory.load()
    logger.info(config.getString("app.env.message"))
  }

}
