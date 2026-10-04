package androidx.appcompat.view.menu;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import androidx.core.internal.view.SupportSubMenu;

/* JADX INFO: renamed from: androidx.appcompat.view.menu.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class SubMenuC21516OooOo0 extends MenuC21514OooOOo0 implements SubMenu {

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public final SupportSubMenu f62715OooO0o0;

    public SubMenuC21516OooOo0(Context context, SupportSubMenu supportSubMenu) {
        super(context, supportSubMenu);
        this.f62715OooO0o0 = supportSubMenu;
    }

    @Override // android.view.SubMenu
    public final void clearHeader() {
        this.f62715OooO0o0.clearHeader();
    }

    @Override // android.view.SubMenu
    public final MenuItem getItem() {
        return OooO00o(this.f62715OooO0o0.getItem());
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(int i) {
        this.f62715OooO0o0.setHeaderIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(int i) {
        this.f62715OooO0o0.setHeaderTitle(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderView(View view) {
        this.f62715OooO0o0.setHeaderView(view);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(int i) {
        this.f62715OooO0o0.setIcon(i);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderIcon(Drawable drawable) {
        this.f62715OooO0o0.setHeaderIcon(drawable);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setHeaderTitle(CharSequence charSequence) {
        this.f62715OooO0o0.setHeaderTitle(charSequence);
        return this;
    }

    @Override // android.view.SubMenu
    public final SubMenu setIcon(Drawable drawable) {
        this.f62715OooO0o0.setIcon(drawable);
        return this;
    }
}
