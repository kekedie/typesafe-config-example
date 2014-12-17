scalaVersion := "2.11.4"

libraryDependencies ++= Seq(
  "com.typesafe" % "config" % "1.2.1",
  "com.typesafe.scala-logging" %% "scala-logging" % "3.1.0",
  "ch.qos.logback" % "logback-classic" % "1.1.2")

initialCommands in console := "import com.typesafe.config._"
