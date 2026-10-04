package com.aspose.words;

import java.util.Comparator;

/* JADX INFO: loaded from: classes6.dex */
final class zzZZ4 implements Comparator<String> {
    static Comparator<String> zzYTS = new zzZZ4();
    private static com.aspose.words.internal.zzD4 zzYTR = new com.aspose.words.internal.zzD4();

    static {
        int[] iArr = {33, 34, 35, 36, 37, 38, 40, 41, 42, 44, 46, 47, 58, 59, 63, 64, 91, 92, 39, 45, 93, 94, 95, 96, 123, 124, 125, 126, 43, 60, 61, 62};
        for (int i = 0; i < 32; i++) {
            int i2 = iArr[i];
            com.aspose.words.internal.zzD4 zzd4 = zzYTR;
            zzd4.add(i2, zzd4.getCount());
        }
    }

    private zzZZ4() {
    }

    private static int zzZ6(char c) {
        if (Character.isLetterOrDigit(c)) {
            return zzYTR.getCount() + (Character.toLowerCase(c) - '0');
        }
        int i = zzYTR.get(c);
        if (com.aspose.words.internal.zzD4.zzWm(i)) {
            return 0;
        }
        return i;
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(String str, String str2) {
        return compare2(str, str2);
    }

    /* JADX INFO: renamed from: compare, reason: avoid collision after fix types in other method */
    private static int compare2(String str, String str2) {
        int i = 0;
        if (com.aspose.words.internal.zzZKO.zzA(str, str2)) {
            return 0;
        }
        if (str == null) {
            return -1;
        }
        if (str2 == null) {
            return 1;
        }
        int length = str.length();
        int length2 = str2.length();
        for (int i2 = 0; i < length && i2 < length2; i2++) {
            int iZzZ6 = zzZ6(str.charAt(i));
            int iZzZ62 = zzZ6(str2.charAt(i2));
            if (iZzZ6 != iZzZ62) {
                return iZzZ6 - iZzZ62;
            }
            i++;
        }
        return length - length2;
    }
}
