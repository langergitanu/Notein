package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zz0P extends zz47 {
    private com.aspose.words.internal.zzZOZ zzYXy = com.aspose.words.internal.zzZOZ.zzZXP;
    private zz49 zzZ0H;
    private String zzZi;
    private String zzmP;

    public final String getText() {
        if (this.zzZi == null) {
            this.zzZi = "";
        }
        return this.zzZi;
    }

    public final String getType() {
        if (this.zzmP == null) {
            this.zzmP = "";
        }
        return this.zzmP;
    }

    public final void setText(String str) {
        this.zzZi = str;
    }

    public final void zzN(com.aspose.words.internal.zzZOZ zzzoz) {
        this.zzYXy = zzzoz;
    }

    public final void zzPy(String str) {
        this.zzmP = str;
    }

    public final com.aspose.words.internal.zzZOZ zzZsX() {
        return this.zzYXy;
    }

    public final zz49 zzZsY() {
        if (this.zzZ0H == null) {
            this.zzZ0H = new zz49();
        }
        return this.zzZ0H;
    }

    @Override // com.aspose.words.zz47
    public final zz47 zzZx7() {
        zz0P zz0p = (zz0P) super.zzZx7();
        zz49 zz49Var = this.zzZ0H;
        if (zz49Var != null) {
            zz0p.zzZ0H = zz49Var.zzZxm();
        }
        return zz0p;
    }
}
