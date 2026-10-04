package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzYQ {
    private zzHL zzXC;
    private zzYM[] zzXD;

    public final zzG zzYs() throws Exception {
        zzG zzg = new zzG();
        for (zzYM zzym : this.zzXD) {
            zzg.zzX(zzym.zzYp());
        }
        return zzg;
    }

    public final void zzZ(zzFG zzfg, zzHL zzhl) throws Exception {
        this.zzXC = zzhl;
        zzHJ zzhjZzMl = zzhl.zzMl();
        zzZ(zzfg, zzhjZzMl);
        zzZ(zzhjZzMl);
        zzhjZzMl.zzXv(zzfg.zzMh().zzMg());
    }

    private void zzZ(zzHJ zzhj) throws Exception {
        int i = 0;
        while (true) {
            zzYM[] zzymArr = this.zzXD;
            if (i >= zzymArr.length) {
                return;
            }
            zzYM zzym = zzymArr[i];
            zzFD zzfdZzYd = zzym.zzYd();
            double dZzY = zzfdZzYd.zzMe().zzMb().zzY(zzfdZzYd);
            double dZzY2 = zzfdZzYd.zzMe().zzMc().zzY(zzfdZzYd);
            if (i != 0) {
                zzhj.zzZ(dZzY);
            }
            zzym.zzZ(zzhj);
            if (i != this.zzXD.length - 1) {
                zzhj.zzY(dZzY2);
            }
            i++;
        }
    }

    private void zzZ(zzFG zzfg, zzHJ zzhj) throws Exception {
        ArrayList<zzFD> arrayListZzMi = zzfg.zzMi();
        this.zzXD = new zzYM[arrayListZzMi.size()];
        for (int i = 0; i < arrayListZzMi.size(); i++) {
            zzYM zzym = new zzYM(arrayListZzMi.get(i), this.zzXC);
            zzym.zzQ(zzhj.zzM7());
            this.zzXD[i] = zzym;
        }
    }
}
