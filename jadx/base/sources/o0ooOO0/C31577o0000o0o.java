package o0ooOO0;

import OooooO0.C21285OooO00o;
import OooooOO.C21334Oooo0o0;
import OooooOO.C21335Oooo0oO;
import OooooOO.InterfaceC21370ooOO;
import android.graphics.Path;
import android.graphics.RectF;

/* JADX INFO: renamed from: o0ooOO0.o0000o0o, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C31577o0000o0o {
    public static final boolean OooO00o(InterfaceC21370ooOO interfaceC21370ooOO, float f, float f2) {
        float f3 = f - 0.005f;
        float f4 = f2 - 0.005f;
        float f5 = f + 0.005f;
        float f6 = f2 + 0.005f;
        C21334Oooo0o0 c21334Oooo0o0OooO00o = C21335Oooo0oO.OooO00o();
        if (Float.isNaN(f3)) {
            throw new IllegalStateException("Rect.left is NaN");
        }
        if (Float.isNaN(f4)) {
            throw new IllegalStateException("Rect.top is NaN");
        }
        if (Float.isNaN(f5)) {
            throw new IllegalStateException("Rect.right is NaN");
        }
        if (Float.isNaN(f6)) {
            throw new IllegalStateException("Rect.bottom is NaN");
        }
        RectF rectF = c21334Oooo0o0OooO00o.f61748OooO0O0;
        rectF.set(f3, f4, f5, f6);
        c21334Oooo0o0OooO00o.f61747OooO00o.addRect(rectF, Path.Direction.CCW);
        C21334Oooo0o0 c21334Oooo0o0OooO00o2 = C21335Oooo0oO.OooO00o();
        c21334Oooo0o0OooO00o2.OooO0oo(interfaceC21370ooOO, c21334Oooo0o0OooO00o, 1);
        boolean zIsEmpty = c21334Oooo0o0OooO00o2.f61747OooO00o.isEmpty();
        c21334Oooo0o0OooO00o2.reset();
        c21334Oooo0o0OooO00o.reset();
        return !zIsEmpty;
    }

    public static final boolean OooO0O0(float f, float f2, float f3, float f4, long j) {
        float f5 = f - f3;
        float f6 = f2 - f4;
        float fOooO0O0 = C21285OooO00o.OooO0O0(j);
        float fOooO0OO = C21285OooO00o.OooO0OO(j);
        return ((f6 * f6) / (fOooO0OO * fOooO0OO)) + ((f5 * f5) / (fOooO0O0 * fOooO0O0)) <= 1.0f;
    }
}
