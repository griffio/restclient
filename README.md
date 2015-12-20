restclient
==========

Example Github rest api to implement /users/{username} service call using:-

retrofit 2.0.0-beta2

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
    compile("com.squareup.retrofit:retrofit:${retrofitVersion}",
            "com.squareup.retrofit:converter-gson:${retrofitVersion}",
            "com.squareup.okhttp:okhttp:${okhttpVersion}",
            "com.squareup.okhttp:okhttp-urlconnection:${okhttpVersion}",
            "com.google.code.gson:gson:${gsonVersion}",
            "com.google.guava:guava:${guavaVersion}"
       )
    testCompile("junit:junit:${junitVersion}")
}

task wrapper(type: Wrapper) {
  gradleVersion = '2.5'
}
~~~
