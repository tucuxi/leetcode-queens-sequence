plugins {
    kotlin("jvm") version "2.0.0"
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
