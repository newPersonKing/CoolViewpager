<p align="center">
    <img src="https://github.com/HuanHaiLiuXin/CoolViewPager/blob/master/ScreenRecorder/Logo_CoolViewPager.png"/>
</p>
<p align="center">
<a target="_blank" href="https://jitpack.io/#HuanHaiLiuXin/CoolViewPager"><img src="https://jitpack.io/v/HuanHaiLiuXin/CoolViewPager.svg"></a>
<a target="_blank" href="https://travis-ci.org/HuanHaiLiuXin/CoolViewPager"><img src="https://travis-ci.org/HuanHaiLiuXin/CoolViewPager.svg?branch=master"></a>
<a target="_blank" href="https://circleci.com/gh/HuanHaiLiuXin/CoolViewPager"><img src="https://circleci.com/gh/HuanHaiLiuXin/CoolViewPager.svg?style=svg"></a>
<a target="_blank" href="https://android-arsenal.com/details/1/6987"><img src="https://img.shields.io/badge/Android%20Arsenal-CoolViewPager-green.svg?style=flat"></a>
<a target="_blank" href="https://www.apache.org/licenses/LICENSE-2.0"><img src="https://img.shields.io/badge/License-Apache%202-3D7DB4.svg"></a>
<!--<a target="_blank" href="https://www.android.com"><img src="https://img.shields.io/badge/platform-Android-4DC71F.svg"></a>-->
<a target="_blank" href="https://android-arsenal.com/api?level=15"><img src="https://img.shields.io/badge/API-15%2B-brightgreen.svg?style=flat"></a>
</p>

## [README of English](https://github.com/HuanHaiLiuXin/CoolViewPager/blob/master/README.md)<br/>

## 关于
[**CoolViewPager**](https://github.com/HuanHaiLiuXin/CoolViewPager)是一个自定义ViewPager,具有以下功能特征:
1. 支持水平及垂直方向循环滚动
2. 支持自动滚动
3. 支持自动滚动方向、滚动时间、间隔时间的设置
4. **支持调用notifyDataSetChanged实时刷新界面**
5. **支持边缘效果颜色的设置**
6. **为垂直滚动提供了适宜的界面切换效果**

## 录屏
<table align="center">
    <tr>
        <td>支持水平及垂直方向循环滚动</td>
        <td>支持自动滚动及滚动方向、滚动时间、间隔时间的设置</td>
    </tr>
    <tr>
        <td><img src="https://github.com/HuanHaiLiuXin/CoolViewPager/blob/master/ScreenRecorder/%E6%B0%B4%E5%B9%B3%E5%8F%8A%E5%9E%82%E7%9B%B4%E6%BB%91%E5%8A%A8-%E5%B0%8F.gif"/></td>
        <td><img src="https://github.com/HuanHaiLiuXin/CoolViewPager/blob/master/ScreenRecorder/%E8%87%AA%E5%8A%A8%E6%BB%9A%E5%8A%A8%E5%8F%AF%E8%AE%BE%E7%BD%AE%E6%96%B9%E5%90%91%E5%8F%8A%E9%97%B4%E9%9A%94%E6%97%B6%E9%97%B4-%E5%B0%8F.gif"/></td>
    </tr>
    <tr>
        <td>支持调用notifyDataSetChanged实时刷新界面</td>
        <td>支持边缘效果颜色的设置</td>
    </tr>
    <tr>
        <td><img src="https://github.com/HuanHaiLiuXin/CoolViewPager/blob/master/ScreenRecorder/notifyDatasetChanged%E7%94%9F%E6%95%88-%E5%B0%8F.gif"/></td>
        <td><img src="https://github.com/HuanHaiLiuXin/CoolViewPager/blob/master/ScreenRecorder/%E8%87%AA%E5%AE%9A%E4%B9%89%E8%BE%B9%E7%BC%98%E6%95%88%E6%9E%9C%E9%A2%9C%E8%89%B2-%E5%B0%8F.gif"/></td>
    </tr>
    <tr>
        <td>为垂直滚动提供了适宜的界面切换效果</td>
        <td></td>
    </tr>
    <tr>
        <td><img src="https://github.com/HuanHaiLiuXin/CoolViewPager/blob/master/ScreenRecorder/%E6%B0%B4%E5%B9%B3%E5%8F%8A%E5%9E%82%E7%9B%B4%E6%96%B9%E5%90%91%E9%A1%B5%E9%9D%A2%E5%88%87%E6%8D%A2%E6%95%88%E6%9E%9C-%E5%B0%8F.gif"/></td>
        <td></td>
    </tr>
</table>

## Apk
[**demo.apk**](https://github.com/HuanHaiLiuXin/CoolViewPager/blob/master/demo.apk)

## 使用步骤
1 在你的build.gradle中添加依赖
###### JitPack:
- 工程根目录下 build.gradle 中添加 
```
allprojects {
    repositories {
        ...
        maven { url 'https://jitpack.io' }
    }
}
```
- 使用CoolViewPager的模块下 build.gradle 中添加
```
dependencies {
        implementation 'com.github.HuanHaiLiuXin:CoolViewPager:v1.0.0'
}
```
###### Bintray:
使用CoolViewPager的模块下 build.gradle 中添加
```
dependencies {
    implementation 'com.huanhailiuxin.view:coolviewpager:1.0.0'
}
```
2 在你的布局文件中引入CoolViewPager
```xml
<com.huanhailiuxin.coolviewpager.CoolViewPager
    android:id="@+id/vp"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    />
```
3 在你的Java代码中获取CoolViewPager,设置各种属性,为其设置Adapter
```java
public class ActivityEdgeEffectColor extends BaseActivity {
    private CoolViewPager vp;
    
    ****
    CoolViewPager vp = findViewById(R.id.vp);
    vp.setScrollMode(CoolViewPager.ScrollMode.HORIZONTAL);
    vp.setAdapter(adapter);
    ****
}
```

## [CoolViewPager的自定义属性](https://github.com/HuanHaiLiuXin/CoolViewPager/blob/master/coolviewpager/src/main/res/values/attrs_coolviewpager.xml)
我们可以通过xml或Java代码的方式设置CoolViewPager实例的属性.

| attribute name | description |
|:---|:---|
| cvp_scrollmode | 滚动方向 |
| cvp_autoscroll | 是否开启自动滚动 |
| cvp_intervalinmillis | 自动滚动时间间隔 |
| cvp_autoscrolldirection | 自动滚动方向 |
| cvp_infiniteloop | 是否循环滚动 |
| cvp_scrollduration | 自动滚动耗时 |
| cvp_drawedgeeffect | 是否绘制边缘效果 |
| cvp_edgeeffectcolor | 绘制的边缘效果颜色 |

#### 在XML中设置
```
<com.huanhailiuxin.coolviewpager.CoolViewPager
    android:id="@+id/vp"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    app:cvp_scrollmode="vertical"
    app:cvp_autoscroll="true"
    app:cvp_intervalinmillis="1000"
    app:cvp_autoscrolldirection="backward"
    app:cvp_infiniteloop="true"
    app:cvp_scrollduration="600"
    app:cvp_drawedgeeffect="true"
    app:cvp_edgeeffectcolor="@color/colorPrimary"
    />
```
#### 在Java代码中设置
```java
public class ActivityEdgeEffectColor extends BaseActivity {
    private CoolViewPager vp;
    
    private void initViewPager(){
        vp = findViewById(R.id.vp);
        vp.setScrollMode(CoolViewPager.ScrollMode.VERTICAL);
        vp.setAutoScroll(true,1000);
        vp.setAutoScrollDirection(CoolViewPager.AutoScrollDirection.BACKWARD);
        vp.setInfiniteLoop(true);
        vp.setScrollDuration(true,600);
        vp.setDrawEdgeEffect(true);
        vp.setEdgeEffectColor(getResources().getColor(R.color.colorPrimary));
    }
}

```

## 作者
<a target="_blank" href="https://github.com/HuanHaiLiuXin"><img src="https://img.shields.io/badge/%E4%BD%9C%E8%80%85-%E5%B9%BB%E6%B5%B7%E6%B5%81%E5%BF%83-2E8CE6.svg"></a>
<a target="_blank" href="https://juejin.im/user/58206bf20ce46300589709d0"><img src="https://img.shields.io/badge/%E6%8E%98%E9%87%91-%E5%B9%BB%E6%B5%B7%E6%B5%81%E5%BF%83-006CFF.svg"></a>
<a target="_blank" href="https://www.jianshu.com/u/5702e6847f31"><img src="https://img.shields.io/badge/%E7%AE%80%E4%B9%A6-%E5%B9%BB%E6%B5%B7%E6%B5%81%E5%BF%83-EE705B.svg"></a>

License
=======

    Copyright 2018 HuanHaiLiuXin

    Licensed under the Apache License, Version 2.0 (the "License");
    you may not use this file except in compliance with the License.
    You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

    Unless required by applicable law or agreed to in writing, software
    distributed under the License is distributed on an "AS IS" BASIS,
    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
    See the License for the specific language governing permissions and
    limitations under the License.
