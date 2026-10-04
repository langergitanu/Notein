package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz3E extends zz33 {
    private int[] zzkp;

    public zz3E(zz4W zz4w) {
        super(zz4w);
    }

    public final void zzU(int[] iArr) {
        this.zzkp = iArr;
    }

    @Override // com.aspose.words.internal.zz33
    public final void zzZ(zzFY zzfy) throws Exception {
        zzfy.writeIntArray(this.zzkp);
    }
}
