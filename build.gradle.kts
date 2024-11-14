plugins {
    id("java")
    war
}

group = "org.example"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("org.apache.maven.plugins:maven-war-plugin:3.4.0")

}

tasks.test {
    useJUnitPlatform()
}