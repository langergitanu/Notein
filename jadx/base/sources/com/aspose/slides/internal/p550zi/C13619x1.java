package com.aspose.slides.internal.p550zi;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentOutOfRangeException;
import com.aspose.slides.exceptions.OutOfMemoryException;
import com.aspose.slides.internal.p385rr.C10052k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.p559ms.System.C14067j2;

/* JADX INFO: renamed from: com.aspose.slides.internal.zi.x1 */
/* JADX INFO: loaded from: classes5.dex */
public class C13619x1 {

    /* JADX INFO: renamed from: k4 */
    private static int f45224k4;

    /* JADX INFO: renamed from: k4 */
    public static int m62864k4() {
        return f45224k4;
    }

    /* JADX INFO: renamed from: x1 */
    public static boolean m62867x1(long j) {
        List list = new List();
        while (j > 0) {
            long j2 = j <= 2147483646 ? j : 2147483646L;
            j -= j2;
            try {
                list.addItem(new byte[(int) j2]);
            } catch (OutOfMemoryError unused) {
                if (C14067j2.m66729x1(list, null)) {
                    return false;
                }
                for (int size = list.size() - 1; size >= 0; size--) {
                    list.set_Item(size, null);
                }
                return false;
            } catch (Throwable th) {
                if (!C14067j2.m66729x1(list, null)) {
                    for (int size2 = list.size() - 1; size2 >= 0; size2--) {
                        list.set_Item(size2, null);
                    }
                }
                throw th;
            }
        }
        if (!C14067j2.m66729x1(list, null)) {
            for (int size3 = list.size() - 1; size3 >= 0; size3--) {
                list.set_Item(size3, null);
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m62865k4(long j) {
        if (j <= 0) {
            throw new ArgumentOutOfRangeException("bytesCount", "Expected positive number of bytes.");
        }
        byte[] bArr = null;
        int i = 2;
        while (bArr == null) {
            try {
                if (m62864k4() > 0 && j > m62864k4()) {
                    throw new OutOfMemoryException();
                }
                bArr = new byte[(int) j];
            } catch (OutOfMemoryError e) {
                long j2 = j / ((long) i);
                j = (j <= 1 || j2 != 0) ? j2 : 1L;
                i <<= 1;
                if (j == 0) {
                    throw e;
                }
            }
        }
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m62866k4(byte[] bArr, int i, int i2, byte[] bArr2, C12014ne c12014ne, boolean z) {
        int iM56668h4 = c12014ne.m56668h4();
        int iM56681to = c12014ne.m56681to();
        int iM56666dy = c12014ne.m56666dy();
        int iM56670k4 = c12014ne.m56670k4();
        int iM56663c5 = c12014ne.m56663c5();
        int iM56683x1 = c12014ne.m56683x1();
        if (iM56681to == 0 && iM56668h4 == i && iM56666dy == 0 && iM56670k4 == i2) {
            if (!z) {
                return bArr;
            }
            C10052k4.m49680k4(bArr, 0, bArr2, 0, i * i2);
            return bArr2;
        }
        if (iM56681to == 0 && iM56668h4 == i) {
            C10052k4.m49680k4(bArr, iM56666dy * i, bArr2, 0, iM56663c5 * iM56683x1);
            return bArr2;
        }
        int i3 = (iM56666dy * i) + iM56681to;
        for (int i4 = 0; i4 < iM56683x1; i4++) {
            C10052k4.m49680k4(bArr, (i4 * i) + i3, bArr2, i4 * iM56663c5, iM56663c5);
        }
        return bArr2;
    }
}
