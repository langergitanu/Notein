package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zz3C implements zzZC4, Cloneable {
    private zzJH zzYZM;
    private zzJH zzZ7B;

    public zz3C(zzJH[] zzjhArr) {
        zzJH zzjh = zzjhArr[0];
        this.zzYZM = zzjh == null ? new zzJH() : zzjh;
        zzJH zzjh2 = zzjhArr[1];
        this.zzZ7B = zzjh2 == null ? new zzJH() : zzjh2;
    }

    private Object memberwiseClone() {
        try {
            return clone();
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    @Override // com.aspose.words.zzZC4
    public final void zzZ(zzZYD zzzyd) {
        zzzyd.zzY("a:quadBezTo");
        zzzyd.zzW(this.zzYZM);
        zzzyd.zzW(this.zzZ7B);
        zzzyd.zzo();
    }

    @Override // com.aspose.words.zzZC4
    public final zzZC4 zzZQP() {
        zz3C zz3c = (zz3C) memberwiseClone();
        zzJH zzjh = this.zzYZM;
        if (zzjh != null) {
            zz3c.zzYZM = zzjh.zzZSq();
        }
        zzJH zzjh2 = this.zzZ7B;
        if (zzjh2 != null) {
            zz3c.zzZ7B = zzjh2.zzZSq();
        }
        return zz3c;
    }

    @Override // com.aspose.words.zzZC4
    public final void zzZ(zzZC2 zzzc2, com.aspose.words.internal.zzP5 zzp5) {
        long jZzX = zzzc2.zzX(this.zzYZM);
        long jZzX2 = zzzc2.zzX(this.zzZ7B);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzPZ>) zzp5.zzNY(), new com.aspose.words.internal.zzPZ(zzzc2.zzDs(), jZzX, jZzX2));
        zzzc2.zzXS(jZzX2);
    }
}
