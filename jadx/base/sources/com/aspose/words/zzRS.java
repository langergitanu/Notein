package com.aspose.words;

import com.aspose.words.ref.RefInt;

/* JADX INFO: loaded from: classes6.dex */
final class zzRS extends zzOP {
    /* JADX WARN: Illegal instructions before constructor call */
    public zzRS() {
        zzMU zzmu = zzL4.zzZnj;
        super("background-position", false, new zzRR(zzmu, zzmu));
    }

    private static boolean zzY(zzL4 zzl4) {
        return zzl4.getValueType() == 4 || zzl4.getValueType() == 5 || zzl4.zzP(zzL4.zzZmY) || zzl4.zzP(zzL4.zzZmF) || zzl4.zzP(zzL4.zzZmX) || zzl4.getValueType() == 3;
    }

    @Override // com.aspose.words.zzOP
    public final zzPT zzYi(boolean z) {
        String name = getName();
        zzOT zzot = zzL4.zzZnn;
        return new zzM3(name, new zzRR(zzot, zzot), z);
    }

    @Override // com.aspose.words.zzOP
    public final zzPT zzZ(zzL2 zzl2, int i, boolean z, boolean z2, RefInt refInt) {
        int i2;
        refInt.set(0);
        zzPT zzptZzX = null;
        if (i >= zzl2.getCount()) {
            return null;
        }
        if (zzZ(zzl2.zzMl(i)) && (i2 = i + 1) < zzl2.getCount() && zzY(zzl2.zzMl(i2)) && (zzptZzX = zzX(new zzL2(zzl2.zzMl(i), zzl2.zzMl(i2)), z, z2)) != null) {
            refInt.set(2);
        }
        if (zzptZzX != null || !zzZ(zzl2.zzMl(i))) {
            return zzptZzX;
        }
        zzPT zzptZzX2 = zzX(new zzL2(zzl2.zzMl(i)), z, z2);
        if (zzptZzX2 != null) {
            refInt.set(1);
        }
        return zzptZzX2;
    }

    @Override // com.aspose.words.zzOP
    public final zzMP zzZ(zzL2 zzl2, boolean z) {
        int count = zzl2.getCount();
        if (count != 1) {
            if (count == 2 && zzZ(zzl2.zzMl(0)) && zzY(zzl2.zzMl(1))) {
                return new zzRR(zzl2.zzMl(0), zzl2.zzMl(1));
            }
            return null;
        }
        if (zzZ(zzl2.zzMl(0))) {
            return new zzRR(zzl2.zzMl(0), zzL4.zzZmF);
        }
        return null;
    }

    private static boolean zzZ(zzL4 zzl4) {
        return zzl4.getValueType() == 4 || zzl4.getValueType() == 5 || zzl4.zzP(zzL4.zzZmH) || zzl4.zzP(zzL4.zzZmF) || zzl4.zzP(zzL4.zzZmG) || zzl4.getValueType() == 3;
    }
}
