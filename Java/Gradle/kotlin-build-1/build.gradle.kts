/*
 * This file was generated by the Gradle 'init' task.
 *
 * This is a general purpose Gradle build.
 * Learn how to create Gradle builds at https://guides.gradle.org/creating-new-gradle-builds
 */
plugins {
    // Apply the Kotlin JVM plugin to add support for Kotlin.
    id("org.jetbrains.kotlin.jvm") version "1.8.0"

    // Apply the java-library plugin for API and implementation separation.
    `java-library`
}

repositories {
    mavenCentral()
}

// region DEPENDENCIES VERSIONS
val swaggerVersion = "2.9.2"

dependencies {
	
	//Basic dependencies:
	implementation(kotlin("stdlib-jdk8"))
	implementation(kotlin("reflect"))
	implementation("javax.activation:activation:1.1.1")
	implementation("br.com.creditas:eventlib-starter:1.10.0")
	
	//Web dependencies:
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.modules:jackson-module-kotlin")
	implementation("com.kreait.slack:slack-spring-boot-starter:1.0.0")
	implementation("com.kreait.slack:slack-spring-test-api-client:1.0.0")
	implementation("com.github.kittinunf.fuel:fuel:2.3.1")
	implementation("com.github.kittinunf.fuel:fuel-jackson:2.2.3")
	testImplementation("com.kreait.slack:slack-jackson-dto-test:1.0.0")
	implementation("io.springfox:springfox-swagger2:$swaggerVersion")
	implementation("io.springfox:springfox-swagger-ui:$swaggerVersion")


	//Security dependencies:
	implementation("org.springframework.boot:spring-boot-starter-security")
	testImplementation("org.springframework.security:spring-security-test")

	//PostgreSQL dependencies:
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")
	runtimeOnly("org.postgresql:postgresql")
	implementation("org.flywaydb:flyway-core")
}
