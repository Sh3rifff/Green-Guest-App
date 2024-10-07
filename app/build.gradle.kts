plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
    alias(libs.plugins.ksp)
    id("androidx.navigation.safeargs.kotlin")
}

android {
    namespace = "com.example.greenguest"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.greenguest"
        minSdk = 24
        targetSdk = 34
        versionCode = 1
        versionName = "1.0"

        testInstrumentationRunner = "androidx.test.runner.AndroidJUnitRunner"
    }

    buildTypes {
        release {
            isMinifyEnabled = false
            proguardFiles(
                getDefaultProguardFile("proguard-android-optimize.txt"),
                "proguard-rules.pro"
            )
        }
    }
    compileOptions {
        sourceCompatibility = JavaVersion.VERSION_11
        targetCompatibility = JavaVersion.VERSION_11
    }
    kotlinOptions {
        jvmTarget = "11"
    }
    buildFeatures {
        viewBinding = true
    }
}

dependencies {

    // Navigation Component
    implementation (libs.androidx.navigation.fragment.ktx.v222)
    implementation (libs.androidx.navigation.ui.ktx.v222)

    // Lifecycle components
    implementation (libs.androidx.lifecycle.extensions)
    implementation (libs.androidx.lifecycle.common.java8)
    implementation (libs.androidx.lifecycle.viewmodel.ktx.v220)

    // Kotlin components
    implementation (libs.kotlin.stdlib.jdk7)
    api (libs.kotlinx.coroutines.core)
    api (libs.kotlinx.coroutines.android)

    // ViewPagerIndicator
    implementation(libs.dotsindicator)

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
}