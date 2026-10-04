package com.aspose.slides;

import com.aspose.slides.internal.p482wr.C12249c5;
import com.aspose.slides.internal.p482wr.C12262lr;
import com.aspose.slides.internal.p482wr.C12275wy;

/* JADX INFO: loaded from: classes3.dex */
class mqz {

    /* JADX INFO: renamed from: k4 */
    agb f46285k4;

    /* JADX INFO: renamed from: x1 */
    Object f46286x1;

    /* JADX INFO: renamed from: k4 */
    public static byte[] m64939k4(C12275wy c12275wy, C12262lr c12262lr) {
        int iM57328c5 = (int) c12262lr.m57328c5();
        byte[] bArr = new byte[iM57328c5];
        C12249c5 c12249c5M57327bv = c12262lr.m57327bv();
        for (int i = 0; i < iM57328c5; i += c12249c5M57327bv.read(bArr, i, iM57328c5 - i)) {
            try {
            } finally {
                if (c12249c5M57327bv != null) {
                    c12249c5M57327bv.dispose();
                }
            }
        }
        return bArr;
    }
}
