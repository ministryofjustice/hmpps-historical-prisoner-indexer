plugins {
  id("uk.gov.justice.hmpps.gradle-spring-boot") version "4.5.7-beta"
  kotlin("plugin.spring") version "1.7.20"
  kotlin("plugin.jpa") version "1.7.20"
}

configurations {
  testImplementation { exclude(group = "org.junit.vintage") }
}

dependencies {
  implementation("org.springframework.boot:spring-boot-starter-webflux")
  implementation("org.springframework.boot:spring-boot-starter-data-jpa")
  implementation("org.springframework.boot:spring-boot-starter-oauth2-resource-server")
  implementation("org.springframework.boot:spring-boot-starter-security")
  implementation("org.springframework.boot:spring-boot-starter-webflux")
  implementation("org.springframework.boot:spring-boot-starter-oauth2-client")

  implementation("org.hibernate:hibernate-core:")
  runtimeOnly("org.flywaydb:flyway-core")
  runtimeOnly("org.flywaydb:flyway-sqlserver")
  runtimeOnly("org.jetbrains.kotlin:kotlin-reflect:1.7.10")
  runtimeOnly("com.microsoft.sqlserver:mssql-jdbc:11.2.1.jre18")
  testImplementation("org.springframework.boot:spring-boot-starter-test")
  testImplementation("org.springframework.security:spring-security-test")
  implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
}

java {
  toolchain.languageVersion.set(JavaLanguageVersion.of(18))
}

tasks {
  withType<org.jetbrains.kotlin.gradle.tasks.KotlinCompile> {
    kotlinOptions {
      jvmTarget = "18"
    }
  }
}
