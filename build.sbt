name := "CapStone_Assignment"

version := "1.0-SNAPSHOT"

scalaVersion := "2.11.11"

libraryDependencies ++= Seq(
                            "org.mockito" %% "mockito-scala" % "1.14.8",
                            "org.scalatest" %% "scalatest" % "3.2.2" % Test  ,
                            "org.mockito" % "mockito-core" % "1.9.5" % "test",
                            "com.typesafe.akka" %% "akka-stream" % "2.5.20" ,
                            "com.typesafe.akka" %% "akka-http" % "10.1.7",
                            "com.typesafe.akka" %% "akka-http-spray-json" % "10.1.7" ,
                            "com.typesafe.akka" %% "akka-testkit" % "2.5.20",
                            "org.postgresql" % "postgresql" % "42.2.18",
                            "com.typesafe.slick" %% "slick" % "3.3.2",
                            "com.typesafe.akka" %% "akka-http-testkit" % "10.1.7" )
