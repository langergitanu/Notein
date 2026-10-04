package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
final class zzNV extends zz80 {
    private zzP9 zzFk;
    private zzN6 zzFz;
    private zzP9 zzFm = new zzP9();
    private zzP9 zzFl = new zzP9();
    private zzP9 zzFj = new zzP9();
    private float zzFi = 1.0f;

    public zzNV(zzN6 zzn6) {
        this.zzFz = zzn6;
    }

    private void zzMr() {
        this.zzFk = null;
        onChanged();
    }

    public final zzNU zzJ(zzP9 zzp9) {
        zzNU zznu = new zzNU(this.zzFm, this.zzFj);
        zzP9 zzp9ZzOh = this.zzFl.zzOh();
        this.zzFl = zzp9ZzOh;
        zzp9ZzOh.zzZ(this.zzFj, 0);
        this.zzFl.zzZ(zzp9, 0);
        this.zzFj = new zzP9();
        if (!zzp9.isIdentity()) {
            zzMr();
        }
        return zznu;
    }

    public final float zzMp() {
        return this.zzFi;
    }

    @Override // com.aspose.words.internal.zz80, com.aspose.words.internal.zzG4
    public final zzP9 zzMq() {
        if (this.zzFk == null) {
            zzP9 zzp9ZzOh = this.zzFm.zzOh();
            this.zzFk = zzp9ZzOh;
            zzp9ZzOh.zzZ(this.zzFl, 0);
            this.zzFk.zzZ(this.zzFj, 0);
        }
        return this.zzFk;
    }

    public final zzNU zzMs() {
        return new zzNU(this.zzFm, this.zzFj);
    }

    public final void zzY(zzP9 zzp9, int i) {
        if (i == 1) {
            this.zzFj = new zzP9();
        } else if (i == 2) {
            zzP9 zzp9ZzOh = this.zzFj.zzOh();
            this.zzFj = zzp9ZzOh;
            zzp9ZzOh.zzZ(zzp9, 0);
        } else if (i == 3) {
            zzP9 zzp9ZzOh2 = this.zzFj.zzOh();
            this.zzFj = zzp9ZzOh2;
            zzp9ZzOh2.zzZ(zzp9, 1);
        } else {
            if (i != 4) {
                throw new IllegalArgumentException("Specified argument was out of the range of valid values.\r\nParameter name: mode");
            }
            this.zzFj = zzp9;
        }
        zzMr();
    }

    public final void zzZ(zzNU zznu, zzP9 zzp9) {
        this.zzFm = zznu.zzMo();
        this.zzFj = zznu.zzMn();
        this.zzFl = zzp9;
        zzMr();
    }

    public final void zzZ(int i, double d) {
        this.zzFm = new zzP9();
        float fZzY = (float) this.zzFz.zzKi().zzY(d, i);
        this.zzFm.zzZ(fZzY, fZzY, 0);
        this.zzFi = fZzY;
        zzMr();
    }
}
