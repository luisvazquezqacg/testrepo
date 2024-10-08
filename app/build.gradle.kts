plugins {
    alias(libs.plugins.android.application)
    alias(libs.plugins.kotlin.android)
}

android {
    namespace = "com.example.test_app"
    compileSdk = 34

    defaultConfig {
        applicationId = "com.example.test_app"
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
        sourceCompatibility = JavaVersion.VERSION_1_8
        targetCompatibility = JavaVersion.VERSION_1_8
    }
    kotlinOptions {
        jvmTarget = "1.8"
    }
    buildFeatures{
        viewBinding = true
    }


}

dependencies {

    implementation(libs.androidx.core.ktx)
    implementation(libs.androidx.appcompat)
    implementation(libs.material)
    implementation(libs.androidx.activity)
    implementation(libs.androidx.constraintlayout)
    testImplementation(libs.junit)
    androidTestImplementation(libs.androidx.junit)
    androidTestImplementation(libs.androidx.espresso.core)
    //ViewModel
    implementation(libs.androidx.lifecycle.viewmodel.ktx)
    //Live Data
    implementation(libs.lifecycle.livedata.ktx)
    //Activity
    implementation(libs.androidx.activity.ktx)
    //Fragment
    implementation(libs.androidx.fragment.ktx)
    // Retrofit
    implementation(libs.retrofit)
    // Gson Converter
    implementation(libs.converter.gson)
    // Coroutines
    implementation(libs.kotlinx.coroutines.android)
}