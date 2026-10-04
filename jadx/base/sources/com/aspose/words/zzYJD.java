package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zzYJD {
    private ArrayList<String> zzYA0;

    public zzYJD(zzZRA zzzra, com.aspose.words.internal.zzZOX zzzox) throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();
        this.zzYA0 = arrayList;
        zzY91.zzY(zzzox, zzzra.zzYGE.zzXzQ, arrayList);
    }

    private int zzCJ(String str) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzYA0, str);
        return this.zzYA0.size() - 1;
    }

    public final int zzCK(String str) {
        int iIndexOf = this.zzYA0.indexOf(str);
        return iIndexOf < 0 ? zzCJ(str) : iIndexOf;
    }

    public final int zzV(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        return zzY91.zzZ(zzzow, this.zzYA0);
    }

    public final String zzpy(int i) {
        return (i < 0 || i >= this.zzYA0.size()) ? "Unknown" : this.zzYA0.get(i);
    }

    public zzYJD() {
        ArrayList<String> arrayList = new ArrayList<>();
        this.zzYA0 = arrayList;
        com.aspose.words.internal.zzZQG.zzZ(arrayList, "Unknown");
    }
}
