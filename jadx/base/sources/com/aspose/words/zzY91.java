package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzY91 extends zzY8Z {
    private ArrayList<String> zzFJ;

    private zzY91(ArrayList<String> arrayList) {
        this.zzFJ = arrayList;
    }

    public static void zzY(com.aspose.words.internal.zzZOX zzzox, zzZRG zzzrg, ArrayList<String> arrayList) throws Exception {
        zzZ(zzzox, zzzrg.zzYHK, zzzrg.zzYHJ, arrayList);
    }

    public static void zzZ(com.aspose.words.internal.zzZOX zzzox, zzZRG zzzrg, ArrayList<String> arrayList) throws Exception {
        new zzY91(arrayList).zzU(zzzox, zzzrg.zzYHK, zzzrg.zzYHJ);
    }

    @Override // com.aspose.words.zzY8Z
    public final void zzH(com.aspose.words.internal.zzZOW zzzow) throws Exception {
        Iterator<T> it = this.zzFJ.iterator();
        while (it.hasNext()) {
            zzY8Z.zzW((String) it.next(), zzzow);
        }
    }

    @Override // com.aspose.words.zzY8Z
    public final int zzY3A() {
        return this.zzFJ.size();
    }

    @Override // com.aspose.words.zzY8Z
    public final int zzY3z() {
        return 0;
    }

    public static void zzZ(com.aspose.words.internal.zzZOX zzzox, int i, int i2, ArrayList<String> arrayList) throws Exception {
        new zzY91(arrayList).zzT(zzzox, i, i2);
    }

    public static int zzZ(com.aspose.words.internal.zzZOW zzzow, ArrayList<String> arrayList) throws Exception {
        return new zzY91(arrayList).zzX(zzzow, false);
    }

    @Override // com.aspose.words.zzY8Z
    public final void zzZ(String str, com.aspose.words.internal.zzZOX zzzox) {
        com.aspose.words.internal.zzZQG.zzZ(this.zzFJ, str);
    }
}
