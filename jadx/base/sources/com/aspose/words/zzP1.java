package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzP1 extends zzL4 {
    private String mName;
    private String mValue;
    private zzL2 zzZq1;

    public zzP1(String str, zzL2 zzl2) {
        super(9, zzZ(str, zzl2));
        this.mName = str;
        zzL2 zzl22 = new zzL2(zzl2);
        this.zzZq1 = zzl22;
        this.mValue = zzZ(this.mName, zzl22);
    }

    private static void zzZ(String str, zzL2 zzl2, StringBuilder sb) {
        com.aspose.words.internal.zzZNH.zzU(sb, str);
        sb.append('(');
        com.aspose.words.internal.zzZNH.zzU(sb, zzl2.zzZXu());
        sb.append(')');
    }

    public final String getName() {
        return this.mName;
    }

    @Override // com.aspose.words.zzL4
    public final /* bridge */ /* synthetic */ Object getValue() {
        return this.mValue;
    }

    @Override // com.aspose.words.zzL4
    public final void zzG(StringBuilder sb) {
        zzZ(this.mName, this.zzZq1, sb);
    }

    @Override // com.aspose.words.zzL4
    public final boolean zzU(zzL4 zzl4) {
        zzP1 zzp1 = (zzP1) zzl4;
        return com.aspose.words.internal.zzZYD.zzi(this.mName, zzp1.mName) && this.zzZq1.zzZ(zzp1.zzZq1);
    }

    public final zzL2 zzZW3() {
        return this.zzZq1;
    }

    private static String zzZ(String str, zzL2 zzl2) {
        StringBuilder sb = new StringBuilder();
        zzZ(str, zzl2, sb);
        return sb.toString();
    }
}
