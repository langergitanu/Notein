package androidx.transition;

import android.os.Build;
import android.view.ViewGroup;

/* JADX INFO: renamed from: androidx.transition.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C22108OooOoO {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static boolean f66397OooO00o = true;

    /* JADX INFO: renamed from: androidx.transition.OooOoO$OooO00o */
    public static class OooO00o {
        public static int OooO00o(ViewGroup viewGroup, int i) {
            return viewGroup.getChildDrawingOrder(i);
        }

        public static void OooO0O0(ViewGroup viewGroup, boolean z) {
            viewGroup.suppressLayout(z);
        }
    }

    public static void OooO00o(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            OooO00o.OooO0O0(viewGroup, z);
        } else if (f66397OooO00o) {
            try {
                OooO00o.OooO0O0(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                f66397OooO00o = false;
            }
        }
    }
}
