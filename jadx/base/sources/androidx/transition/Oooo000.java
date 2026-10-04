package androidx.transition;

import android.view.View;

/* JADX INFO: loaded from: classes.dex */
public class Oooo000 extends C22114OooOooo {

    /* JADX INFO: renamed from: OooO0o, reason: collision with root package name */
    public static boolean f66425OooO0o = true;

    public static class OooO00o {
        public static void OooO00o(View view, int i, int i2, int i3, int i4) {
            view.setLeftTopRightBottom(i, i2, i3, i4);
        }
    }

    public void OooO0o(View view, int i, int i2, int i3, int i4) {
        if (f66425OooO0o) {
            try {
                OooO00o.OooO00o(view, i, i2, i3, i4);
            } catch (NoSuchMethodError unused) {
                f66425OooO0o = false;
            }
        }
    }
}
