// Top-level build file where you can add configuration options common to all sub-projects/modules.

buildscript {
    ext {
        kotlin_version = '1.5.31'
        gradle_plugin_version = '7.0.2'
    }
    repositories {
        google()
        mavenCentral()
    }
    dependencies {
        classpath("com.android.tools.build:gradle:${gradle_plugin_version}")
        classpath("org.jetbrains.kotlin:kotlin-gradle-plugin:${kotlin_version}")
    }
}

// All projects using this module will have access to the same repository configurations
allprojects {
    repositories {
        google()
        mavenCentral()
    }
}

// Configure task dependencies here
tasks.whenTaskAdded { task ->
    // Configure tasks if necessary
}