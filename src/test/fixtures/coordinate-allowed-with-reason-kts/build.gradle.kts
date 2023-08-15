plugins {
  id("java-library")
  alias(libs.plugins.licensee)
}

dependencies {
  implementation("com.example:example:1.0.0")
}

licensee {
  allowDependency("com.example", "example", "1.0.0") {
    because("there are reasons!")
  }
}
