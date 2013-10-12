name := "sbt-git-info"

organization := "net.leifwarner"

version := "0.1-SNAPSHOT"

description := "An sbt plugin to embed git status into a .properties file."

libraryDependencies += "org.eclipse.jgit" % "org.eclipse.jgit" % "3.0.0.201306101825-r"

sbtPlugin := true
