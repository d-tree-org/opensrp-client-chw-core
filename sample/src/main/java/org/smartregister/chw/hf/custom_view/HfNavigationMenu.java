package org.smartregister.chw.hf.custom_view;

import org.smartregister.chw.core.custom_views.NavigationMenu;

import java.util.HashMap;

public class HfNavigationMenu implements NavigationMenu.Flavour {
    @Override
    public String[] getSupportedLanguages() {
        return new String[]{"English", "Kiswahili"};
    }

    @Override
    public HashMap<String, String> getTableMapValues() {
        return null;
    }
}
