package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYXO extends zzYXN {
    private ArrayList<zzYYA> zzZEc;

    public zzYXO(ArrayList<zzYYA> arrayList) {
        this.zzZEc = arrayList;
    }

    @Override // com.aspose.words.zzYXN
    public final String zzP1(int i) {
        this.zzZEc.size();
        return this.zzZEc.get(i).zzau();
    }

    @Override // com.aspose.words.zzYXN
    public final zzYXQ zzY(int i, int i2, int i3, String str) {
        this.zzZEc.size();
        return new zzYXQ(this.zzZEc.get(i).getOffset() + i2, -1, -1, i3, str);
    }

    @Override // com.aspose.words.zzYXN
    public final zzYXQ zzZ(zzYWR zzywr, int i) {
        return new zzYXQ(0, -1, -1, zzywr.zzXWe, zzywr.zzXWd);
    }

    @Override // com.aspose.words.zzYXN
    public final int zzaf() {
        return this.zzZEc.size();
    }
}
