package com.aspose.words.internal;

import java.net.URL;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZG2 extends zzZG3 {
    final String zzYry;
    final String zzYrz;

    public zzZG2(zzZQY zzzqy, String str, URL url, String str2, String str3) {
        super(zzzqy, str, url);
        this.zzYrz = str2;
        this.zzYry = str3;
    }

    @Override // com.aspose.words.internal.zzZFY, com.aspose.words.internal.zzZQP
    public final String getPublicId() {
        return this.zzYrz;
    }

    @Override // com.aspose.words.internal.zzZFY, com.aspose.words.internal.zzZQP
    public final String getSystemId() {
        return this.zzYry;
    }

    @Override // com.aspose.words.internal.zzZG3
    public final boolean isExternal() {
        return true;
    }

    @Override // com.aspose.words.internal.zzZG3, com.aspose.words.internal.zzZFY, com.aspose.words.internal.zzZQP
    public final String zzlc() {
        return null;
    }
}
