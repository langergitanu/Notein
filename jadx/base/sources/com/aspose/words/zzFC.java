package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzFC extends zzCU implements Cloneable {
    public zzFC(zzZCO zzzco) {
        super(zzzco);
    }

    @Override // com.aspose.words.zzCU
    public final Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.zzCU
    public final zzCU zzZMt() {
        zzFC zzfc = (zzFC) memberwiseClone();
        zzY(zzfc);
        return zzfc;
    }
}
