package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY0A extends zzY0B {
    private zzY9X zzWTQ;

    public zzY0A(zzTF zztf, zzY9X zzy9x) {
        super(zztf);
        this.zzWTQ = zzy9x;
    }

    private boolean zzI(zzTC zztc) {
        if (zztc.zz60() != 32) {
            return false;
        }
        zzZ55 zzz55 = (zzZ55) this.zzWTQ.zzZZJ();
        if (zzz55 == null) {
            return true;
        }
        return zztc.zza9() == ((zzYMM) zzz55.zza9()) && zzz55 != zztc;
    }

    @Override // com.aspose.words.zzY0B
    public final boolean zzY(zzY0B zzy0b, zzTC zztc) {
        return super.zzY(zzy0b, zztc) || zzI(zztc);
    }
}
