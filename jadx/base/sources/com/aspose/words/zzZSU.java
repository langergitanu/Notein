package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZSU extends zzZTO implements zzZ9I {
    public zzZSU() {
        super(61445);
    }

    @Override // com.aspose.words.zzZ9I
    public final zzTM zzDZ(int i) {
        for (int i2 = 0; i2 < getCount(); i2++) {
            zzZT7 zzzt7ZzEi = zzZiD().zzEi(i2);
            if (zzzt7ZzEi instanceof zzZTP) {
                zzZTP zzztp = (zzZTP) zzzt7ZzEi;
                if (zzztp.zzYKe == i) {
                    return zzztp.zzZiE();
                }
            }
        }
        return null;
    }

    @Override // com.aspose.words.zzZTO, com.aspose.words.zzZT7
    public final void zzZ(zzZSP zzzsp) throws Exception {
        super.zzZ(zzzsp);
        zzZii().zzE7(zzZiD().getCount());
    }

    @Override // com.aspose.words.zzZ9I
    public final void zzZ(int i, zzTM zztm) {
        zzZiD().zzZ(new zzZTP(getCount() + 1, i, zztm));
    }
}
