package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYKK {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("attr", "counter", "counters");
    private zzYKF[] zzXDa;

    private zzYKK(zzYKF[] zzykfArr) {
        this.zzXDa = zzykfArr;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0097 A[LOOP:0: B:3:0x0008->B:37:0x0097, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static zzYKK zzQ(zzMP zzmp) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z = false;
        while (true) {
            if (i >= zzmp.getCount()) {
                break;
            }
            zzL4 zzl4ZzMl = zzmp.zzMl(i);
            int valueType = zzl4ZzMl.getValueType();
            if (valueType != 0) {
                if (valueType == 1) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzYKE>) arrayList, new zzYKE(((zzM2) zzl4ZzMl).getValue()));
                } else if (valueType == 6) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzYKE>) arrayList, new zzYKE(""));
                } else if (valueType != 9) {
                    z = true;
                } else {
                    zzP1 zzp1 = (zzP1) zzl4ZzMl;
                    int iZzTP = zzUR.zzTP(zzp1.getName());
                    Object objZzX = iZzTP != 0 ? iZzTP != 1 ? iZzTP != 2 ? null : zzYKG.zzX(zzp1) : zzYKI.zzY(zzp1) : zzYKJ.zzZ(zzp1);
                    if (objZzX != null) {
                        com.aspose.words.internal.zzZQG.zzZ((ArrayList<Object>) arrayList, objZzX);
                    }
                }
                if (!z) {
                    arrayList.clear();
                    break;
                }
                i++;
            } else {
                if (zzl4ZzMl.zzP(zzL4.zzZkQ) || zzl4ZzMl.zzP(zzL4.zzZkP) || zzl4ZzMl.zzP(zzL4.zzZkO) || zzl4ZzMl.zzP(zzL4.zzZkN)) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzYKE>) arrayList, new zzYKE(""));
                }
                if (!z) {
                }
            }
        }
        if (z || arrayList.size() == 0) {
            return null;
        }
        return new zzYKK((zzYKF[]) arrayList.toArray(new zzYKF[0]));
    }

    public final void zzZ(zzZ9L zzz9l) {
        for (zzYKF zzykf : this.zzXDa) {
            zzykf.zzZ(zzz9l);
        }
    }
}
