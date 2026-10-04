package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzNN extends zzMN {
    private zzM5 zzZpw;

    public zzNN(zzM5 zzm5) {
        this.zzZpw = zzm5;
    }

    @Override // com.aspose.words.zzQB
    public final boolean zzZ(zzZBM zzzbm, int i) {
        return !this.zzZpw.zzZ(zzzbm, i);
    }

    @Override // com.aspose.words.zzMD
    public final String zzZXr() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder("not("), this.zzZpw.zzZXu(), ")");
    }

    @Override // com.aspose.words.zzMN, com.aspose.words.zzMD
    public final zzMA zzZXs() {
        return this.zzZpw.zzZXs();
    }

    @Override // com.aspose.words.zzMD
    public final String zzZXu() {
        return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(":not("), this.zzZpw.zzZXu(), ")");
    }
}
