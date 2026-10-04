package com.aspose.words.internal;

import android.graphics.Color;

/* JADX INFO: loaded from: classes5.dex */
final class zzT4 {
    private static final zzZHW zzUR = new zzZHW("window", "windowtext");

    public static zzPV zzB(String str) {
        int i = zzZQ1.zz2p;
        int iZzTP = zzUR.zzTP(zzZKN.zzU2(str));
        if (iZzTP == 0) {
            i = zzZQ2.zz2H;
        } else if (iZzTP == 1) {
            i = zzZQ2.zz2F;
        }
        return new zzPV(i);
    }

    public static int zzS(zzPV zzpv) {
        return zzpv.isEmpty() ? zzZQ1.zz2p : zzPV.zzZ(zzpv, zzPV.zzI1) ? zzZQ2.zz2H : Color.argb(zzpv.zzPD(), zzpv.zzPC(), zzpv.zzPB(), zzpv.zzPA());
    }

    public static zzPV zzYR(int i) {
        return new zzPV(i);
    }
}
