# A bridge between sbt's plugin logger and SLF4J

You use it with your sbt plugin, or with inlined custom sbt tasks, so that you can
include libraries that rely on SLF4J for logging.

## Usage
Add it to your sbt plugin's dependencies, or - if you
are writing custom sbt tasks inline in your build
definition - add the dependency in ./project/slf4j.sbt.

```sbt
libraryDependencies += "com.github.eirslett" %% "sbt-slf4j" % "0.1"
```

You have to setup SLF4J in every task implementation.
```scala
val foo = TaskKey[Unit]("foo", "do some foo stuff")
val fooTask = foo := {
  // Bind sbt logger to SLF4J
  StaticLoggerBinder.sbtLogger = streams.value.log

  // The library will now log through SBT's logger.
  MyFancyLibrary.performWork()
}
```

## Building
`sbt package`, or `sbt publishLocal`

## License
Apache 2
