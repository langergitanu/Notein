package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzYIP extends zzYO4 {
    private int zzZpV;

    public zzYIP(zzYO5 zzyo5) {
        super(zzyo5);
        int direction = zzyo5.getDirection();
        if (direction == 2) {
            this.zzZpV = -1;
        } else if (direction != 3) {
            zzYO4.zzYrf();
        } else {
            this.zzZpV = 1;
        }
    }

    @Override // com.aspose.words.zzYO4
    public final boolean zzYre() {
        return this.zzXII.zzOy(this.zzZpV);
    }
}
