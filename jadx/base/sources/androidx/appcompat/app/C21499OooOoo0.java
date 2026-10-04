package androidx.appcompat.app;

import android.content.Context;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.Window;
import androidx.appcompat.app.OooO00o;
import androidx.appcompat.view.menu.OooO;
import androidx.appcompat.view.menu.OooOOOO;
import androidx.appcompat.widget.C21569OoooOoO;
import androidx.appcompat.widget.Toolbar;
import androidx.core.util.Preconditions;
import androidx.core.view.ViewCompat;
import java.util.ArrayList;

/* JADX INFO: renamed from: androidx.appcompat.app.OooOoo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21499OooOoo0 extends androidx.appcompat.app.OooO00o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C21569OoooOoO f62474OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public final Window.Callback f62475OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public final C21501OooO0o0 f62476OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public boolean f62477OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public boolean f62478OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public boolean f62479OooO0o0;

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public final ArrayList<OooO00o.OooO0O0> f62480OooO0oO = new ArrayList<>();

    /* JADX INFO: renamed from: OooO0oo, reason: collision with root package name */
    public final OooO00o f62481OooO0oo = new OooO00o();

    /* JADX INFO: renamed from: androidx.appcompat.app.OooOoo0$OooO00o */
    public class OooO00o implements Runnable {
        public OooO00o() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            C21499OooOoo0 c21499OooOoo0 = C21499OooOoo0.this;
            Window.Callback callback = c21499OooOoo0.f62475OooO0O0;
            Menu menuOooOOOo = c21499OooOoo0.OooOOOo();
            androidx.appcompat.view.menu.OooO oooO = menuOooOOOo instanceof androidx.appcompat.view.menu.OooO ? (androidx.appcompat.view.menu.OooO) menuOooOOOo : null;
            if (oooO != null) {
                oooO.stopDispatchingItemsChanged();
            }
            try {
                menuOooOOOo.clear();
                if (!callback.onCreatePanelMenu(0, menuOooOOOo) || !callback.onPreparePanel(0, null, menuOooOOOo)) {
                    menuOooOOOo.clear();
                }
                if (oooO != null) {
                    oooO.startDispatchingItemsChanged();
                }
            } catch (Throwable th) {
                if (oooO != null) {
                    oooO.startDispatchingItemsChanged();
                }
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.OooOoo0$OooO0O0 */
    public class OooO0O0 implements Toolbar.InterfaceC21583OooO0oo {
        public OooO0O0() {
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.OooOoo0$OooO0OO */
    public final class OooO0OO implements OooOOOO.OooO00o {

        /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
        public boolean f62485OooOo0o;

        public OooO0OO() {
        }

        @Override // androidx.appcompat.view.menu.OooOOOO.OooO00o
        public final boolean OooO00o(androidx.appcompat.view.menu.OooO oooO) {
            C21499OooOoo0.this.f62475OooO0O0.onMenuOpened(108, oooO);
            return true;
        }

        @Override // androidx.appcompat.view.menu.OooOOOO.OooO00o
        public final void onCloseMenu(androidx.appcompat.view.menu.OooO oooO, boolean z) {
            if (this.f62485OooOo0o) {
                return;
            }
            this.f62485OooOo0o = true;
            C21499OooOoo0 c21499OooOoo0 = C21499OooOoo0.this;
            c21499OooOoo0.f62474OooO00o.OooOO0o();
            c21499OooOoo0.f62475OooO0O0.onPanelClosed(108, oooO);
            this.f62485OooOo0o = false;
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.OooOoo0$OooO0Oo, reason: case insensitive filesystem */
    public final class C21500OooO0Oo implements OooO.OooO00o {
        public C21500OooO0Oo() {
        }

        @Override // androidx.appcompat.view.menu.OooO.OooO00o
        public final boolean onMenuItemSelected(androidx.appcompat.view.menu.OooO oooO, MenuItem menuItem) {
            return false;
        }

        @Override // androidx.appcompat.view.menu.OooO.OooO00o
        public final void onMenuModeChange(androidx.appcompat.view.menu.OooO oooO) {
            C21499OooOoo0 c21499OooOoo0 = C21499OooOoo0.this;
            boolean zIsOverflowMenuShowing = c21499OooOoo0.f62474OooO00o.f63100OooO00o.isOverflowMenuShowing();
            Window.Callback callback = c21499OooOoo0.f62475OooO0O0;
            if (zIsOverflowMenuShowing) {
                callback.onPanelClosed(108, oooO);
            } else if (callback.onPreparePanel(0, null, oooO)) {
                callback.onMenuOpened(108, oooO);
            }
        }
    }

    /* JADX INFO: renamed from: androidx.appcompat.app.OooOoo0$OooO0o0, reason: case insensitive filesystem */
    public class C21501OooO0o0 {
        public C21501OooO0o0() {
        }
    }

    public C21499OooOoo0(Toolbar toolbar, CharSequence charSequence, Window.Callback callback) {
        OooO0O0 oooO0O0 = new OooO0O0();
        Preconditions.checkNotNull(toolbar);
        C21569OoooOoO c21569OoooOoO = new C21569OoooOoO(toolbar, false);
        this.f62474OooO00o = c21569OoooOoO;
        this.f62475OooO0O0 = (Window.Callback) Preconditions.checkNotNull(callback);
        c21569OoooOoO.f63109OooOO0O = callback;
        toolbar.setOnMenuItemClickListener(oooO0O0);
        c21569OoooOoO.setWindowTitle(charSequence);
        this.f62476OooO0OO = new C21501OooO0o0();
    }

    @Override // androidx.appcompat.app.OooO00o
    public final boolean OooO(int i, KeyEvent keyEvent) {
        Menu menuOooOOOo = OooOOOo();
        if (menuOooOOOo == null) {
            return false;
        }
        menuOooOOOo.setQwertyMode(KeyCharacterMap.load(keyEvent.getDeviceId()).getKeyboardType() != 1);
        return menuOooOOOo.performShortcut(i, keyEvent, 0);
    }

    @Override // androidx.appcompat.app.OooO00o
    public final boolean OooO00o() {
        return this.f62474OooO00o.f63100OooO00o.hideOverflowMenu();
    }

    @Override // androidx.appcompat.app.OooO00o
    public final boolean OooO0O0() {
        C21569OoooOoO c21569OoooOoO = this.f62474OooO00o;
        if (!c21569OoooOoO.f63100OooO00o.hasExpandedActionView()) {
            return false;
        }
        c21569OoooOoO.collapseActionView();
        return true;
    }

    @Override // androidx.appcompat.app.OooO00o
    public final void OooO0OO(boolean z) {
        if (z == this.f62478OooO0o) {
            return;
        }
        this.f62478OooO0o = z;
        ArrayList<OooO00o.OooO0O0> arrayList = this.f62480OooO0oO;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).OooO00o();
        }
    }

    @Override // androidx.appcompat.app.OooO00o
    public final int OooO0Oo() {
        return this.f62474OooO00o.f63101OooO0O0;
    }

    @Override // androidx.appcompat.app.OooO00o
    public final boolean OooO0o() {
        C21569OoooOoO c21569OoooOoO = this.f62474OooO00o;
        Toolbar toolbar = c21569OoooOoO.f63100OooO00o;
        OooO00o oooO00o = this.f62481OooO0oo;
        toolbar.removeCallbacks(oooO00o);
        ViewCompat.postOnAnimation(c21569OoooOoO.f63100OooO00o, oooO00o);
        return true;
    }

    @Override // androidx.appcompat.app.OooO00o
    public final Context OooO0o0() {
        return this.f62474OooO00o.f63100OooO00o.getContext();
    }

    @Override // androidx.appcompat.app.OooO00o
    public final void OooO0oO() {
    }

    @Override // androidx.appcompat.app.OooO00o
    public final void OooO0oo() {
        this.f62474OooO00o.f63100OooO00o.removeCallbacks(this.f62481OooO0oo);
    }

    @Override // androidx.appcompat.app.OooO00o
    public final boolean OooOO0(KeyEvent keyEvent) {
        if (keyEvent.getAction() == 1) {
            OooOO0O();
        }
        return true;
    }

    @Override // androidx.appcompat.app.OooO00o
    public final boolean OooOO0O() {
        return this.f62474OooO00o.f63100OooO00o.showOverflowMenu();
    }

    @Override // androidx.appcompat.app.OooO00o
    public final void OooOO0o(boolean z) {
    }

    @Override // androidx.appcompat.app.OooO00o
    public final void OooOOO(CharSequence charSequence) {
        this.f62474OooO00o.setWindowTitle(charSequence);
    }

    @Override // androidx.appcompat.app.OooO00o
    public final void OooOOO0(boolean z) {
    }

    public final Menu OooOOOo() {
        boolean z = this.f62479OooO0o0;
        C21569OoooOoO c21569OoooOoO = this.f62474OooO00o;
        if (!z) {
            c21569OoooOoO.f63100OooO00o.setMenuCallbacks(new OooO0OO(), new C21500OooO0Oo());
            this.f62479OooO0o0 = true;
        }
        return c21569OoooOoO.f63100OooO00o.getMenu();
    }
}
