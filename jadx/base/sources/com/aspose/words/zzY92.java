package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzY92 extends zzY8Z {
    private ArrayList<zzZNA> zzZm = new ArrayList<>();

    public final String zzBR(int i) {
        for (zzZNA zzzna : this.zzZm) {
            if (zzzna.zzYxC == i) {
                return zzzna.zzLJ;
            }
        }
        return "";
    }

    @Override // com.aspose.words.zzY8Z
    public final void zzH(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        for (zzZNA zzzna : this.zzZm) {
            zzY8Z.zzW(zzzna.zzLJ, zzzow);
            zzzna.zzZ(zzzow);
        }
    }

    @Override // com.aspose.words.zzY8Z
    public final int zzY3A() {
        return this.zzZm.size();
    }

    @Override // com.aspose.words.zzY8Z
    public final int zzY3z() {
        return 8;
    }

    @Override // com.aspose.words.zzY8Z
    public final void zzZ(String str, com.aspose.words.internal.zzZOX zzzox) throws Exception {
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, new zzZNA(str, zzzox));
    }

    public final int zzj(int i, String str) {
        zzZNA zzzna = new zzZNA();
        zzzna.zzYxC = i | (this.zzZm.size() << 4);
        zzzna.zzYxB = 255;
        zzzna.zzLJ = str;
        com.aspose.words.internal.zzZQG.zzZ(this.zzZm, zzzna);
        return zzzna.zzYxC;
    }
}
