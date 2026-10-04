package androidx.fragment.app;

import android.view.View;

/* JADX INFO: renamed from: androidx.fragment.app.Ooooo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21929Ooooo0o {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f65107OooO00o = 0;

    public static void OooO00o(boolean z, String str) {
        if (!z) {
            throw new IllegalArgumentException(str);
        }
    }

    public static void OooO0O0(Object obj) {
        OooO0OO(obj, "Argument must not be null");
    }

    public static void OooO0OO(Object obj, String str) {
        if (obj == null) {
            throw new NullPointerException(str);
        }
    }

    public static final Fragment OooO0Oo(View view) {
        Fragment fragmentOooo000 = FragmentManager.Oooo000(view);
        if (fragmentOooo000 != null) {
            return fragmentOooo000;
        }
        throw new IllegalStateException("View " + view + " does not have a Fragment set");
    }
}
