object Version {
    const val KOTLIN = "1.3.72"
    const val DAGGER_HILT_ANDROID_VER = "2.28-alpha"
}

object ProjectConfig {
    const val GRADLE = "com.android.tools.build:gradle:4.0.0"
    const val KOTLIN_GRADLE_PLUGIN = "org.jetbrains.kotlin:kotlin-gradle-plugin:${Version.KOTLIN}"
    const val HILT_ANDROID_GRADLE_PLUGIN =
        "com.google.dagger:hilt-android-gradle-plugin:${Version.DAGGER_HILT_ANDROID_VER}"
}

object AndroidConfig {
    const val COMPILE_SDK = 29
    const val APP_ID = "com.example.parayo"
    const val MIN_SDK = 23
    const val VERSION_CODE = 1
    const val VERSION_NAME = "1.0.0"
    const val TEST_INSTRUMENTATION_RUNNER = "androidx.test.runner.AndroidJUnitRunner"
}

object BasicDependencies {
    const val KOTLIN_STDLIB = "org.jetbrains.kotlin:kotlin-stdlib:${Version.KOTLIN}"
    const val MATERIAL = "com.google.android.material:material:1.1.0"
}

object AndroidXDependencies {
    private const val LIFECYCLE_VER = "2.2.0"
    const val CORE_KTX = "androidx.core:core-ktx:1.2.0"
    const val CONSTRAINT_LAYOUT = "androidx.constraintlayout:constraintlayout:1.1.3"

    const val LIFECYCLE_EXT = "androidx.lifecycle:lifecycle-extensions:$LIFECYCLE_VER"
    const val LIFECYCLE_VIEWMODEL_KTX = "androidx.lifecycle:lifecycle-viewmodel-ktx:$LIFECYCLE_VER"

    const val ACTIVITY_KTX = "androidx.activity:activity-ktx:1.1.0"

    const val PREFERENCE_KTX = "androidx.preference:preference-ktx:1.1.1"
}

object TestDependencies {
    const val JUNIT = "junit:junit:4.12"
    const val EXT_JUNIT = "androidx.test.ext:junit:1.1.1"
    const val ESPRESSO_CORE = "androidx.test.espresso:espresso-core:3.2.0"
}

object SquareUpDependencies {
    private const val RETROFIT_VER = "2.6.1"

    const val RETROFIT = "com.squareup.retrofit2:retrofit:$RETROFIT_VER"
    const val CONVERTER_GSON = "com.squareup.retrofit2:converter-gson:$RETROFIT_VER"
    const val LOGGING_INTERCEPTOR = "com.squareup.okhttp3:logging-interceptor:3.14.2"
}

object DaggerDependencies {
    private const val DAGGER_HILT_VER = "1.0.0-alpha01"

    const val DAGGER_HILT = "com.google.dagger:hilt-android:${Version.DAGGER_HILT_ANDROID_VER}"
    const val DAGGER_HILT_LIFECYCLE_VM = "androidx.hilt:hilt-lifecycle-viewmodel:$DAGGER_HILT_VER"

    const val DAGGER_HILT_ANDROID_COMPILER =
        "com.google.dagger:hilt-android-compiler:${Version.DAGGER_HILT_ANDROID_VER}"
    const val DAGGER_HILT_COMPILER = "androidx.hilt:hilt-compiler:$DAGGER_HILT_VER"
}

object Dependencies {
    private const val GLIDE_VER = "4.11.0"

    const val COROUTINE = "org.jetbrains.kotlinx:kotlinx-coroutines-core:1.3.7"

    const val TED_IMAGE_PICKER = "gun0912.ted:tedimagepicker:1.1.3"
    const val GLIDE = "com.github.bumptech.glide:glide:$GLIDE_VER"
    const val GLIDE_COMPILER = "com.github.bumptech.glide:compiler:$GLIDE_VER"
}