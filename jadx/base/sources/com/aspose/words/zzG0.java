package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzG0 extends zz39 {
    private static final com.aspose.words.internal.zzZHW zzUR = new com.aspose.words.internal.zzZHW("meth", "id", "variation", "extLst");

    public static zzG1 zzZ(zzZXT zzzxt) throws Exception {
        if (!"colorStyle".equals(zzzxt.zzZsD().getLocalName())) {
            return null;
        }
        zzG1 zzg1 = new zzG1();
        zzZ(zzzxt.zzZsD(), zzg1);
        zzZ(zzzxt, zzg1);
        return zzg1;
    }

    private static void zzZ(zzYU4 zzyu4, zzG1 zzg1) {
        while (zzyu4.zzi()) {
            int iZzTP = zzUR.zzTP(zzyu4.getLocalName());
            if (iZzTP == 0) {
                zzg1.zzRA(zzyu4.getValue());
            } else if (iZzTP != 1) {
                zz39.zzI(zzyu4);
            } else {
                zzg1.setId(zzyu4.getValue());
            }
        }
        zzyu4.zzj();
    }

    private static void zzZ(zzZXT zzzxt, zzG1 zzg1) throws Exception {
        zzYU4 zzyu4ZzZsD = zzzxt.zzZsD();
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        while (zzyu4ZzZsD.zzQ("colorStyle")) {
            int iZzTP = zzUR.zzTP(zzyu4ZzZsD.getLocalName());
            if (iZzTP == 2) {
                zzFZ zzfz = new zzFZ();
                zzfz.zze(zzBR.zzV(zzyu4ZzZsD, zzzxt.zzZqn()));
                com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzFZ>) arrayList2, zzfz);
            } else if (iZzTP != 3) {
                zzBW zzbwZzW = zzBR.zzW(zzyu4ZzZsD, zzzxt.zzZqn());
                if (zzbwZzW != null) {
                    com.aspose.words.internal.zzZQG.zzZ((ArrayList<zzBW>) arrayList, zzbwZzW);
                }
            } else {
                zzg1.setExtensions(zz81.zzd(zzzxt));
            }
        }
        if (arrayList.size() > 0) {
            zzg1.zzZ(new zzBW[arrayList.size()]);
            for (int i = 0; i < arrayList.size(); i++) {
                zzg1.zzZO0()[i] = (zzBW) arrayList.get(i);
            }
        }
        if (arrayList2.size() > 0) {
            zzg1.zzZ(new zzFZ[arrayList2.size()]);
            for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                zzg1.zzZNZ()[i2] = (zzFZ) arrayList2.get(i2);
            }
        }
    }
}
