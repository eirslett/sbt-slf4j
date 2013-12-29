package org.slf4j.impl

import org.slf4j.helpers.MarkerIgnoringBase
import org.slf4j.{Logger => SLF4JLogger}
import sbt.{Logger => SbtLogger}

abstract class AbstractSbtLoggerAdapter(protected val log: SbtLogger) extends MarkerIgnoringBase with SLF4JLogger {
  override def error(p1: String, p2: Throwable) = log error toMessageWithCause(p1,p2)

  override def error(p1: String, p2: scala.Any, p3: scala.Any) = log error toMessage(p1,p2,p3)

  override def error(p1: String, p2: scala.Any) = log error toMessage(p1,p2)

  override def error(p1: String) = log error p1

  override def warn(p1: String, p2: Throwable) = log warn toMessageWithCause(p1,p2)

  override def warn(p1: String, p2: scala.Any, p3: scala.Any) = log warn toMessage(p1,p2,p3)

  override def warn(p1: String, p2: scala.Any) = log warn toMessage(p1,p2)

  override def warn(p1: String) = log warn p1

  override def info(p1: String, p2: Throwable) = log info toMessageWithCause(p1,p2)

  override def info(p1: String, p2: scala.Any, p3: scala.Any) = log info toMessage(p1,p2,p3)

  override def info(p1: String, p2: scala.Any) = log info toMessage(p1,p2)

  override def info(p1: String) = log info p1

  override def debug(p1: String, p2: Throwable) = log debug toMessageWithCause(p1,p2)

  override def debug(p1: String, p2: scala.Any, p3: scala.Any) = log debug toMessage(p1,p2,p3)

  override def debug(p1: String, p2: scala.Any)  = log debug toMessage(p1,p2)

  override def debug(p1: String)  = log debug p1

  override def trace(p1: String, p2: Throwable) = log trace p2

  override def trace(p1: String, p2: scala.Any, p3: scala.Any) = log debug toMessage(p1,p2,p3)

  override def trace(p1: String, p2: scala.Any) = log debug toMessage(p1,p2)

  override def trace(p1: String) = log debug p1

  override def isTraceEnabled = true

  override def isDebugEnabled = true

  override def isInfoEnabled = true

  override def isWarnEnabled = true

  override def isErrorEnabled = true

  protected def toMessageWithCause(message: String, cause: Throwable) =
    message + ": " + cause.getStackTraceString

  protected def toMessage(message: String, args: Any*) =
    message +": "+args mkString ","

  protected def toSeq(array: Array[Any]) = array.toSeq
}