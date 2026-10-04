package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZVN extends com.aspose.words.internal.zzQA {
    private int zzYMk;
    private float zzYMl;
    private zzZBQ zzYMm;
    private com.aspose.words.internal.zzQB zzYMn;
    private com.aspose.words.internal.zzQB zzYMo;
    private ArrayList<com.aspose.words.internal.zzP5> zzYMp;
    private com.aspose.words.internal.zz0Q zzYMq;
    private com.aspose.words.internal.zzQG[] zzYMr;
    private com.aspose.words.internal.zzZG[] zzYMs;
    private ArrayList<com.aspose.words.internal.zzZL> zzYMt;
    private com.aspose.words.internal.zzQB zzZFq;
    private float zzp6;
    private com.aspose.words.internal.zzZQ4 zzYME = com.aspose.words.internal.zzZQ4.zz2T;
    private com.aspose.words.internal.zzH zzZdO = new com.aspose.words.internal.zzH();

    public zzZVN(com.aspose.words.internal.zzQB zzqb, com.aspose.words.internal.zzQB zzqb2, float f, float f2, zzZBQ zzzbq) {
        this.zzYMo = zzqb;
        this.zzZFq = zzqb2;
        this.zzYMm = zzzbq;
        this.zzYMl = f;
        this.zzp6 = f2;
    }

    @Override // com.aspose.words.internal.zzQA
    public final void zzQd() throws Exception {
        int i = 0;
        while (true) {
            com.aspose.words.internal.zzZG[] zzzgArr = this.zzYMs;
            if (i >= zzzgArr.length) {
                ArrayList<com.aspose.words.internal.zzZL> arrayList = new ArrayList<>(this.zzYMs.length);
                this.zzYMt = arrayList;
                com.aspose.words.internal.zzZQG.zzZ((ArrayList) arrayList, (Object[]) this.zzYMs);
                this.zzYMs = null;
                return;
            }
            zzzgArr[i] = this.zzYMm.zzZ(zzzgArr[i], this.zzYMr[i], this.zzYMn, this.zzYME);
            i++;
        }
    }

    @Override // com.aspose.words.internal.zzQA
    public final void zzX(com.aspose.words.internal.zzQG zzqg) throws Exception {
        com.aspose.words.internal.zzZG zzzg = new com.aspose.words.internal.zzZG();
        com.aspose.words.internal.zzZQG.zzZ((ArrayList) zzzg.zzZ0().zzO7(), (Iterable) this.zzYMp);
        com.aspose.words.internal.zzZG[] zzzgArr = this.zzYMs;
        int i = this.zzYMk;
        zzzgArr[i] = zzzg;
        this.zzYMr[i] = zzqg;
        if (com.aspose.words.internal.zzQE.zzYe(zzqg.getType())) {
            com.aspose.words.internal.zzZQ4 zzzq4ZzZ = this.zzZdO.zzZ((com.aspose.words.internal.zzZL) zzzg);
            if (!com.aspose.words.internal.zzZQ4.zzV(this.zzYME, com.aspose.words.internal.zzZQ4.zz2T)) {
                zzzq4ZzZ = com.aspose.words.internal.zzZQ4.zzT(this.zzYME, zzzq4ZzZ);
            }
            this.zzYME = zzzq4ZzZ;
        }
        this.zzYMk++;
    }

    @Override // com.aspose.words.internal.zzQA
    public final void zzY(com.aspose.words.internal.zzQG zzqg) throws Exception {
        this.zzYMp = new ArrayList<>();
    }

    @Override // com.aspose.words.internal.zzQA
    public final void zzZ(com.aspose.words.internal.zzQ8 zzq8) throws Exception {
        this.zzYMs = new com.aspose.words.internal.zzZG[zzq8.getCount()];
        this.zzYMn = new com.aspose.words.internal.zzQB();
        this.zzYMr = new com.aspose.words.internal.zzQG[zzq8.getCount()];
        this.zzYME = new com.aspose.words.internal.zzZQ4();
        com.aspose.words.internal.zzQB zzqb = this.zzZFq;
        if (zzqb != null) {
            this.zzYMn.zzY(zzqb);
        }
        this.zzYMn.zzY(this.zzYMo);
        this.zzYMk = 0;
    }

    public final ArrayList<com.aspose.words.internal.zzZL> zzZjV() {
        return this.zzYMt;
    }

    @Override // com.aspose.words.internal.zzQA
    public final void zzY(com.aspose.words.internal.zzQD zzqd) throws Exception {
        com.aspose.words.internal.zzZQG.zzZ(this.zzYMp, com.aspose.words.internal.zzP5.zzX(this.zzYMq, false, zzqd.isClosed()));
        this.zzYMq = null;
    }

    @Override // com.aspose.words.internal.zzQA
    public final void zzZ(com.aspose.words.internal.zzQD zzqd) throws Exception {
        this.zzYMq = new com.aspose.words.internal.zz0Q();
    }

    @Override // com.aspose.words.internal.zzQA
    public final void zzX(com.aspose.words.internal.zzQ9 zzq9) throws Exception {
        com.aspose.words.internal.zzQ9 zzq9ZzY = this.zzYMo.zzY(zzq9);
        this.zzYMq.add(com.aspose.words.internal.zzZPY.zzG(((float) zzq9ZzY.zzQb()) + this.zzYMl, ((float) zzq9ZzY.zzYm()) + this.zzp6));
    }
}
