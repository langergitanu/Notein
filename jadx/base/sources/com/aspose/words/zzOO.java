package com.aspose.words;

import com.aspose.words.ref.RefInt;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzOO extends zzOP {
    private zzZCX zzZpT;

    public zzOO(String str, boolean z, zzL4 zzl4, zzZCX zzzcx) {
        super(str, z, zzl4 != null ? new zzMP(zzl4) : null);
        this.zzZpT = zzzcx;
    }

    private zzMP zzY(zzL4 zzl4, boolean z) {
        if (this.zzZpT.zzX(zzl4, z)) {
            return new zzMP(zzl4);
        }
        return null;
    }

    @Override // com.aspose.words.zzOP
    public final zzPT zzZ(zzL2 zzl2, int i, boolean z, boolean z2, RefInt refInt) {
        zzMP zzmpZzY = zzY(zzl2.zzMl(i), z2);
        if (zzmpZzY != null) {
            refInt.set(1);
            return new zzM3(getName(), zzmpZzY, z);
        }
        refInt.set(0);
        return null;
    }

    @Override // com.aspose.words.zzOP
    public final zzMP zzZ(zzL2 zzl2, boolean z) {
        if (zzl2.getCount() == 1) {
            return zzY(zzl2.zzMl(0), z);
        }
        return null;
    }
}
