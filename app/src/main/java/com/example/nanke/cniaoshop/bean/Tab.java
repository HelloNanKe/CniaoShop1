package com.example.nanke.cniaoshop.bean;

/**
 * Created by Ivan on 15/9/25.
 */
public class Tab {

    private  int title;
    private  int icon;
    private Class fragment;

    public Tab(Class fragment, int title, int icon) {
        this.title = title;
        this.icon = icon;
        this.fragment = fragment;
    }
    public int getTitle() {
        return title;
    }
    public int getIcon() {
        return icon;
    }
    public Class getFragment() {
        return fragment;
    }
}
