package com.aspose.words.internal;

import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZG4 extends zzZGC {
    static final zzZG4 zzWN2;
    final zzZDZ zzWN3;
    int zzZpS = -1;

    static {
        zzZG4 zzzg4 = new zzZG4(null);
        zzWN2 = zzzg4;
        zzzg4.zzZpS = 0;
    }

    public zzZG4(zzZDZ zzzdz) {
        this.zzWN3 = zzzdz;
    }

    public static zzZG4 zzXNN() {
        return zzWN2;
    }

    public final String toString() {
        zzZDZ zzzdz = this.zzWN3;
        return zzzdz == null ? "[null]" : zzzdz.toString();
    }

    @Override // com.aspose.words.internal.zzZGC
    public final void zzV(List<zzZG4> list) {
        if (this != zzWN2) {
            this.zzZpS = list.size();
            list.add(this);
        }
    }

    @Override // com.aspose.words.internal.zzZGC
    public final boolean zzXOX() {
        return false;
    }

    @Override // com.aspose.words.internal.zzZGC
    public final zzZGC zzXOY() {
        return new zzZG4(this.zzWN3);
    }

    @Override // com.aspose.words.internal.zzZGC
    public final void zzY(BitSet bitSet) {
        bitSet.set(this.zzZpS);
    }

    @Override // com.aspose.words.internal.zzZGC
    public final void zzZ(BitSet[] bitSetArr) {
    }

    @Override // com.aspose.words.internal.zzZGC
    public final void zzZ(BitSet bitSet) {
        bitSet.set(this.zzZpS);
    }
}
