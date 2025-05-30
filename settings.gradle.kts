plugins {
    id("com.gradle.enterprise") version "3.19.2"
    id("org.gradle.toolchains.foojay-resolver-convention") version "1.0.0"
}

include(
    "alchemist-api",
    "alchemist-cognitive-agents",
    "alchemist-engine",
    "alchemist-euclidean-geometry",
    "alchemist-full",
    "alchemist-graphql",
    "alchemist-grid",
    "alchemist-implementationbase",
    "alchemist-incarnation-protelis",
    "alchemist-incarnation-sapere",
    "alchemist-incarnation-scafi",
    "alchemist-incarnation-biochemistry",
    "alchemist-loading",
    "alchemist-maintenance-tooling",
    "alchemist-maps",
    "alchemist-multivesta-adapter",
    "alchemist-physics",
    "alchemist-sapere-mathexp",
    "alchemist-smartcam",
    "alchemist-swingui",
    "alchemist-sapere-mathexp",
    "alchemist-smartcam",
    "alchemist-test",
    "alchemist-ui-tooling",
    "alchemist-swingui",
    "alchemist-fxui",
    "alchemist-web-renderer",
)

rootProject.name = "alchemist-testbed"

gradleEnterprise {
    buildScan {
        termsOfServiceUrl = "https://gradle.com/terms-of-service"
        termsOfServiceAgree = "yes"
        publishOnFailure()
    }
}
