package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzY4D extends zzY4C {
    private boolean zzX13;

    public zzY4D() {
        this(false);
    }

    @Override // com.aspose.words.zzYNQ
    public final int getOrder() {
        return 1;
    }

    @Override // com.aspose.words.zzYNQ
    public final boolean zzYqP() {
        return true;
    }

    @Override // com.aspose.words.zzY4C
    public final zzTL zzZ(zzZVZ zzzvz) {
        zzZVZ zzzvzZzZ = zzZVZ.zzZ(zzzvz, -zzzvz.zz8Y(), zzzvz.zzZk5());
        if (this.zzX13) {
            zzzvzZzZ.zzWp(true);
        }
        return zzzvzZzZ;
    }

    public zzY4D(boolean z) {
        this.zzX13 = z;
    }
}
