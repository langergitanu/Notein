package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzM3 extends zzPT {
    private String mName;

    public zzM3(String str, zzMP zzmp, boolean z) {
        super(zzmp, z);
        com.aspose.words.internal.zzZYD.zzXk(str);
        com.aspose.words.internal.zzZKN.equals(str, com.aspose.words.internal.zzZKN.zzU2(str));
        this.mName = str;
    }

    @Override // com.aspose.words.zzPT
    public final String zzZWo() {
        return this.mName;
    }

    public zzM3(String str, zzMP zzmp) {
        this(str, zzmp, false);
    }

    private zzM3(String str, zzL4 zzl4) {
        this(str, new zzMP(zzl4), false);
    }

    public zzM3(String str, zzL4 zzl4, byte b) {
        this(str, zzl4);
    }
}
