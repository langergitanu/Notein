package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zzZTX extends zzZTO implements zzZD8 {
    public zzZTX() {
        super(61441);
    }

    @Override // com.aspose.words.zzZD8
    public final zzZTW zzEl(int i) {
        int i2 = i - 1;
        if (i2 < 0 || i2 >= zzZiD().getCount()) {
            return null;
        }
        return (zzZTW) zzZiD().zzEi(i2);
    }

    public final void zzX(zzZSP zzzsp) throws Exception {
        for (zzZTW zzztw : zzZiD()) {
            if (!zzztw.zzZiK()) {
                zzztw.zzW(zzzsp);
            }
        }
    }

    @Override // com.aspose.words.zzZTO, com.aspose.words.zzZT7
    public final void zzZ(zzZSP zzzsp) throws Exception {
        zzZii().zzE7(zzZiD().getCount());
        super.zzZ(zzzsp);
    }

    public final void zzz(com.aspose.words.internal.zzZOX zzzox) throws Exception {
        for (zzZTW zzztw : zzZiD()) {
            if (!zzztw.zzZiK()) {
                zzztw.zzy(zzzox);
            }
        }
    }

    @Override // com.aspose.words.zzZD8
    public final int zzZ(zzZTW zzztw) {
        int count = zzZiD().getCount() + 1;
        zzZiD().zzZ(zzztw);
        return count;
    }
}
