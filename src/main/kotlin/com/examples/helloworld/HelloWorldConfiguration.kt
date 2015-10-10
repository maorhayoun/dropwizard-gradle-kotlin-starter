package com.examples.helloworld

import io.dropwizard.Configuration;

class HelloWorldConfiguration : Configuration() {
    var template : String? = null
    var defaultName : String = "Stranger"
}
