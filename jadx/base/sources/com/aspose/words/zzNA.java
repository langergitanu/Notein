package com.aspose.words;

import com.aspose.words.ref.RefDouble;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzNA extends zzOO {
    public zzNA(String str) {
        super(str, false, zzL4.zzZnl, zzL3.zzZ(zzL3.zzZkg, zzL3.zzZkf));
    }

    public static double zzY(zzMP zzmp) {
        if (zzmp.getCount() != 1) {
            return 0.0d;
        }
        RefDouble refDouble = new RefDouble(0.0d);
        zzZ(zzmp.zzZVx(), refDouble);
        return refDouble.get();
    }

    public static boolean zzZ(zzL4 zzl4, RefDouble refDouble) {
        double dZzL = zzL5.zzL(zzl4);
        if (com.aspose.words.internal.zzAN.zzL(dZzL, -1.7976931348623157E308d)) {
            refDouble.set(0.0d);
            return false;
        }
        refDouble.set(dZzL);
        return true;
    }
}
