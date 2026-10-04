package com.aspose.slides.internal.p437u9;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.u9.du */
/* JADX INFO: loaded from: classes4.dex */
public class C11292du {

    /* JADX INFO: renamed from: x1 */
    private static final char[] f38870x1 = {';'};

    /* JADX INFO: renamed from: kk */
    private static final char[] f38868kk = {','};

    /* JADX INFO: renamed from: to */
    private static final char[] f38869to = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* JADX INFO: renamed from: k4 */
    public static final byte[] f38867k4 = new byte[0];

    /* JADX INFO: renamed from: k4 */
    public static void m54263k4(int i, byte[] bArr, int i2) {
        for (int i3 = 0; i3 < 4; i3++) {
            bArr[i2 + i3] = (byte) i;
            i >>= 8;
        }
    }

    /* JADX INFO: renamed from: kk */
    public static long[] m54269kk(List<Long> list) {
        int size = list.size();
        long[] jArr = new long[size];
        for (int i = 0; i < size; i++) {
            jArr[i] = list.get_Item(i).longValue();
        }
        return jArr;
    }

    /* JADX INFO: renamed from: to */
    public static double[] m54270to(List<Double> list) {
        int size = list.size();
        double[] dArr = new double[size];
        for (int i = 0; i < size; i++) {
            dArr[i] = list.get_Item(i).doubleValue();
        }
        return dArr;
    }

    /* JADX INFO: renamed from: x1 */
    public static int[] m54271x1(List<Integer> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = list.get_Item(i).intValue();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m54264k4(String str) {
        return str != null && str.length() > 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m54265k4(String str, String str2) {
        return str.equalsIgnoreCase(str2);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m54266k4(String str, String str2, boolean z) {
        if (z) {
            str = C14113y2.m67358c5(str);
            str2 = C14113y2.m67358c5(str2);
        }
        return C14113y2.m67364dy(str, str2) >= 0;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m54267k4(List<Byte> list) {
        int size = list.size();
        byte[] bArr = new byte[size];
        for (int i = 0; i < size; i++) {
            bArr[i] = list.get_Item(i).byteValue();
        }
        return bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static Byte[] m54268k4(byte[] bArr) {
        int length = bArr.length;
        Byte[] bArr2 = new Byte[length];
        for (int i = 0; i < length; i++) {
            bArr2[i] = Byte.valueOf(bArr[i]);
        }
        return bArr2;
    }
}
