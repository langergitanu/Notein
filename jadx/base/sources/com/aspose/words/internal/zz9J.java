package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zz9J extends zz9L {
    private zzON zzFy;
    private zzON zzqR;

    public zz9J(zzZQ4 zzzq4) {
        super(zzzq4);
    }

    private void zzV1(int i) {
        if (this.zzFy != null) {
            return;
        }
        if (i == 1) {
            this.zzFy = zzOK.zzNg();
        } else if (i == 2 || i == 3 || i == 4) {
            this.zzFy = new zzOJ(this.zzqT);
        }
    }

    public final void reset() {
        this.zzFy = null;
        resetCache();
        zzA5();
    }

    public final zz9I zzA3() {
        return new zz9I(this.zzFy, this.zzqR, zzA6());
    }

    public final void zzA4() {
        zzON zzon;
        zzON zzon2 = this.zzqR;
        if (zzon2 == null || (zzon = this.zzFy) == null) {
            this.zzqR = this.zzFy;
        } else {
            zzon2.zzZ(zzon);
        }
        this.zzFy = null;
    }

    @Override // com.aspose.words.internal.zz9L
    public final zzON zzMA() {
        zzON zzon = this.zzqR;
        if (zzon == null && this.zzFy == null) {
            return null;
        }
        if (zzon == null) {
            return this.zzFy;
        }
        zzON zzon2 = this.zzFy;
        return zzon2 == null ? zzon : zzon.zzZ(zzon2);
    }

    public final void zzZ(zzON zzon, int i) {
        zzV1(i);
        if (i == 1) {
            this.zzFy = this.zzFy.zzZ(zzon);
        } else if (i == 2) {
            this.zzFy = this.zzFy.zzY(zzon);
        } else if (i == 3) {
            this.zzFy = this.zzFy.zzX(zzon);
        } else if (i == 4) {
            this.zzFy = this.zzFy.zzW(zzon);
        } else if (i == 5) {
            this.zzFy = zzon;
        }
        resetCache();
        zzA5();
    }

    public final void zzi(long j) throws Exception {
        zzON zzon;
        if (zzZPY.zzYF(j) || (zzon = this.zzFy) == null) {
            return;
        }
        this.zzFy = zzon.zzU(Float.intBitsToFloat((int) j), zzZPY.zzYC(j));
        resetCache();
        zzA5();
    }

    public final void zzZ(zz9I zz9i) {
        this.zzFy = zz9i.zzMz();
        this.zzqR = zz9i.zzA2();
        zzL(zz9i.zzMy());
        zzA5();
    }
}
