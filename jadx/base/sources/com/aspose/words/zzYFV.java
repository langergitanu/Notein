package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYFV {
    private boolean zzXtj;
    private int zzXtk;
    private boolean zzXtl;
    private boolean zzXtm;
    private boolean zzXtn;
    private boolean zzYFQ;

    public final boolean getBidi() {
        return this.zzYFQ;
    }

    public final int getMode() {
        int i = this.zzXtk;
        int i2 = 1;
        if (i != 1) {
            i2 = 2;
            if (i != 2) {
                i2 = 3;
                if (i != 3) {
                    return zzYgF() ? 4 : 0;
                }
            }
        }
        return i2;
    }

    public final void reset() {
        this.zzYFQ = false;
        this.zzXtn = false;
        this.zzXtm = false;
        this.zzXtl = false;
        this.zzXtj = true;
        this.zzXtk = 0;
    }

    public final void zzRl(boolean z) {
        this.zzXtk = 0;
        this.zzXtl = !this.zzXtl;
        this.zzXtm = z;
    }

    public final boolean zzYgF() {
        if (this.zzXtk != 0) {
            return false;
        }
        boolean z = this.zzYFQ;
        if (z || this.zzXtm) {
            return (this.zzXtn && this.zzXtl && z != this.zzXtm) ? false : true;
        }
        return false;
    }

    public final void zzYgG() {
        reset();
        this.zzXtk = 3;
        this.zzXtj = false;
    }

    public final void zzYgH() {
        reset();
        this.zzXtk = 2;
        this.zzXtj = false;
    }

    public final void zzYgI() {
        reset();
        this.zzXtk = 1;
        this.zzXtj = false;
    }

    public final void zzYgJ() {
        this.zzXtk = 0;
        this.zzXtn = !this.zzXtn;
        this.zzYFQ = true;
    }

    public final void zzYgK() {
        this.zzXtk = 0;
        this.zzXtn = !this.zzXtn;
        this.zzYFQ = false;
    }

    public final void zzYgL() {
        if (this.zzXtj) {
            this.zzXtk = 0;
        }
        this.zzXtj = true;
    }
}
