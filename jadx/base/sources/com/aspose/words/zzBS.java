package com.aspose.words;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzBS {
    public static void zzZ(String str, ArrayList<zzZCM> arrayList, zzZXR zzzxr) {
        Iterator<zzZCM> it = arrayList.iterator();
        while (it.hasNext()) {
            it.next().zzZ(str, zzzxr.zzZlV());
        }
    }
}
