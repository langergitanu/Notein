package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzNM extends zzMN {
    private zzOR zzZpv;

    public zzNM(zzOR zzor) {
        this.zzZpv = zzor;
    }

    @Override // com.aspose.words.zzQB
    public final boolean zzZ(zzZBM zzzbm, int i) {
        zzZBM zzzbmZzZ2Q = zzzbm.zzZ2Q();
        if (zzzbmZzZ2Q == null) {
            return false;
        }
        zzZBM[] zzzbmArrZzZ2M = zzzbmZzZ2Q.zzZ2M();
        for (int i2 = 0; i2 < zzzbmArrZzZ2M.length; i2++) {
            if (zzzbmArrZzZ2M[i2] == zzzbm) {
                return this.zzZpv.zzMs(i2);
            }
        }
        return false;
    }

    @Override // com.aspose.words.zzMD
    public final String zzZXr() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("nth-child("), this.zzZpv.getText(), ")");
    }

    @Override // com.aspose.words.zzMD
    public final String zzZXu() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(":nth-child("), this.zzZpv.getText(), ")");
    }
}
