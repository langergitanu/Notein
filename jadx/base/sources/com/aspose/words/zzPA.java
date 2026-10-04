package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzPA extends zzMP {
    public zzPA(zzL4 zzl4) {
        super(zzl4);
    }

    @Override // com.aspose.words.zzMP
    public final void zzF(StringBuilder sb) {
        for (int i = 0; i < getCount(); i++) {
            if (i != 0) {
                com.aspose.words.internal.zzZNH.zzU(sb, ", ");
            }
            zzMl(i).zzG(sb);
        }
    }

    public zzPA(zzL2 zzl2) {
        super(zzl2);
    }
}
