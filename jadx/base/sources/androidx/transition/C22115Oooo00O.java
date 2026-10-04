package androidx.transition;

import android.os.Build;
import android.view.View;

/* JADX INFO: renamed from: androidx.transition.Oooo00O, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C22115Oooo00O extends Oooo000 {

    /* JADX INFO: renamed from: OooO0oO, reason: collision with root package name */
    public static boolean f66426OooO0oO = true;

    /* JADX INFO: renamed from: androidx.transition.Oooo00O$OooO00o */
    public static class OooO00o {
        public static void OooO00o(View view, int i) {
            view.setTransitionVisibility(i);
        }
    }

    @Override // androidx.transition.C22113OooOooO
    public void OooO0OO(View view, int i) {
        if (Build.VERSION.SDK_INT == 28) {
            super.OooO0OO(view, i);
        } else if (f66426OooO0oO) {
            try {
                OooO00o.OooO00o(view, i);
            } catch (NoSuchMethodError unused) {
                f66426OooO0oO = false;
            }
        }
    }
}
