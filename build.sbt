name := "CRUD"

version := "0.1"

scalaVersion := "2.12.8"

libraryDependencies += "org.apache.cassandra" % "cassandra-all" % "3.11.3"
//libraryDependencies += "com.datastax.cassandra" % "cassandra-driver-core" % "3.0.0"
/*libraryDependencies ++= Seq(
  "com.datastax.cassandra" % "cassandra-driver-core" % cassandraDriverVersion,
  "com.typesafe" % "config" % "1.3.1"
)*/
//libraryDependencies += "com.datastax.cassandra" % "cassandra-driver-extras" % "3.0.0"

libraryDependencies += "com.datastax.cassandra" % "cassandra-driver-core" % "3.6.0"