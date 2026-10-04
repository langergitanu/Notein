package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzZTA implements zzZD8 {
    private ArrayList<zzZTW> zzYJL = new ArrayList<>();

    @Override // com.aspose.words.zzZD8
    public final zzZTW zzEl(int i) {
        if (this.zzYJL.size() == 0) {
            return null;
        }
        ArrayList<zzZTW> arrayList = this.zzYJL;
        if (i > arrayList.size()) {
            i = this.zzYJL.size();
        }
        return arrayList.get(i - 1);
    }

    @Override // com.aspose.words.zzZD8
    public final int zzZ(zzZTW zzztw) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzYJL, zzztw);
        return this.zzYJL.size();
    }

    public final void zzZ(zzZSP zzzsp, int i) throws Exception {
        for (zzZTW zzztw : this.zzYJL) {
            zzztw.zzYKr = i;
            zzztw.zzS(zzzsp);
        }
    }
}
