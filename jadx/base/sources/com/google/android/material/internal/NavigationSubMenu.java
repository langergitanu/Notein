package com.google.android.material.internal;

import android.content.Context;
import androidx.appcompat.view.menu.OooO;
import androidx.appcompat.view.menu.OooOO0O;
import androidx.appcompat.view.menu.OooOo00;

/* JADX INFO: loaded from: classes7.dex */
public class NavigationSubMenu extends OooOo00 {
    public NavigationSubMenu(Context context, NavigationMenu navigationMenu, OooOO0O oooOO0O) {
        super(context, navigationMenu, oooOO0O);
    }

    @Override // androidx.appcompat.view.menu.OooO
    public void onItemsChanged(boolean z) {
        super.onItemsChanged(z);
        ((OooO) getParentMenu()).onItemsChanged(z);
    }
}
