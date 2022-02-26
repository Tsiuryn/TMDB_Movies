plugins {
    id("com.android.application")
    kotlin("plugin.serialization") version "1.5.30"
    kotlin("android")
    kotlin("kapt")
}

android {
    compileSdk = 31
    buildToolsVersion = "30.0.3"

    defaultConfig {
        minSdk = 21
        targetSdk = 30
        applicationId = "com.ts.alex.tmdb_movies"
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = true
            proguardFiles(getDefaultProguardFile("proguard-android-optimize.txt"), "proguard-rules.pro")
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    implementation ("androidx.core:core-ktx:1.7.0")
    implementation ("androidx.appcompat:appcompat:1.4.1")
    implementation ("com.google.android.material:material:1.5.0")
    implementation ("androidx.constraintlayout:constraintlayout:2.1.3")

    implementation (Dependencies.Navigator.fragment)
    implementation (Dependencies.Navigator.ui)

    // Dagger 2
    implementation(Dependencies.Dagger.depend)
    kapt(Dependencies.Dagger.kapt)

    // RXJava
    implementation(Dependencies.RX.rxJava)
    implementation(Dependencies.RX.rxAndroid)
}