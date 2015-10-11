# Dropwizard Gradle Kotlin Starter

Minimal example to set up an 'Hello World' Dropwizard service written in [Kotlin](https://github.com/JetBrains/kotlin) going with Gradle. 

This example utilizes [Gradle Shadow](https://github.com/johnrengelman/shadow), plugin which collapses all dependencies and project code into a single Jar file, in similar concept as Maven Shade, thus, creating Self-Contained executable Jar.

## Getting Started

In order to create a running Jar, run `gradlew shadowJar`. This will output result to `build/libs/Dropwizard_Gradle_Kotlin_starter-1.0-SNAPSHOT-all.jar`

Now that you’ve built a JAR file, it’s time to run it.

In your project directory, run this to get DropWizard application started:   
`$ java -jar build/libs/Dropwizard_Gradle_Kotlin_starter-1.0-SNAPSHOT-all.jar server helloworld.yml` 

### Demo
Once service is live, give it a try with [http://localhost:8080/hello-world?name=John+Doe](http://localhost:8080/hello-world?name=John+Doe)

And That's It! 

## License
The content of this project is licensed under the [MIT license](LICENSE.md). 
