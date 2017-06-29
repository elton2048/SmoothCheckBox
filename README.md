# SmoothCheckBox

Android library for circular check box with animation.

[![Platform](http://img.shields.io/badge/platform-android-brightgreen.svg?style=flat)](http://developer.android.com/index.html) [![Language](http://img.shields.io/badge/language-java-orange.svg?style=flat)](http://www.oracle.com/technetwork/java/javase/downloads/index.html) [![License](http://img.shields.io/badge/license-apache2.0-lightgrey.svg?style=flat)](http://www.apache.org/licenses/LICENSE-2.0)  

### ScreenShot 截圖:

![](https://github.com/andyxialm/SmoothCheckBox/blob/master/art/smoothcb.gif?raw=true)

### Getting started:

Add the project in Gradle.

```
compile 'com.github.elton2048:SmoothCheckBox:1.0.1'
```

Don't forget add the following in project build.gradle
```
allprojects {
    repositories {
        maven { url 'https://jitpack.io' }
    }
}
```

### Attrs 屬性
|Attr|Format|Description|Method|
|---|:---|:---:|:---:|
|duration|integer|Duration of animation|setAnimDuration()|
|stroke_width|dimension|Stroke width when unchecked||
|color_tick|color|Tick colour|setColorTick()|
|color_checked|color|Background colour when checked|setColorChecked()|
|color_unchecked|color|Background colour when unchecked|setColorUnchecked()|
|color_unchecked_stroke|color|Stroke colour when unchecked||


## Sample Usage 使用


```java
    // Animation settings require development...
    setChecked(boolean checked);                   // 默认不带动画，若需要动画 调用重载方法
    setChecked(boolean checked, boolean animate);  // 参数: animate 是否显示动画
```


```java

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample);

        final SmoothCheckBox scb = (SmoothCheckBox) findViewById(R.id.scb);
        scb.setOnCheckedChangeListener(new SmoothCheckBox.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(SmoothCheckBox checkBox, boolean isChecked) {
                Log.d("SmoothCheckBox", String.valueOf(isChecked));
            }
        });
    }    
```

## About me

Update By:

Github [here](https://github.com/elton2048)

Original By:

An android developer in Beijing.

Welcome to [offer me](mailto:andyxialm@gmail.com). :smiley:

## License

    Copyright 2015, 2016 andy

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
