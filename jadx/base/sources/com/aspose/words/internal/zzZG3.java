package com.aspose.words.internal;

import java.io.IOException;
import java.net.URL;

/* JADX INFO: loaded from: classes5.dex */
public abstract class zzZG3 extends zzZFY {
    final String mName;
    protected boolean zzWN0;
    final URL zzWN1;

    public zzZG3(zzZQY zzzqy, String str, URL url) {
        super(zzzqy);
        this.zzWN0 = false;
        this.mName = str;
        this.zzWN1 = url;
    }

    @Override // com.aspose.words.internal.zzZFY, com.aspose.words.internal.zzZQP
    public final String getBaseURI() {
        return this.zzWN1.toExternalForm();
    }

    @Override // com.aspose.words.internal.zzZFY, com.aspose.words.internal.zzZQP
    public final String getName() {
        return this.mName;
    }

    public abstract boolean isExternal();

    public abstract boolean zzXNK();

    public final boolean zzXNL() {
        return this.zzWN0;
    }

    public final void zzXNM() {
        this.zzWN0 = true;
    }

    public abstract zzZF1 zzZ(zzZF1 zzzf1, zzZQT zzzqt, zzZHC zzzhc, int i) throws IOException, zzZQS;

    @Override // com.aspose.words.internal.zzZFY, com.aspose.words.internal.zzZQP
    public abstract String zzlc();

    @Override // com.aspose.words.internal.zzYFN, com.aspose.words.internal.zzZQN
    public final zzZQY zzlj() {
        return this.zzWOA;
    }
}
