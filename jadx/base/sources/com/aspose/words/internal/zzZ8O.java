package com.aspose.words.internal;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZ8O extends zzZDB {
    private zzZDD zzWFn;
    private zzZDD zzWFu;
    private zzZDF zzWtA;
    private zzZ8P zzWtB;
    private zzZDA zzWtC;
    private zzZ7T zzWtv;
    private zzZ7R zzWtw;
    private zzZDD zzWtx;
    private zzZDM zzWty;
    private zzZ8Q zzWtz;

    private zzZ8O(zzZD4 zzzd4) {
        Enumeration enumerationZzXKE = zzzd4.zzXKE();
        this.zzWFn = zzZDD.zzYB(enumerationZzXKE.nextElement());
        this.zzWtC = zzZDA.zzYA(enumerationZzXKE.nextElement());
        this.zzWtB = zzZ8P.zzXx(enumerationZzXKE.nextElement());
        this.zzWFu = zzZDD.zzYB(enumerationZzXKE.nextElement());
        this.zzWtA = zzZDF.zzYC(enumerationZzXKE.nextElement());
        this.zzWty = zzZDM.zzOQ(false);
        while (enumerationZzXKE.hasMoreElements()) {
            zzZDB zzzdb = (zzZDB) enumerationZzXKE.nextElement();
            if (zzzdb instanceof zzZCY) {
                zzZCY zzzcy = (zzZCY) zzzdb;
                int iZzXKy = zzzcy.zzXKy();
                if (iZzXKy == 0) {
                    this.zzWtw = zzZ7R.zzX9(zzZCY.zzX(zzzcy));
                } else {
                    if (iZzXKy != 1) {
                        throw new IllegalArgumentException("Unknown tag value " + zzzcy.zzXKy());
                    }
                    this.zzWtv = zzZ7T.zzR(zzzcy);
                }
            } else if ((zzzdb instanceof zzZD4) || (zzzdb instanceof zzZ8Q)) {
                this.zzWtz = zzZ8Q.zzXy(zzzdb);
            } else if (zzzdb instanceof zzZDM) {
                this.zzWty = zzZDM.zzYE(zzzdb);
            } else if (zzzdb instanceof zzZDD) {
                this.zzWtx = zzZDD.zzYB(zzzdb);
            }
        }
    }

    public static zzZ8O zzXw(Object obj) {
        if (obj instanceof zzZ8O) {
            return (zzZ8O) obj;
        }
        if (obj != null) {
            return new zzZ8O(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZDD zzXIJ() {
        return this.zzWtx;
    }

    public final zzZDF zzXIK() {
        return this.zzWtA;
    }

    public final zzZDA zzXIL() {
        return this.zzWtC;
    }

    public final zzZ8P zzXIM() {
        return this.zzWtB;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWFn);
        zzzdj.zzZ(this.zzWtC);
        zzzdj.zzZ(this.zzWtB);
        zzzdj.zzZ(this.zzWFu);
        zzzdj.zzZ(this.zzWtA);
        zzZ8Q zzz8q = this.zzWtz;
        if (zzz8q != null) {
            zzzdj.zzZ(zzz8q);
        }
        zzZDM zzzdm = this.zzWty;
        if (zzzdm != null && zzzdm.zzXL1()) {
            zzzdj.zzZ(this.zzWty);
        }
        zzZDD zzzdd = this.zzWtx;
        if (zzzdd != null) {
            zzzdj.zzZ(zzzdd);
        }
        zzZ7R zzz7r = this.zzWtw;
        if (zzz7r != null) {
            zzzdj.zzZ(new zzZBX(true, 0, zzz7r));
        }
        zzZ7T zzz7t = this.zzWtv;
        if (zzz7t != null) {
            zzzdj.zzZ(new zzZBX(false, 1, zzz7t));
        }
        return new zzZC2(zzzdj);
    }
}
