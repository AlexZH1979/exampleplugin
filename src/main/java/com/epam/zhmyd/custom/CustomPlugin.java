package com.epam.zhmyd.custom;

import com.epam.zhmyd.plugin.Plugin;

public class CustomPlugin implements Plugin {

    @Override
    public void init() {
        System.out.println("Init custom plugin");
    }

    @Override
    public void apply() {
        System.out.println("Run custom plugin");
    }
}
