package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzLA extends zzM5 {
    private static zzMA zzZrQ = new zzMA(0, 0, 1);
    private String zzZnu;
    private zzNQ zzZnv;

    public zzLA(zzNQ zznq, String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        com.aspose.words.internal.zzZYD.zzXm(str);
        this.zzZnv = zznq;
        this.zzZnu = str;
    }

    public final zzQ5 zzS9(String str) {
        return new zzQ5(this, zzMD.zzSh(str));
    }

    @Override // com.aspose.words.zzQB
    public final boolean zzZ(zzZBM zzzbm, int i) {
        return com.aspose.words.internal.zzZKN.equals(zzzbm.zzZTQ(), this.zzZnu) && this.zzZnv.matches(zzzbm.zzZ2G());
    }

    public final String zzZTQ() {
        return this.zzZnu;
    }

    @Override // com.aspose.words.zzMD
    public final String zzZXr() {
        return this.zzZnu;
    }

    @Override // com.aspose.words.zzMD
    public final zzMA zzZXs() {
        return zzZrQ;
    }

    @Override // com.aspose.words.zzMD
    public final String zzZXu() {
        return this.zzZnv.zzZx(com.aspose.words.internal.zzS0.zzl(this.zzZnu), zzNQ.zzZpB.getName());
    }
}
