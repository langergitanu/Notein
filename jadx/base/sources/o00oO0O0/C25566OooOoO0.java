package o00oO0O0;

import OooOOO0.AbstractC20449OooO0Oo;
import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: renamed from: o00oO0O0.OooOoO0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25566OooOoO0 extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C25566OooOoO0 f87246OooOo0o = new C25566OooOoO0();

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooOo0O(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float f5 = rect.left;
        float f6 = rect.top;
        matrix.setScale(f3, f4);
        matrix.postTranslate((int) (f5 + 0.5f), (int) (f6 + 0.5f));
    }

    public final String toString() {
        return "fit_xy";
    }
}
