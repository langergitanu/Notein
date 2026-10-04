package o0O0oo00;

import android.graphics.Bitmap;
import android.graphics.CornerPathEffect;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import androidx.ink.strokes.OooOOO0;

/* JADX INFO: loaded from: classes9.dex */
public interface OooO00o<T> {

    /* JADX INFO: renamed from: o0O0oo00.OooO00o$OooO00o, reason: collision with other inner class name */
    public static final class C19734OooO00o {
        public static /* synthetic */ void OooO00o(OooO00o oooO00o, int i, float f, int i2, int i3, boolean z, int i4) {
            if ((i4 & 8) != 0) {
                i3 = -1;
            }
            int i5 = i3;
            if ((i4 & 16) != 0) {
                z = false;
            }
            oooO00o.OooOOo0(f, i, i2, i5, z);
        }
    }

    void OooO(float f);

    void OooO00o(float f, float f2, float f3, float f4, float f5, float f6);

    void OooO0O0(float f, float f2, float f3, float f4);

    void OooO0OO();

    void OooO0Oo();

    void OooO0o(RectF rectF, Paint paint);

    void OooO0o0();

    void OooO0oO(float f);

    void OooO0oo(float[] fArr);

    void OooOO0(RectF rectF);

    void OooOO0O(int i);

    void OooOO0o(OooOOO0 oooOOO0, Matrix matrix, OooO0OO oooO0OO);

    void OooOOO(float f, float f2);

    void OooOOO0(float f);

    void OooOOOO(float f);

    void OooOOOo(float f, float f2, float f3);

    void OooOOo();

    void OooOOo0(float f, int i, int i2, int i3, boolean z);

    void OooOOoo(RectF rectF);

    void OooOo(int i);

    void OooOo0(int i);

    void OooOo00(OooO0O0<T> oooO0O0);

    void OooOo0O(String str, float f, float f2, float f3);

    void OooOo0o(Bitmap bitmap, RectF rectF, float f);

    void OooOoO(RectF rectF, float f);

    void OooOoO0(int i);

    void OooOoOO(CornerPathEffect cornerPathEffect);

    void OooOoo();

    void OooOoo0(float f, float f2, RectF rectF);

    int getStyle();

    float getWidth();

    void lineTo(float f, float f2);

    void moveTo(float f, float f2);

    void reset();
}
