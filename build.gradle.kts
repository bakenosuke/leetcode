plugins {
    kotlin("jvm") version "2.1.0"
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    testImplementation(platform("io.kotest:kotest-bom:5.8.0"))
    testImplementation("io.kotest:kotest-assertions-core-jvm")
    testImplementation("io.kotest:kotest-property-jvm")
}

sourceSets {
    main {
        kotlin.srcDir("src")
    }
    test {
        kotlin.srcDir("test")
    }
}

tasks {
    wrapper {
        gradleVersion = "8.5"
    }
}
