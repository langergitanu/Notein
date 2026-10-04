package OooOO0o;

import OooOO0o.AbstractC20443OooO00o;
import OooOo.C20493Oooo00o;
import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.view.menu.MenuC21514OooOOo0;
import androidx.appcompat.view.menu.MenuItemC21510OooOO0o;
import androidx.appcompat.view.menu.OooO;
import androidx.core.internal.view.SupportMenu;
import androidx.core.internal.view.SupportMenuItem;
import java.util.ArrayList;

/* JADX INFO: renamed from: OooOO0o.OooO0o0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C20445OooO0o0 extends ActionMode {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final Context f58374OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final AbstractC20443OooO00o f58375OooO0O0;

    /* JADX INFO: renamed from: OooOO0o.OooO0o0$OooO00o */
    public static class OooO00o implements AbstractC20443OooO00o.InterfaceC18960OooO00o {

        /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
        public final ActionMode.Callback f58376OooO00o;

        /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
        public final Context f58377OooO0O0;

        /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
        public final ArrayList<C20445OooO0o0> f58378OooO0OO = new ArrayList<>();

        /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
        public final C20493Oooo00o<Menu, Menu> f58379OooO0Oo = new C20493Oooo00o<>();

        public OooO00o(Context context, ActionMode.Callback callback) {
            this.f58377OooO0O0 = context;
            this.f58376OooO00o = callback;
        }

        @Override // OooOO0o.AbstractC20443OooO00o.InterfaceC18960OooO00o
        public final boolean OooO00o(AbstractC20443OooO00o abstractC20443OooO00o, MenuItem menuItem) {
            return this.f58376OooO00o.onActionItemClicked(OooO0o0(abstractC20443OooO00o), new MenuItemC21510OooOO0o(this.f58377OooO0O0, (SupportMenuItem) menuItem));
        }

        @Override // OooOO0o.AbstractC20443OooO00o.InterfaceC18960OooO00o
        public final boolean OooO0O0(AbstractC20443OooO00o abstractC20443OooO00o, OooO oooO) {
            C20445OooO0o0 c20445OooO0o0OooO0o0 = OooO0o0(abstractC20443OooO00o);
            C20493Oooo00o<Menu, Menu> c20493Oooo00o = this.f58379OooO0Oo;
            Menu menuC21514OooOOo0 = c20493Oooo00o.get(oooO);
            if (menuC21514OooOOo0 == null) {
                menuC21514OooOOo0 = new MenuC21514OooOOo0(this.f58377OooO0O0, oooO);
                c20493Oooo00o.put(oooO, menuC21514OooOOo0);
            }
            return this.f58376OooO00o.onCreateActionMode(c20445OooO0o0OooO0o0, menuC21514OooOOo0);
        }

        @Override // OooOO0o.AbstractC20443OooO00o.InterfaceC18960OooO00o
        public final void OooO0OO(AbstractC20443OooO00o abstractC20443OooO00o) {
            this.f58376OooO00o.onDestroyActionMode(OooO0o0(abstractC20443OooO00o));
        }

        @Override // OooOO0o.AbstractC20443OooO00o.InterfaceC18960OooO00o
        public final boolean OooO0Oo(AbstractC20443OooO00o abstractC20443OooO00o, Menu menu) {
            C20445OooO0o0 c20445OooO0o0OooO0o0 = OooO0o0(abstractC20443OooO00o);
            C20493Oooo00o<Menu, Menu> c20493Oooo00o = this.f58379OooO0Oo;
            Menu menuC21514OooOOo0 = c20493Oooo00o.get(menu);
            if (menuC21514OooOOo0 == null) {
                menuC21514OooOOo0 = new MenuC21514OooOOo0(this.f58377OooO0O0, (SupportMenu) menu);
                c20493Oooo00o.put(menu, menuC21514OooOOo0);
            }
            return this.f58376OooO00o.onPrepareActionMode(c20445OooO0o0OooO0o0, menuC21514OooOOo0);
        }

        public final C20445OooO0o0 OooO0o0(AbstractC20443OooO00o abstractC20443OooO00o) {
            ArrayList<C20445OooO0o0> arrayList = this.f58378OooO0OO;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                C20445OooO0o0 c20445OooO0o0 = arrayList.get(i);
                if (c20445OooO0o0 != null && c20445OooO0o0.f58375OooO0O0 == abstractC20443OooO00o) {
                    return c20445OooO0o0;
                }
            }
            C20445OooO0o0 c20445OooO0o02 = new C20445OooO0o0(this.f58377OooO0O0, abstractC20443OooO00o);
            arrayList.add(c20445OooO0o02);
            return c20445OooO0o02;
        }
    }

    public C20445OooO0o0(Context context, AbstractC20443OooO00o abstractC20443OooO00o) {
        this.f58374OooO00o = context;
        this.f58375OooO0O0 = abstractC20443OooO00o;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.f58375OooO0O0.OooO00o();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.f58375OooO0O0.OooO0O0();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new MenuC21514OooOOo0(this.f58374OooO00o, this.f58375OooO0O0.OooO0OO());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.f58375OooO0O0.OooO0Oo();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.f58375OooO0O0.OooO0o0();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.f58375OooO0O0.f58321OooOo0o;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.f58375OooO0O0.OooO0o();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.f58375OooO0O0.f58320OooOo;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.f58375OooO0O0.OooO0oO();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.f58375OooO0O0.OooO0oo();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.f58375OooO0O0.OooO(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.f58375OooO0O0.OooOO0O(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.f58375OooO0O0.f58321OooOo0o = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.f58375OooO0O0.OooOOO0(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.f58375OooO0O0.OooOOO(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.f58375OooO0O0.OooOO0(i);
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.f58375OooO0O0.OooOO0o(i);
    }
}
