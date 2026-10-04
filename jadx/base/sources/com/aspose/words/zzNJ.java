package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzNJ extends zzMN {
    private zzOR zzZpv;

    public zzNJ(zzOR zzor) {
        this.zzZpv = zzor;
    }

    @Override // com.aspose.words.zzQB
    public final boolean zzZ(zzZBM zzzbm, int i) {
        zzZBM zzzbmZzZ2Q = zzzbm.zzZ2Q();
        if (zzzbmZzZ2Q == null) {
            return false;
        }
        int i2 = 0;
        for (zzZBM zzzbm2 : zzzbmZzZ2Q.zzZ2M()) {
            if (zzzbm2 == zzzbm) {
                return this.zzZpv.zzMs(i2);
            }
            if (com.aspose.words.internal.zzZKN.equals(zzzbm2.zzZTQ(), zzzbm.zzZTQ()) && com.aspose.words.internal.zzZKN.equals(zzzbm2.zzZ2G(), zzzbm.zzZ2G())) {
                i2++;
            }
        }
        return false;
    }

    @Override // com.aspose.words.zzMD
    public final String zzZXr() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("nth-of-type("), this.zzZpv.getText(), ")");
    }

    @Override // com.aspose.words.zzMD
    public final String zzZXu() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(":nth-of-type("), this.zzZpv.getText(), ")");
    }
}
