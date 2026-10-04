package com.aspose.words.internal;

import java.math.BigInteger;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ8Z extends zzZDB {
    public static final zzZDD zzWw3;
    public static final zzZDD zzWw4;
    public static final zzZ86 zzWwh;
    public static final zzZ86 zzWwi;
    private zzZ86 zzWDP;
    private zzZDD zzWw5;
    private zzZDD zzWw6;
    private zzZ86 zzWwk;

    static {
        zzZ86 zzz86 = new zzZ86(zzZ9K.zzWyW, zzZC8.zzWHS);
        zzWwi = zzz86;
        zzWwh = new zzZ86(zzZ96.zzWyu, zzz86);
        zzWw4 = new zzZDD(20L);
        zzWw3 = new zzZDD(1L);
    }

    public zzZ8Z() {
        this.zzWDP = zzWwi;
        this.zzWwk = zzWwh;
        this.zzWw6 = zzWw4;
        this.zzWw5 = zzWw3;
    }

    public static zzZ8Z zzXB(Object obj) {
        if (obj instanceof zzZ8Z) {
            return (zzZ8Z) obj;
        }
        if (obj != null) {
            return new zzZ8Z(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final BigInteger zzXIU() {
        return this.zzWw5.zzXKZ();
    }

    public final BigInteger zzXIV() {
        return this.zzWw6.zzXKZ();
    }

    public final zzZ86 zzXJ2() {
        return this.zzWwk;
    }

    public final zzZ86 zzXJ3() {
        return this.zzWDP;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        if (!this.zzWDP.equals(zzWwi)) {
            zzzdj.zzZ(new zzZBX(true, 0, this.zzWDP));
        }
        if (!this.zzWwk.equals(zzWwh)) {
            zzzdj.zzZ(new zzZBX(true, 1, this.zzWwk));
        }
        if (!this.zzWw6.equals(zzWw4)) {
            zzzdj.zzZ(new zzZBX(true, 2, this.zzWw6));
        }
        if (!this.zzWw5.equals(zzWw3)) {
            zzzdj.zzZ(new zzZBX(true, 3, this.zzWw5));
        }
        return new zzZC2(zzzdj);
    }

    public zzZ8Z(zzZ86 zzz86, zzZ86 zzz862, zzZDD zzzdd, zzZDD zzzdd2) {
        this.zzWDP = zzz86;
        this.zzWwk = zzz862;
        this.zzWw6 = zzzdd;
        this.zzWw5 = zzzdd2;
    }

    private zzZ8Z(zzZD4 zzzd4) {
        this.zzWDP = zzWwi;
        this.zzWwk = zzWwh;
        this.zzWw6 = zzWw4;
        this.zzWw5 = zzWw3;
        for (int i = 0; i != zzzd4.size(); i++) {
            zzZCY zzzcy = (zzZCY) zzzd4.zzg6(i);
            int iZzXKy = zzzcy.zzXKy();
            if (iZzXKy == 0) {
                this.zzWDP = zzZ86.zzT(zzzcy);
            } else if (iZzXKy == 1) {
                this.zzWwk = zzZ86.zzT(zzzcy);
            } else if (iZzXKy == 2) {
                this.zzWw6 = zzZDD.zzZ(zzzcy, true);
            } else if (iZzXKy == 3) {
                this.zzWw5 = zzZDD.zzZ(zzzcy, true);
            } else {
                throw new IllegalArgumentException("unknown tag");
            }
        }
    }
}
