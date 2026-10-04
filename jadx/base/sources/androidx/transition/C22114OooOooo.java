package androidx.transition;

import android.graphics.Matrix;
import android.view.View;

/* JADX INFO: renamed from: androidx.transition.OooOooo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public class C22114OooOooo extends C22113OooOooO {

    /* JADX INFO: renamed from: OooO0Oo, reason: collision with root package name */
    public static boolean f66406OooO0Oo = true;

    /* JADX INFO: renamed from: OooO0o0, reason: collision with root package name */
    public static boolean f66407OooO0o0 = true;

    /* JADX INFO: renamed from: androidx.transition.OooOooo$OooO00o */
    public static class OooO00o {
        public static void OooO00o(View view, Matrix matrix) {
            view.setAnimationMatrix(matrix);
        }

        public static void OooO0O0(View view, Matrix matrix) {
            view.transformMatrixToGlobal(matrix);
        }

        public static void OooO0OO(View view, Matrix matrix) {
            view.transformMatrixToLocal(matrix);
        }
    }

    public void OooO0Oo(View view, Matrix matrix) {
        if (f66406OooO0Oo) {
            try {
                OooO00o.OooO0O0(view, matrix);
            } catch (NoSuchMethodError unused) {
                f66406OooO0Oo = false;
            }
        }
    }

    public void OooO0o0(View view, Matrix matrix) {
        if (f66407OooO0o0) {
            try {
                OooO00o.OooO0OO(view, matrix);
            } catch (NoSuchMethodError unused) {
                f66407OooO0o0 = false;
            }
        }
    }
}
