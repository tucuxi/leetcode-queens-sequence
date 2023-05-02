plugins {
    kotlin("jvm") version "1.8.21"
    id("io.gitlab.arturbosch.detekt").version("1.20.0")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.8.2")
}

tasks.withType<Test> {
    useJUnitPlatform()
}