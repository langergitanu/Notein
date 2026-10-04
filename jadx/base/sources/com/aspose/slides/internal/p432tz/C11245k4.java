package com.aspose.slides.internal.p432tz;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.words.EditingLanguage;
import com.aspose.words.StyleIdentifier;

/* JADX INFO: renamed from: com.aspose.slides.internal.tz.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11245k4 {

    /* JADX INFO: renamed from: k4 */
    static final int[] f38796k4 = {3, 7, 11, 17, 23, 29, 37, 47, 59, 71, 89, 107, 131, 163, 197, 239, StyleIdentifier.GRID_TABLE_7_COLORFUL_ACCENT_2, StyleIdentifier.LIST_TABLE_4_ACCENT_4, 431, 521, 631, 761, 919, EditingLanguage.SANSKRIT, 1327, 1597, 1931, 2333, 2801, 3371, 4049, 4861, 5839, 7013, 8419, 10103, 12143, 14591, 17519, 21023, 25229, 30293, 36353, 43627, 52361, 62851, 75431, 90523, 108631, 130363, 156437, 187751, 225307, 270371, 324449, 389357, 467237, 560689, 672827, 807403, 968897, 1162687, 1395263, 1674319, 2009191, 2411033, 2893249, 3471899, 4166287, 4999559, 5999471, 7199369};

    /* JADX INFO: renamed from: k4 */
    public static int m54232k4(int i) {
        if (i < 0) {
            throw new ArgumentException("Hashtable's capacity overflowed and went negative. Check load factor, capacity and the current size of the table");
        }
        int i2 = 0;
        while (true) {
            int[] iArr = f38796k4;
            if (i2 >= iArr.length) {
                for (int i3 = i | 1; i3 < Integer.MAX_VALUE; i3 += 2) {
                    if (m54233x1(i3)) {
                        return i3;
                    }
                }
                return i;
            }
            int i4 = iArr[i2];
            if (i4 >= i) {
                return i4;
            }
            i2++;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m54233x1(int i) {
        if ((i & 1) == 0) {
            return i == 2;
        }
        int iM67496rv = (int) C14116yg.m67496rv(i);
        for (int i2 = 3; i2 <= iM67496rv; i2 += 2) {
            if (i % i2 == 0) {
                return false;
            }
        }
        return true;
    }
}
