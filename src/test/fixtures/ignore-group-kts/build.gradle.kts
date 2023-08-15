plugins {
  id("java-library")
  alias(libs.plugins.licensee)
}

dependencies {
  implementation("com.example:example-a:1.0.0")
}

licensee {
  allow("Apache-2.0")
  ignoreDependencies("com.example")
}
