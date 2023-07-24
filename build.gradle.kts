plugins {
    kotlin("jvm") version "1.9.0"
    id("io.gitlab.arturbosch.detekt").version("1.20.0")
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