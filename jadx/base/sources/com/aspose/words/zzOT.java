package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzOT extends zzL4 {
    private String zzZpY;
    private String zzZpZ;

    public zzOT(String str) {
        super(0, str);
        com.aspose.words.internal.zzZYD.zzXk(str);
        this.zzZpZ = str;
        this.zzZpY = com.aspose.words.internal.zzZKN.zzU2(str);
    }

    @Override // com.aspose.words.zzL4
    public final String getValue() {
        return this.zzZpZ;
    }

    @Override // com.aspose.words.zzL4
    public int hashCode() {
        return (this.zzZpY.hashCode() * 397) ^ getValueType();
    }

    @Override // com.aspose.words.zzL4
    public final void zzG(StringBuilder sb) {
        com.aspose.words.internal.zzZNH.zzU(sb, com.aspose.words.internal.zzS0.zzl(this.zzZpZ));
    }

    @Override // com.aspose.words.zzL4
    public final boolean zzU(zzL4 zzl4) {
        return com.aspose.words.internal.zzZKN.equals(this.zzZpY, ((zzOT) zzl4).zzZpY);
    }

    @Override // com.aspose.words.zzL4
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.zzZpZ;
    }
}
