name :="RecommendationEngine"

scalaVersion :="2.11.12"

version :="1.0"

libraryDependencies ++= {
  Seq(
    "org.apache.spark" %% "spark-mllib" % "2.3.1" % "runtime"
  )
}