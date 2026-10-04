package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz5N extends zz5O {
    private zz4R zzkD;

    public zz5N(zz4R zz4r) {
        if (zz4r == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: destination");
        }
        this.zzkD = zz4r;
    }

    @Override // com.aspose.words.internal.zz5O
    public final void zzV(zzFY zzfy) throws Exception {
        zzfy.zzYY("/D");
        zzfy.zzFh();
        this.zzkD.zzW(zzfy);
    }

    @Override // com.aspose.words.internal.zz5O
    public final String zzw8() {
        return "/GoTo";
    }
}
