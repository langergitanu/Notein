package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public class zz8 extends zzL {
    private zzZZQ zzZd;
    private zzZQ9 zzZe;
    private zzPV zzZf;
    private String zzZg;
    private String zzZh;
    private String zzZi;
    private String zzZj;

    public zz8(zzZQ4 zzzq4, zzZZQ zzzzq, String str, String str2, String str3, String str4, zzPV zzpv, zzZQ9 zzzq9) {
        super(zzzq4);
        this.zzZd = zzzzq;
        this.zzZj = str;
        this.zzZi = str2;
        this.zzZh = str3;
        this.zzZg = str4;
        this.zzZf = zzpv;
        this.zzZe = zzzq9;
    }

    public final String getId() {
        return this.zzZh;
    }

    public final String getParentId() {
        return this.zzZg;
    }

    public final String getText() {
        return this.zzZi;
    }

    public final String getTitle() {
        return this.zzZj;
    }

    @Override // com.aspose.words.internal.zzL
    public final int getType() {
        return 1;
    }

    @Override // com.aspose.words.internal.zzL
    public final zzL zz0() {
        zz8 zz8Var = new zz8(zzZZ(), this.zzZd, this.zzZj, this.zzZi, this.zzZh, this.zzZg, this.zzZf, this.zzZe);
        zz8Var.zzO(zzZY());
        return zz8Var;
    }

    public final zzZZQ zzZw() {
        return this.zzZd;
    }

    public final zzZQ9 zzZx() {
        return this.zzZe;
    }

    public final zzPV zzZy() {
        return this.zzZf;
    }
}
