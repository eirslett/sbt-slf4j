# sbt-slf4j: A bridge between sbt logger and slf4j

You use it with your sbt plugin, so that you can
include libraries that rely on SLF4J for logging.
This bridge sets up SBT's logger as implementation
for SLF4J.

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