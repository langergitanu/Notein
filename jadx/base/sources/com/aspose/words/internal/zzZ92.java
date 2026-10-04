package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ92 extends zzZDB {
    public static final zzZ86 zzWwg;
    public static final zzZ86 zzWwh;
    public static final zzZ86 zzWwi;
    private zzZ86 zzWDP;
    private zzZ86 zzWwj;
    private zzZ86 zzWwk;

    static {
        zzZ86 zzz86 = new zzZ86(zzZ9K.zzWyW, zzZC8.zzWHS);
        zzWwi = zzz86;
        zzWwh = new zzZ86(zzZ96.zzWyu, zzz86);
        zzWwg = new zzZ86(zzZ96.zzWyt, new zzZC6(new byte[0]));
    }

    public zzZ92() {
        this.zzWDP = zzWwi;
        this.zzWwk = zzWwh;
        this.zzWwj = zzWwg;
    }

    public static zzZ92 zzXE(Object obj) {
        if (obj != null) {
            return new zzZ92(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZ86 zzXJ1() {
        return this.zzWwj;
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
        if (!this.zzWwj.equals(zzWwg)) {
            zzzdj.zzZ(new zzZBX(true, 2, this.zzWwj));
        }
        return new zzZC2(zzzdj);
    }

    public zzZ92(zzZ86 zzz86, zzZ86 zzz862, zzZ86 zzz863) {
        this.zzWDP = zzz86;
        this.zzWwk = zzz862;
        this.zzWwj = zzz863;
    }

    private zzZ92(zzZD4 zzzd4) {
        this.zzWDP = zzWwi;
        this.zzWwk = zzWwh;
        this.zzWwj = zzWwg;
        for (int i = 0; i != zzzd4.size(); i++) {
            zzZCY zzzcy = (zzZCY) zzzd4.zzg6(i);
            int iZzXKy = zzzcy.zzXKy();
            if (iZzXKy == 0) {
                this.zzWDP = zzZ86.zzT(zzzcy);
            } else if (iZzXKy == 1) {
                this.zzWwk = zzZ86.zzT(zzzcy);
            } else if (iZzXKy == 2) {
                this.zzWwj = zzZ86.zzT(zzzcy);
            } else {
                throw new IllegalArgumentException("unknown tag");
            }
        }
    }
}
