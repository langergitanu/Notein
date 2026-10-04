package com.aspose.words.internal;

import java.util.Enumeration;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZAG extends zzZDB {
    private zzZD2 zzWF4;
    private zzZD9 zzWF5;
    private zzZ86 zzWF6;
    private zzZD2 zzWF7;
    private zzZ86 zzWF8;
    private zzZAH zzWF9;
    private zzZDD zzWFn;

    public zzZAG(zzZAH zzzah, zzZ86 zzz86, zzZD2 zzzd2, zzZ86 zzz862, zzZD9 zzzd9, zzZD2 zzzd22) {
        if (zzzah.zzXJG()) {
            this.zzWFn = new zzZDD(3L);
        } else {
            this.zzWFn = new zzZDD(1L);
        }
        this.zzWF9 = zzzah;
        this.zzWF8 = zzz86;
        this.zzWF7 = zzzd2;
        this.zzWF6 = zzz862;
        this.zzWF5 = zzzd9;
        this.zzWF4 = zzzd22;
    }

    public static zzZAG zzY5(Object obj) throws IllegalArgumentException {
        if (obj instanceof zzZAG) {
            return (zzZAG) obj;
        }
        if (obj != null) {
            return new zzZAG(zzZD4.zzYy(obj));
        }
        return null;
    }

    public final zzZD9 zzXJA() {
        return this.zzWF5;
    }

    public final zzZ86 zzXJB() {
        return this.zzWF8;
    }

    public final zzZD2 zzXJC() {
        return this.zzWF7;
    }

    public final zzZAH zzXJD() {
        return this.zzWF9;
    }

    public final zzZDD zzXJE() {
        return this.zzWFn;
    }

    public final zzZD2 zzXJy() {
        return this.zzWF4;
    }

    public final zzZ86 zzXJz() {
        return this.zzWF6;
    }

    @Override // com.aspose.words.internal.zzZDB, com.aspose.words.internal.zzZDK
    public final zzZD5 zzXL0() {
        zzZDJ zzzdj = new zzZDJ();
        zzzdj.zzZ(this.zzWFn);
        zzzdj.zzZ(this.zzWF9);
        zzzdj.zzZ(this.zzWF8);
        zzZD2 zzzd2 = this.zzWF7;
        if (zzzd2 != null) {
            zzzdj.zzZ(new zzZBX(false, 0, zzzd2));
        }
        zzzdj.zzZ(this.zzWF6);
        zzzdj.zzZ(this.zzWF5);
        zzZD2 zzzd22 = this.zzWF4;
        if (zzzd22 != null) {
            zzzdj.zzZ(new zzZBX(false, 1, zzzd22));
        }
        return new zzZC2(zzzdj);
    }

    private zzZAG(zzZD4 zzzd4) {
        Enumeration enumerationZzXKE = zzzd4.zzXKE();
        this.zzWFn = (zzZDD) enumerationZzXKE.nextElement();
        this.zzWF9 = zzZAH.zzY6(enumerationZzXKE.nextElement());
        this.zzWF8 = zzZ86.zzXm(enumerationZzXKE.nextElement());
        Object objNextElement = enumerationZzXKE.nextElement();
        if (objNextElement instanceof zzZCY) {
            this.zzWF7 = zzZD2.zzW((zzZCY) objNextElement, false);
            this.zzWF6 = zzZ86.zzXm(enumerationZzXKE.nextElement());
        } else {
            this.zzWF7 = null;
            this.zzWF6 = zzZ86.zzXm(objNextElement);
        }
        this.zzWF5 = zzZD9.zzYz(enumerationZzXKE.nextElement());
        if (enumerationZzXKE.hasMoreElements()) {
            this.zzWF4 = zzZD2.zzW((zzZCY) enumerationZzXKE.nextElement(), false);
        } else {
            this.zzWF4 = null;
        }
    }
}
