package com.aspose.words;

import OooOoo.C20593OooO0Oo;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzS2 extends zzM5 {
    private static zzMA zzZrQ = new zzMA(0, 1, 0);
    private String mValue;
    private String zzZrP;
    private String zzZrR;
    private zzNQ zzZrS;

    public zzS2(zzNQ zznq, String str, String str2, String str3) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        com.aspose.words.internal.zzZYD.zzXm(str);
        com.aspose.words.internal.zzZYD.zzXk(str2);
        this.zzZrS = zznq;
        this.zzZrR = str;
        this.zzZrP = str2;
        this.mValue = str3;
    }

    public final String getValue() {
        return this.mValue;
    }

    public final String zzZXp() {
        return this.zzZrR;
    }

    public final zzNQ zzZXq() {
        return this.zzZrS;
    }

    @Override // com.aspose.words.zzMD
    public final String zzZXr() {
        if (!com.aspose.words.internal.zzZYD.zzXk(this.zzZrP)) {
            return this.zzZrR;
        }
        return this.zzZrR + this.zzZrP + this.mValue;
    }

    @Override // com.aspose.words.zzMD
    public final zzMA zzZXs() {
        return zzZrQ;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.lang.String] */
    @Override // com.aspose.words.zzMD
    public final String zzZXu() {
        String strZzZx = this.zzZrS.zzZx(com.aspose.words.internal.zzS0.zzl(this.zzZrR), zzNQ.zzZpA.getName());
        if (!com.aspose.words.internal.zzZYD.zzXk(this.zzZrP)) {
            return C20593OooO0Oo.OooO0O0("[", strZzZx, "]");
        }
        com.aspose.words.internal.zzS0.zzn(this.mValue);
        new StringBuilder("[").append(strZzZx);
        String str = this.zzZrP;
        return Class.newInstance();
    }
}
