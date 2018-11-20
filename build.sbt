lazy val root = (project in file(".")).settings(
  inThisBuild(
    List(
      organization := "com.example",
      scalaVersion := "2.12.7",
      version := "0.1.0-SNAPSHOT"
    )),
  name := "study01",
  libraryDependencies += "org.typelevel" %% "cats-core" % "1.4.0"
)
