plugins {
	java
	id("org.springframework.boot") version "3.2.3"
	id("io.spring.dependency-management") version "1.1.4"
	id("org.openapi.generator") version "7.3.0"
}

group = "io.github.companyb-teamdelta"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("org.springframework.boot:spring-boot-starter-data-jpa")

	// for OpenAPI Generator
	implementation("org.openapitools:jackson-databind-nullable:0.2.6")
	implementation("org.springdoc:springdoc-openapi-ui:1.7.0")

	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
	useJUnitPlatform()
}

openApiGenerate {
	inputSpec = "$rootDir/src/main/resources/telegram-module-api.yaml"
	generatorName = "spring"
	apiPackage = "io.github.companybteamdelta.telegrammgmt.api"
	modelPackage = "io.github.companybteamdelta.telegrammgmt.model"
	configOptions = mapOf(
		// "interfaceOnly" to "true",
		"delegatePattern" to "true"
	)
}

 /*The  openApiGenerate  block is where we configure the OpenAPI Generator plugin. We specify the input spec, which is the path to the OpenAPI specification file. We also specify the generator name, which is  spring  in this case. We also specify the package names for the generated API and model classes.
 The  configOptions  map is used to specify additional configuration options for the generator. In this case, we are setting  interfaceOnly  to  true  and  delegatePattern  to  true . This will generate interfaces for the API classes and delegate classes that implement the interfaces.
 Now, we can run the  openApiGenerate  task to generate the code.
 ./gradlew openApiGenerate

 This will generate the API and model classes in the specified package.
 The generated code will include the API interfaces and the delegate classes that implement the interfaces.
 package io.github.companyb.teamdelta.api;*/