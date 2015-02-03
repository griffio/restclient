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
    id 'com.ewerk.gradle.plugins.auto-value' version '1.0.1'
}

mainClassName = "griffio.MainApplication"

autoValue {
    autoValueSourcesDir = 'src/autoValue/java'
}

repositories {
    jcenter()
}

dependencies {
    compile('com.squareup.retrofit:retrofit:1.8.0',
            'com.squareup.okhttp:okhttp:2.1.0',
            'com.squareup.okhttp:okhttp-urlconnection:2.1.0'
    )
    testCompile('junit:junit:4.11')
}

task wrapper(type: Wrapper) {
  gradleVersion = '2.2.1'
}
~~~
