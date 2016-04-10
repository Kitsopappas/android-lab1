## Android Lab 1
>Christodoulos Pappas

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
