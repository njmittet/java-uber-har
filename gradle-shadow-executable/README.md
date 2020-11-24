# gradle-shadow-executable

Example Java application packed to an executable Jar using the [Gradle Shadow Plugin](https://imperceptiblethoughts.com/shadow/).

Create the executable with: 

```
./gradlew shadowJar
```

Run the application with:

```
java -jar build/libs/java-executable-all.jar
```

Customize the name of the Jar by configuring the Shadow Gradle task in the `build.gradle` file:

```
shadowJar{
	archiveBaseName = 'shadow'
    archiveFileName = "${baseName}-${appendix}-${classifier}.${extension}"
}
```

Create the jar when running `./gradlew build` by adding the following line to the `build.gradle` file:

```
build.finalizedBy(shadowJar)
```

Both Jar files can be found in `./build/libs/`

## Resources

The [Gradle Shadow Plugin](https://imperceptiblethoughts.com/shadow/introduction/) documentation.
