# gradle-shadow-library

Example Java library packed to an 'uber-jar' using the [Gradle Shadow Plugin](https://imperceptiblethoughts.com/shadow/).

Create the uber-jar with: 

```
./gradlew shadowJar
```

Running `./gradlew build` will produce a normal Jar library, as the `java-library` plugin is used. Both Jar files can be found in `./build/libs/`

## Resouces

The [Gradle Shadow Plugin](https://imperceptiblethoughts.com/shadow/introduction/) documentation.
