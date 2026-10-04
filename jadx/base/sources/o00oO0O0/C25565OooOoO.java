package o00oO0O0;

import OooOOO0.AbstractC20449OooO0Oo;
import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: renamed from: o00oO0O0.OooOoO, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25565OooOoO extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C25565OooOoO f87245OooOo0o = new C25565OooOoO();

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooOo0O(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        float fMax;
        float fMax2;
        if (f4 > f3) {
            float f5 = i * f4;
            fMax = Math.max(Math.min((rect.width() * 0.5f) - (f * f5), 0.0f), rect.width() - f5) + rect.left;
            fMax2 = rect.top;
            f3 = f4;
        } else {
            fMax = rect.left;
            float f6 = i2 * f3;
            fMax2 = Math.max(Math.min((rect.height() * 0.5f) - (f2 * f6), 0.0f), rect.height() - f6) + rect.top;
        }
        matrix.setScale(f3, f3);
        matrix.postTranslate((int) (fMax + 0.5f), (int) (fMax2 + 0.5f));
    }

    public final String toString() {
        return "focus_crop";
    }
}
