package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzJO extends zzYL {
    @Override // com.aspose.words.zzYNQ
    public final int getOrder() {
        return 3;
    }

    @Override // com.aspose.words.zzYL
    public final zzTL zzZ(zzZVZ zzzvz, zzZVZ zzzvz2) {
        if (zzzvz2.zz8Y() == 0.0d) {
            return new zzZU3("!Zero Divide");
        }
        return zzZVZ.zzZ(zzzvz, zzzvz2, zzzvz.zz8Y() / zzzvz2.zz8Y(), Math.max(zzzvz.zzZk5() + zzzvz2.zzZk5(), 2));
    }
}
