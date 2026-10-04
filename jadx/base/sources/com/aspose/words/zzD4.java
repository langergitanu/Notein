package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzD4 extends zzCF {
    private String mValue;

    public zzD4(int i, String str) {
        super(i, 1);
        this.mValue = str;
    }

    @Override // com.aspose.words.zzCF
    public final String getStringValue() {
        return this.mValue;
    }

    @Override // com.aspose.words.zzCF
    public final double getValue() {
        return getIndex() + 1;
    }
}
