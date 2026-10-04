package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ5J {
    public static zzZ5I[] zzX(long[] jArr, int i, int i2) {
        if (i == 0 && i2 == 0) {
            return null;
        }
        int length = jArr.length;
        zzZ5I[] zzz5iArr = new zzZ5I[length];
        for (int i3 = 0; i3 < length; i3++) {
            zzz5iArr[i3] = zzZ5I.zzW(jArr[i3], i, i2);
        }
        return zzz5iArr;
    }

    private static zzZ5I zzZ(zzYM5 zzym5, int i, int i2) {
        boolean z = false;
        boolean z2 = !zzym5.zzYnG().zzYnC() && zzym5.zzYnG().getValue() > i;
        if (!zzym5.zzYnF().zzYnC() && zzym5.zzYnF().getValue() > i2) {
            z = true;
        }
        return new zzZ5I(z2, z);
    }

    public static zzZ5I[] zzp(Shape shape) {
        if (shape.zzYbm() == 0 && shape.zzYbl() == 0) {
            return null;
        }
        zzYM5[] zzym5ArrZzYbp = shape.zzYbp();
        if (zzym5ArrZzYbp.length == 0) {
            return null;
        }
        zzZ5I[] zzz5iArr = new zzZ5I[zzym5ArrZzYbp.length];
        int iZzYbm = shape.zzYbm();
        int iZzYbl = shape.zzYbl();
        for (int i = 0; i < zzym5ArrZzYbp.length; i++) {
            zzz5iArr[i] = zzZ(zzym5ArrZzYbp[i], iZzYbm, iZzYbl);
        }
        return zzz5iArr;
    }
}
