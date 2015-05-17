restclient
==========

Example Github rest api to implement /users/{username} service call using:-

okhttp, retrofit, autovalue, gson

---

gradle build

~~~
./gradlew run
~~~

~~~groovy
plugins {
    id 'application'
    id 'java'
    id 'com.ewerk.gradle.plugins.auto-value' version '1.0.3'
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
            "com.squareup.okhttp:okhttp:${okhttpVersion}",
            "com.squareup.okhttp:okhttp-urlconnection:${okhttpVersion}"
    )
    testCompile("junit:junit:${junitVersion}")
}

task wrapper(type: Wrapper) {
  gradleVersion = '2.4'
}
~~~
