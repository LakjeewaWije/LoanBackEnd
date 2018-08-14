name := "play-java-ebean-example"

version := "0.0.1-SNAPSHOT"

scalaVersion := "2.11.11"

lazy val root = (project in file(".")).enablePlugins(PlayJava, PlayEbean)
libraryDependencies += "mysql" % "mysql-connector-java" % "5.1.18"
libraryDependencies += jdbc
libraryDependencies += "com.adrianhurt" %% "play-bootstrap" % "1.0-P25-B3"
