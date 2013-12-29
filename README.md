# A bridge between sbt's plugin logger and SLF4J

You use it with your sbt plugin, so that you can
include libraries that rely on SLF4J for logging.

## Usage
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
