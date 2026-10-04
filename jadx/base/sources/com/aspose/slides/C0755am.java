package com.aspose.slides;

import com.aspose.slides.exceptions.NotImplementedException;
import com.aspose.slides.internal.p129fe.C3983k4;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12014ne;
import com.aspose.slides.internal.p475wh.C12023wl;

/* JADX INFO: renamed from: com.aspose.slides.am */
/* JADX INFO: loaded from: classes3.dex */
class C0755am {

    /* JADX INFO: renamed from: k4 */
    private byte[] f3924k4;

    /* JADX INFO: renamed from: kk */
    private int f3925kk;

    /* JADX INFO: renamed from: to */
    private int f3926to;

    /* JADX INFO: renamed from: x1 */
    private C12023wl f3927x1 = new C12023wl();

    /* JADX INFO: renamed from: du */
    public final C12023wl m3671du() {
        return this.f3927x1;
    }

    /* JADX INFO: renamed from: h4 */
    public final C12009k4 m3672h4() {
        C12009k4 c12009k4 = new C12009k4(m3674k4(), m3678x1(), m3676kk());
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 2, m3676kk());
        System.arraycopy(this.f3924k4, 0, c3983k4M56597k4.m15721to().m67356kk().m19850k4(), 0, this.f3924k4.length);
        c12009k4.m56605k4(c3983k4M56597k4);
        return c12009k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m3673k4(int i, int i2) {
        if (m3676kk() != 139273) {
            throw new NotImplementedException();
        }
        int iM3677to = (i * 4) + (i2 * m3677to());
        byte[] bArr = this.f3924k4;
        return (byte) C22201OooO0oO.OooO00o(((double) (bArr[iM3677to + 2] & 255)) * 0.114d, (((double) (bArr[iM3677to + 1] & 255)) * 0.587d) + (((double) (bArr[iM3677to] & 255)) * 0.299d), 14);
    }

    /* JADX INFO: renamed from: kk */
    public final int m3676kk() {
        return this.f3926to;
    }

    /* JADX INFO: renamed from: to */
    public final int m3677to() {
        return this.f3925kk;
    }

    /* JADX INFO: renamed from: x1 */
    public final int m3678x1() {
        return this.f3927x1.m56862kk();
    }

    /* JADX INFO: renamed from: k4 */
    public final int m3674k4() {
        return this.f3927x1.m56865x1();
    }

    /* JADX INFO: renamed from: k4 */
    public static C0755am m3668k4(int i, int i2, int i3) {
        C12009k4 c12009k4 = new C12009k4(i, i2, i3);
        try {
            return m3669k4(c12009k4);
        } finally {
            c12009k4.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static C0755am m3669k4(C12009k4 c12009k4) {
        C0755am c0755am = new C0755am();
        c0755am.f3927x1 = new C12023wl(c12009k4.mo15760yj(), c12009k4.mo15757m9());
        c0755am.f3926to = c12009k4.mo15753jd();
        C3983k4 c3983k4M56597k4 = c12009k4.m56597k4(new C12014ne(0, 0, c12009k4.mo15760yj(), c12009k4.mo15757m9()), 1, c12009k4.mo15753jd());
        c0755am.f3925kk = c3983k4M56597k4.m15715du();
        c0755am.f3924k4 = new byte[c0755am.m3677to() * c0755am.m3678x1()];
        System.arraycopy(c3983k4M56597k4.m15721to().m67356kk().m19850k4(), 0, c0755am.f3924k4, 0, c0755am.m3677to() * c0755am.m3678x1());
        c12009k4.m56605k4(c3983k4M56597k4);
        return c0755am;
    }

    /* JADX INFO: renamed from: k4 */
    public static C0755am m3670k4(C12023wl c12023wl, int i) {
        return m3668k4(c12023wl.m56865x1(), c12023wl.m56862kk(), i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m3675k4(int i, int i2, byte b) {
        if (m3676kk() == 139273) {
            int iM3677to = (i * 4) + (i2 * m3677to());
            byte[] bArr = this.f3924k4;
            bArr[iM3677to] = b;
            bArr[iM3677to + 1] = b;
            bArr[iM3677to + 2] = b;
            return;
        }
        if (m3676kk() != 196865) {
            throw new NotImplementedException();
        }
        int iM3677to2 = (i / 8) + (i2 * m3677to());
        if (((b & 255) >> 7) != 1) {
            byte[] bArr2 = this.f3924k4;
            bArr2[iM3677to2] = (byte) (((byte) (~(128 >> (i % 8)))) & 255 & bArr2[iM3677to2] & 255);
        } else {
            byte[] bArr3 = this.f3924k4;
            bArr3[iM3677to2] = (byte) ((((byte) (128 >> (i % 8))) & 255) | (bArr3[iM3677to2] & 255));
        }
    }
}
