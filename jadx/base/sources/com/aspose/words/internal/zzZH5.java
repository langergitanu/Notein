package com.aspose.words.internal;

import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZH5 extends zzZGC {
    zzZGC zzWOL;
    zzZGC zzWOM;
    BitSet zzWON;
    BitSet zzWOO;
    final boolean zzWOP;

    public zzZH5(zzZGC zzzgc, zzZGC zzzgc2) {
        this.zzWOM = zzzgc;
        this.zzWOL = zzzgc2;
        this.zzWOP = zzzgc.zzXOX() && this.zzWOL.zzXOX();
    }

    public final String toString() {
        return "(" + this.zzWOM.toString() + ", " + this.zzWOL.toString() + ')';
    }

    @Override // com.aspose.words.internal.zzZGC
    public final void zzV(List<zzZG4> list) {
        this.zzWOM.zzV(list);
        this.zzWOL.zzV(list);
    }

    @Override // com.aspose.words.internal.zzZGC
    public final boolean zzXOX() {
        return this.zzWOP;
    }

    @Override // com.aspose.words.internal.zzZGC
    public final zzZGC zzXOY() {
        return new zzZH5(this.zzWOM.zzXOY(), this.zzWOL.zzXOY());
    }

    @Override // com.aspose.words.internal.zzZGC
    public final void zzY(BitSet bitSet) {
        if (this.zzWON == null) {
            BitSet bitSet2 = new BitSet();
            this.zzWON = bitSet2;
            this.zzWOL.zzY(bitSet2);
            if (this.zzWOL.zzXOX()) {
                this.zzWOM.zzY(this.zzWON);
            }
        }
        bitSet.or(this.zzWON);
    }

    @Override // com.aspose.words.internal.zzZGC
    public final void zzZ(BitSet bitSet) {
        if (this.zzWOO == null) {
            BitSet bitSet2 = new BitSet();
            this.zzWOO = bitSet2;
            this.zzWOM.zzZ(bitSet2);
            if (this.zzWOM.zzXOX()) {
                this.zzWOL.zzZ(this.zzWOO);
            }
        }
        bitSet.or(this.zzWOO);
    }

    @Override // com.aspose.words.internal.zzZGC
    public final void zzZ(BitSet[] bitSetArr) {
        this.zzWOM.zzZ(bitSetArr);
        this.zzWOL.zzZ(bitSetArr);
        BitSet bitSet = new BitSet();
        this.zzWOL.zzZ(bitSet);
        BitSet bitSet2 = new BitSet();
        this.zzWOM.zzY(bitSet2);
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
