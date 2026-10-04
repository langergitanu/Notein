package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY4U implements zzZ8R {
    static boolean zzZD5 = false;
    int zzX1Z;
    int zzX20;
    int zzX21;
    boolean zzX22;
    int zzX23;
    int zzYuX;

    public zzY4U() {
    }

    @Override // com.aspose.words.zzZ8R
    public final void zzZ(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        zzzow.zzl(this.zzYuX);
        zzzow.zzl(this.zzX23);
        zzzow.zzK(this.zzX22 ? (short) 1 : (short) 0);
        zzzow.zzl(this.zzX21);
        zzzow.zzl(this.zzX20);
        zzzow.zzl(this.zzX1Z);
    }

    public zzY4U(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        this.zzYuX = zzzox.zzXc();
        this.zzX23 = zzzox.zzXc();
        this.zzX22 = zzzox.zzXa() != 0;
        this.zzX21 = zzzox.zzXc();
        this.zzX20 = zzzox.zzXc();
        this.zzX1Z = zzzox.zzXc();
        if (zzZD5) {
            com.aspose.words.internal.zzZKN.format("Txbx: cTxbx:{0}, cReusable:{1}, fReusable:{2}, reserved:{3}, lid:{4} x{4:X}, txidUndo:{5}", Integer.valueOf(this.zzYuX), Integer.valueOf(this.zzX23), Boolean.valueOf(this.zzX22), Integer.valueOf(this.zzX21), Integer.valueOf(this.zzX20), Integer.valueOf(this.zzX1Z));
        }
    }
}
