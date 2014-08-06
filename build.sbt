name := "sbt-slf4j"

organization := "com.github.eirslett"

version := "0.1.2"

scalaVersion := "2.11.1"

crossScalaVersions := Seq("2.10.4", "2.11.1")

resolvers += "Typesafe Releases" at "https://repo.typesafe.com/typesafe/releases/"

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-api" % "1.7.5",
  "org.scala-sbt" % "logging" % "0.13.0" % "provided"
)
