package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZZ2 {
    Theme zzYTm;
    IWarningCallback zzYUo;
    FontInfoCollection zzYUq;
    zzYJD zzYUs;

    private zzZZ2() {
    }

    public static zzZZ2 zzZ(FontInfoCollection fontInfoCollection, zzYJD zzyjd, Theme theme, IWarningCallback iWarningCallback) {
        zzZZ2 zzzz2 = new zzZZ2();
        zzzz2.zzYUs = zzyjd;
        zzzz2.zzYUq = fontInfoCollection;
        zzzz2.zzYTm = theme;
        zzzz2.zzYUo = iWarningCallback;
        return zzzz2;
    }
}
