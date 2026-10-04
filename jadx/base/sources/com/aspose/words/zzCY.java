package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzCY extends zz8A {
    private String[] zzZcM;

    public final void zzI(String[] strArr) {
        this.zzZcM = strArr;
    }

    public final String[] zzZM1() {
        return this.zzZcM;
    }

    @Override // com.aspose.words.zz17
    public final zz17 zzZM2() {
        zzCY zzcy = (zzCY) super.zzZM2();
        String[] strArr = this.zzZcM;
        if (strArr != null) {
            zzcy.zzZcM = new String[strArr.length];
            int i = 0;
            while (true) {
                String[] strArr2 = this.zzZcM;
                if (i >= strArr2.length) {
                    break;
                }
                zzcy.zzZcM[i] = strArr2[i];
                i++;
            }
        }
        return zzcy;
    }
}
