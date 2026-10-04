package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzC4 implements zzZC4, Cloneable {
    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.zzZC4
    public final void zzZ(zzZC2 zzzc2, com.aspose.words.internal.zzP5 zzp5) {
        zzp5.zze(true);
    }

    @Override // com.aspose.words.zzZC4
    public final zzZC4 zzZQP() {
        return (zzC4) memberwiseClone();
    }

    @Override // com.aspose.words.zzZC4
    public final void zzZ(zzZYD zzzyd) {
        zzzyd.zzZ("a:close", (String) null);
    }
}
