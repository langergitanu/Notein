package com.aspose.words.internal;

import java.text.MessageFormat;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZGH {
    private String mValue = null;
    private zzZ zzWNF = null;
    final int zzWNG;
    static final zzZGH zzWNI = new zzZGH(2);
    static final zzZGH zzWNH = new zzZGH(3);

    public static final class zzZ {
        final String mName;
        final boolean zzWNE;
        final zzZQY zzWOA;

        public zzZ(String str, zzZQY zzzqy, boolean z) {
            this.mName = str;
            this.zzWNE = z;
            this.zzWOA = zzzqy;
        }

        public final void zzY(zzYFC zzyfc, zzYF6 zzyf6) throws zzZQS {
            zzYF8 zzyf8 = new zzYF8(this.zzWOA, MessageFormat.format(zzZH9.zzWPe, this.zzWNE ? "parsed" : "general", this.mName), 3);
            zzyf8.zzY(zzyf6);
            zzyfc.zzY(zzyf8);
        }
    }

    private zzZGH(int i) {
        this.zzWNG = i;
    }

    public static zzZGH zzXOp() {
        return new zzZGH(1);
    }

    public static zzZGH zzXOq() {
        return new zzZGH(4);
    }

    public static zzZGH zzXOr() {
        return zzWNH;
    }

    public static zzZGH zzXOs() {
        return zzWNI;
    }

    private void zzZ(String str, zzZQY zzzqy, boolean z) {
        if (this.zzWNF == null) {
            this.zzWNF = new zzZ(str, zzzqy, z);
        }
    }

    public final String getValue() {
        return this.mValue;
    }

    public final boolean isFixed() {
        return this.zzWNG == 4;
    }

    public final void setValue(String str) {
        this.mValue = str;
    }

    public final void zzW(String str, zzZQY zzzqy) {
        zzZ(str, zzzqy, false);
    }

    public final void zzX(String str, zzZQY zzzqy) {
        zzZ(str, zzzqy, true);
    }

    public final boolean zzXOP() {
        int i = this.zzWNG;
        return i == 1 || i == 4;
    }

    public final boolean zzXOQ() {
        return this != zzWNI;
    }

    public final boolean zzXOR() {
        return this == zzWNH;
    }

    public final String zzXOo() {
        if (this.zzWNF == null) {
            return this.mValue;
        }
        return null;
    }

    public final void zzY(zzYFC zzyfc, zzYF6 zzyf6) throws zzZQS {
        this.zzWNF.zzY(zzyfc, zzyf6);
    }
}
