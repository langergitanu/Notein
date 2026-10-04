package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYWT extends zzYWU {
    private zzYWT(zzJU zzju, zzJU zzju2) {
        super(zzju, zzju2);
    }

    public static void zzT(zzJU zzju, zzJU zzju2) {
        new zzYWT(zzju, zzju2).zzYBr();
    }

    @Override // com.aspose.words.zzYWU
    public final zzYAX zzE(int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int iZztE = zztE(1);
        this.zzXWx[iZztE] = 0;
        this.zzXWw[iZztE] = 0;
        int i7 = this.zzVF;
        int i8 = (i7 % 2) + (i7 / 2);
        for (int i9 = 0; i9 <= i8; i9++) {
            if (zztG(i9)) {
                while (true) {
                    int i10 = this.zzXWv;
                    if (i10 <= 0 || (i5 = this.zzXWr) <= 0 || !zzWC(i10 - 1, i5 - 1)) {
                        break;
                    }
                    this.zzXWv--;
                    this.zzXWr--;
                }
                return new zzYAX(this.zzXWv + i, this.zzXWr + i3, i + this.zzXWu, i3 + this.zzXWq);
            }
            if (zztF(i9)) {
                int i11 = -((this.zzXWt - this.zzXWr) - this.zzXWA);
                int i12 = this.zzXWu;
                int i13 = i12 - i11;
                this.zzXWq = i13;
                this.zzXWv = i12;
                this.zzXWr = i13;
                while (true) {
                    int i14 = this.zzXWv;
                    if (i14 <= 0 || (i6 = this.zzXWr) <= 0 || !zzWC(i14 - 1, i6 - 1)) {
                        break;
                    }
                    this.zzXWv--;
                    this.zzXWr--;
                }
                return new zzYAX(this.zzXWv + i, this.zzXWr + i3, i + this.zzXWu, i3 + this.zzXWq);
            }
        }
        return null;
    }
}
