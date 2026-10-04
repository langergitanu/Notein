package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzNK extends zzMN {
    private zzOR zzZpv;

    public zzNK(zzOR zzor) {
        this.zzZpv = zzor;
    }

    @Override // com.aspose.words.zzQB
    public final boolean zzZ(zzZBM zzzbm, int i) {
        zzZBM zzzbmZzZ2Q = zzzbm.zzZ2Q();
        if (zzzbmZzZ2Q == null) {
            return false;
        }
        zzZBM[] zzzbmArrZzZ2M = zzzbmZzZ2Q.zzZ2M();
        int i2 = 0;
        for (int i3 = 0; i3 < zzzbmArrZzZ2M.length; i3++) {
            zzZBM zzzbm2 = zzzbmArrZzZ2M[(zzzbmArrZzZ2M.length - i3) - 1];
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
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("nth-last-of-type("), this.zzZpv.getText(), ")");
    }

    @Override // com.aspose.words.zzMD
    public final String zzZXu() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(":nth-last-of-type("), this.zzZpv.getText(), ")");
    }
}
