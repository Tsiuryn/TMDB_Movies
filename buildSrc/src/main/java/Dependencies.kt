object Dependencies {
    object Dagger {
        private const val version = "2.40.5"

        const val depend = "com.google.dagger:dagger:$version"
        const val kapt = "com.google.dagger:dagger-compiler:$version"  // Kotlin
        const val annotationProcessor = "com.google.dagger:dagger-compiler:$version"  //Java
    }

    object Navigator {
        private const val version = "2.4.1"
        const val fragment = "androidx.navigation:navigation-fragment-ktx:$version"
        const val ui = "androidx.navigation:navigation-ui-ktx:$version"
    }

    object RX {
        private const val versionJava = "3.1.3"
        private const val versionAndroid = "3.0.0"

        const val rxJava = "io.reactivex.rxjava3:rxjava:$versionJava"
        const val rxAndroid = "io.reactivex.rxjava3:rxandroid:$versionAndroid"
    }
}