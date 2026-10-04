package com.aspose.slides.internal.p353q7;

import com.aspose.slides.internal.p505xn.C12564kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C9772h4 {

    /* JADX INFO: renamed from: k4 */
    private final C12564kk f35306k4;

    public C9772h4(C12564kk c12564kk) {
        this.f35306k4 = c12564kk;
    }

    /* JADX INFO: renamed from: du */
    public final C9765du m48084du() {
        return new C9765du(this);
    }

    /* JADX INFO: renamed from: k4 */
    public final short m48085k4() {
        return (short) (this.f35306k4.m58601h4() & 255);
    }

    /* JADX INFO: renamed from: kk */
    public final short m48087kk() {
        return (short) (this.f35306k4.m58601h4() & 255);
    }

    /* JADX INFO: renamed from: to */
    public final C12564kk m48088to() {
        return this.f35306k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m48089x1() {
        return this.f35306k4.m58600du();
    }

    /* JADX INFO: renamed from: k4 */
    public final int[] m48086k4(short s, int i) {
        int[] iArr = new int[i];
        byte[] bArrM58603k4 = this.f35306k4.m58603k4(s * i);
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < s; i3++) {
                int i4 = iArr[i2] | (bArrM58603k4[(i2 * s) + i3] & 255);
                iArr[i2] = i4;
                if ((s - i3) - 1 > 0) {
                    iArr[i2] = i4 << 8;
                }
            }
        }
        return iArr;
    }
}
