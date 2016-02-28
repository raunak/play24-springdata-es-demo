name := """play24-springdata-es-demo"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.6"

libraryDependencies ++= Seq(

  javaJdbc,
  cache,

  // elastic search
  "org.elasticsearch" % "elasticsearch" % "2.2.0",
  "org.springframework.data" % "spring-data-elasticsearch" % "1.4.0.BUILD-SNAPSHOT",

  // dependency injection
  "javax.inject" % "javax.inject" % "1"
)

resolvers ++= Seq(
  Resolver.mavenLocal,
  "Spring Snapshot Repository" at "http://repo.spring.io/libs-snapshot"
)

// Play provides two styles of routers, one expects its actions to be injected, the
// other, legacy style, accesses its actions statically.
routesGenerator := InjectedRoutesGenerator
