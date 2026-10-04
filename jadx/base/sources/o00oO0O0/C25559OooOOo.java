package o00oO0O0;

import OooOOO0.AbstractC20449OooO0Oo;
import android.graphics.Matrix;
import android.graphics.Rect;

/* JADX INFO: renamed from: o00oO0O0.OooOOo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes5.dex */
public final class C25559OooOOo extends AbstractC20449OooO0Oo {

    /* JADX INFO: renamed from: OooOo0o, reason: collision with root package name */
    public static final C25559OooOOo f87232OooOo0o = new C25559OooOOo();

    @Override // OooOOO0.AbstractC20449OooO0Oo
    public final void OooOo0O(Matrix matrix, Rect rect, int i, int i2, float f, float f2, float f3, float f4) {
        matrix.setTranslate((int) (((rect.width() - i) * 0.5f) + rect.left + 0.5f), (int) (((rect.height() - i2) * 0.5f) + rect.top + 0.5f));
    }

    public final String toString() {
        return "center";
    }
}
