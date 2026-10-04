package com.aspose.words.internal;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ99 extends zzZDB implements zzZ96 {
    private zzZ9D zzWyG;
    private zzZ9C zzWyH;

    public zzZ99(zzZ9C zzz9c, zzZ9D zzz9d) {
        this.zzWyH = zzz9c;
        this.zzWyG = zzz9d;
    }

    public static zzZ99 zzXK(Object obj) {
        if (obj instanceof zzZ99) {
            return (zzZ99) obj;
        }
        if (obj != null) {
            return new zzZ99(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZ9D zzXJf() {
        return this.zzWyG;
    }

    public final zzZ9C zzXJg() {
        return this.zzWyH;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWyH);
        zzzdj.zzZ(this.zzWyG);
        return new zzZC2(zzzdj);
    }

    private zzZ99(zzZD4 zzzd4) {
        Enumeration enumerationZzXKE = zzzd4.zzXKE();
        zzZD4 zzzd4ZzYy = zzZD4.zzYy(((zzZDK) enumerationZzXKE.nextElement()).zzXL0());
        zzZDK zzzdkZzg6 = zzzd4ZzYy.zzg6(0);
        zzZDA zzzda = zzZ96.zzWyb;
        if (zzzdkZzg6.equals(zzzda)) {
            this.zzWyH = new zzZ9C(zzzda, zzZ98.zzXJ(zzzd4ZzYy.zzg6(1)));
        } else {
            this.zzWyH = zzZ9C.zzXN(zzzd4ZzYy);
        }
        this.zzWyG = zzZ9D.zzXO(enumerationZzXKE.nextElement());
    }
}
