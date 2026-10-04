package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzO8 extends zzLG {
    private ArrayList<zzLH> zzZpR;
    private int zzp8 = -1;

    public zzO8(ArrayList<zzLH> arrayList) {
        this.zzZpR = arrayList;
    }

    @Override // com.aspose.words.zzLG
    public final void zzZVT() {
        int i = this.zzp8;
        if (i >= 0) {
            this.zzp8 = i - 1;
        }
    }

    @Override // com.aspose.words.zzLG
    public final zzLH zzZVU() {
        if (this.zzp8 < this.zzZpR.size()) {
            this.zzp8++;
        }
        return this.zzp8 < this.zzZpR.size() ? this.zzZpR.get(this.zzp8) : zzLH.zzZo4;
    }
}
