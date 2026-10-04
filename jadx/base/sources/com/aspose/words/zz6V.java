package com.aspose.words;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes6.dex */
final class zz6V implements zzZCD {
    private zzZCF zzZ37 = new zz7L();

    @Override // com.aspose.words.zzZCD
    public final zz6W zzQ(String str, String str2, boolean z) {
        if (str == null) {
            throw new NullPointerException("Value cannot be null.\r\nParameter name: formula");
        }
        if (str2 != null) {
            return new zz6W(str2, this.zzZ37.zzOD(str), z);
        }
        throw new NullPointerException("Value cannot be null.\r\nParameter name: name");
    }

    @Override // com.aspose.words.zzZCD
    public final ArrayList<zz6W> zzZA4() {
        ArrayList<zz6W> arrayList = new ArrayList<>(34);
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("val 16200000", "3cd4", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("val 8100000", "3cd8", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("val 13500000", "5cd8", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("val 18900000", "7cd8", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("val 10800000", "cd2", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("val 5400000", "cd4", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("val 2700000", "cd8", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("val h", "b", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("val 0", "l", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("val 0", "t", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("val w", "r", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("*/ w 1.0 2.0", "hc", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("*/ h 1.0 2.0", "hd2", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("*/ h 1.0 3.0", "hd3", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("*/ h 1.0 4.0", "hd4", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("*/ h 1.0 5.0", "hd5", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("*/ h 1.0 6.0", "hd6", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("*/ h 1.0 8.0", "hd8", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("*/ h 1.0 2.0", "vc", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("*/ w 1.0 2.0", "wd2", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("*/ w 1.0 3.0", "wd3", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("*/ w 1.0 4.0", "wd4", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("*/ w 1.0 5.0", "wd5", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("*/ w 1.0 6.0", "wd6", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("*/ w 1.0 8.0", "wd8", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("*/ w 1.0 10.0", "wd10", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("*/ w 1.0 12.0", "wd12", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("*/ w 1.0 32.0", "wd32", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("max w h", "ls", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("min w h", "ss", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("*/ ss 1.0 2.0", "ssd2", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("*/ ss 1.0 4.0", "ssd4", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("*/ ss 1.0 6.0", "ssd6", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("*/ ss 1.0 8.0", "ssd8", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("*/ ss 1.0 16.0", "ssd16", false));
        com.aspose.words.internal.zzZQG.zzZ(arrayList, zzQ("*/ ss 1.0 32.0", "ssd32", false));
        return arrayList;
    }
}
