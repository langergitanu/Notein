package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzBD extends zzBG {
    private zzBI zzZQ;
    private String zzsC;
    private int zzsD;

    public zzBD(int i, zzBI zzbi, String str) {
        this.zzsD = i;
        this.zzZQ = zzbi;
        this.zzsC = str;
    }

    public final String zzBC() {
        return this.zzsC;
    }

    public final int zzBD() {
        return this.zzsD;
    }

    @Override // com.aspose.words.internal.zzBG, com.aspose.words.internal.zzGH
    public final void zzZ(zzAX zzax) {
        zzax.zzZ(this);
        super.zzZ(zzax);
        zzax.zzBt();
    }

    public final zzBI zzZV() {
        return this.zzZQ;
    }
}
