package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZZB {
    IWarningCallback zzYUo;
    LoadOptions zzYUp;
    FontInfoCollection zzYUq;
    int zzYUr;
    zzYJD zzYUs;
    com.aspose.words.internal.zzZOX zzYUt;

    private zzZZB() {
    }

    public static zzZZB zzZ(com.aspose.words.internal.zzZOX zzzox, FontInfoCollection fontInfoCollection, zzYJD zzyjd, int i, IWarningCallback iWarningCallback) {
        zzZZB zzzzb = new zzZZB();
        zzzzb.zzYUt = zzzox;
        zzzzb.zzYUs = zzyjd;
        zzzzb.zzYUr = i;
        zzzzb.zzYUq = fontInfoCollection;
        zzzzb.zzYUo = iWarningCallback;
        return zzzzb;
    }

    public final boolean zzZrB() {
        LoadOptions loadOptions = this.zzYUp;
        return loadOptions != null && loadOptions.zzZrB();
    }
}
