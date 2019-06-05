scalacOptions ++= {
  import Ordering.Implicits._
  if (VersionNumber(scalaVersion.value).numbers < Seq(2L, 12L)) {
    // Enable SAM types for Scala 2.11
    Some("-Xexperimental")
  } else {
    None
  }
}

libraryDependencies += "com.thoughtworks.dsl" %%% "comprehension" % "1.3.1" % Optional

libraryDependencies += "com.thoughtworks.dsl" %%% "domains-task" % "1.3.1" % Optional

libraryDependencies += "com.thoughtworks.dsl" %%% "keywords-using" % "1.3.1" % Optional

libraryDependencies += "com.thoughtworks.dsl" %%% "keywords-each" % "1.3.1" % Optional
