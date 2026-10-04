package com.aspose.words.internal;

import java.net.URL;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZFX extends zzYFM {
    final URL zzWMV;

    public zzZFX(zzZQY zzzqy, String str, String str2, String str3, URL url) {
        super(zzzqy, str, str2, str3);
        this.zzWMV = url;
    }

    @Override // com.aspose.words.internal.zzYFM, com.aspose.words.internal.zzYFU
    public final String getBaseURI() {
        URL url = this.zzWMV;
        return url == null ? super.getBaseURI() : url.toExternalForm();
    }
}
