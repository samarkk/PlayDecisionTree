name := "playdtreeservice"
version := "1.0.0-SNAPSHOT"
lazy val root = (project in file(".")).enablePlugins(PlayScala)
scalaVersion := "2.12.12"
libraryDependencies += guice
libraryDependencies += "ml.combust.mleap" %% "mleap-spark" % "0.16.0"
