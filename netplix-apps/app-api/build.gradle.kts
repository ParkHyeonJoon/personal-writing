dependencies {
    implementation(project(":netplix-core:core-usecase"))

    runtimeOnly(project(":netplix-core:core-service"))

    implementation("org.springframework.boot:spring-boot-starter-web")
}