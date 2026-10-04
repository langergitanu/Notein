package com.aspose.words.internal;

/* JADX INFO: loaded from: classes5.dex */
public final class zzOM extends zzON {
    private int zzG4;
    private zzON zzG5;
    private zzON zzG6;

    public zzOM(zzON zzon, zzON zzon2, int i) {
        this.zzG6 = zzon;
        this.zzG5 = zzon2;
        this.zzG4 = i;
    }

    @Override // com.aspose.words.internal.zzON
    public final boolean isEmpty() {
        int i = this.zzG4;
        if (i == 1) {
            return this.zzG6.isEmpty() || this.zzG5.isEmpty();
        }
        if (i == 2) {
            return this.zzG6.isEmpty() && this.zzG5.isEmpty();
        }
        if (i == 3) {
            return (this.zzG6.isInfinite() && this.zzG5.isInfinite()) || (this.zzG6.isEmpty() && this.zzG5.isEmpty());
        }
        if (i == 4) {
            return this.zzG6.isEmpty() || this.zzG5.isInfinite();
        }
        if (i != 5) {
            return false;
        }
        return this.zzG6.isInfinite() || this.zzG5.isEmpty();
    }

    @Override // com.aspose.words.internal.zzON
    public final boolean isInfinite() {
        int i = this.zzG4;
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i == 5 && this.zzG6.isEmpty() && this.zzG5.isInfinite() : this.zzG6.isInfinite() && this.zzG5.isEmpty() : (this.zzG6.isInfinite() && this.zzG5.isEmpty()) || (this.zzG6.isEmpty() && this.zzG5.isInfinite()) : this.zzG6.isInfinite() || this.zzG5.isInfinite() : this.zzG6.isInfinite() && this.zzG5.isInfinite();
    }

    @Override // com.aspose.words.internal.zzON
    public final zzON zzM(zzP9 zzp9) throws Exception {
        return new zzOM(this.zzG6.zzM(zzp9), this.zzG5.zzM(zzp9), this.zzG4);
    }

    public final int zzNi() {
        return this.zzG4;
    }

    public final zzON zzNj() {
        return this.zzG5;
    }

    public final zzON zzNk() {
        return this.zzG6;
    }

    @Override // com.aspose.words.internal.zzON
    public final zzON zzNm() {
        if (isInfinite()) {
            return zzOK.zzNg();
        }
        if (isEmpty()) {
            return zzOL.zzNh();
        }
        int i = this.zzG4;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5 && this.zzG6.isEmpty()) {
                            return this.zzG5;
                        }
                    } else if (this.zzG5.isEmpty()) {
                        return this.zzG6;
                    }
                } else {
                    if (this.zzG6.isEmpty()) {
                        return this.zzG5;
                    }
                    if (this.zzG5.isEmpty()) {
                        return this.zzG6;
                    }
                }
            } else {
                if (this.zzG6.isEmpty()) {
                    return this.zzG5;
                }
                if (this.zzG5.isEmpty()) {
                    return this.zzG6;
                }
            }
        } else {
            if (this.zzG6.isInfinite()) {
                return this.zzG5;
            }
            if (this.zzG5.isInfinite()) {
                return this.zzG6;
            }
        }
        return new zzOM(this.zzG6.zzNm(), this.zzG5.zzNm(), this.zzG4);
    }

    @Override // com.aspose.words.internal.zzON
    public final void zzZ(zzH1 zzh1) {
        zzh1.zzZ(this);
    }
}
