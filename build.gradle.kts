plugins {
    kotlin("jvm") version "1.9.23"
    id("io.gitlab.arturbosch.detekt").version("1.23.4")
}

repositories {
    mavenCentral()
}

testing {
    suites {
        val test by getting(JvmTestSuite::class) {
            useJUnitJupiter()
        }
    }
}
