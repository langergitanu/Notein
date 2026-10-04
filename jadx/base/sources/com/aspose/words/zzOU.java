package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzOU extends zzM5 {
    private static zzMA zzZrQ = new zzMA(1, 0, 0);
    private String zzZh;

    public zzOU(String str) {
        com.aspose.words.internal.zzZYD.zzXk(str);
        this.zzZh = str;
    }

    public final String getId() {
        return this.zzZh;
    }

    @Override // com.aspose.words.zzQB
    public final boolean zzZ(zzZBM zzzbm, int i) {
        String strZzKM = zzzbm.zzKM("id");
        if (strZzKM == null) {
            return false;
        }
        return i == 2 ? com.aspose.words.internal.zzZYD.zzi(this.zzZh, strZzKM) : com.aspose.words.internal.zzZKN.equals(this.zzZh, strZzKM);
    }

    @Override // com.aspose.words.zzMD
    public final String zzZXr() {
        return this.zzZh;
    }

    @Override // com.aspose.words.zzMD
    public final zzMA zzZXs() {
        return zzZrQ;
    }

    @Override // com.aspose.words.zzMD
    public final String zzZXu() {
        return "#" + com.aspose.words.internal.zzS0.zzl(this.zzZh);
    }
}
