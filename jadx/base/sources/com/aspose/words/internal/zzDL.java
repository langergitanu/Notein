package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzDL extends zzDK {
    private zzE6[] zzv9;
    private int zzva;
    private zzE2 zzvb;
    private zzED zzvp;

    public zzDL(zzE2 zze2, zzED zzed, int i) {
        this.zzvb = zze2;
        this.zzvp = zzed;
        this.zzva = i;
        ArrayList<zzEB> arrayListZzDu = zze2.zzDv().zzDg().zzDu();
        int size = arrayListZzDu.size();
        this.zzv9 = new zzE6[size];
        for (int i2 = 0; i2 < size; i2++) {
            this.zzv9[i2] = arrayListZzDu.get(i2).zzVO(i);
        }
    }

    public final zzE6[] zzD1() {
        return this.zzv9;
    }

    public final int zzD2() {
        return this.zzva;
    }

    public final zzED zzD3() {
        return this.zzvp;
    }

    public final zzE2 zzD4() {
        return this.zzvb;
    }

    @Override // com.aspose.words.internal.zzDK
    public final void zzZ(zzGM zzgm) {
        zzgm.zzZ(this);
    }
}
