package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzQ3 {
    private boolean zzZr1;

    public zzQ3(boolean z) {
        this.zzZr1 = z;
    }

    private zzPS zzV(zzPS zzps) {
        if (this.zzZr1) {
            return zzps;
        }
        zzPT zzptZzSx = zzps.zzSx("color");
        boolean z = (zzps.zzSx("border-top-color") == null || zzps.zzSx("border-right-color") == null || zzps.zzSx("border-bottom-color") == null || zzps.zzSx("border-left-color") == null) ? false : true;
        if (zzptZzSx == null || z) {
            return zzps;
        }
        zzPR zzpr = new zzPR(zzps);
        zzZ(zzpr, zzptZzSx.zzZWj(), "border-top-color");
        zzZ(zzpr, zzptZzSx.zzZWj(), "border-right-color");
        zzZ(zzpr, zzptZzSx.zzZWj(), "border-bottom-color");
        zzZ(zzpr, zzptZzSx.zzZWj(), "border-left-color");
        return zzpr.zzZWe();
    }

    /* JADX WARN: Removed duplicated region for block: B:29:0x0089  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private zzPS zzY(zzPS zzps, zzPS zzps2, zzPS zzps3, boolean z) {
        double d;
        zzPT zzptZzSx;
        if (zzps.getCount() == 0) {
            return zzPS.zzZqo;
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (zzPT zzpt : zzps) {
            zzM3 zzm3 = (zzM3) com.aspose.words.internal.zzZKW.zzZ(zzpt, zzM3.class);
            if (zzm3 != null) {
                if (zzm3.zzZWj().zzZVz()) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzPT>) arrayList2, zzpt);
                } else {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzM3>) arrayList, zzm3);
                }
            }
        }
        if (arrayList.size() == 0 && arrayList2.size() == 0) {
            return zzps;
        }
        if (this.zzZr1 || (zzptZzSx = zzps.zzSx("font-size")) == null) {
            d = 12.0d;
        } else {
            zzM3 zzm32 = (zzM3) com.aspose.words.internal.zzZKW.zzZ(zzptZzSx, zzM3.class);
            if (zzm32 != null) {
                zzptZzSx = zzZ(zzm32, new zzQK(zzps3, zzps2, 0.0d, z));
            }
            double dZzL = zzL5.zzL(zzptZzSx.zzZWj().zzZVx());
            if (!com.aspose.words.internal.zzAN.zzZC(dZzL)) {
                d = dZzL;
            }
        }
        zzQK zzqk = new zzQK(zzps3, zzps2, d, z);
        zzPR zzpr = new zzPR(zzps);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            zzpr.remove(((zzPT) it.next()).zzZWo());
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            zzpr.zzU(zzZ((zzM3) it2.next(), zzqk));
        }
        return zzpr.zzZWe();
    }

    public final zzPS zzW(zzPS zzps) {
        return zzZ(zzps, null, null, false);
    }

    public final zzPS zzZ(zzPS zzps, zzPS zzps2, zzPS zzps3, boolean z) {
        return zzV(zzY(zzps, zzps2, zzps3, z));
    }

    private static zzQ4 zzZ(zzM3 zzm3, zzQK zzqk) {
        zzMS zzmsZzSk = zzMR.zzSk(zzm3.zzZWo());
        return new zzQ4(zzmsZzSk, zzmsZzSk.zzY(zzm3.zzZWj(), zzqk), zzm3.zzZWi(), zzm3.zzZWj());
    }

    private static void zzZ(zzPR zzpr, zzMP zzmp, String str) {
        if (zzpr.zzSx(str) != null) {
            return;
        }
        zzpr.zzY(new zzQ4(zzMR.zzSk(str), zzmp, false, zzmp));
        zzpr.zzSv(str);
    }
}
