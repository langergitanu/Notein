package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
public final class zzJ9 {
    public static ArrayList<String> zzU(String str, boolean z) throws Exception {
        ArrayList<String> arrayList = new ArrayList<>();
        if (z) {
            zzY(arrayList, str);
            return arrayList;
        }
        zzZQG.zzY((ArrayList) arrayList, zzZOV.zzVo(str));
        return arrayList;
    }

    private static void zzY(ArrayList<String> arrayList, String str) throws Exception {
        zzZQG.zzY((ArrayList) arrayList, zzZOV.zzVo(str));
        for (String str2 : zzZOV.zzVn(str)) {
            zzY(arrayList, str2);
        }
    }
}
