package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYU9 {
    public static boolean zzZ(DocumentBase documentBase, zzY6G zzy6g) {
        for (TableStyle tableStyle = (TableStyle) documentBase.getStyles().zzZ8(zzy6g.zzZ7j(), false); tableStyle != null; tableStyle = (TableStyle) tableStyle.zzY3j()) {
            if (tableStyle.zzZYd().zzVE(4340) || tableStyle.zzZYf().zzVE(4340)) {
                return true;
            }
        }
        return false;
    }

    public static void zzZ(zzY6G zzy6g, int i, int i2) {
        if (i2 != 0) {
            zzy6g.set(i, Integer.valueOf(i2 - 1));
        }
    }
}
