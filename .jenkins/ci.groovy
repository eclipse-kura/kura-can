@Library('add-ons-shared-libs@develop') _

node {
    continuousIntegrationPipeline(
        buildType: "deploy",
        sonar: [
            enable: false,
            projectKey: "eclipse-kura_kura-can",
            tokenId: "sonarcloud-token-kura-can",
            exclusions: "tests/**/*,**/*.xml,**/*.yml",
            testExclusions: "**/*"
        ],
    )
}
