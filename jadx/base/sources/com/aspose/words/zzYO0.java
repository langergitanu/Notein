package com.aspose.words;

import java.util.Comparator;
import java.util.HashMap;

/* JADX INFO: loaded from: classes6.dex */
final class zzYO0 implements Comparator<String> {
    private static HashMap<String, Integer> zzXIr = zzYqU();

    private static HashMap<String, Integer> zzYqU() {
        HashMap<String, Integer> map = new HashMap<>();
        OooO0OO.OooO0O0(0, map, "/[Content_Types].xml", 1, "/_rels/.rels");
        map.put("/word/document.xml", 2);
        return map;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(String str, String str2) {
        return compare2(str, str2);
    }

    /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
    private static int compare2(String str, String str2) {
        if (str == null || str2 == null) {
            return com.aspose.words.internal.zzZYO.compare2(str, str2);
        }
        int iIntValue = ((Integer) com.aspose.words.internal.zzQW.zzZ(zzXIr, str, 3)).intValue();
        int iIntValue2 = ((Integer) com.aspose.words.internal.zzQW.zzZ(zzXIr, str2, 3)).intValue();
        return iIntValue == iIntValue2 ? com.aspose.words.internal.zzZYO.compare2(str, str2) : com.aspose.words.internal.zzZKR.zzZ7(iIntValue, iIntValue2);
    }
}
