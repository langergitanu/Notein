package com.aspose.words.internal;

import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZH6 extends zzZGC {
    BitSet zzWON;
    BitSet zzWOO;
    boolean zzWOP;
    final zzZGC[] zzWOQ;

    public zzZH6(zzZGC[] zzzgcArr) {
        boolean z = false;
        this.zzWOP = false;
        this.zzWOQ = zzzgcArr;
        int length = zzzgcArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                break;
            }
            if (zzzgcArr[i].zzXOX()) {
                z = true;
                break;
            }
            i++;
        }
        this.zzWOP = z;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < this.zzWOQ.length; i++) {
            if (i > 0) {
                sb.append(" | ");
            }
            sb.append(this.zzWOQ[i].toString());
        }
        sb.append(')');
        return sb.toString();
    }

    @Override // com.aspose.words.internal.zzZGC
    public final void zzV(List<zzZG4> list) {
        int length = this.zzWOQ.length;
        for (int i = 0; i < length; i++) {
            this.zzWOQ[i].zzV(list);
        }
    }

    @Override // com.aspose.words.internal.zzZGC
    public final boolean zzXOX() {
        return this.zzWOP;
    }

    @Override // com.aspose.words.internal.zzZGC
    public final zzZGC zzXOY() {
        int length = this.zzWOQ.length;
        zzZGC[] zzzgcArr = new zzZGC[length];
        for (int i = 0; i < length; i++) {
            zzzgcArr[i] = this.zzWOQ[i].zzXOY();
        }
        return new zzZH6(zzzgcArr);
    }

    @Override // com.aspose.words.internal.zzZGC
    public final void zzY(BitSet bitSet) {
        if (this.zzWON == null) {
            this.zzWON = new BitSet();
            int length = this.zzWOQ.length;
            for (int i = 0; i < length; i++) {
                this.zzWOQ[i].zzY(this.zzWON);
            }
        }
        bitSet.or(this.zzWON);
    }

    @Override // com.aspose.words.internal.zzZGC
    public final void zzZ(BitSet bitSet) {
        if (this.zzWOO == null) {
            this.zzWOO = new BitSet();
            int length = this.zzWOQ.length;
            for (int i = 0; i < length; i++) {
                this.zzWOQ[i].zzZ(this.zzWOO);
            }
        }
        bitSet.or(this.zzWOO);
    }

    @Override // com.aspose.words.internal.zzZGC
    public final void zzZ(BitSet[] bitSetArr) {
        int length = this.zzWOQ.length;
        for (int i = 0; i < length; i++) {
            this.zzWOQ[i].zzZ(bitSetArr);
        }
    }
}
