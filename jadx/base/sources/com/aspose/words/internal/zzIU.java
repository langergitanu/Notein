package com.aspose.words.internal;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes5.dex */
final class zzIU {
    public static ArrayList<Integer> zzQ(long j, int i) {
        ArrayList<Integer> arrayList = new ArrayList<>(10);
        int iZzWn = zzWn(i);
        do {
            long j2 = iZzWn;
            zzZQG.zzZ(arrayList, Integer.valueOf((int) (j % j2)));
            j /= j2;
        } while (j > 0);
        return arrayList;
    }

    private static int zzWn(int i) {
        if (i == 1) {
            return 10;
        }
        if (i != 3) {
            return i != 4 ? 0 : 10000;
        }
        return 1000;
    }
}
