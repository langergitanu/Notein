package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzQG extends zzM5 {
    private static zzMA zzZrQ = new zzMA(0, 1, 0);
    private String zzZqL;

    public zzQG(String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        this.zzZqL = str;
    }

    public final String getClassName() {
        return this.zzZqL;
    }

    @Override // com.aspose.words.zzQB
    public final boolean zzZ(zzZBM zzzbm, int i) {
        String[] strArrZzZ2K = zzzbm.zzZ2K();
        if (strArrZzZ2K.length == 0) {
            return false;
        }
        for (String str : strArrZzZ2K) {
            if (i == 2) {
                if (com.aspose.words.internal.zzZYD.zzi(str, this.zzZqL)) {
                    return true;
                }
            } else if (com.aspose.words.internal.zzZKN.equals(str, this.zzZqL)) {
                return true;
            }
        }
        return false;
    }

    @Override // com.aspose.words.zzMD
    public final String zzZXr() {
        return this.zzZqL;
    }

    @Override // com.aspose.words.zzMD
    public final zzMA zzZXs() {
        return zzZrQ;
    }

    @Override // com.aspose.words.zzMD
    public final String zzZXu() {
        return "." + com.aspose.words.internal.zzS0.zzl(this.zzZqL);
    }
}
