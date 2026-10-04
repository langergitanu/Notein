package com.google.android.material.internal;

import android.content.Context;
import android.view.SubMenu;
import androidx.appcompat.view.menu.OooO;
import androidx.appcompat.view.menu.OooOO0O;

/* JADX INFO: loaded from: classes7.dex */
public class NavigationMenu extends OooO {
    public NavigationMenu(Context context) {
        super(context);
    }

    @Override // androidx.appcompat.view.menu.OooO, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        OooOO0O oooOO0O = (OooOO0O) addInternal(i, i2, i3, charSequence);
        NavigationSubMenu navigationSubMenu = new NavigationSubMenu(getContext(), this, oooOO0O);
        oooOO0O.f62653OooOOOO = navigationSubMenu;
        navigationSubMenu.setHeaderTitle(oooOO0O.f62645OooO0o0);
        return navigationSubMenu;
    }
}
