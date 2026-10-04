package com.aspose.slides.internal.p347px;

import com.aspose.slides.internal.p437u9.C11296k4;

/* JADX INFO: renamed from: com.aspose.slides.internal.px.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C9586h4 {

    /* JADX INFO: renamed from: k4 */
    private final C11296k4 f34601k4;

    public C9586h4(C11296k4 c11296k4) {
        this.f34601k4 = c11296k4;
    }

    /* JADX INFO: renamed from: du */
    public final C9583du m46820du() {
        return new C9583du(this);
    }

    /* JADX INFO: renamed from: k4 */
    public final short m46821k4() {
        return (short) (this.f34601k4.m54275h4() & 255);
    }

    /* JADX INFO: renamed from: kk */
    public final short m46823kk() {
        return (short) (this.f34601k4.m54275h4() & 255);
    }

    /* JADX INFO: renamed from: to */
    public final C11296k4 m46824to() {
        return this.f34601k4;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m46825x1() {
        return this.f34601k4.m54274du();
    }

    /* JADX INFO: renamed from: k4 */
    public final int[] m46822k4(short s, int i) {
        int[] iArr = new int[i];
        byte[] bArrM54277k4 = this.f34601k4.m54277k4(s * i);
        for (int i2 = 0; i2 < i; i2++) {
            for (int i3 = 0; i3 < s; i3++) {
                int i4 = iArr[i2] | (bArrM54277k4[(i2 * s) + i3] & 255);
                iArr[i2] = i4;
                if ((s - i3) - 1 > 0) {
                    iArr[i2] = i4 << 8;
                }
            }
        }
        return iArr;
    }
}
