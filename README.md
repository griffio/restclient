restclient
==========

Example Github rest api to implement /users/{username} service call using:-

retrofit2 2.1.x
okhttp3 3.4.x

* [okhttp](https://github.com/square/okhttp)
* [retrofit](https://github.com/square/retrofit)
* [autovalue](https://github.com/google/auto)
* [gson](https://github.com/google/gson)

---

Note: Intellij 2016 or higher with gradle import, **uncheck** "create separate module per source set" as project needs Autovalue sources on classpath.

---

gradle build

~~~
./gradlew run
~~~

~~~groovy
plugins {
    id 'application'
    id 'java'
    id 'com.ewerk.gradle.plugins.auto-value' version '1.0.6'
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
  gradleVersion = '3.0'
}
~~~
