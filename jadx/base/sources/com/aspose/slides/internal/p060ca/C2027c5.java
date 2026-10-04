package com.aspose.slides.internal.p060ca;

import com.aspose.slides.Collections.Generic.List;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.c5 */
/* JADX INFO: loaded from: classes3.dex */
public class C2027c5 {
    /* JADX INFO: renamed from: k4 */
    public static byte[] m10303k4(List<Byte> list) {
        int size = list.size();
        byte[] bArr = new byte[size];
        for (int i = 0; i < size; i++) {
            bArr[i] = list.get_Item(i).byteValue();
        }
        return bArr;
    }

    /* JADX INFO: renamed from: x1 */
    public static int[] m10306x1(List<Integer> list) {
        int size = list.size();
        int[] iArr = new int[size];
        for (int i = 0; i < size; i++) {
            iArr[i] = list.get_Item(i).intValue();
        }
        return iArr;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m10304k4(Byte[] bArr) {
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        for (int i = 0; i < length; i++) {
            bArr2[i] = bArr[i].byteValue();
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public static double[] m10305k4(double[] dArr) {
        return (double[]) dArr.clone();
    }
}
