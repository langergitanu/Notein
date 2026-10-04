package com.aspose.words.internal;

import java.util.BitSet;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZGB extends zzZGC {
    zzZGC zzWN7;

    public zzZGB(zzZGC zzzgc) {
        this.zzWN7 = zzzgc;
    }

    public final String toString() {
        return this.zzWN7 + "[?]";
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
        return new zzZGB(this.zzWN7.zzXOY());
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
    }
}
