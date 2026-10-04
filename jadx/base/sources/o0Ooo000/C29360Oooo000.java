package o0Ooo000;

import android.graphics.Matrix;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: renamed from: o0Ooo000.Oooo000, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes10.dex */
public final class C29360Oooo000 {
    public static final boolean OooO00o(View v, MotionEvent motionEvent) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(v, "v");
        int[] iArr = new int[2];
        v.getLocationOnScreen(iArr);
        int i = iArr[0];
        int i2 = iArr[1];
        Matrix matrix = new Matrix();
        v.getMatrix().invert(matrix);
        float[] fArr = {motionEvent.getRawX(), motionEvent.getRawY()};
        matrix.mapPoints(fArr);
        int i3 = (int) fArr[0];
        int i4 = (int) fArr[1];
        return i3 >= i && i3 < v.getWidth() + i && i4 >= i2 && i4 < v.getHeight() + i2;
    }
}
