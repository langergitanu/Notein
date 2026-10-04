package com.aspose.words;

import com.aspose.words.ref.RefDouble;

/* JADX INFO: loaded from: classes6.dex */
final class zzZ7P extends zzTL {
    private int zzZn;

    public zzZ7P(int i) {
        this.zzZn = i;
    }

    @Override // com.aspose.words.zzTL
    public final String zz8W() {
        return Integer.toString(this.zzZn);
    }

    @Override // com.aspose.words.zzTL
    public final boolean zz8X() {
        return this.zzZn != 0;
    }

    @Override // com.aspose.words.zzTL
    public final double zz8Y() {
        return this.zzZn;
    }

    @Override // com.aspose.words.zzTL
    public final zzZQ8 zzZ(zzYIU zzyiu, int i, IFieldResultFormatter iFieldResultFormatter) {
        return zzZVZ.zzZ(this.zzZn, zzyiu, i, iFieldResultFormatter);
    }

    @Override // com.aspose.words.zzTL
    public final int zzbY() {
        return 1;
    }

    @Override // com.aspose.words.zzTL
    public final boolean zzZ(RefDouble refDouble) {
        refDouble.set(this.zzZn);
        return true;
    }
}
