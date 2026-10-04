package com.aspose.words;

import com.aspose.words.ref.RefInt;

/* JADX INFO: loaded from: classes6.dex */
final class zzMY extends zzOP {
    public zzMY() {
        super("size", false, zzMX.zzZVJ());
    }

    @Override // com.aspose.words.zzOP
    public final zzPT zzZ(zzL2 zzl2, int i, boolean z, boolean z2, RefInt refInt) {
        refInt.set(0);
        return null;
    }

    @Override // com.aspose.words.zzOP
    public final zzMP zzZ(zzL2 zzl2, boolean z) {
        int count = zzl2.getCount();
        if (count == 1) {
            zzL4 zzl4ZzMl = zzl2.zzMl(0);
            if (zzl4ZzMl.zzP(zzL4.zzZng)) {
                return zzMX.zzZVJ();
            }
            if (zzl4ZzMl.getValueType() == 0) {
                return zzMX.zzZ((zzOT) zzl4ZzMl);
            }
            zzOI zzoiZzZTO = zzl4ZzMl.zzZTO();
            if (zzoiZzZTO != null) {
                return zzMX.zzZ(zzoiZzZTO);
            }
            return null;
        }
        if (count != 2) {
            return null;
        }
        zzL4 zzl4ZzMl2 = zzl2.zzMl(0);
        zzL4 zzl4ZzMl3 = zzl2.zzMl(1);
        if (zzl4ZzMl2.getValueType() == 0 && zzl4ZzMl3.getValueType() == 0) {
            return zzMX.zzZ((zzOT) zzl4ZzMl2, (zzOT) zzl4ZzMl3);
        }
        zzOI zzoiZzZTO2 = zzl4ZzMl2.zzZTO();
        zzOI zzoiZzZTO3 = zzl4ZzMl3.zzZTO();
        if (zzoiZzZTO2 == null || zzoiZzZTO3 == null) {
            return null;
        }
        return zzMX.zzZ(zzoiZzZTO2, zzoiZzZTO3);
    }
}
