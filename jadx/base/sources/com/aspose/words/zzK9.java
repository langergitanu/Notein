package com.aspose.words;

import com.microsoft.identity.client.internal.MsalUtils;

/* JADX INFO: loaded from: classes6.dex */
final class zzK9 extends com.aspose.words.internal.zzZO5 {
    private zzK8 zzZjx;
    private String zzZjy;

    public zzK9() {
        this.zzZjy = MsalUtils.QUERY_STRING_SYMBOL;
        this.zzZjx = new zzK8(MsalUtils.QUERY_STRING_SYMBOL);
    }

    @Override // com.aspose.words.internal.zzZO5
    public final int zzFQ() {
        return this.zzZjy.length();
    }

    @Override // com.aspose.words.internal.zzZO5
    public final com.aspose.words.internal.zzZO4 zzi7() {
        return this.zzZjx;
    }

    public zzK9(String str) {
        this.zzZjy = str;
        this.zzZjx = new zzK8(str);
    }
}
