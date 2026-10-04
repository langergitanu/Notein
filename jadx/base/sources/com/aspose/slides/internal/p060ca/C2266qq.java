package com.aspose.slides.internal.p060ca;

import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.qq */
/* JADX INFO: loaded from: classes3.dex */
public class C2266qq {
    /* JADX INFO: renamed from: k4 */
    public static AbstractC6747ar m11310k4(String str) {
        return AbstractC6747ar.m26640kk(str);
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m11311k4(byte[] bArr, int i, byte[] bArr2) {
        if (bArr2.length + i > bArr.length) {
            return false;
        }
        for (int i2 = i; i2 < bArr2.length + i; i2++) {
            if (C7019kk.m27462to(Byte.valueOf(bArr[i2]), 6) != C7019kk.m27462to(Byte.valueOf(bArr2[i2 - i]), 6)) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: k4 */
    public static boolean m11312k4(byte[] bArr, byte[] bArr2) {
        if (bArr.length != bArr2.length) {
            return false;
        }
        for (int i = 0; i < bArr.length; i++) {
            if (m11311k4(bArr, i, bArr2)) {
                return true;
            }
        }
        return false;
    }
}
