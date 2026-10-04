package com.aspose.words.internal;

import java.util.Comparator;

/* JADX INFO: loaded from: classes5.dex */
final class zzA9 implements Comparator<String> {
    private static int zzu(String str, String str2) {
        int length = str.length();
        int length2 = str2.length();
        int iMin = Math.min(length, length2);
        int i = 0;
        while (true) {
            int i2 = iMin - 1;
            if (iMin == 0) {
                return length - length2;
            }
            char cZzZK = zzZKU.zzZK(str.charAt(i));
            char cZzZK2 = zzZKU.zzZK(str2.charAt(i));
            if (cZzZK != cZzZK2) {
                return cZzZK - cZzZK2;
            }
            i++;
            iMin = i2;
        }
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(String str, String str2) {
        return compare2(str, str2);
    }

    /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
    private static int compare2(String str, String str2) {
        int iZzZ7 = zzZKR.zzZ7(str.length(), str2.length());
        return iZzZ7 == 0 ? zzu(str, str2) : iZzZ7;
    }
}
