package o0ooOoO;

import Oooo0O0.C20935Oooo00o;
import OooooO0.C21291OooO0oO;
import android.graphics.Rect;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import kotlin.jvm.internal.OooOOO0;
import o0ooOO0.C31537OoooO;

/* JADX INFO: renamed from: o0ooOoO.OooO00o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31662OooO00o extends ActionMode.Callback2 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C31663OooO0O0 f113176OooO00o;

    public C31662OooO00o(C31663OooO0O0 callback) {
        OooOOO0.OooO0oO(callback, "callback");
        this.f113176OooO00o = callback;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        C31663OooO0O0 c31663OooO0O0 = this.f113176OooO00o;
        c31663OooO0O0.getClass();
        OooOOO0.OooO0Oo(menuItem);
        int itemId = menuItem.getItemId();
        if (itemId == 0) {
            C20935Oooo00o.OooO0OO oooO0OO = c31663OooO0O0.f113179OooO0OO;
            if (oooO0OO != null) {
                oooO0OO.invoke();
            }
        } else if (itemId == 1) {
            C20935Oooo00o.C20937OooO0o0 c20937OooO0o0 = c31663OooO0O0.f113180OooO0Oo;
            if (c20937OooO0o0 != null) {
                c20937OooO0o0.invoke();
            }
        } else if (itemId == 2) {
            C20935Oooo00o.C20936OooO0Oo c20936OooO0Oo = c31663OooO0O0.f113182OooO0o0;
            if (c20936OooO0Oo != null) {
                c20936OooO0Oo.invoke();
            }
        } else {
            if (itemId != 3) {
                return false;
            }
            C20935Oooo00o.OooO0o oooO0o = c31663OooO0O0.f113181OooO0o;
            if (oooO0o != null) {
                oooO0o.invoke();
            }
        }
        if (actionMode != null) {
            actionMode.finish();
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        C31663OooO0O0 c31663OooO0O0 = this.f113176OooO00o;
        c31663OooO0O0.getClass();
        if (menu == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (actionMode == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        if (c31663OooO0O0.f113179OooO0OO != null) {
            C31663OooO0O0.OooO00o(menu, 1);
        }
        if (c31663OooO0O0.f113180OooO0Oo != null) {
            C31663OooO0O0.OooO00o(menu, 2);
        }
        if (c31663OooO0O0.f113182OooO0o0 != null) {
            C31663OooO0O0.OooO00o(menu, 3);
        }
        if (c31663OooO0O0.f113181OooO0o != null) {
            C31663OooO0O0.OooO00o(menu, 4);
        }
        return true;
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        C31537OoooO c31537OoooO = this.f113176OooO00o.f113177OooO00o;
        if (c31537OoooO != null) {
            c31537OoooO.invoke();
        }
    }

    @Override // android.view.ActionMode.Callback2
    public final void onGetContentRect(ActionMode actionMode, View view, Rect rect) {
        C21291OooO0oO c21291OooO0oO = this.f113176OooO00o.f113178OooO0O0;
        if (rect != null) {
            rect.set((int) c21291OooO0oO.f61724OooO00o, (int) c21291OooO0oO.f61725OooO0O0, (int) c21291OooO0oO.f61726OooO0OO, (int) c21291OooO0oO.f61727OooO0Oo);
        }
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        C31663OooO0O0 c31663OooO0O0 = this.f113176OooO00o;
        c31663OooO0O0.getClass();
        if (actionMode == null || menu == null) {
            return false;
        }
        C31663OooO0O0.OooO0O0(menu, 1, c31663OooO0O0.f113179OooO0OO);
        C31663OooO0O0.OooO0O0(menu, 2, c31663OooO0O0.f113180OooO0Oo);
        C31663OooO0O0.OooO0O0(menu, 3, c31663OooO0O0.f113182OooO0o0);
        C31663OooO0O0.OooO0O0(menu, 4, c31663OooO0O0.f113181OooO0o);
        return true;
    }
}
