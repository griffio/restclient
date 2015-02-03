restclient
==========

Example Github rest api

okhttp, retrofit, autovalue, gson, jackson

---

gradle build

~~~
plugins {
    id 'java'
    id 'com.ewerk.gradle.plugins.auto-value' version '1.0.1'
}

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
~~~
