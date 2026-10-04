package com.aspose.words.internal;

import com.huawei.hms.network.embedded.C18358t1;
import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZG7 extends zzZGC {
    zzZGC zzWN7;

    public zzZG7(zzZGC zzzgc) {
        this.zzWN7 = zzzgc;
    }

    public final String toString() {
        return this.zzWN7.toString() + C18358t1.g.f56183c;
    }

    @Override // com.aspose.words.internal.zzZGC
    public final void zzV(List<zzZG4> list) {
        this.zzWN7.zzV(list);
    }

    @Override // com.aspose.words.internal.zzZGC
    public final boolean zzXOX() {
        return true;
    }

    @Override // com.aspose.words.internal.zzZGC
    public final zzZGC zzXOY() {
        return new zzZG7(this.zzWN7.zzXOY());
    }

    @Override // com.aspose.words.internal.zzZGC
    public final void zzY(BitSet bitSet) {
        this.zzWN7.zzY(bitSet);
    }

    @Override // com.aspose.words.internal.zzZGC
    public final void zzZ(BitSet bitSet) {
        this.zzWN7.zzZ(bitSet);
    }

    @Override // com.aspose.words.internal.zzZGC
    public final void zzZ(BitSet[] bitSetArr) {
        this.zzWN7.zzZ(bitSetArr);
        BitSet bitSet = new BitSet();
        this.zzWN7.zzZ(bitSet);
        BitSet bitSet2 = new BitSet();
        this.zzWN7.zzY(bitSet2);
        int iNextSetBit = 0;
        while (true) {
            iNextSetBit = bitSet2.nextSetBit(iNextSetBit + 1);
            if (iNextSetBit < 0) {
                return;
            } else {
                bitSetArr[iNextSetBit].or(bitSet);
            }
        }
    }
}
