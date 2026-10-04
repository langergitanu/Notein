package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
abstract class zzYNY {
    private com.aspose.words.internal.zz79 zz5y;
    private boolean zzXIq;

    public zzYNY(com.aspose.words.internal.zz79 zz79Var, boolean z) {
        this.zz5y = zz79Var;
        this.zzXIq = z;
    }

    private static com.aspose.words.internal.zz77 zzZ(com.aspose.words.internal.zz79 zz79Var, String str, String str2) throws Exception {
        com.aspose.words.internal.zz77 zz77VarZzZ = zz79Var.zzZ((com.aspose.words.internal.zz77) null, str2);
        return zz77VarZzZ == null ? zz79Var.zzZ(null, str, "application/vnd.openxmlformats-package.digital-signature-origin", str2) : zz77VarZzZ;
    }

    public abstract boolean zzR(com.aspose.words.internal.zz77 zz77Var);

    public abstract String zzY(com.aspose.words.internal.zz79 zz79Var);

    public final void zzY(DigitalSignature digitalSignature) throws Exception {
        zzYJU zzyju = new zzYJU(new zzYNZ(this.zz5y));
        zzZ(this.zz5y, (com.aspose.words.internal.zz77) null, zzyju);
        for (com.aspose.words.internal.zz77 zz77Var : this.zz5y.zzxo()) {
            if (!zzR(zz77Var) && !"application/vnd.openxmlformats-package.relationships+xml".equals(zz77Var.getContentType())) {
                if (zz77Var.zzxn().getCount() > 0) {
                    zzZ(this.zz5y, zz77Var, zzyju);
                }
                zzyju.zzY(new zzYJW(zz77Var.getName(), zz77Var.getContentType()));
            }
        }
        com.aspose.words.internal.zz77 zz77VarZzZ = this.zz5y.zzZ(zzZ(this.zz5y, zzYqT(), "http://schemas.openxmlformats.org/package/2006/relationships/digital-signature/origin"), zzZ(this.zz5y), "application/vnd.openxmlformats-package.digital-signature-xmlsignature+xml", "http://schemas.openxmlformats.org/package/2006/relationships/digital-signature/signature");
        com.aspose.words.internal.zzZOR zzzorZzZ = zzZ(zzyju, digitalSignature);
        zzzorZzZ.zzH(0L);
        com.aspose.words.internal.zzZYQ.zzX(zzzorZzZ, zz77VarZzZ.zzR1());
        if (!this.zzXIq) {
            com.aspose.words.internal.zz77 zz77VarZzZ2 = this.zz5y.zzZ(zz77VarZzZ, zzY(this.zz5y), "application/vnd.openxmlformats-package.digital-signature-certificate", "http://schemas.openxmlformats.org/package/2006/relationships/digital-signature/certificate");
            byte[] bArrZzW = com.aspose.words.internal.zzS1.zzW(digitalSignature.zzZSz());
            zz77VarZzZ2.zzR1().write(bArrZzW, 0, bArrZzW.length);
        }
        this.zz5y.zzxr();
    }

    public abstract String zzYqT();

    public abstract com.aspose.words.internal.zzZOR zzZ(zzYJU zzyju, DigitalSignature digitalSignature) throws Exception;

    public abstract String zzZ(com.aspose.words.internal.zz79 zz79Var);

    public abstract void zzZ(com.aspose.words.internal.zz79 zz79Var, com.aspose.words.internal.zz77 zz77Var, zzYJU zzyju);
}
