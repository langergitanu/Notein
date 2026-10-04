package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZAL extends zzZDB {
    private zzZDD zzWFu;
    private zzZ8C zzWFv;

    private zzZAL(zzZD4 zzzd4) {
        this.zzWFv = zzZ8C.zzXn(zzzd4.zzg6(0));
        this.zzWFu = (zzZDD) zzzd4.zzg6(1);
    }

    public static zzZAL zzYa(Object obj) {
        if (obj instanceof zzZAL) {
            return (zzZAL) obj;
        }
        if (obj != null) {
            return new zzZAL(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZDD zzXJQ() {
        return this.zzWFu;
    }

    public final zzZ8C zzXJR() {
        return this.zzWFv;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWFv);
        zzzdj.zzZ(this.zzWFu);
        return new zzZC2(zzzdj);
    }

    public zzZAL(zzZ80 zzz80) {
        this.zzWFv = zzz80.zzXIh();
        this.zzWFu = zzz80.zzXJQ();
    }
}
