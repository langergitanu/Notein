package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzEZ extends zz7O {
    private String[] zzZcM;

    public final void zzI(String[] strArr) {
        this.zzZcM = strArr;
    }

    public final String[] zzZM1() {
        return this.zzZcM;
    }

    @Override // com.aspose.words.zz17
    public final zz17 zzZM2() {
        zzEZ zzez = (zzEZ) super.zzZM2();
        String[] strArr = this.zzZcM;
        if (strArr != null) {
            zzez.zzZcM = new String[strArr.length];
            int i = 0;
            while (true) {
                String[] strArr2 = this.zzZcM;
                if (i >= strArr2.length) {
                    break;
                }
                zzez.zzZcM[i] = strArr2[i];
                i++;
            }
        }
        return zzez;
    }
}
