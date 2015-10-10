package com.examples.helloworld.core

import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.Length;

data class Saying (@JsonProperty val id : Long,
                   @Length(max = 3) @JsonProperty val content : String)