plugins {
  id("org.jetbrains.kotlin.multiplatform").version("1.9.20")
}

kotlin {
  jvm()
  macosArm64()

  sourceSets {
    getByName("commonMain") {
      dependencies {
        implementation("com.squareup.okio:okio:3.8.0")
      }
    }
  }
}