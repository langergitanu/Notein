package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zzZR extends zzL {
    private String zzYK;
    private String zzYL;
    private boolean zzYM;
    private String zzYN;

    public zzZR(zzZQ4 zzzq4, String str, String str2, String str3) {
        super(zzzq4);
        if (zzZVR.zzWw(str)) {
            this.zzYM = true;
            this.zzYL = zzI.zzL(str.substring(1));
        } else {
            this.zzYM = false;
            this.zzYL = str;
        }
        this.zzYK = str2;
        this.zzYN = str3;
    }

    public final String getScreenTip() {
        return this.zzYN;
    }

    public final String getTarget() {
        return this.zzYL;
    }

    @Override // com.aspose.words.internal.zzL
    public final int getType() {
        return 0;
    }

    @Override // com.aspose.words.internal.zzL
    public final zzL zz0() {
        zzZR zzzr = new zzZR(zzZZ(), this.zzYM, this.zzYL, this.zzYK, this.zzYN);
        zzzr.zzO(zzZY());
        return zzzr;
    }

    public final String zzZe() {
        return this.zzYK;
    }

    public final boolean zzZf() {
        return this.zzYM;
    }

    private zzZR(zzZQ4 zzzq4, boolean z, String str, String str2, String str3) {
        super(zzzq4);
        this.zzYM = z;
        this.zzYL = str;
        this.zzYK = str2;
        this.zzYN = str3;
    }
}
