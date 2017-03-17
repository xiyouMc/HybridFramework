## HybridFramework

### 引言

Hybrid也已经火了很长一段时间了，但是一直有人不知从何入手。
那么下面是我花了一段时间做的一个Hybrid框架，并基于这个框架和Django编写了一个Demo，
支持H5和Native的无缝调用，并支持自定义事件的扩展.

----

### 废话不多讲，先来看效果展示（其中除了页面是H5，其他View均是AndroidUI）


#### 1. 启动Hybrid页面

<img src=https://github.com/xiyouMc/HybridFramework/blob/master/img/start_hybrid.gif width=300px>
<br>

#### 2. 检测Hybrid默认支持的事件 (以Toast为例)

<img src=https://github.com/xiyouMc/HybridFramework/blob/master/img/checkjsapi.gif width=300px>
<br>

#### 3.  隐藏TitleBar 

<img src=https://github.com/xiyouMc/HybridFramework/blob/master/img/hide_title.gif width=300px>
<br>

#### 4.  显示TitleBar 

<img src=https://github.com/xiyouMc/HybridFramework/blob/master/img/show_title.gif width=300px>
<br>

-----

以上支持Demo的一部分效果，具体的可以见[Demo-Android](https://github.com/xiyouMc/HybridFramework/tree/master/demo_android)中.

### 技术点

1. 重构WebView和WebViewClient生命周期中的所有方法
2. 依赖[AppDynamicFramework](https://github.com/xiyouMc/AppDynamicFramework)，来动态加载Hybrid框架，即 `jniLibs/armeabi/libh5core.so`
3. 通过注解自定义Hybrid扩展事件
4. CreatePage()可将Hybrid页面嵌入到其他View
5. 等等的


## Contact me

Any further question?

[Email](mailto:tmac694449212@gmail.com) me please!

## License

        Copyright 2017 xiyouMc

        Licensed under the Apache License, Version 2.0 (the "License");
        you may not use this file except in compliance with the License.
        You may obtain a copy of the License at

        http://www.apache.org/licenses/LICENSE-2.0

        Unless required by applicable law or agreed to in writing, software
        distributed under the License is distributed on an "AS IS" BASIS,
        WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
        See the License for the specific language governing permissions and
        limitations under the License.