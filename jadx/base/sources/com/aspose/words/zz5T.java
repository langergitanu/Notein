package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz5T implements zzZC4, Cloneable {
    private zzJH zzZ1L;

    public zz5T() {
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    public final void zzY(zzJH zzjh) {
        this.zzZ1L = zzjh;
    }

    @Override // com.aspose.words.zzZC4
    public final void zzZ(zzZYD zzzyd) {
        zzzyd.zzY("a:lnTo");
        zzzyd.zzW(this.zzZ1L);
        zzzyd.zzo();
    }

    @Override // com.aspose.words.zzZC4
    public final zzZC4 zzZQP() {
        zz5T zz5t = (zz5T) memberwiseClone();
        zzJH zzjh = this.zzZ1L;
        if (zzjh != null) {
            zz5t.zzZ1L = zzjh.zzZSq();
        }
        return zz5t;
    }

    public zz5T(zzJH zzjh) {
        this.zzZ1L = zzjh;
    }

    @Override // com.aspose.words.zzZC4
    public final void zzZ(zzZC2 zzzc2, com.aspose.words.internal.zzP5 zzp5) {
        long jZzX = zzzc2.zzX(this.zzZ1L);
        zzp5.zzR(zzzc2.zzDs(), jZzX);
        zzzc2.zzXS(jZzX);
    }
}
