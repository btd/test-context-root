seq(webSettings :_*)

scalaVersion := "2.9.1"




libraryDependencies ++= Seq (
  "net.liftweb"         %% "lift-webkit"      % "2.4-M4"                % "compile",
  "org.eclipse.jetty"   % "jetty-webapp"      % "8.0.0.v20110901"       % "jetty",
  "ch.qos.logback"      % "logback-classic"   % "0.9.26"
  )