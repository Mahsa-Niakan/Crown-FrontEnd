package com.nikanmedia.kalaagh;

public class Application extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        FontsOverride.setDefaultFont(this, "DEFAULT", "byekan.ttf");
        FontsOverride.setDefaultFont(this, "MONOSPACE", "byekan.ttf");
        FontsOverride.setDefaultFont(this, "SERIF", "byekan.ttf");
        FontsOverride.setDefaultFont(this, "SANS_SERIF", "byekan.ttf");
    }
}
