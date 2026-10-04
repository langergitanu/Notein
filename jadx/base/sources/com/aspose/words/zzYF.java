package com.aspose.words;

import java.util.Iterator;

/* JADX INFO: loaded from: classes6.dex */
final class zzYF {
    private static int zzOZ(int i) {
        int[] iArr = {24, 28, 32, 36, 40};
        int i2 = iArr[0];
        int i3 = 0;
        for (int i4 = 0; i4 < 5; i4++) {
            int i5 = iArr[i4];
            int i6 = i % i5;
            if (i6 == 0) {
                return i5;
            }
            if (i6 > i3) {
                i2 = i5;
                i3 = i6;
            }
        }
        return i2;
    }

    public static long zzW(Document document) {
        Iterator<T> it = document.getSections().iterator();
        float fIntBitsToFloat = 0.0f;
        float fZzYz = 0.0f;
        while (it.hasNext()) {
            long pageSize = ((Section) it.next()).getPageSetup().getPageSize();
            int i = (int) pageSize;
            if (fIntBitsToFloat < Float.intBitsToFloat(i)) {
                fIntBitsToFloat = Float.intBitsToFloat(i);
            }
            if (fZzYz < com.aspose.words.internal.zzZPW.zzYz(pageSize)) {
                fZzYz = com.aspose.words.internal.zzZPW.zzYz(pageSize);
            }
        }
        return fIntBitsToFloat <= fZzYz ? com.aspose.words.internal.zzZPW.zzG(fIntBitsToFloat * 2.0f, fZzYz) : com.aspose.words.internal.zzZPW.zzG(fIntBitsToFloat, fZzYz * 2.0f);
    }

    private static int zzYD(int i, int i2) {
        if (i == 0 || 2147483644 < i) {
            return 2147483644;
        }
        if (i < 0) {
            return zzOZ(i2);
        }
        int i3 = i % 4;
        return i3 != 0 ? (4 - i3) + i : i;
    }

    public static zzYE[] zzp(int i, int i2, int i3) {
        int iZzYD = zzYD(i2, i);
        int i4 = i / iZzYD;
        if (i % iZzYD > 0) {
            i4++;
        }
        int i5 = (i / 4) + (i % 4 > 0 ? 1 : 0);
        int i6 = iZzYD / 4;
        zzYE[] zzyeArr = new zzYE[i5 * 2];
        boolean z = i3 != 4;
        int i7 = 0;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = i5 >= i6 ? i6 : i5;
            i5 -= i9;
            int i10 = i8 * iZzYD;
            int i11 = ((i9 * 4) + i10) - 1;
            for (int i12 = 0; i12 < i9; i12++) {
                int i13 = i12 * 2;
                int i14 = i10 + i13;
                int i15 = i11 - i13;
                int i16 = i7 + 1;
                zzyeArr[i7] = z ? new zzYE(i15, i14) : new zzYE(i14, i15);
                int i17 = i14 + 1;
                int i18 = i15 - 1;
                i7 += 2;
                zzyeArr[i16] = z ? new zzYE(i17, i18) : new zzYE(i18, i17);
            }
        }
        return zzyeArr;
    }
}
