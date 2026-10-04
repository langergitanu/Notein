package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzNZ extends zz9L {
    private zzON zzFx;
    private zzON zzFy;

    public zzNZ(zzZQ4 zzzq4) {
        super(zzzq4);
        this.zzFy = zzOK.zzNg();
        this.zzFx = zzOK.zzNg();
    }

    @Override // com.aspose.words.internal.zz9L
    public final zzON zzMA() {
        return this.zzFy.zzZ(this.zzFx);
    }

    public final zzNY zzMB() {
        zzNY zzny = new zzNY(this.zzFy, zzA6());
        this.zzFx = this.zzFx.zzZ(this.zzFy);
        this.zzFy = zzOK.zzNg();
        return zzny;
    }

    public final zzNY zzMC() {
        return new zzNY(this.zzFy, zzA6());
    }

    public final void zzZ(zzNY zzny, zzON zzon) {
        this.zzFy = zzny.zzMz();
        this.zzFx = zzon;
        zzL(zzny.zzMy());
        zzA5();
    }

    public final void zzi(long j) throws Exception {
        if (zzZPW.zzYF(j)) {
            return;
        }
        this.zzFy = this.zzFy.zzU(Float.intBitsToFloat((int) j), zzZPW.zzYz(j));
        resetCache();
        zzA5();
    }

    public final void zzZ(zzON zzon, int i) {
        if (i == 0) {
            this.zzFy = zzon;
        } else if (i == 1) {
            this.zzFy = this.zzFy.zzZ(zzon);
        } else if (i == 2) {
            this.zzFy = this.zzFy.zzY(zzon);
        } else if (i == 3) {
            this.zzFy = this.zzFy.zzX(zzon);
        } else if (i == 4) {
            this.zzFy = this.zzFy.zzW(zzon);
        } else if (i == 5) {
            this.zzFy = this.zzFy.zzV(zzon);
        } else {
            throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: mode");
        }
        resetCache();
        zzA5();
    }
}
