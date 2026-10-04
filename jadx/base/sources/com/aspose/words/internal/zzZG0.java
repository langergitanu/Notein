package com.aspose.words.internal;

import java.io.IOException;
import java.net.URL;

/* JADX INFO: loaded from: classes5.dex */
public final class zzZG0 extends zzZG2 {
    public zzZG0(zzZQY zzzqy, String str, URL url, String str2, String str3) {
        super(zzzqy, str, url, str2, str3);
    }

    @Override // com.aspose.words.internal.zzZFY, com.aspose.words.internal.zzZQP
    public final String getNotationName() {
        return null;
    }

    @Override // com.aspose.words.internal.zzZG3
    public final boolean zzXNK() {
        return true;
    }

    @Override // com.aspose.words.internal.zzZG3
    public final zzZF1 zzZ(zzZF1 zzzf1, zzZQT zzzqt, zzZHC zzzhc, int i) throws IOException, zzZQS {
        if (i == 0) {
            i = 256;
        }
        return zzZFH.zzZ(zzzf1, this.zzWN1, this.mName, this.zzYrz, this.zzYry, zzzqt, zzzhc, i);
    }
}
