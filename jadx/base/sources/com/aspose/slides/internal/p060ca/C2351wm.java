package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14092to;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.wm */
/* JADX INFO: loaded from: classes3.dex */
public class C2351wm {
    /* JADX INFO: renamed from: k4 */
    private int m11605k4(char c) {
        int iM11610x1 = m11610x1(c);
        if (iM11610x1 < 0 || iM11610x1 >= 6) {
            return 8;
        }
        return C2192m9.f7619k4[iM11610x1];
    }

    /* JADX INFO: renamed from: kk */
    private int m11609kk(char c) {
        return c & 65535;
    }

    /* JADX INFO: renamed from: x1 */
    private int m11610x1(char c) {
        int iM11606k4 = m11606k4((char) m11609kk(c), C2192m9.m11114k4());
        if (iM11606k4 < 0) {
            return 0;
        }
        return m11611x1(C2192m9.m11114k4()[iM11606k4].m10256kk()) & 65535;
    }

    /* JADX INFO: renamed from: k4 */
    private int m11606k4(char c, C2013bm[] c2013bmArr) {
        int length = c2013bmArr.length;
        int iM11607k4 = 1 << m11607k4(length);
        int i = length - iM11607k4;
        if (length == 0) {
            return -1;
        }
        if ((m11611x1(c2013bmArr[i].m10255k4()) & 65535) > c) {
            i = 0;
        }
        while (iM11607k4 > 1) {
            iM11607k4 >>= 1;
            int i2 = i + iM11607k4;
            if ((m11611x1(c2013bmArr[i2].m10255k4()) & 65535) <= c) {
                i = i2;
            }
        }
        if ((m11611x1(c2013bmArr[i].m10255k4()) & 65535) > c || (m11611x1(c2013bmArr[i].m10257x1()) & 65535) < c) {
            return -1;
        }
        return i;
    }

    /* JADX INFO: renamed from: x1 */
    private static int m11611x1(int i) {
        if ((32768 & i) == 0) {
            return i;
        }
        return (((i & 65280) >> 8) | ((i & 255) << 8)) & 65535;
    }

    /* JADX INFO: renamed from: x1 */
    private List<Long> m11612x1(String str) {
        int length = str.length();
        List<Long> list = new List<>(AbstractC14092to.m67254x1(AbstractC14092to.m67208k4(new long[length])));
        int i = length - 1;
        int i2 = length;
        int i3 = 0;
        boolean z = false;
        boolean z2 = false;
        while (i3 < length) {
            int iM11605k4 = m11605k4(str.charAt(i3));
            list.set_Item(i, Long.valueOf(iM11605k4 == 8 ? 0L : 2415788032L));
            if ((iM11605k4 & 4) == 0) {
                boolean z3 = (iM11605k4 & 8) == 0;
                boolean z4 = (iM11605k4 & 1) != 0;
                if (z2 && z4) {
                    if (z) {
                        m11608k4(i2, 2, list);
                    }
                    if (z3) {
                        m11608k4(i, 1, list);
                    }
                }
                z2 = (iM11605k4 & 2) != 0;
                i2 = i;
                z = z3;
            }
            i3++;
            i--;
        }
        return list;
    }

    /* JADX INFO: renamed from: k4 */
    public final C2084fc m11613k4(String str) {
        List<Long> listM11612x1 = m11612x1(str);
        listM11612x1.reverse();
        return new C2084fc(str, listM11612x1, null);
    }

    /* JADX INFO: renamed from: k4 */
    private static short m11607k4(int i) {
        byte b;
        if (i <= 0) {
            return (short) -32;
        }
        if (i >= 65536) {
            i >>= 16;
            b = (byte) 16;
        } else {
            b = 0;
        }
        if (i >= 256) {
            i >>= 8;
            b = (byte) ((b & 255) + 8);
        }
        if (i >= 16) {
            i >>= 4;
            b = (byte) ((b & 255) + 4);
        }
        if (i >= 4) {
            i >>= 2;
            b = (byte) ((b & 255) + 2);
        }
        if (i >= 2) {
            b = (byte) ((b & 255) + 1);
        }
        return (short) (b & 255);
    }

    /* JADX INFO: renamed from: k4 */
    private void m11608k4(int i, int i2, List<Long> list) {
        long jLongValue = list.get_Item(i).longValue();
        list.set_Item(i, Long.valueOf((jLongValue & (-4026531841L)) | C7019kk.m27461m9(Long.valueOf(((4026531840L & jLongValue) >> i2) & 4294967295L), 10)));
    }
}
