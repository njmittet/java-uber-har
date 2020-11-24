# gradle-zip-library

Example Java library packed to an 'uber-jar' using a custom Zip task.

Create the Zip file with: 

```
./gradlew buildZip
```

or just `./gradlew build` as the build task is extended with `build.dependsOn buildZip`.

## Resouces

* The Gradle [Working With Files](https://docs.gradle.org/current/userguide/working_with_files.html#sec:creating_archives_example) documentation.
* [Compile zip with gradle including libraries implemented by a sibling subproject](https://stackoverflow.com/questions/49931217/compile-zip-with-gradle-including-libraries-implemented-by-a-sibling-subproject)
* on stack Stack Overflow.
