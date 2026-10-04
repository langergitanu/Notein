package com.aspose.slides.internal.p240kw;

import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p329p4.C7179c5;
import com.aspose.slides.internal.p329p4.C7185jd;
import com.aspose.slides.internal.p329p4.C7186k4;
import com.aspose.slides.internal.p329p4.C7191up;

/* JADX INFO: renamed from: com.aspose.slides.internal.kw.k4 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC5994k4 {

    /* JADX INFO: renamed from: k4 */
    private String f16921k4;

    /* JADX INFO: renamed from: kk */
    private String f16922kk;

    /* JADX INFO: renamed from: to */
    private int f16923to;

    /* JADX INFO: renamed from: x1 */
    private String f16924x1;

    /* JADX INFO: renamed from: k4 */
    private static int m24209k4(byte[] bArr) {
        int i = 0;
        for (byte b : bArr) {
            i = (i << 8) | (b & 255);
        }
        return i;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract void mo24213k4(C7191up c7191up, C7185jd c7185jd);

    /* JADX INFO: renamed from: kk */
    public void m24216kk(String str) {
        this.f16924x1 = str;
    }

    /* JADX INFO: renamed from: x1 */
    public void m24217x1(String str) {
        this.f16922kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public void m24212k4(int i) {
        this.f16923to = i;
    }

    /* JADX INFO: renamed from: k4 */
    private static void m24210k4(int i, byte[] bArr) {
        for (int length = bArr.length - 1; length >= 0; length--) {
            bArr[length] = (byte) i;
            i >>= 8;
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m24214k4(C7191up c7191up, C7191up c7191up2, C7185jd c7185jd) {
        C7185jd c7191up3;
        byte[] bArrM24211k4 = m24211k4(c7191up);
        byte[] bArrM24211k42 = m24211k4(c7191up2);
        if (bArrM24211k4.length != bArrM24211k42.length || bArrM24211k4.length == 0) {
            throw new ArgumentException("Invalid map");
        }
        byte[] bArrM24211k43 = C7019kk.m27469x1(c7185jd, C7191up.class) ? m24211k4((C7191up) c7185jd) : null;
        int iM24209k4 = m24209k4(bArrM24211k4);
        int iM24209k42 = m24209k4(bArrM24211k42);
        for (int i = iM24209k4; i <= iM24209k42; i++) {
            m24210k4(i, bArrM24211k4);
            C7191up c7191up4 = new C7191up(bArrM24211k4);
            if (C7019kk.m27469x1(c7185jd, C7186k4.class)) {
                c7191up3 = ((C7186k4) c7185jd).m27785kk(i - iM24209k4);
            } else {
                if (C7019kk.m27469x1(c7185jd, C7179c5.class)) {
                    mo24213k4(c7191up4, new C7179c5((((C7179c5) c7185jd).m27752kk() + i) - iM24209k4));
                } else if (C7019kk.m27469x1(c7185jd, C7191up.class)) {
                    c7191up3 = new C7191up(bArrM24211k43);
                    int length = bArrM24211k43.length - 1;
                    bArrM24211k43[length] = (byte) (bArrM24211k43[length] + 1);
                }
            }
            mo24213k4(c7191up4, c7191up3);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public void m24215k4(String str) {
        this.f16921k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public static byte[] m24211k4(C7191up c7191up) {
        byte[] bArrM27846k4 = c7191up.m27846k4();
        byte[] bArr = new byte[bArrM27846k4.length];
        System.arraycopy(bArrM27846k4, 0, bArr, 0, bArrM27846k4.length);
        return bArr;
    }
}
