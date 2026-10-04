package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzID {
    private float zzZhL;
    private com.aspose.words.internal.zzZQ4 zzZij;
    private ArrayList<zzIE> zzZm = new ArrayList<>();

    public zzID(long j) {
        this.zzZij = new com.aspose.words.internal.zzZQ4(j, 0L);
        this.zzZhL = Float.intBitsToFloat((int) j);
    }

    public abstract void zzS(zzIE zzie);

    public abstract com.aspose.words.internal.zzZQ4 zzT(zzIE zzie);

    public abstract zzID zzZ(boolean z, float f);

    public final ArrayList<zzIE> zzZA() {
        return this.zzZm;
    }

    public final float zzZRp() {
        return this.zzZhL;
    }

    public final com.aspose.words.internal.zzZQ4 zzZSh() {
        return this.zzZij;
    }

    public final void zzZZ(com.aspose.words.internal.zzZQ4 zzzq4) {
        this.zzZij = zzzq4;
    }

    public final void zzZv(float f) {
        this.zzZhL = f;
    }

    public final void zzZw(float f) {
        this.zzZhL += f;
        long jZzG = com.aspose.words.internal.zzZPW.zzG(f, 0.0f);
        this.zzZij = new com.aspose.words.internal.zzZQ4(com.aspose.words.internal.zzZPY.zzC(this.zzZij.zzZE(), jZzG), this.zzZij.getSize());
        for (zzIE zzie : this.zzZm) {
            zzie.zzA(com.aspose.words.internal.zzZPY.zzG(Float.intBitsToFloat((int) jZzG) + Float.intBitsToFloat((int) zzie.zzZE()), com.aspose.words.internal.zzZPW.zzYz(jZzG) + com.aspose.words.internal.zzZPY.zzYC(zzie.zzZE())));
        }
    }
}
