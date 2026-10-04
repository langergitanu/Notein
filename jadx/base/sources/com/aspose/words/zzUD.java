package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzUD extends zzYOE {
    private com.aspose.words.internal.zzZOZ zzOF;
    private String zzZuA;
    private zzVB zzZux;
    private String zzZuy;
    private String zzZuz;

    public zzUD() {
        this.zzOF = com.aspose.words.internal.zzZOZ.zzZXP;
    }

    public static zzUD zzY(com.aspose.words.internal.zzAA zzaa) throws Exception {
        try {
            if (zzaa.containsKey("\u0001CompObj")) {
                return new zzUD(new com.aspose.words.internal.zzZOX(zzaa.zzYu("\u0001CompObj")));
            }
        } catch (Exception unused) {
        }
        return null;
    }

    @Override // com.aspose.words.zzYOE
    public final String getName() {
        return "\u0001CompObj";
    }

    public final String getProgId() {
        return com.aspose.words.internal.zzZYD.zzXk(this.zzZuz) ? this.zzZuz : this.zzZuA;
    }

    public final void setProgId(String str) {
        this.zzZuz = str;
    }

    public final com.aspose.words.internal.zzZOZ zzAC() {
        return this.zzOF;
    }

    public final void zzSW(String str) {
        this.zzZuy = str;
    }

    public final void zzW(com.aspose.words.internal.zzZOZ zzzoz) {
        this.zzOF = zzzoz;
    }

    @Override // com.aspose.words.zzYOE
    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzk(-131071);
        zzzow.zzl(2563);
        zzzow.zzk(-1);
        zzzow.writeBytes(this.zzOF.toByteArray());
        zzYO6.zzV(zzzow, this.zzZuy);
        zzVB zzvb = this.zzZux;
        if (zzvb == null) {
            zzvb = new zzVB("");
        }
        zzvb.zzW(zzzow);
        zzYO6.zzV(zzzow, this.zzZuz);
        zzzow.zzl(1907505652);
        zzzow.zzl(0);
        zzzow.zzl(0);
        zzzow.zzl(0);
    }

    private zzUD(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzOF = com.aspose.words.internal.zzZOZ.zzZXP;
        zzzox.zzXc();
        zzzox.zzXc();
        zzzox.zzn(4);
        this.zzOF = new com.aspose.words.internal.zzZOZ(zzzox.zzn(16));
        this.zzZuy = zzYO6.zzf(zzzox);
        this.zzZux = zzVB.zzY(zzzox, false);
        this.zzZuz = zzYO6.zzf(zzzox);
        if (com.aspose.words.internal.zzZYQ.zzT(zzzox, 4) && zzzox.zzXc() == 1907505652) {
            zzZZR.zzH(zzzox);
            zzVB.zzY(zzzox, true);
            this.zzZuA = zzZZR.zzH(zzzox);
        }
    }

    public final void zzZ(zzVB zzvb) {
        this.zzZux = zzvb;
    }
}
