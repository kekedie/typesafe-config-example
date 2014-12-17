import java.net.{URLStreamHandler, URLStreamHandlerFactory}

class EnvironmentURLStreamHandlerFactory extends URLStreamHandlerFactory {

  def createURLStreamHandler(protocol: String): URLStreamHandler = {
    protocol match {
      case p if p.startsWith("environment") => new EnvironmentURLStreamHandler
      case _ => null
    }
  }

}