package com.aspose.words.internal;

import java.net.URL;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZFZ extends zzZG2 {
    final String zzWMW;

    public zzZFZ(zzZQY zzzqy, String str, URL url, String str2, String str3, String str4) {
        super(zzzqy, str, url, str2, str3);
        this.zzWMW = str4;
    }

    @Override // com.aspose.words.internal.zzZFY, com.aspose.words.internal.zzZQP
    public final String getNotationName() {
        return this.zzWMW;
    }

    @Override // com.aspose.words.internal.zzZG3
    public final boolean zzXNK() {
        return false;
    }

    @Override // com.aspose.words.internal.zzZG3
    public final zzZF1 zzZ(zzZF1 zzzf1, zzZQT zzzqt, zzZHC zzzhc, int i) {
        throw new IllegalStateException("Internal error: createInputSource() called for unparsed (external) entity.");
    }
}
