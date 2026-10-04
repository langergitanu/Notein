package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzY0I extends com.aspose.words.internal.zz6 implements com.aspose.words.internal.zzH2 {
    private ArrayList<com.aspose.words.internal.zzZG> zzMM;
    protected boolean zzWUk;
    protected float[] zzWUl;
    protected com.aspose.words.internal.zzZQ4 zzZ3N = com.aspose.words.internal.zzZQ4.zz2T;
    protected com.aspose.words.internal.zzP5[] zzZ3Q;
    private com.aspose.words.internal.zzP5 zzly;
    private com.aspose.words.internal.zzP8 zzqr;

    public abstract long zzXb(long j) throws Exception;

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzY(com.aspose.words.internal.zzP5 zzp5) {
        return true;
    }

    public final com.aspose.words.internal.zzZG[] zzZ(com.aspose.words.internal.zzG zzg, com.aspose.words.internal.zzZQ4 zzzq4, com.aspose.words.internal.zzP5[] zzp5Arr, boolean z) throws Exception {
        this.zzWUk = z;
        this.zzMM = new ArrayList<>();
        this.zzZ3Q = zzp5Arr;
        this.zzZ3N = zzzq4;
        zzZzf();
        zzg.zzZ(this);
        return (com.aspose.words.internal.zzZG[]) this.zzMM.toArray(new com.aspose.words.internal.zzZG[0]);
    }

    public void zzZzf() throws Exception {
        this.zzWUl = new float[this.zzZ3Q.length];
        int i = 0;
        while (true) {
            com.aspose.words.internal.zzP5[] zzp5Arr = this.zzZ3Q;
            if (i >= zzp5Arr.length) {
                return;
            }
            this.zzWUl[i] = com.aspose.words.internal.zzP3.zzT(zzp5Arr[i]);
            i++;
        }
    }

    @Override // com.aspose.words.internal.zz6
    public void zzZ(com.aspose.words.internal.zzZG zzzg) throws Exception {
        this.zzqr = new com.aspose.words.internal.zzP8();
        zzzg.zzZ0().zzY(this);
        com.aspose.words.internal.zzZG zzzg2 = new com.aspose.words.internal.zzZG(this.zzqr);
        zzzg2.zzX(zzzg.zzZ2());
        zzzg2.zzY(zzzg.zzZ1());
        com.aspose.words.internal.zzZQG.zzZ(this.zzMM, zzzg2);
        super.zzZ(zzzg);
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(com.aspose.words.internal.zzP5 zzp5) {
        com.aspose.words.internal.zzP5 zzp52 = new com.aspose.words.internal.zzP5();
        this.zzly = zzp52;
        zzp52.zze(zzp5.isClosed());
        com.aspose.words.internal.zzZQG.zzZ(this.zzqr.zzO7(), this.zzly);
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(com.aspose.words.internal.zzOS zzos) throws Exception {
        com.aspose.words.internal.zzOS zzos2 = new com.aspose.words.internal.zzOS();
        for (int i = 0; i < zzos.zzNu().getCount(); i++) {
            zzos2.zzNu().add(zzXb(zzos.zzNu().get(i)));
        }
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzOS>) this.zzly.zzNY(), zzos2);
        return true;
    }

    @Override // com.aspose.words.internal.zzH2
    public final boolean zzZ(com.aspose.words.internal.zzPZ zzpz) throws Exception {
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzPZ>) this.zzly.zzNY(), new com.aspose.words.internal.zzPZ(zzXb(zzpz.zzPX()), zzXb(zzpz.zzPL()), zzXb(zzpz.zzPK()), zzXb(zzpz.zzPW())));
        return true;
    }
}
