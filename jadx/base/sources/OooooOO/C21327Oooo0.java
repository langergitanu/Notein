package OooooOO;

import android.graphics.Matrix;
import oOo0oooO.InterfaceC34588OooO0oO;

/* JADX INFO: renamed from: OooooOO.Oooo0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C21327Oooo0 {

    /* JADX INFO: renamed from: OooO00o, reason: collision with root package name */
    public static final /* synthetic */ int f61737OooO00o = 0;

    public static final InterfaceC34588OooO0oO OooO00o(InterfaceC34588OooO0oO first, InterfaceC34588OooO0oO second) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(first, "first");
        kotlin.jvm.internal.OooOOO0.OooO0oO(second, "second");
        return first.isEmpty() ? second : second.isEmpty() ? first : new oOo0oooO.OooOO0(first, second);
    }

    public static final void OooO0O0(float[] setFrom, Matrix matrix) {
        kotlin.jvm.internal.OooOOO0.OooO0oO(setFrom, "$this$setFrom");
        kotlin.jvm.internal.OooOOO0.OooO0oO(matrix, "matrix");
        matrix.getValues(setFrom);
        float f = setFrom[0];
        float f2 = setFrom[1];
        float f3 = setFrom[2];
        float f4 = setFrom[3];
        float f5 = setFrom[4];
        float f6 = setFrom[5];
        float f7 = setFrom[6];
        float f8 = setFrom[7];
        float f9 = setFrom[8];
        setFrom[0] = f;
        setFrom[1] = f4;
        setFrom[2] = 0.0f;
        setFrom[3] = f7;
        setFrom[4] = f2;
        setFrom[5] = f5;
        setFrom[6] = 0.0f;
        setFrom[7] = f8;
        setFrom[8] = 0.0f;
        setFrom[9] = 0.0f;
        setFrom[10] = 1.0f;
        setFrom[11] = 0.0f;
        setFrom[12] = f3;
        setFrom[13] = f6;
        setFrom[14] = 0.0f;
        setFrom[15] = f9;
    }
}
