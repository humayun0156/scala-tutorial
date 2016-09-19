name := "scalainaction ch02"

scalaVersion := "2.11.8"

organization := "ScalaInAction"

libraryDependencies += "commons-logging" % "commons-logging" % "1.1.1"

libraryDependencies += "org.apache.httpcomponents" % "httpclient" % "4.1.2"

// append options passed to the Scala compiler
scalacOptions ++= Seq("-deprecation", "-unchecked", "-language:_")