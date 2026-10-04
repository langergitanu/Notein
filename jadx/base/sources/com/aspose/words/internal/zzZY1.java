package com.aspose.words.internal;

import com.aspose.words.ControlChar;

/* JADX INFO: loaded from: classes5.dex */
final class zzZY1 {
    public static String zzY(float[] fArr, float f) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < fArr.length; i++) {
            if (i != 0) {
                sb.append(ControlChar.SPACE_CHAR);
            }
            zzZNH.zzU(sb, zzZ(fArr[i] * f, true, 9));
        }
        return sb.toString();
    }

    public static String zzZ(float f, boolean z, int i) {
        if (z) {
            f = (float) zzSA.pointToPixel(f);
        }
        return zzJB.zzV(f, i);
    }

    public static String zzt(zzP9 zzp9) {
        return zzZVC.zzZ(new zzP9(zzp9.zzOf(), zzp9.zzOe(), zzp9.zzOd(), zzp9.zzOc(), zzp9.zzOb(), zzp9.zzOa()), 9, false);
    }

    public static String zzu(zzP9 zzp9) {
        return zzZVC.zzZ(new zzP9(zzp9.zzOf(), zzp9.zzOe(), zzp9.zzOd(), zzp9.zzOc(), (float) zzSA.pointToPixel(zzp9.zzOb()), (float) zzSA.pointToPixel(zzp9.zzOa())), 9, false);
    }

    public static zzP9 zzv(zzP9 zzp9) {
        return new zzP9((float) zzSA.pointToPixel(zzp9.zzOf()), (float) zzSA.pointToPixel(zzp9.zzOe()), (float) zzSA.pointToPixel(zzp9.zzOd()), (float) zzSA.pointToPixel(zzp9.zzOc()), (float) zzSA.pointToPixel(zzp9.zzOb()), (float) zzSA.pointToPixel(zzp9.zzOa()));
    }

    public static String zzZ(zzPQ zzpq, boolean z) {
        if (zzpq.zzPu()) {
            return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), zzZ(zzpq.zzPv() * 100.0f, false, 9), "%");
        }
        return zzZ(zzpq.zzPv(), z, 9);
    }
}
