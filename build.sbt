name := "sbt-slf4j"

organization := "com.github.eirslett"

version := "0.2"

scalaVersion := "2.12.2"

resolvers += "Typesafe Releases" at "https://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-api" % "1.7.25",
  "org.scala-sbt" %% "util-logging" % "1.0.2" % "provided"
)