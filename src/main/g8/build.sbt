val scala3Version = "3.5.1"

lazy val root = project
  .in(file("."))
  .settings(
    name := "scala3-simple",
    version := "0.1.0",

    scalaVersion := scala3Version,

    libraryDependencies ++= Seq(
      "org.scala-lang" %% "scala3-staging" % scala3Version,
      "com.github.sbt" % "junit-interface" % "0.13.3" % "test"
    )
  )
