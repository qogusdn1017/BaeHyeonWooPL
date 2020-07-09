plugins {
    kotlin("jvm") version "1.3.72"
}

group = "com.github.qogusdn1017.baehyeonwoopl"
version = "1.5"

repositories {
    maven("https://repo.maven.apache.org/maven2/")
    maven("https://papermc.io/repo/repository/maven-public/")
    maven("https://jitpack.io/")
}

dependencies {
    compileOnly(kotlin("stdlib-jdk8"))
    compileOnly("com.destroystokyo.paper:paper-api:1.15.2-R0.1-SNAPSHOT")
    compileOnly("com.github.noonmaru:tap:2.6-dev")
}
tasks {
    create<Copy>("distJar") {
        from(jar)
        into(".\\Results")
    }
}