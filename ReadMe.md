## Android Lab 1 ![Acitivity Lifecycle](https://raw.githubusercontent.com/Kitsopappas/android-lab1/master/app/src/main/res/mipmap-hdpi/ic_launcher.png)
>Christodoulos Pappas

[![Build status](https://ci.appveyor.com/api/projects/status/1tkktwh654w07eim?svg=true)](https://ci.appveyor.com/project/Atom/atom)
[![Dependency Status](https://david-dm.org/atom/atom.svg)](https://david-dm.org/atom/atom)

## Activity Life Cycle
![Acitivity Lifecycle](http://www.vogella.com/tutorials/AndroidLifeCycle/images/xactivity_lifecycle10.png.pagespeed.ic.fPEkTDwujN.png)

> Java code


```java
@Override
    protected void onPause() {
        super.onPause();
        Log.i("#ALC", "Activity Paused");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("#ALC", "Activity Resumed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("#ALC", "Activity Stopped");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("#ALC", "Activity Destroyed");
    }

```

## Intents
>Android Intent can be defined as a simple message objects which is used to communicate from 1 activity to another. Intents define intention of an Application . They are also used to transfer data between activities

```java
/* Open another activity */
Intent i = new Intent(getApplicationContext(), Activity2.class);
startActivity(i);

/* Intent to open browser */
Intent browserIntent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
startActivity(browserIntent);
```

## Icons used

| Facebook        | Google         | Twitter       | LinkedIn       |
|:--------------:|:--------------:|:--------------:|:--------------:|
|![icon](https://github.com/Kitsopappas/android-lab1/blob/master/app/src/main/res/drawable/facebook.png)|![icon](https://github.com/Kitsopappas/android-lab1/blob/master/app/src/main/res/drawable/google.png) | ![icon](https://github.com/Kitsopappas/android-lab1/blob/master/app/src/main/res/drawable/twitter.png) |![icon](https://github.com/Kitsopappas/android-lab1/blob/master/app/src/main/res/drawable/linkedin.png)|
