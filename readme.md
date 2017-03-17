## HybridFramework

### 引言

Hybrid也已经火了很长一段时间了，但是一直有人不知从何入手。
那么下面是我花了一段时间做的一个Hybrid框架，并基于这个框架和Django编写了一个Demo，
支持H5和Native的无缝调用，并支持自定义事件的扩展.

----

### 废话不多讲，先来看效果展示


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

### 技术点

1. 重构WebView和WebViewClient生命周期中的所有方法
2. 动态化加载Hybrid框架，即 `jniLibs/armeabi/libh5core.so`
3. 通过注解自定义Hybrid扩展事件
4. CreatePage()可将Hybrid页面嵌入到其他View
5. 等等的