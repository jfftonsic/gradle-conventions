# gradle-conventions
This project has some templates to use with gradle conventions mechanism.

`myproject.java-conventions.gradle.kts`: applies some common things for java applications.

`myproject.spring-conventions.gradle.kts`: to use with Spring Boot framework projects.

And then, at the module build.gradle.kts, i.e. you use it like this:
```
  plugins {
    id("myproject.java-conventions")
  }
  
  dependencies {
      // internal module dependencies
  }
 ```

The overall idea comes from this link https://docs.gradle.org/current/samples/sample_convention_plugins.html .
