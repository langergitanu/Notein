package com.aspose.slides.internal.p353q7;

import com.aspose.slides.internal.p505xn.C12564kk;
import com.aspose.slides.internal.p505xn.C12570to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.q7.t6 */
/* JADX INFO: loaded from: classes4.dex */
public class C9788t6 {

    /* JADX INFO: renamed from: k4 */
    public String f35381k4;

    /* JADX INFO: renamed from: kk */
    public int f35382kk;

    /* JADX INFO: renamed from: to */
    public int f35383to;

    /* JADX INFO: renamed from: x1 */
    public int f35384x1;

    public C9788t6(C12564kk c12564kk) {
        this.f35381k4 = C14113y2.m67405k4(c12564kk.m58607x1(4));
        this.f35384x1 = c12564kk.m58606x1();
        this.f35382kk = c12564kk.m58606x1();
        this.f35383to = c12564kk.m58606x1();
    }

    /* JADX INFO: renamed from: k4 */
    public static int m48158k4(byte[] bArr, int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i2 / 4;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            int i10 = bArr[i] & 255;
            int i11 = bArr[i + 1] & 255;
            int i12 = i + 3;
            int i13 = bArr[i + 2] & 255;
            i += 4;
            i8 += (i11 << 16) | (i13 << 8) | (bArr[i12] & 255) | (i10 << 24);
        }
        if (i < i2) {
            i3 = i + 1;
            i4 = bArr[i] & 255;
        } else {
            i3 = i;
            i4 = 0;
        }
        if (i3 < i2) {
            i5 = i3 + 1;
            i6 = bArr[i3] & 255;
        } else {
            i5 = i3;
            i6 = 0;
        }
        return i8 + (((i5 < i2 ? bArr[i5] & 255 : 0) << 8) | (i6 << 16) | (i4 << 24));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48159k4(C12570to c12570to) {
        for (int i = 0; i < this.f35381k4.length(); i++) {
            c12570to.m58667k4((byte) this.f35381k4.charAt(i));
        }
        c12570to.m58668k4(this.f35384x1);
        c12570to.m58668k4(this.f35382kk);
        c12570to.m58668k4(this.f35383to);
    }
}
