plugins {
    kotlin("jvm") version "1.9.22"
    id("io.gitlab.arturbosch.detekt").version("1.23.3")
}

repositories {
    mavenCentral()
}

dependencies {
    testImplementation("org.junit.jupiter:junit-jupiter:5.10.1")
}

tasks.withType<Test> {
    useJUnitPlatform()
}
