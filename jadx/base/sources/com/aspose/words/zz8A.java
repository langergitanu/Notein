package com.aspose.words;

/* JADX INFO: loaded from: classes6.dex */
class zz8A extends zz17 {
    private int zzZ53;

    public final void zzIU(int i) {
        this.zzZ53 = i;
    }

    public final zzZV0 zzX(zzZ90 zzz90) {
        int i = this.zzZ53;
        if (i == 0 || zzz90 == null) {
            return null;
        }
        return zzz90.getEffectStyle(i - 1);
    }

    public final int zzZC7() {
        return this.zzZ53;
    }
}
