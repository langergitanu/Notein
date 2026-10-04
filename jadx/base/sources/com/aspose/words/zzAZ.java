package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzAZ implements zzZC4, Cloneable {
    private zzJH zzZ7B;
    private zzJH zzZ7C;
    private zzJH zzZ7D;

    public zzAZ(zzJH[] zzjhArr) {
        zzJH zzjh = zzjhArr[0];
        this.zzZ7D = zzjh == null ? new zzJH() : zzjh;
        zzJH zzjh2 = zzjhArr[1];
        this.zzZ7C = zzjh2 == null ? new zzJH() : zzjh2;
        zzJH zzjh3 = zzjhArr[2];
        this.zzZ7B = zzjh3 == null ? new zzJH() : zzjh3;
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
        zzzyd.zzY("a:cubicBezTo");
        zzzyd.zzW(this.zzZ7D);
        zzzyd.zzW(this.zzZ7C);
        zzzyd.zzW(this.zzZ7B);
        zzzyd.zzo();
    }

    @Override // com.aspose.words.zzZC4
    public final zzZC4 zzZQP() {
        zzAZ zzaz = (zzAZ) memberwiseClone();
        zzJH zzjh = this.zzZ7D;
        if (zzjh != null) {
            zzaz.zzZ7D = zzjh.zzZSq();
        }
        zzJH zzjh2 = this.zzZ7C;
        if (zzjh2 != null) {
            zzaz.zzZ7C = zzjh2.zzZSq();
        }
        zzJH zzjh3 = this.zzZ7B;
        if (zzjh3 != null) {
            zzaz.zzZ7B = zzjh3.zzZSq();
        }
        return zzaz;
    }

    @Override // com.aspose.words.zzZC4
    public final void zzZ(zzZC2 zzzc2, com.aspose.words.internal.zzP5 zzp5) {
        long jZzX = zzzc2.zzX(this.zzZ7D);
        long jZzX2 = zzzc2.zzX(this.zzZ7C);
        long jZzX3 = zzzc2.zzX(this.zzZ7B);
        com.aspose.words.internal.zzZQG.zzZ((ArrayList<com.aspose.words.internal.zzPZ>) zzp5.zzNY(), new com.aspose.words.internal.zzPZ(zzzc2.zzDs(), jZzX, jZzX2, jZzX3));
        zzzc2.zzXS(jZzX3);
    }
}
