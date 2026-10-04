package o0ooOoO;

import Oooo0.o0OoOo0;
import Oooo0O0.C20935Oooo00o;
import OooooO0.C21291OooO0oO;
import android.R;
import android.view.Menu;
import com.aspose.slides.C22220Oooo00o;
import kotlin.jvm.internal.OooOOO0;
import o0ooOO0.C31537OoooO;
import oO00ooO.C32442OooOO0o;

/* JADX INFO: renamed from: o0ooOoO.OooO0O0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31663OooO0O0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public final C31537OoooO f113177OooO00o;

    /* JADX INFO: renamed from: OooO0O0, reason: collision with root package name */
    public C21291OooO0oO f113178OooO0O0;

    /* JADX INFO: renamed from: OooO0OO, reason: collision with root package name */
    public C20935Oooo00o.OooO0OO f113179OooO0OO;

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public C20935Oooo00o.C20937OooO0o0 f113180OooO0Oo;

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public C20935Oooo00o.OooO0o f113181OooO0o;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public C20935Oooo00o.C20936OooO0Oo f113182OooO0o0;

    public C31663OooO0O0(C31537OoooO c31537OoooO) {
        C21291OooO0oO c21291OooO0oO = C21291OooO0oO.f61723OooO0o0;
        this.f113177OooO00o = c31537OoooO;
        this.f113178OooO0O0 = c21291OooO0oO;
        this.f113179OooO0OO = null;
        this.f113180OooO0Oo = null;
        this.f113182OooO0o0 = null;
        this.f113181OooO0o = null;
    }

    public static void OooO00o(Menu menu, int i) {
        int i2;
        OooOOO0.OooO0oO(menu, "menu");
        C22220Oooo00o.OooO0OO(i, "item");
        int iOooO00o = o0OoOo0.OooO00o(i);
        if (iOooO00o == 0) {
            i2 = R.string.copy;
        } else if (iOooO00o == 1) {
            i2 = R.string.paste;
        } else if (iOooO00o == 2) {
            i2 = R.string.cut;
        } else {
            if (iOooO00o != 3) {
                throw new C32442OooOO0o();
            }
            i2 = R.string.selectAll;
        }
        menu.add(0, o0OoOo0.OooO00o(i), o0OoOo0.OooO00o(i), i2).setShowAsAction(1);
    }

    public static void OooO0O0(Menu menu, int i, oO0O000o.OooO00o oooO00o) {
        if (oooO00o != null && menu.findItem(o0OoOo0.OooO00o(i)) == null) {
            OooO00o(menu, i);
        } else {
            if (oooO00o != null || menu.findItem(o0OoOo0.OooO00o(i)) == null) {
                return;
            }
            menu.removeItem(o0OoOo0.OooO00o(i));
        }
    }
}
