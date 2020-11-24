# maven-shade-library

Example Java library packed to an uber-jar using the [Maven Shade Plugin](http://maven.apache.org/plugins/maven-shade-plugin/).

Running `mvn package` will produce two Jar files: A normal Jar without the dependency, prefixed with `original`, as well as the shaded Jar. Both files can be found in `./target`.