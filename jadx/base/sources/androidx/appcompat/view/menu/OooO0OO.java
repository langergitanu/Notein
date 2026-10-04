package androidx.appcompat.view.menu;

import OooOo.C20493Oooo00o;
import android.content.Context;
import android.view.MenuItem;
import android.view.SubMenu;
import androidx.core.internal.view.SupportMenuItem;
import androidx.core.internal.view.SupportSubMenu;

/* JADX INFO: loaded from: classes.dex */
public abstract class OooO0OO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f62584OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C20493Oooo00o<SupportMenuItem, MenuItem> f62585OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public C20493Oooo00o<SupportSubMenu, SubMenu> f62586OooO0OO;

    public OooO0OO(Context context) {
        this.f62584OooO00o = context;
    }

    public final MenuItem OooO00o(MenuItem menuItem) {
        if (!(menuItem instanceof SupportMenuItem)) {
            return menuItem;
        }
        SupportMenuItem supportMenuItem = (SupportMenuItem) menuItem;
        if (this.f62585OooO0O0 == null) {
            this.f62585OooO0O0 = new C20493Oooo00o<>();
        }
        MenuItem menuItem2 = this.f62585OooO0O0.get(supportMenuItem);
        if (menuItem2 != null) {
            return menuItem2;
        }
        MenuItemC21510OooOO0o menuItemC21510OooOO0o = new MenuItemC21510OooOO0o(this.f62584OooO00o, supportMenuItem);
        this.f62585OooO0O0.put(supportMenuItem, menuItemC21510OooOO0o);
        return menuItemC21510OooOO0o;
    }

    public final SubMenu OooO0O0(SubMenu subMenu) {
        if (!(subMenu instanceof SupportSubMenu)) {
            return subMenu;
        }
        SupportSubMenu supportSubMenu = (SupportSubMenu) subMenu;
        if (this.f62586OooO0OO == null) {
            this.f62586OooO0OO = new C20493Oooo00o<>();
        }
        SubMenu subMenu2 = this.f62586OooO0OO.get(supportSubMenu);
        if (subMenu2 != null) {
            return subMenu2;
        }
        SubMenuC21516OooOo0 subMenuC21516OooOo0 = new SubMenuC21516OooOo0(this.f62584OooO00o, supportSubMenu);
        this.f62586OooO0OO.put(supportSubMenu, subMenuC21516OooOo0);
        return subMenuC21516OooOo0;
    }
}
