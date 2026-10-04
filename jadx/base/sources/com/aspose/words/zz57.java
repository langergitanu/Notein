package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz57 implements zzZC4, Cloneable {
    private zzJH zzZ1L;

    public zz57() {
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
        zzzyd.zzY("a:moveTo");
        zzzyd.zzW(this.zzZ1L);
        zzzyd.zzo();
    }

    @Override // com.aspose.words.zzZC4
    public final zzZC4 zzZQP() {
        zz57 zz57Var = (zz57) memberwiseClone();
        zzJH zzjh = this.zzZ1L;
        if (zzjh != null) {
            zz57Var.zzZ1L = zzjh.zzZSq();
        }
        return zz57Var;
    }

    public zz57(zzJH zzjh) {
        this.zzZ1L = zzjh;
    }

    @Override // com.aspose.words.zzZC4
    public final void zzZ(zzZC2 zzzc2, com.aspose.words.internal.zzP5 zzp5) {
        zzzc2.zzXS(zzzc2.zzX(this.zzZ1L));
    }
}
