rootProject.name = "leetcode"

dependencyResolutionManagement {
    repositories {
        maven(url = "https://artifactory.internal.cba:443/gist-maven")
        mavenCentral()
    }
}

pluginManagement {
    repositories {
        maven (url = "https://artifactory.internal.cba:443/gist-maven")
    }
}