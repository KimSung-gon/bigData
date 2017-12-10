name := "homework-1"

scalaVersion := "2.11.7"

scalacOptions ++= Seq("-deprecation")

// testing
libraryDependencies ++= Seq(
  "junit" % "junit" % "4.10" % Test,
  "org.scalatest" %% "scalatest" % "2.2.4"
)

// for funsets
libraryDependencies += "org.scala-lang.modules" %% "scala-parser-combinators" % "1.0.4"

