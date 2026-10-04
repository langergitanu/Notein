package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzNU extends zzMG {
    private zzMG[] zzZpE;
    private zzNV zzZpF;

    public zzNU(zzNV zznv, zzMG[] zzmgArr) {
        super(2);
        this.zzZpF = zznv;
        this.zzZpE = zzmgArr;
    }

    public final zzMG[] zzZVQ() {
        return this.zzZpE;
    }

    public final zzNV zzZVR() {
        return this.zzZpF;
    }

    @Override // com.aspose.words.zzMG
    public final String zzZXu() {
        StringBuilder sb = new StringBuilder();
        com.aspose.words.internal.zzZNH.zzU(sb, "@media ");
        com.aspose.words.internal.zzZNH.zzZ(sb, this.zzZpF);
        com.aspose.words.internal.zzZNH.zzU(sb, " { ");
        zzMG[] zzmgArr = this.zzZpE;
        int length = zzmgArr.length;
        boolean z = true;
        int i = 0;
        while (i < length) {
            zzMG zzmg = zzmgArr[i];
            if (!z) {
                sb.append(ControlChar.SPACE_CHAR);
            }
            com.aspose.words.internal.zzZNH.zzU(sb, zzmg.zzZXu());
            i++;
            z = false;
        }
        com.aspose.words.internal.zzZNH.zzU(sb, " }");
        return sb.toString();
    }
}
