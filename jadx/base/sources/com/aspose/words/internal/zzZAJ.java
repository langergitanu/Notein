package com.aspose.words.internal;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZAJ extends zzZDB {
    private boolean zzWFg;
    private boolean zzWFh;
    private zzZD2 zzWFi;
    private zzZD2 zzWFj;
    private zzZD2 zzWFk;
    private zzZAP zzWFl;
    private zzZD2 zzWFm;
    private zzZDD zzWFn;
    private static final zzZDD zzWFr = new zzZDD(1);
    private static final zzZDD zzWFq = new zzZDD(3);
    private static final zzZDD zzWFp = new zzZDD(4);
    private static final zzZDD zzWFo = new zzZDD(5);

    public zzZAJ(zzZD2 zzzd2, zzZAP zzzap, zzZD2 zzzd22, zzZD2 zzzd23, zzZD2 zzzd24) {
        this.zzWFn = zzZ(zzzap.zzXJW(), zzzd22, zzzd23, zzzd24);
        this.zzWFm = zzzd2;
        this.zzWFl = zzzap;
        this.zzWFk = zzzd22;
        this.zzWFj = zzzd23;
        this.zzWFi = zzzd24;
        this.zzWFg = zzzd23 instanceof zzZCN;
        this.zzWFh = zzzd22 instanceof zzZCN;
    }

    public static zzZAJ zzY8(Object obj) {
        if (obj instanceof zzZAJ) {
            return (zzZAJ) obj;
        }
        if (obj != null) {
            return new zzZAJ(zzZD4.zzYy(obj));
        }
        return null;
    }

    private static zzZDD zzZ(zzZDA zzzda, zzZD2 zzzd2, zzZD2 zzzd22, zzZD2 zzzd23) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4 = false;
        if (zzzd2 != null) {
            Enumeration enumerationZzXKE = zzzd2.zzXKE();
            z = false;
            z2 = false;
            z3 = false;
            while (enumerationZzXKE.hasMoreElements()) {
                Object objNextElement = enumerationZzXKE.nextElement();
                if (objNextElement instanceof zzZCY) {
                    zzZCY zzzcyZzYw = zzZCY.zzYw(objNextElement);
                    if (zzzcyZzYw.zzXKy() == 1) {
                        z2 = true;
                    } else if (zzzcyZzYw.zzXKy() == 2) {
                        z3 = true;
                    } else if (zzzcyZzYw.zzXKy() == 3) {
                        z = true;
                    }
                }
            }
        } else {
            z = false;
            z2 = false;
            z3 = false;
        }
        if (z) {
            return new zzZDD(5L);
        }
        if (zzzd22 != null) {
            Enumeration enumerationZzXKE2 = zzzd22.zzXKE();
            while (enumerationZzXKE2.hasMoreElements()) {
                if (enumerationZzXKE2.nextElement() instanceof zzZCY) {
                    z4 = true;
                }
            }
        }
        return z4 ? zzWFo : z3 ? zzWFp : z2 ? zzWFq : zzZ(zzzd23) ? zzWFq : !zzZAQ.zzWFM.equals(zzzda) ? zzWFq : zzWFr;
    }

    public final zzZD2 zzXJM() {
        return this.zzWFi;
    }

    public final zzZAP zzXJN() {
        return this.zzWFl;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWFn);
        zzzdj.zzZ(this.zzWFm);
        zzzdj.zzZ(this.zzWFl);
        zzZD2 zzzd2 = this.zzWFk;
        if (zzzd2 != null) {
            if (this.zzWFh) {
                zzzdj.zzZ(new zzZCL(false, 0, zzzd2));
            } else {
                zzzdj.zzZ(new zzZBX(false, 0, zzzd2));
            }
        }
        zzZD2 zzzd22 = this.zzWFj;
        if (zzzd22 != null) {
            if (this.zzWFg) {
                zzzdj.zzZ(new zzZCL(false, 1, zzzd22));
            } else {
                zzzdj.zzZ(new zzZBX(false, 1, zzzd22));
            }
        }
        zzzdj.zzZ(this.zzWFi);
        return new zzZCP(zzzdj);
    }

    private zzZAJ(zzZD4 zzzd4) {
        Enumeration enumerationZzXKE = zzzd4.zzXKE();
        this.zzWFn = zzZDD.zzYB(enumerationZzXKE.nextElement());
        this.zzWFm = (zzZD2) enumerationZzXKE.nextElement();
        this.zzWFl = zzZAP.zzYd(enumerationZzXKE.nextElement());
        while (enumerationZzXKE.hasMoreElements()) {
            zzZD5 zzzd5 = (zzZD5) enumerationZzXKE.nextElement();
            if (zzzd5 instanceof zzZCY) {
                zzZCY zzzcy = (zzZCY) zzzd5;
                int iZzXKy = zzzcy.zzXKy();
                if (iZzXKy == 0) {
                    this.zzWFh = zzzcy instanceof zzZCL;
                    this.zzWFk = zzZD2.zzW(zzzcy, false);
                } else if (iZzXKy == 1) {
                    this.zzWFg = zzzcy instanceof zzZCL;
                    this.zzWFj = zzZD2.zzW(zzzcy, false);
                } else {
                    throw new IllegalArgumentException("unknown tag value " + zzzcy.zzXKy());
                }
            } else {
                this.zzWFi = (zzZD2) zzzd5;
            }
        }
    }

    private static boolean zzZ(zzZD2 zzzd2) {
        Enumeration enumerationZzXKE = zzzd2.zzXKE();
        while (enumerationZzXKE.hasMoreElements()) {
            if (zzZAG.zzY5(enumerationZzXKE.nextElement()).zzXJE().zzXKZ().intValue() == 3) {
                return true;
            }
        }
        return false;
    }
}
