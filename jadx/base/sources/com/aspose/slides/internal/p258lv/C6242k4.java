package com.aspose.slides.internal.p258lv;

import com.aspose.slides.Collections.Generic.OooO00o;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3149x1;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p505xn.C12565ks;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: renamed from: com.aspose.slides.internal.lv.k4 */
/* JADX INFO: loaded from: classes4.dex */
public class C6242k4 {

    /* JADX INFO: renamed from: k4 */
    private byte f17673k4;

    /* JADX INFO: renamed from: kk */
    private C3149x1 f17674kk;

    /* JADX INFO: renamed from: x1 */
    private int f17675x1;

    public C6242k4(AbstractC3150x6 abstractC3150x6) {
        this.f17674kk = new C3149x1(abstractC3150x6);
    }

    /* JADX INFO: renamed from: k4 */
    public static int m25275k4(int[] iArr) {
        if (iArr.length == 0) {
            return 0;
        }
        long[] jArr = new long[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            int i2 = iArr[i];
            jArr[i] = i2 == Integer.MIN_VALUE ? 0L : ((long) C14116yg.m67482k4(i2)) & 4294967295L;
        }
        return m25276k4(jArr) + 1;
    }

    /* JADX INFO: renamed from: kk */
    public final void m25291kk(int i) {
        this.f17674kk.m13455x1(i);
    }

    /* JADX INFO: renamed from: x1 */
    public final C3149x1 m25292x1() {
        return this.f17674kk;
    }

    /* JADX INFO: renamed from: k4 */
    public static int m25276k4(long[] jArr) {
        long jM67508x1 = jArr[0];
        for (long j : jArr) {
            jM67508x1 = C14116yg.m67508x1(jM67508x1, j);
        }
        long j2 = jM67508x1 & 4294967295L;
        return (j2 != 0 ? C7019kk.m27462to(Double.valueOf(C14116yg.m67476k4(j2, 2.0d)), 14) : 0) + 1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25293x1(int i) {
        this.f17674kk.m13448k4((short) i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25280k4() {
        int i = this.f17675x1;
        if (i != 0) {
            if (i != 8) {
                m25294x1(0, 7 - i, false);
            }
            this.f17674kk.m13443k4(this.f17673k4);
            this.f17673k4 = (byte) 0;
            this.f17675x1 = 0;
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25294x1(int i, int i2, boolean z) {
        int i3 = (i2 / 8) + (i2 % 8 > 0 ? 1 : 0);
        int i4 = (i2 + 8) - (i3 * 8);
        byte[] bArr = new byte[4];
        C12565ks.m58613k4(i, bArr, 0);
        int i5 = i3 - 1;
        for (int i6 = i5; i6 >= 0; i6--) {
            if (i6 == i5) {
                m25277k4(bArr[i6], i4, false);
            } else {
                m25277k4(bArr[i6], 8, false);
            }
        }
        m25279k4(z);
    }

    /* JADX INFO: renamed from: k4 */
    private void m25277k4(byte b, int i, boolean z) {
        while (i > 0) {
            int i2 = this.f17675x1;
            this.f17673k4 = (byte) ((this.f17673k4 & 255) | (((byte) (((b & 255) << (8 - i)) >> i2)) & 255));
            int i3 = (i < 8 - i2 ? i : 8 - i2) + i2;
            this.f17675x1 = i3;
            i -= i3 - i2;
            m25279k4(false);
        }
        m25279k4(z);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m25295x1(C5656k4 c5656k4) {
        m25287k4(c5656k4);
        this.f17674kk.m13443k4((byte) c5656k4.m23105x1());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25281k4(double d, int i, boolean z) {
        if (i < 17) {
            throw new ArgumentException("length cannot be less than 18");
        }
        boolean z2 = d < 0.0d;
        if (z2) {
            d = d + 2.147483647E9d + 1.0d;
        }
        int iM27462to = C7019kk.m27462to(Double.valueOf(d), 14);
        int iOooO00o = OooO00o.OooO00o(d - ((double) iM27462to), 65536.0d, 14);
        if (z2) {
            iM27462to -= Integer.MAX_VALUE;
        }
        m25285k4(iM27462to, i - 16, false);
        m25294x1(iOooO00o, 16, false);
        m25279k4(z);
    }

    /* JADX INFO: renamed from: k4 */
    private void m25278k4(float f, float f2) {
        if (f < 0.0f) {
            f -= 1.0f;
        }
        if (f2 < 0.0f) {
            f2 -= 1.0f;
        }
        int iM25275k4 = m25275k4(new int[]{C7019kk.m27462to(Float.valueOf(f), 13), C7019kk.m27462to(Float.valueOf(f2), 13)}) + 16;
        m25294x1(iM25275k4, 5, false);
        m25281k4(f, iM25275k4, false);
        m25281k4(f2, iM25275k4, false);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25282k4(int i) {
        this.f17674kk.m13443k4((byte) i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25283k4(int i, int i2) {
        m25293x1((short) ((i << 6) | 63));
        m25291kk(i2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25284k4(int i, int i2, int i3, int i4) {
        int iM25275k4 = m25275k4(new int[]{i, i2, i3, i4});
        m25294x1(iM25275k4, 5, false);
        m25285k4(i, iM25275k4, false);
        m25285k4(i2, iM25275k4, false);
        m25285k4(i3, iM25275k4, false);
        m25285k4(i4, iM25275k4, true);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25285k4(int i, int i2, boolean z) {
        m25289k4(i < 0, false);
        if (i2 <= 1) {
            return;
        }
        m25294x1((int) (i < 0 ? (((long) i) + 4294967296L) & (4294967295 >> (33 - i2)) : C14116yg.m67482k4(i)), i2 - 1, z);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25286k4(C4317dy c4317dy) {
        boolean z = (c4317dy.m17347to() == 1.0f && c4317dy.m17346m9() == 1.0f) ? false : true;
        boolean z2 = (c4317dy.m17329du() == 0.0f && c4317dy.m17331h4() == 0.0f) ? false : true;
        m25289k4(z, false);
        if (z) {
            m25278k4(c4317dy.m17347to(), c4317dy.m17346m9());
        }
        m25289k4(z2, false);
        if (z2) {
            m25278k4(c4317dy.m17329du(), c4317dy.m17331h4());
        }
        int iM58608k4 = C12565ks.m58608k4(c4317dy.m17330dy());
        int iM58608k42 = C12565ks.m58608k4(c4317dy.m17328c5());
        int iM25275k4 = m25275k4(new int[]{iM58608k4, iM58608k42});
        m25294x1(iM25275k4, 5, false);
        m25285k4(iM58608k4, iM25275k4, false);
        m25285k4(iM58608k42, iM25275k4, true);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25287k4(C5656k4 c5656k4) {
        this.f17674kk.m13443k4((byte) c5656k4.m23102kk());
        this.f17674kk.m13443k4((byte) c5656k4.m23104to());
        this.f17674kk.m13443k4((byte) c5656k4.m23099du());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25288k4(String str) {
        this.f17674kk.m13450k4(AbstractC6747ar.m26635ix().mo26677to(str));
        this.f17674kk.m13443k4((byte) 0);
    }

    /* JADX INFO: renamed from: k4 */
    private void m25279k4(boolean z) {
        if ((!z || this.f17675x1 == 0) && this.f17675x1 != 8) {
            return;
        }
        m25280k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25289k4(boolean z, boolean z2) {
        int i = this.f17675x1 + 1;
        this.f17675x1 = i;
        if (z) {
            this.f17673k4 = (byte) ((this.f17673k4 & 255) | (((byte) (1 << (8 - i))) & 255));
        }
        m25279k4(z2);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m25290k4(byte[] bArr) {
        this.f17674kk.m13450k4(bArr);
    }
}
