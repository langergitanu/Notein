package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZE extends zzYYH {
    private zzZA[] zzZEp;
    private zzYZ[] zzZEq;

    public zzZE(zzYZ[] zzyzArr, zzZA[] zzzaArr, com.aspose.words.internal.zzZO0 zzzo0) {
        super(zzzo0, "href=\"kindle:pos:fid:[0-9A-Z]{4}:off:[0-9A-Z]{10}\"");
        this.zzZEq = zzyzArr;
        this.zzZEp = zzzaArr;
    }

    @Override // com.aspose.words.zzYYH
    public final zzYYJ zzTx(String str) {
        return zzZF.zzZ(str, this.zzZEq, this.zzZEp);
    }
}
