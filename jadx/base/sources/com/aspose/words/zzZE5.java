package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzZE5 {
    private boolean zzYkT = true;
    private boolean zzYkp;
    private zzZG4 zzYkq;
    private zzZG4 zzYkr;

    public zzZE5(zzZIG zzzig) {
        this.zzYkr = zzzig;
    }

    public final boolean moveNext() {
        zzZG4 zzzg4 = this.zzYkq;
        if (zzzg4 == null) {
            if (!this.zzYkT) {
                return false;
            }
            this.zzYkq = this.zzYkr;
            this.zzYkT = true;
            this.zzYkp = false;
            return true;
        }
        if (this.zzYkT && !this.zzYkp && (zzzg4 instanceof zzZIG)) {
            zzZG3 zzzg3ZzZ2C = ((zzZIG) zzzg4).zzZ2C();
            if (zzzg3ZzZ2C.getCount() > 0) {
                this.zzYkq = zzzg3ZzZ2C.zzzd(0);
            } else {
                this.zzYkT = false;
            }
        } else if (zzzg4 == this.zzYkr) {
            this.zzYkq = null;
        } else if (zzzg4.zzZ0d() != null) {
            this.zzYkq = this.zzYkq.zzZ0d();
            this.zzYkT = true;
        } else {
            this.zzYkq = this.zzYkq.zzZ0e();
            this.zzYkT = false;
        }
        this.zzYkp = false;
        return this.zzYkq != null;
    }

    public final zzZG4 zzYXo() {
        return this.zzYkq;
    }

    public final void zzYXp() {
        this.zzYkp = true;
    }

    public final boolean zzZou() {
        return this.zzYkT;
    }
}
