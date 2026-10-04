package o00oO0O0;

import OooOOO0.AbstractC20449OooO0Oo;
import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: renamed from: o00oO0O0.OooOo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25562OooOo0 extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C25562OooOo0 f87241OooOo0o = new C25562OooOo0();

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooOo0O(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float fMin = Math.min(f3, f4);
        float f5 = rect.left;
        float fHeight = (rect.height() - (i2 * fMin)) + rect.top;
        matrix.setScale(fMin, fMin);
        matrix.postTranslate((int) (f5 + 0.5f), (int) (fHeight + 0.5f));
    }

    public final String toString() {
        return "fit_bottom_start";
    }
}
