publishMavenStyle := true

publishTo := {
  val nexus = "https://oss.sonatype.org/"
  if (isSnapshot.value)
    Some("snapshots" at nexus + "content/repositories/snapshots")
  else
    Some("releases"  at nexus + "service/local/staging/deploy/maven2")
}

publishArtifact in Test := false

pomIncludeRepository := { _ => false }

pomExtra := (
  <url>https://github.com/eirslett/sbt-slf4j</url>
  <licenses>
    <license>
      <name>The Apache Software License, Version 2.0</name>
      <url>http://www.apache.org/licenses/LICENSE-2.0.txt</url>
      <distribution>repo</distribution>
    </license>
  </licenses>
  <scm>
    <url>https://github.com/eirslett/sbt-slf4j</url>
    <connection>scm:git:https://github.com/eirslett/sbt-slf4j.git</connection>
    <developerConnection>scm:git:git@github.com:eirslett/sbt-slf4j.git</developerConnection>
  </scm>
  <developers>
    <developer>
      <id>eirslett</id>
      <name>Eirik Sletteberg</name>
      <email>eiriksletteberg@gmail.com</email>
    </developer>
  </developers>)
