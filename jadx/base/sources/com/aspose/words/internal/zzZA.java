package com.aspose.words.internal;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZA extends zz6 {
    private ArrayList<zzZG> zzY8 = new ArrayList<>();

    public static void zzP(zzZL zzzl) throws Exception {
        zzZA zzza = new zzZA();
        zzzl.zzZ(zzza);
        ArrayList<zzZG> arrayList = zzza.zzY8;
        if (arrayList.size() == 0) {
            return;
        }
        Iterator<zzZG> it = arrayList.iterator();
        while (it.hasNext()) {
            zzZ(it.next(), 12700.0f);
        }
    }

    private static void zzZ(zzZG zzzg, float f) throws Exception {
        zz7 zz7VarZzZ5 = zzzg.zzZ5();
        int iZzW = zz7VarZzZ5.zzW(zzzg);
        zz7VarZzZ5.removeAt(iZzW);
        zzG zzg = new zzG();
        zz7VarZzZ5.zzZ(iZzW, zzg);
        zzg.zzW(zzzg.zzZO());
        zzzg.zzW((zzP9) null);
        zzOH zzoh = (zzOH) zzzg.zzZ1();
        zzzg.zzY((zzPY) null);
        if (zzzg.zzZ2() != null && !zzzg.zzZ2().zzZ1().isEmpty()) {
            zzg.zzX(zzzg);
            zzG zzg2 = new zzG();
            zzg.zzZ(0, zzg2);
            zzg = zzg2;
        }
        zzP8 zzp8ZzZN = zzzg.zzZN();
        zzg.zzZ(zzzg.zzZ0().zzO8());
        if (zzp8ZzZN != null) {
            zzG zzg3 = new zzG();
            zzg3.zzZ(zzp8ZzZN);
            zzg.zzX((zzZL) zzg3);
            zzg = zzg3;
        }
        zzEG zzegZzZT = zzEF.zzZT(zzoh.getImageBytes());
        zzZP zzzp = new zzZP(0L, zzZPW.zzG(zzegZzZT.getWidth(), zzegZzZT.getHeight()), zzoh.getImageBytes(), zzoh.zzNd().isEmpty() ? new zzEP(0.0d, 0.0d, 0.0d, 0.0d) : new zzEP(zzoh.zzNd().zzZm() / zzegZzZT.getWidth(), (zzegZzZT.getWidth() - zzoh.zzNd().zzkw()) / zzegZzZT.getWidth(), zzoh.zzNd().zzZo() / zzegZzZT.getHeight(), (zzegZzZT.getHeight() - zzoh.zzNd().zzZn()) / zzegZzZT.getHeight()));
        zzG zzg4 = new zzG();
        zzg4.zzW(zzoh.zzNb() != null ? zzoh.zzNb() : new zzP9());
        zzg4.zzZO().zzZ(12700.0f, 12700.0f, 0);
        zzg.zzX((zzZL) zzg4);
        zzg4.zzX(zzzp);
    }

    @Override // com.aspose.words.internal.zz6
    public final void zzZ(zzZG zzzg) throws Exception {
        if (zzzg.zzZ1() == null || zzzg.zzZ1().zzPH() != 2) {
            return;
        }
        zzOH zzoh = (zzOH) zzzg.zzZ1();
        if (zzoh.zzNa() != 4) {
            return;
        }
        if ((zzoh.zzNf() <= 0.0f || zzoh.zzNf() >= 1.0f) && zzEF.zzZH(zzoh.getImageBytes())) {
            zzZQG.zzZ(this.zzY8, zzzg);
        }
    }
}
