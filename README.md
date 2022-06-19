# skeleton

```bash
.
├── README.md
├── build.gradle
├── gradle
│   └── wrapper
│       ├── gradle-wrapper.jar
│       └── gradle-wrapper.properties
├── gradlew
├── gradlew.bat
├── out.out
├── settings.gradle
├── skeleton-domain
│   ├── build.gradle
│   └── src
│       ├── main
│       │   ├── java
│       │   │   ├── domian
│       │   │   │   └── skeleton
│       │   │   │       ├── Request.java
│       │   │   │       ├── Response.java
│       │   │   │       └── exception
│       │   │   ├── ports
│       │   │   │   ├── in
│       │   │   │   └── out
│       │   │   │       └── GetSkeletonRepositoryExample.java
│       │   │   └── usecase
│       │   │       ├── UseCase.java
│       │   │       └── skeleton
│       │   │           └── GenerateSkeletonPort.java
│       │   └── resources
│       └── test
│           ├── java
│           └── resources
└── skeleton-infra
    ├── build.gradle
    ├── gradle
    │   └── wrapper
    │       ├── gradle-wrapper.jar
    │       └── gradle-wrapper.properties
    └── src
        ├── main
        │   ├── java
        │   │   └── skeleton
        │   │       └── infra
        │   │           ├── SkeletonInfraApplication.java
        │   │           ├── ports
        │   │           │   ├── in
        │   │           │   │   └── skleton
        │   │           │   │       ├── dto
        │   │           │   │       └── mapper
        │   │           │   └── out
        │   │           │       ├── config
        │   │           │       │   └── OutBoundBeanConfiguration.java
        │   │           │       └── skeleton
        │   │           │           ├── GetSkeletonExamplePort.java
        │   │           │           └── mapper
        │   │           └── usecase
        │   │               └── skeleton
        │   │                   ├── GenerateSkeletonUseCase.java
        │   │                   ├── config
        │   │                   │   └── GenerateSkeletonConfig.java
        │   │                   └── mapper
        │   └── resources
        │       └── application.properties
        └── test
            └── java
                └── skeleton
                    └── infra
                        └── SkeletonInfraApplicationTests.java

```