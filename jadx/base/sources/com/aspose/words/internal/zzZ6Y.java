package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ6Y extends zzZDB implements zzZ6W {
    private zzZD5 zzWon;
    private zzZDA zzWoo;

    public zzZ6Y(BigInteger bigInteger) {
        this.zzWoo = zzZ6W.zzWok;
        this.zzWon = new zzZDD(bigInteger);
    }

    public static zzZ6Y zzWQ(Object obj) {
        if (obj instanceof zzZ6Y) {
            return (zzZ6Y) obj;
        }
        if (obj != null) {
            return new zzZ6Y(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZDA zzXHq() {
        return this.zzWoo;
    }

    public final zzZD5 zzXHx() {
        return this.zzWon;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWoo);
        zzzdj.zzZ(this.zzWon);
        return new zzZC2(zzzdj);
    }

    public zzZ6Y(int i, int i2) {
        this(i, i2, 0, 0);
    }

    public zzZ6Y(int i, int i2, int i3, int i4) {
        this.zzWoo = zzZ6W.zzWoj;
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(new zzZDD(i));
        if (i3 == 0) {
            if (i4 == 0) {
                zzzdj.zzZ(zzZ6W.zzWoh);
                zzzdj.zzZ(new zzZDD(i2));
            } else {
                throw new IllegalArgumentException("inconsistent k values");
            }
        } else if (i3 > i2 && i4 > i3) {
            zzzdj.zzZ(zzZ6W.zzWog);
            zzZDJ zzzdj2 = new zzZDJ();
            zzzdj2.zzZ(new zzZDD(i2));
            zzzdj2.zzZ(new zzZDD(i3));
            zzzdj2.zzZ(new zzZDD(i4));
            zzzdj.zzZ(new zzZC2(zzzdj2));
        } else {
            throw new IllegalArgumentException("inconsistent k values");
        }
        this.zzWon = new zzZC2(zzzdj);
    }

    private zzZ6Y(zzZD4 zzzd4) {
        this.zzWoo = zzZDA.zzYA(zzzd4.zzg6(0));
        this.zzWon = zzzd4.zzg6(1).zzXL0();
    }
}
