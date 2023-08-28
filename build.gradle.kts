plugins {
    kotlin("jvm") version "1.9.10"
    id("io.gitlab.arturbosch.detekt").version("1.23.1")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.0")
}

tasks.withType<Test> {
    useJUnitPlatform()
}