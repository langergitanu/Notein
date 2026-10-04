package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.appcompat.view.menu.OooO;
import com.huawei.hms.network.embedded.C18241k5;

/* JADX INFO: loaded from: classes.dex */
public class OooOo00 extends OooO implements SubMenu {
    private OooOO0O mItem;
    private OooO mParentMenu;

    public OooOo00(Context context, OooO oooO, OooOO0O oooOO0O) {
        super(context);
        this.mParentMenu = oooO;
        this.mItem = oooOO0O;
    }

    @Override // androidx.appcompat.view.menu.OooO
    public boolean collapseItemActionView(OooOO0O oooOO0O) {
        return this.mParentMenu.collapseItemActionView(oooOO0O);
    }

    @Override // androidx.appcompat.view.menu.OooO
    public boolean dispatchMenuItemSelected(OooO oooO, MenuItem menuItem) {
        return super.dispatchMenuItemSelected(oooO, menuItem) || this.mParentMenu.dispatchMenuItemSelected(oooO, menuItem);
    }

    @Override // androidx.appcompat.view.menu.OooO
    public boolean expandItemActionView(OooOO0O oooOO0O) {
        return this.mParentMenu.expandItemActionView(oooOO0O);
    }

    @Override // androidx.appcompat.view.menu.OooO
    public String getActionViewStatesKey() {
        OooOO0O oooOO0O = this.mItem;
        int i = oooOO0O != null ? oooOO0O.f62640OooO00o : 0;
        if (i == 0) {
            return null;
        }
        return super.getActionViewStatesKey() + C18241k5.f55433h + i;
    }

    @Override // android.view.SubMenu
    public MenuItem getItem() {
        return this.mItem;
    }

    public Menu getParentMenu() {
        return this.mParentMenu;
    }

    @Override // androidx.appcompat.view.menu.OooO
    public OooO getRootMenu() {
        return this.mParentMenu.getRootMenu();
    }

    @Override // androidx.appcompat.view.menu.OooO
    public boolean isGroupDividerEnabled() {
        return this.mParentMenu.isGroupDividerEnabled();
    }

    @Override // androidx.appcompat.view.menu.OooO
    public boolean isQwertyMode() {
        return this.mParentMenu.isQwertyMode();
    }

    @Override // androidx.appcompat.view.menu.OooO
    public boolean isShortcutsVisible() {
        return this.mParentMenu.isShortcutsVisible();
    }

    @Override // androidx.appcompat.view.menu.OooO
    public void setCallback(OooO.OooO00o oooO00o) {
        this.mParentMenu.setCallback(oooO00o);
    }

    @Override // androidx.appcompat.view.menu.OooO, androidx.core.internal.view.SupportMenu, android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.mParentMenu.setGroupDividerEnabled(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(Drawable drawable) {
        return (SubMenu) super.setHeaderIconInt(drawable);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(CharSequence charSequence) {
        return (SubMenu) super.setHeaderTitleInt(charSequence);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderView(View view) {
        return (SubMenu) super.setHeaderViewInt(view);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(Drawable drawable) {
        this.mItem.setIcon(drawable);
        return this;
    }

    @Override // androidx.appcompat.view.menu.OooO, android.view.Menu
    public void setQwertyMode(boolean z) {
        this.mParentMenu.setQwertyMode(z);
    }

    @Override // androidx.appcompat.view.menu.OooO
    public void setShortcutsVisible(boolean z) {
        this.mParentMenu.setShortcutsVisible(z);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderIcon(int i) {
        return (SubMenu) super.setHeaderIconInt(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setHeaderTitle(int i) {
        return (SubMenu) super.setHeaderTitleInt(i);
    }

    @Override // android.view.SubMenu
    public SubMenu setIcon(int i) {
        this.mItem.setIcon(i);
        return this;
    }
}
