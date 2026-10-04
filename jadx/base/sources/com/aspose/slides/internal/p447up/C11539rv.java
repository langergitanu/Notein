package com.aspose.slides.internal.p447up;

import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5796m9;
import com.aspose.slides.internal.p270m9.C6344m9;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.up.rv */
/* JADX INFO: loaded from: classes4.dex */
public final class C11539rv {

    /* JADX INFO: renamed from: k4 */
    private AbstractC5788h4[] f39031k4;

    /* JADX INFO: renamed from: kk */
    private C6344m9 f39032kk;

    /* JADX INFO: renamed from: x1 */
    private short[] f39033x1;

    public C11539rv(C6344m9 c6344m9) {
        this.f39032kk = c6344m9;
        int iM25981du = c6344m9.m25981du() + 1;
        this.f39031k4 = new AbstractC5788h4[iM25981du];
        this.f39033x1 = new short[iM25981du];
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC5788h4 m54525k4(int i) {
        return this.f39031k4[i];
    }

    /* JADX INFO: renamed from: kk */
    public final void m54528kk(int i, boolean z) {
        if (z) {
            short[] sArr = this.f39033x1;
            sArr[i] = (short) (sArr[i] | 4);
        } else {
            short[] sArr2 = this.f39033x1;
            sArr2[i] = (short) (sArr2[i] & (-5));
        }
    }

    /* JADX INFO: renamed from: to */
    public final boolean m54530to(int i) {
        return (this.f39033x1[i] & 4) != 0;
    }

    public String toString() {
        C6765kp c6765kp = new C6765kp();
        int i = 0;
        while (true) {
            AbstractC5788h4[] abstractC5788h4Arr = this.f39031k4;
            if (i >= abstractC5788h4Arr.length) {
                return c6765kp.toString();
            }
            AbstractC5788h4 abstractC5788h4 = abstractC5788h4Arr[i];
            if (abstractC5788h4 != null) {
                String strM26010x1 = this.f39032kk.m26010x1(i);
                c6765kp.m26792k4(strM26010x1);
                c6765kp.m26792k4(": ");
                if ("font-family".equals(strM26010x1)) {
                    C5796m9 c5796m9 = (C5796m9) C7019kk.m27452k4((Object) abstractC5788h4, C5796m9.class);
                    if (c5796m9 != null) {
                        if (c5796m9.mo23681k4() > 0) {
                            c6765kp.m26792k4(c5796m9.mo23682k4(0).mo23414h4());
                        }
                        for (int i2 = 1; i2 < c5796m9.mo23681k4(); i2++) {
                            c6765kp.m26792k4(", ");
                            c6765kp.m26792k4(c5796m9.mo23682k4(i2).mo23414h4());
                        }
                    }
                } else {
                    c6765kp.m26791k4(abstractC5788h4);
                }
                if (m54532x1(i)) {
                    c6765kp.m26792k4(" !important");
                }
                c6765kp.m26792k4(";\n");
            }
            i++;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m54531x1(int i, boolean z) {
        if (z) {
            short[] sArr = this.f39033x1;
            sArr[i] = (short) (sArr[i] | 2);
        } else {
            short[] sArr2 = this.f39033x1;
            sArr2[i] = (short) (sArr2[i] & (-3));
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54526k4(int i, AbstractC5788h4 abstractC5788h4) {
        this.f39031k4[i] = abstractC5788h4;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m54529kk(int i) {
        return (this.f39033x1[i] & 2) != 0;
    }

    /* JADX INFO: renamed from: x1 */
    public final boolean m54532x1(int i) {
        return (this.f39033x1[i] & 1) != 0;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m54527k4(int i, boolean z) {
        if (z) {
            short[] sArr = this.f39033x1;
            sArr[i] = (short) (sArr[i] | 1);
        } else {
            short[] sArr2 = this.f39033x1;
            sArr2[i] = (short) (sArr2[i] & (-2));
        }
    }
}
