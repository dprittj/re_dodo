plugins {
	java
	id("org.springframework.boot") version "2.7.17"
	id("io.spring.dependency-management") version "1.0.15.RELEASE"
}

group = "re-dodo"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_11
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-thymeleaf:2.7.8")
	implementation("org.springframework.boot:spring-boot-starter-web:2.7.12")
//	implementation("org.springframework.boot:spring-boot-starter-data-jpa:2.7.12")
	implementation("mysql:mysql-connector-java:5.1.49")
	developmentOnly("org.springframework.boot:spring-boot-devtools:2.7.8")
	testImplementation("org.springframework.boot:spring-boot-starter-test:2.7.8")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
