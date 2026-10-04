package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzEA extends zzE9 {
    public zzEA(int i) {
        super(i, 3);
    }

    @Override // com.aspose.words.zzCF
    public final double getValue() {
        return getIndex() + 1;
    }

    public final String zzKI(int i) {
        if (i < zzZLe().size()) {
            return (String) zzZLe().get((zzZLe().size() - i) - 1);
        }
        return null;
    }

    @Override // com.aspose.words.zzCF
    public final zzCF zzKK(int i) {
        return (i < 0 || i >= zzZLe().size() || zzZLe().get(i) == null) ? new zzFA(getIndex(), getIndex() + 1) : new zzD4(getIndex(), (String) zzZLe().get(i));
    }
}
