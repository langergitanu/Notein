package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzXZN extends zzYU6 {
    private com.aspose.words.internal.zz77 zzYPj;
    private IWarningCallback zzZG0;

    public zzXZN(com.aspose.words.internal.zz77 zz77Var, boolean z, IWarningCallback iWarningCallback) throws Exception {
        super(zz77Var.zzR1(), new com.aspose.words.internal.zzZNI(false), z, false);
        this.zzYPj = zz77Var;
        this.zzZG0 = iWarningCallback;
    }

    private void zzXRv() {
        zzX("mc:Ignorable", "x15 xr xr6 xr10 xr2");
    }

    private void zzZmS() {
        zzX("xmlns:mc", zzXZF.zzZlx());
    }

    private void zzZmT() {
        zzX("xmlns", zzXZF.zzZlD());
        zzX("xmlns:r", zzXZF.zzZlE());
        zzZmS();
        zzX("mc:Ignorable", "x14ac x16r2 xr");
        zzX("xmlns:x14ac", zzXZF.zzXQZ());
        zzX("xmlns:x16r2", zzXZF.zzXR3());
        zzX("xmlns:xr", zzXZF.zzQD());
    }

    public static String zzg(com.aspose.words.internal.zzPV zzpv) {
        return com.aspose.words.internal.zzZKN.format("{0}{1}{2}", com.aspose.words.internal.zzJB.zzWv(zzpv.zzPC()), com.aspose.words.internal.zzJB.zzWv(zzpv.zzPB()), com.aspose.words.internal.zzJB.zzWv(zzpv.zzPA()));
    }

    public final void zzM(String str, double d) {
        zzYz(str, com.aspose.words.internal.zzJB.zzZZ(d));
    }

    public final void zzNU(String str) {
        zzZ(str);
        zzX("xmlns", zzXZF.zzZlD());
        zzX("xmlns:r", zzXZF.zzZlE());
        zzZmS();
        zzXRv();
        zzX("xmlns:x15", zzXZF.zzXR4());
        zzX("xmlns:xr", zzXZF.zzQD());
        zzX("xmlns:xr6", zzXZF.zzXR1());
        zzX("xmlns:xr10", zzXZF.zzXR0());
        zzX("xmlns:xr2", zzXZF.zzXR2());
    }

    public final com.aspose.words.internal.zz77 zzZmN() {
        return this.zzYPj;
    }

    public final void zzZmU() {
        zzZ("styleSheet");
        zzZmT();
    }

    public final void zzZmY() {
        zzZ("Properties");
        zzX("xmlns", "http://schemas.openxmlformats.org/officeDocument/2006/extended-properties");
        zzX("xmlns:vt", "http://schemas.openxmlformats.org/officeDocument/2006/docPropsVTypes");
    }

    @Override // com.aspose.words.zzYU6
    public final void zzw(String str, boolean z) {
        if (z) {
            zzX(str, "1");
        }
    }

    @Override // com.aspose.words.zzYU6
    public final void zzx(String str, boolean z) {
        zzX(str, z ? "1" : "0");
    }

    @Override // com.aspose.words.zzYU6
    public final void zzy(String str, boolean z) {
        if (z) {
            zzZ(str, (String) null);
        } else {
            zzYz(str, "0");
        }
    }

    @Override // com.aspose.words.zzYU6
    public final void zzz(String str, boolean z) {
        zzYz(str, z ? "1" : "0");
    }
}
