package androidx.appcompat.view.menu;

import OooOo.C20493Oooo00o;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.internal.view.SupportSubMenu;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.OooOOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class MenuC21514OooOOo0 extends OooO0OO implements Menu {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public final SupportMenu f62693OooO0Oo;

    public MenuC21514OooOOo0(Context context, SupportMenu supportMenu) {
        super(context);
        if (supportMenu == null) {
            throw new IllegalArgumentException("Wrapped Object can not be null.");
        }
        this.f62693OooO0Oo = supportMenu;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return OooO00o(this.f62693OooO0Oo.add(charSequence));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        MenuItem[] menuItemArr2 = menuItemArr != null ? new MenuItem[menuItemArr.length] : null;
        int iAddIntentOptions = this.f62693OooO0Oo.addIntentOptions(i, i2, i3, componentName, intentArr, intent, i4, menuItemArr2);
        if (menuItemArr2 != null) {
            int length = menuItemArr2.length;
            for (int i5 = 0; i5 < length; i5++) {
                menuItemArr[i5] = OooO00o(menuItemArr2[i5]);
            }
        }
        return iAddIntentOptions;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return OooO0O0(this.f62693OooO0Oo.addSubMenu(charSequence));
    }

    @Override // android.view.Menu
    public final void clear() {
        C20493Oooo00o<SupportMenuItem, MenuItem> c20493Oooo00o = this.f62585OooO0O0;
        if (c20493Oooo00o != null) {
            c20493Oooo00o.clear();
        }
        C20493Oooo00o<SupportSubMenu, SubMenu> c20493Oooo00o2 = this.f62586OooO0OO;
        if (c20493Oooo00o2 != null) {
            c20493Oooo00o2.clear();
        }
        this.f62693OooO0Oo.clear();
    }

    @Override // android.view.Menu
    public final void close() {
        this.f62693OooO0Oo.close();
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        return OooO00o(this.f62693OooO0Oo.findItem(i));
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return OooO00o(this.f62693OooO0Oo.getItem(i));
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        return this.f62693OooO0Oo.hasVisibleItems();
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        return this.f62693OooO0Oo.isShortcutKey(i, keyEvent);
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return this.f62693OooO0Oo.performIdentifierAction(i, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        return this.f62693OooO0Oo.performShortcut(i, keyEvent, i2);
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        if (this.f62585OooO0O0 != null) {
            int i2 = 0;
            while (true) {
                C20493Oooo00o<SupportMenuItem, MenuItem> c20493Oooo00o = this.f62585OooO0O0;
                if (i2 >= c20493Oooo00o.f58550OooOoO0) {
                    break;
                }
                if (c20493Oooo00o.OooO0oO(i2).getGroupId() == i) {
                    this.f62585OooO0O0.OooO(i2);
                    i2--;
                }
                i2++;
            }
        }
        this.f62693OooO0Oo.removeGroup(i);
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        if (this.f62585OooO0O0 != null) {
            int i2 = 0;
            while (true) {
                C20493Oooo00o<SupportMenuItem, MenuItem> c20493Oooo00o = this.f62585OooO0O0;
                if (i2 >= c20493Oooo00o.f58550OooOoO0) {
                    break;
                }
                if (c20493Oooo00o.OooO0oO(i2).getItemId() == i) {
                    this.f62585OooO0O0.OooO(i2);
                    break;
                }
                i2++;
            }
        }
        this.f62693OooO0Oo.removeItem(i);
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        this.f62693OooO0Oo.setGroupCheckable(i, z, z2);
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        this.f62693OooO0Oo.setGroupEnabled(i, z);
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        this.f62693OooO0Oo.setGroupVisible(i, z);
    }

    @Override // android.view.Menu
    public final void setQwertyMode(boolean z) {
        this.f62693OooO0Oo.setQwertyMode(z);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.f62693OooO0Oo.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return OooO00o(this.f62693OooO0Oo.add(i));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return OooO0O0(this.f62693OooO0Oo.addSubMenu(i));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return OooO00o(this.f62693OooO0Oo.add(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        return OooO0O0(this.f62693OooO0Oo.addSubMenu(i, i2, i3, charSequence));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return OooO00o(this.f62693OooO0Oo.add(i, i2, i3, i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return OooO0O0(this.f62693OooO0Oo.addSubMenu(i, i2, i3, i4));
    }
}
