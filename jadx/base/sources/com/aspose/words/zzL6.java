package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzL6 extends zzL4 {
    private String mValue;

    public zzL6(String str) {
        super(6, str);
        this.mValue = str;
    }

    @Override // com.aspose.words.zzL4
    public final String getValue() {
        return this.mValue;
    }

    @Override // com.aspose.words.zzL4
    public final void zzG(StringBuilder sb) {
        com.aspose.words.internal.zzZNH.zzU(sb, "url('");
        com.aspose.words.internal.zzZNH.zzU(sb, this.mValue);
        com.aspose.words.internal.zzZNH.zzU(sb, "')");
    }

    @Override // com.aspose.words.zzL4
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.mValue;
    }
}
