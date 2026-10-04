package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zz86 {
    private zzZ90 zzZ4W;
    private zzZV0 zzZdN;
    private zz1K zzZjk;

    public zz86(zz1K zz1k, zzZ90 zzz90) {
        this.zzZjk = zz1k;
        this.zzZ4W = zzz90;
    }

    private zzZV0 zzZC1() {
        zz1K zz1k;
        if (this.zzZdN == null && (zz1k = this.zzZjk) != null) {
            this.zzZdN = zz1k.zzX(this.zzZ4W);
        }
        return this.zzZdN;
    }

    public final zz2N zzZTc() {
        if (zzZC1() == null) {
            return null;
        }
        return zzZC1().zzZTc();
    }

    public final zz2S zzZTd() {
        if (zzZC1() == null) {
            return null;
        }
        return zzZC1().zzZTd();
    }

    public final zz2C zzZTe() {
        if (zzZC1() == null) {
            return null;
        }
        return zzZC1().zzZTe();
    }
}
