package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYW extends zzYXN {
    private ArrayList<zzZ3> zzZDX;
    private ArrayList<zzZ5> zzZEc;

    public zzYW(ArrayList<zzZ3> arrayList, ArrayList<zzZ5> arrayList2) {
        this.zzZDX = arrayList;
        this.zzZEc = arrayList2;
    }

    @Override // com.aspose.words.zzYXN
    public final String zzP1(int i) {
        this.zzZEc.size();
        return this.zzZEc.get(i).zzau();
    }

    @Override // com.aspose.words.zzYXN
    public final zzYXQ zzY(int i, int i2, int i3, String str) {
        this.zzZEc.size();
        zzZ5 zzz5 = this.zzZEc.get(i);
        return new zzYXQ(zzz5.zzaN() + i2, zzz5.zzaL(), i2, i3, str);
    }

    @Override // com.aspose.words.zzYXN
    public final zzYXQ zzZ(zzYWR zzywr, int i) {
        this.zzZDX.size();
        zzZ3 zzz3 = this.zzZDX.get(i);
        if (zzz3.zzaD().size() == 0) {
            return null;
        }
        zzZ5 zzz5 = zzz3.zzaD().get(0);
        return new zzYXQ(zzz5.zzaN(), zzz5.zzaL(), 0, zzywr.zzXWe, zzywr.zzXWd);
    }

    @Override // com.aspose.words.zzYXN
    public final int zzaf() {
        return this.zzZEc.size();
    }
}
