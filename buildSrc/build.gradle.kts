import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    `kotlin-dsl`
}

repositories {
    gradlePluginPortal() // so that external plugins can be resolved in dependencies section
    maven ( "https://repo.spring.io/milestone" )
    maven ( "https://repo.spring.io/snapshot" )
    mavenCentral()
}

val javaVersion by extra(JavaVersion.VERSION_17.toString())
val spotBugsVersion by extra("5.0.6")
val lombokPluginVersion by extra("6.4.1")
val springBootGradlePluginVersion by extra("3.0.0-SNAPSHOT")
val springDependencyManagementVersion by extra("1.0.11.RELEASE")

val gradleConventionsProjectJunitVersion by extra("4.13")

tasks.getByName<KotlinCompile>("compileKotlin") {
    targetCompatibility = javaVersion
}

dependencies {
    implementation("com.github.spotbugs.snom:spotbugs-gradle-plugin:$spotBugsVersion")
    implementation("io.freefair.gradle:lombok-plugin:$lombokPluginVersion")

    // this configures the junit you would use to test the 'conventions' themselves, if needed.
    testImplementation("junit:junit:$gradleConventionsProjectJunitVersion")

    implementation("org.springframework.boot:spring-boot-gradle-plugin:$springBootGradlePluginVersion")
    implementation("io.spring.gradle:dependency-management-plugin:$springDependencyManagementVersion")
}
