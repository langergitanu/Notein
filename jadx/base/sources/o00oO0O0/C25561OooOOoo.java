package o00oO0O0;

import OooOOO0.AbstractC20449OooO0Oo;
import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: renamed from: o00oO0O0.OooOOoo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25561OooOOoo extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C25561OooOOoo f87239OooOo0o = new C25561OooOOoo();

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooOo0O(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float fWidth;
        float fHeight;
        if (f4 > f3) {
            fWidth = ((rect.width() - (i * f4)) * 0.5f) + rect.left;
            fHeight = rect.top;
            f3 = f4;
        } else {
            fWidth = rect.left;
            fHeight = ((rect.height() - (i2 * f3)) * 0.5f) + rect.top;
        }
        matrix.setScale(f3, f3);
        matrix.postTranslate((int) (fWidth + 0.5f), (int) (fHeight + 0.5f));
    }

    public final String toString() {
        return "center_crop";
    }
}
