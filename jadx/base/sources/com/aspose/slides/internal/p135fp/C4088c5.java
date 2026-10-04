package com.aspose.slides.internal.p135fp;

import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.fp.c5 */
/* JADX INFO: loaded from: classes.dex */
public class C4088c5 {
    /* JADX INFO: renamed from: k4 */
    public static byte[][] m16260k4(byte[] bArr) {
        int iM67496rv = (int) C14116yg.m67496rv(bArr.length);
        byte[][] bArr2 = new byte[iM67496rv][];
        for (int i = 0; i < iM67496rv; i++) {
            bArr2[i] = new byte[iM67496rv];
            for (int i2 = 0; i2 < iM67496rv; i2++) {
                bArr2[i][i2] = bArr[(i2 * iM67496rv) + i];
            }
        }
        return bArr2;
    }

    /* JADX INFO: renamed from: k4 */
    public static C4105um[][] m16261k4(int i, int i2) {
        C4105um[][] c4105umArr = new C4105um[i][];
        for (int i3 = 0; i3 < i; i3++) {
            c4105umArr[i3] = new C4105um[i2];
        }
        return c4105umArr;
    }
}
