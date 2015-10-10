package com.examples.helloworld

import com.examples.helloworld.resources.HelloWorldResource
import io.dropwizard.Application
import io.dropwizard.setup.Bootstrap
import io.dropwizard.setup.Environment

public class HelloWorldApplication : Application<HelloWorldConfiguration>() {

    override fun getName(): String {
        return "hello-world"
    }

    override fun initialize(bootstrap: Bootstrap<HelloWorldConfiguration>?) {
        // nothing to do yet
    }

    override fun run(configuration: HelloWorldConfiguration,
                     environment: Environment) {

        val resource = HelloWorldResource(
                        configuration.template,
                        configuration.defaultName)
        environment.jersey().register(resource)
    }
}