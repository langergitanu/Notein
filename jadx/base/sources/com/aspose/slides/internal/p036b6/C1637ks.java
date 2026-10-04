package com.aspose.slides.internal.p036b6;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p463vm.C11697x1;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14098up;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14114y9;
import com.microsoft.identity.common.java.cache.CacheKeyValueDelegate;

/* JADX INFO: renamed from: com.aspose.slides.internal.b6.ks */
/* JADX INFO: loaded from: classes3.dex */
public class C1637ks {
    /* JADX INFO: renamed from: k4 */
    private static double m8880k4(C1636kp c1636kp) {
        String[] strArr = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", ".", "E", "E-", null, CacheKeyValueDelegate.CACHE_VALUE_SEPARATOR};
        String strM67400k4 = "";
        while (true) {
            byte bM8870kk = c1636kp.m8870kk();
            int i = (bM8870kk & 255) >> 4;
            int i2 = bM8870kk & 15;
            int i3 = i & 255;
            if (i3 == 15) {
                break;
            }
            strM67400k4 = C14113y2.m67400k4(strM67400k4, strArr[i3]);
            if (i2 == 15) {
                break;
            }
            strM67400k4 = C14113y2.m67400k4(strM67400k4, strArr[i2]);
        }
        return C14044b3.m66428k4(strM67400k4, C11697x1.m55250kk());
    }

    /* JADX INFO: renamed from: kk */
    public static String[] m8886kk(C1636kp c1636kp, long j, long j2, Object[] objArr) {
        c1636kp.m8868k4(j);
        List list = new List();
        long j3 = (j2 & 4294967295L) - 1;
        list.addItem(".notdef");
        byte bM8870kk = c1636kp.m8870kk();
        int i = bM8870kk & 255;
        if (i == 0) {
            for (int i2 = 0; i2 < (j3 & 4294967295L); i2++) {
                list.addItem(m8884k4(objArr, c1636kp.m8874to() & 65535));
            }
        } else if (i == 1) {
            while (list.size() <= (j3 & 4294967295L)) {
                int iM8874to = c1636kp.m8874to();
                long jM8870kk = c1636kp.m8870kk() & 255;
                for (int i3 = 0; i3 <= (jM8870kk & 4294967295L); i3++) {
                    int i4 = iM8874to & 65535;
                    list.addItem(m8884k4(objArr, i4));
                    iM8874to = (i4 + 1) & 65535;
                }
            }
        } else {
            if (i != 2) {
                throw new Exception(C14113y2.m67408k4("Unknown charset format ", C14098up.m67323x1(bM8870kk)));
            }
            while (list.size() <= (j3 & 4294967295L)) {
                int iM8874to2 = c1636kp.m8874to();
                long jM8874to = c1636kp.m8874to() & 65535;
                for (int i5 = 0; i5 <= (jM8874to & 4294967295L); i5++) {
                    int i6 = iM8874to2 & 65535;
                    list.addItem(m8884k4(objArr, i6));
                    iM8874to2 = (i6 + 1) & 65535;
                }
            }
        }
        return (String[]) list.toArray(new String[0]);
    }

    /* JADX INFO: renamed from: x1 */
    public static Dictionary<String, Object[]> m8887x1(C1636kp c1636kp, long j, long j2, Object[] objArr) {
        return m8881k4(m8882k4(c1636kp, j, j2), C1665yj.m9047h4(), objArr);
    }

    /* JADX INFO: renamed from: k4 */
    private static Dictionary<String, Object[]> m8881k4(Dictionary<Object, Object[]> dictionary, C1665yj[] c1665yjArr, Object[] objArr) {
        Dictionary<String, Object[]> dictionary2 = new Dictionary<>();
        for (C1665yj c1665yj : c1665yjArr) {
            Object[][] objArr2 = {null};
            boolean zTryGetValue = dictionary.tryGetValue(Long.valueOf(c1665yj.m9055x1()), objArr2);
            Object[] objArr3 = objArr2[0];
            if (!zTryGetValue) {
                objArr3 = c1665yj.m9054to() != null ? new Object[]{c1665yj.m9054to()} : null;
            }
            if ("SID".equals(c1665yj.m9053kk())) {
                objArr3 = new Object[]{objArr3 != null ? m8884k4(objArr, ((Integer) C7019kk.m27464to(objArr3[0], Integer.TYPE)).intValue()) : null};
            }
            dictionary2.addItem(c1665yj.m9052k4(), objArr3);
        }
        return dictionary2;
    }

    /* JADX INFO: renamed from: x1 */
    private static Object m8888x1(C1636kp c1636kp, long j) {
        long j2 = j & 4294967295L;
        if (j2 == 28) {
            return Integer.valueOf((int) ((((c1636kp.m8870kk() & 255) & 4294967295L) << 8) | ((long) (c1636kp.m8870kk() & 255))));
        }
        if (j2 == 29) {
            return Integer.valueOf((int) ((((c1636kp.m8870kk() & 255) & 4294967295L) << 24) | (((c1636kp.m8870kk() & 255) & 4294967295L) << 16) | ((4294967295L & (c1636kp.m8870kk() & 255)) << 8) | ((long) (c1636kp.m8870kk() & 255))));
        }
        if (j2 == 30) {
            return Double.valueOf(m8880k4(c1636kp));
        }
        if (j2 >= 32 && j2 <= 246) {
            return Integer.valueOf((int) (j2 - 139));
        }
        if (j2 >= 247 && j2 <= 250) {
            return Integer.valueOf((int) (((((((j2 - 247) & 4294967295L) * 256) & 4294967295L) + (((long) (c1636kp.m8870kk() & 255)) & 4294967295L)) & 4294967295L) + 108));
        }
        if (j2 < 251 || j2 > 254) {
            throw new Exception(C14113y2.m67408k4("Invalid b0 ", C14114y9.m67465x1(j), ",at:", C14114y9.m67465x1(c1636kp.m8865k4())));
        }
        return Integer.valueOf((int) ((((-((j2 - 251) & 4294967295L)) * 256) - (((long) (c1636kp.m8870kk() & 255)) & 4294967295L)) - 108));
    }

    /* JADX INFO: renamed from: k4 */
    private static Dictionary<Object, Object[]> m8882k4(C1636kp c1636kp, long j, long j2) {
        c1636kp.m8868k4(j);
        Dictionary<Object, Object[]> dictionary = new Dictionary<>();
        List list = new List();
        long jM8865k4 = (c1636kp.m8865k4() & 4294967295L) + (j2 & 4294967295L);
        while ((c1636kp.m8865k4() & 4294967295L) < (jM8865k4 & 4294967295L)) {
            long jM8870kk = c1636kp.m8870kk() & 255;
            long j3 = jM8870kk & 4294967295L;
            if (j3 <= 21) {
                if (j3 == 12) {
                    jM8870kk = (((long) (c1636kp.m8870kk() & 255)) + 1200) & 4294967295L;
                }
                if (dictionary.containsKey(Long.valueOf(jM8870kk))) {
                    C6005k4.m24259k4(C14113y2.m67408k4("Double encounter / Dict already has key:", C14114y9.m67465x1(jM8870kk)));
                } else {
                    dictionary.addItem(Long.valueOf(jM8870kk), list.toArray(new Object[0]));
                    list.clear();
                }
            } else {
                list.addItem(m8888x1(c1636kp, jM8870kk));
            }
        }
        return dictionary;
    }

    /* JADX INFO: renamed from: k4 */
    public static Dictionary<String, Object[]> m8883k4(C1636kp c1636kp, long j, long j2, Object[] objArr) {
        return m8881k4(m8882k4(c1636kp, j, j2), C1665yj.m9046du(), objArr);
    }

    /* JADX INFO: renamed from: k4 */
    private static String m8884k4(Object[] objArr, int i) {
        return i <= 390 ? C1643rv.m8903k4()[i] : (String) objArr[i - 391];
    }

    /* JADX INFO: renamed from: k4 */
    public static String[] m8885k4(C1636kp c1636kp, long j) {
        c1636kp.m8868k4(j);
        String[] strArr = new String[255];
        byte bM8870kk = c1636kp.m8870kk();
        int i = bM8870kk & 255;
        byte b = 0;
        if (i == 0) {
            byte bM8870kk2 = c1636kp.m8870kk();
            while (true) {
                int i2 = b & 255;
                if (i2 >= (bM8870kk2 & 255)) {
                    break;
                }
                strArr[c1636kp.m8870kk() & 255] = C14098up.m67323x1(b);
                b = (byte) (i2 + 1);
            }
        } else {
            if (i != 1) {
                throw new Exception(C14113y2.m67408k4("Unknown encoding format ", C14098up.m67323x1(bM8870kk)));
            }
            byte bM8870kk3 = c1636kp.m8870kk();
            byte b2 = 1;
            while (true) {
                int i3 = b & 255;
                if (i3 >= (bM8870kk3 & 255)) {
                    break;
                }
                byte bM8870kk4 = c1636kp.m8870kk();
                byte bM8870kk5 = c1636kp.m8870kk();
                byte b3 = bM8870kk4;
                while (true) {
                    int i4 = b3 & 255;
                    if (i4 <= (bM8870kk4 & 255) + (bM8870kk5 & 255)) {
                        strArr[i4] = C14098up.m67323x1(b2);
                        b2 = (byte) ((b2 & 255) + 1);
                        b3 = (byte) (i4 + 1);
                    }
                }
                b = (byte) (i3 + 1);
            }
        }
        return strArr;
    }
}
