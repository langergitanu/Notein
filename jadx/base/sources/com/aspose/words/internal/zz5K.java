package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz5K extends zz5O {
    private String zzkB;

    public zz5K(String str) {
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: uri");
        }
        this.zzkB = zzZVR.zzWj(str);
    }

    @Override // com.aspose.words.internal.zz5O
    public final void zzV(zzFY zzfy) throws Exception {
        zzfy.zzD("/URI", this.zzkB);
    }

    @Override // com.aspose.words.internal.zz5O
    public final String zzw8() {
        return "/URI";
    }
}
