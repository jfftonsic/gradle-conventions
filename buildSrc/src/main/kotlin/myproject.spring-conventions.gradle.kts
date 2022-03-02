plugins {
    id("myproject.java-conventions")
    id ("org.springframework.boot")
    id ("io.spring.dependency-management")
}

repositories {
    maven("https://repo.spring.io/milestone")
    maven("https://repo.spring.io/snapshot")
}

dependencies {
    testImplementation("org.springframework.boot:spring-boot-starter-test")
}
