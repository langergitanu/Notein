package com.aspose.words;

import com.aspose.words.ref.RefInt;

/* JADX INFO: loaded from: classes6.dex */
final class zzM0 extends zzOP {
    public zzM0() {
        super("stroke-dasharray", true, zzPU.zzZqr);
    }

    @Override // com.aspose.words.zzOP
    public final zzMP zzZ(zzL2 zzl2, boolean z) {
        if (zzl2.getCount() == 1 && zzl2.zzMl(0).zzP(zzL4.zzZno)) {
            return zzPU.zzZqr;
        }
        if (zzl2.getCount() <= 0) {
            return null;
        }
        zzL2 zzl22 = new zzL2();
        for (zzL4 zzl4 : zzl2) {
            if (zzl4.getValueType() != 3 && zzl4.getValueType() != 4 && zzl4.getValueType() != 5 && zzl4.getValueType() != 7) {
                return null;
            }
            if (zzl4.getValueType() != 7) {
                zzl22.zzI(zzl4);
            }
        }
        return new zzPU(zzl22);
    }

    @Override // com.aspose.words.zzOP
    public final zzPT zzZ(zzL2 zzl2, int i, boolean z, boolean z2, RefInt refInt) {
        refInt.set(0);
        return null;
    }
}
