plugins {
    `java-library`
}
dependencies {                              
    api("junit:junit:4.13.2")
    implementation("junit:junit:4.13.2")
    testImplementation("junit:junit:4.13.2")
}
configurations {                            
    implementation {
        resolutionStrategy.failOnVersionConflict()
    }
}
sourceSets {                                
    main {                                  
        java.srcDir("src/core/java")
    }
}
java {                                      
    sourceCompatibility = JavaVersion.VERSION_11
    targetCompatibility = JavaVersion.VERSION_11
}
tasks {
    test {                                  
        testLogging.showExceptions = true
    }
}
