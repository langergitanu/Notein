package com.aspose.words;

import android.graphics.Matrix;
import android.graphics.Paint;
import o00O0oo0.C24970OooOO0O;

/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class OooO0O0 {
    public static String OooO00o(com.aspose.words.internal.zzZNT zzznt, int i) {
        return zzznt.zzhJ().zzQx(i).getValue();
    }

    public static void OooO0O0(Matrix matrix, float f, Paint paint) {
        paint.setStrokeWidth(C24970OooOO0O.OooO00o(matrix) * f);
    }
}
