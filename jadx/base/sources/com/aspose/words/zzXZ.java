package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
final class zzXZ implements zzZD6 {
    private com.aspose.words.internal.zzZQH<Integer, Integer> zzZCc;
    private zzZ35 zzZCd;

    private zzXZ(zzZ35 zzz35, com.aspose.words.internal.zzZQH<Integer, Integer> zzzqh) {
        this.zzZCd = zzz35;
        this.zzZCc = zzzqh;
    }

    public static BorderCollection zzZ(zzZ35 zzz35, int... iArr) {
        com.aspose.words.internal.zzZQH zzzqh = new com.aspose.words.internal.zzZQH();
        for (int i = 0; i < 4; i++) {
            int i2 = iArr[i];
            zzzqh.zzB(Integer.valueOf(i2), Integer.valueOf(i2));
        }
        return new BorderCollection(new zzXZ(zzz35, zzzqh));
    }

    @Override // com.aspose.words.zzZD6
    public final Object fetchInheritedBorderAttr(int i) {
        return null;
    }

    @Override // com.aspose.words.zzZD6
    public final Object getDirectBorderAttr(int i) {
        return zz5.zzZ(this.zzZCd.zzYMV().zzwz(i));
    }

    @Override // com.aspose.words.zzZD6
    public final com.aspose.words.internal.zzZQH<Integer, Integer> getPossibleBorderKeys() {
        return this.zzZCc;
    }

    @Override // com.aspose.words.zzZD6
    public final void setBorderAttr(int i, Object obj) {
    }
}
