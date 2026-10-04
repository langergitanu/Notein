package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzOY {
    /* JADX WARN: Removed duplicated region for block: B:6:0x0018  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void zzW(zzPS zzps, Shape shape) {
        double dZzW;
        zzPT zzptZzSx;
        zzPT zzptZzSx2;
        zzPT zzptZzSx3 = zzps.zzSx("height");
        double dZzV = 0.0d;
        if (zzptZzSx3 != null) {
            dZzW = zzL5.zzW(zzptZzSx3.zzZWj());
            if (com.aspose.words.internal.zzAN.zzZC(dZzW)) {
                dZzW = 0.0d;
            }
        }
        zzPT zzptZzSx4 = zzps.zzSx("border-top-style");
        zzPT zzptZzSx5 = zzps.zzSx("border-bottom-style");
        double dZzV2 = (zzptZzSx4 == null || zzptZzSx4.zzZWj().zzP(zzL4.zzZno) || (zzptZzSx2 = zzps.zzSx("border-top-width")) == null) ? 0.0d : zzL5.zzV(zzptZzSx2.zzZWj());
        if (zzptZzSx5 != null && !zzptZzSx5.zzZWj().zzP(zzL4.zzZno) && (zzptZzSx = zzps.zzSx("border-bottom-width")) != null) {
            dZzV = zzL5.zzV(zzptZzSx.zzZWj());
        }
        shape.zzWe(dZzW + dZzV2 + dZzV);
    }
}
