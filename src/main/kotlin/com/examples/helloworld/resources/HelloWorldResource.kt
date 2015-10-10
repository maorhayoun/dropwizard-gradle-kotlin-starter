package com.examples.helloworld.resources

import com.examples.helloworld.core.Saying;
import com.codahale.metrics.annotation.Timed;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.concurrent.atomic.AtomicLong;

@Path("/hello-world")
@Produces(MediaType.APPLICATION_JSON)
class HelloWorldResource(val template : String? = "",
                         val defaultName : String = "",
                         var counter : AtomicLong =   AtomicLong()) {
    @GET
    @Timed
    fun  sayHello(@QueryParam("name") name : String?) : Saying {
        val value : String = template!!  format (name ?: defaultName)
        return Saying(counter.incrementAndGet(), value)
    }
}