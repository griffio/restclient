restclient
==========

Example Github rest api to implement /users/{username} service call using:-

retrofit2 2.0.0-beta3
okhttp3 3.0.1

* [okhttp](https://github.com/square/okhttp)
* [retrofit](https://github.com/square/retrofit)
* [autovalue](https://github.com/google/auto)
* [gson](https://github.com/google/gson)

---

gradle build

~~~
./gradlew run
~~~

~~~groovy
plugins {
    id 'application'
    id 'java'
    id 'com.ewerk.gradle.plugins.auto-value' version '1.0.4'
}

mainClassName = "griffio.MainApplication"

autoValue {
    autoValueSourcesDir = 'src/autoValue/java'
}

repositories {
    jcenter()
}

dependencies {
    compile("com.squareup.retrofit2:retrofit:${retrofitVersion}",
            "com.squareup.retrofit2:converter-gson:${retrofitVersion}",
            "com.squareup.okhttp3:okhttp:${okhttpVersion}",
            "com.squareup.okhttp3:okhttp-urlconnection:${okhttpVersion}",
            "com.google.code.gson:gson:${gsonVersion}",
            "com.google.guava:guava:${guavaVersion}"
    )
    testCompile("junit:junit:${junitVersion}")
}

task wrapper(type: Wrapper) {
  gradleVersion = '2.5'
}

~~~
