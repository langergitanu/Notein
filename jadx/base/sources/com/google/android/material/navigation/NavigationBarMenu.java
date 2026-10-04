package com.google.android.material.navigation;

import OooO0o.C20424OooO0Oo;
import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.appcompat.view.menu.OooO;
import androidx.appcompat.view.menu.OooOO0O;

/* JADX INFO: loaded from: classes7.dex */
public final class NavigationBarMenu extends OooO {
    private final int maxItemCount;
    private final Class<?> viewClass;

    public NavigationBarMenu(Context context, Class<?> cls, int i) {
        super(context);
        this.viewClass = cls;
        this.maxItemCount = i;
    }

    @Override // androidx.appcompat.view.menu.OooO
    public MenuItem addInternal(int i, int i2, int i3, CharSequence charSequence) {
        if (size() + 1 <= this.maxItemCount) {
            stopDispatchingItemsChanged();
            MenuItem menuItemAddInternal = super.addInternal(i, i2, i3, charSequence);
            if (menuItemAddInternal instanceof OooOO0O) {
                ((OooOO0O) menuItemAddInternal).OooO0Oo(true);
            }
            startDispatchingItemsChanged();
            return menuItemAddInternal;
        }
        String simpleName = this.viewClass.getSimpleName();
        StringBuilder sbOooO0o0 = C20424OooO0Oo.OooO0o0("Maximum number of items supported by ", simpleName, " is ");
        sbOooO0o0.append(this.maxItemCount);
        sbOooO0o0.append(". Limit can be checked with ");
        sbOooO0o0.append(simpleName);
        sbOooO0o0.append("#getMaxItemCount()");
        throw new IllegalArgumentException(sbOooO0o0.toString());
    }

    @Override // androidx.appcompat.view.menu.OooO, android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        throw new UnsupportedOperationException(this.viewClass.getSimpleName().concat(" does not support submenus"));
    }

    public int getMaxItemCount() {
        return this.maxItemCount;
    }
}
