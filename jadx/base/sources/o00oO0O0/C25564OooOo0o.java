package o00oO0O0;

import OooOOO0.AbstractC20449OooO0Oo;
import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: renamed from: o00oO0O0.OooOo0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25564OooOo0o extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C25564OooOo0o f87244OooOo0o = new C25564OooOo0o();

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooOo0O(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float fMin = Math.min(f3, f4);
        float fWidth = (rect.width() - (i * fMin)) + rect.left;
        float fHeight = (rect.height() - (i2 * fMin)) + rect.top;
        matrix.setScale(fMin, fMin);
        matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
    }

    public final String toString() {
        return "fit_end";
    }
}
