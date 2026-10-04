package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzM2 extends zzL4 {
    private String mValue;

    public zzM2(String str) {
        super(1, str);
        this.mValue = str;
    }

    @Override // com.aspose.words.zzL4
    public final String getValue() {
        return this.mValue;
    }

    @Override // com.aspose.words.zzL4
    public final void zzG(StringBuilder sb) {
        sb.append('\'');
        com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzS0.zzm(this.mValue));
        sb.append('\'');
    }

    @Override // com.aspose.words.zzL4
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.mValue;
    }
}
