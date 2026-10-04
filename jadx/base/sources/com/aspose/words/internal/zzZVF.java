package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzZVF {
    private static String[] zz7l = {null, "một", "hai", "ba", "bốn", "năm", "sáu", "bảy", "tám", "chín"};

    public static String zzYV(long j) {
        if (j < 0) {
            return "";
        }
        if (j == 0 || j > 1000) {
            return "không";
        }
        if (j == 1000) {
            return androidx.concurrent.futures.OooO00o.OooO0OO(new StringBuilder(), zz7l[1], " ngàn");
        }
        ArrayList<Integer> arrayListZzQ = zzIU.zzQ(j, 1);
        int iIntValue = arrayListZzQ.get(0).intValue();
        int iIntValue2 = arrayListZzQ.size() > 1 ? arrayListZzQ.get(1).intValue() : 0;
        int iIntValue3 = arrayListZzQ.size() > 2 ? arrayListZzQ.get(2).intValue() : 0;
        ArrayList arrayList = new ArrayList();
        if (iIntValue3 != 0) {
            zzZQG.zzZ((ArrayList<String>) arrayList, zz7l[iIntValue3]);
            zzZQG.zzZ((ArrayList<String>) arrayList, "trăm");
        }
        if (iIntValue2 != 0) {
            if (iIntValue2 == 1) {
                zzZQG.zzZ((ArrayList<String>) arrayList, "mười");
            } else {
                zzZQG.zzZ((ArrayList<String>) arrayList, zz7l[iIntValue2]);
                zzZQG.zzZ((ArrayList<String>) arrayList, "mươi");
            }
        }
        if (iIntValue != 0) {
            if (iIntValue3 == 1 && iIntValue2 == 0) {
                zzZQG.zzZ((ArrayList<String>) arrayList, "lẻ");
            }
            if (iIntValue == 1 && iIntValue2 > 1) {
                zzZQG.zzZ((ArrayList<String>) arrayList, "mốt");
            } else if (iIntValue != 5 || iIntValue2 == 0) {
                zzZQG.zzZ((ArrayList<String>) arrayList, zz7l[iIntValue]);
            } else {
                zzZQG.zzZ((ArrayList<String>) arrayList, "lăm");
            }
        }
        return zzZKN.zzY(" ", (String[]) arrayList.toArray(new String[0]));
    }
}
