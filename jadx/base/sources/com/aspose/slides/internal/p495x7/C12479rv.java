package com.aspose.slides.internal.p495x7;

import com.aspose.slides.internal.p016a8.C1303du;
import com.aspose.slides.internal.p016a8.C1307to;
import com.aspose.slides.internal.p016a8.C1308x1;
import com.aspose.slides.internal.p066cl.InterfaceC2623jd;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p477wk.C12083kk;

/* JADX INFO: renamed from: com.aspose.slides.internal.x7.rv */
/* JADX INFO: loaded from: classes5.dex */
public class C12479rv extends AbstractC12472k4 {

    /* JADX INFO: renamed from: c5 */
    private final double f41603c5;

    /* JADX INFO: renamed from: ck */
    private final double f41604ck;

    /* JADX INFO: renamed from: jd */
    private final double f41605jd;

    public C12479rv(C12009k4 c12009k4, C12083kk c12083kk) {
        super(c12009k4, c12083kk);
        this.f41603c5 = 0.212655d;
        this.f41605jd = 0.715158d;
        this.f41604ck = 0.072187d;
    }

    /* JADX INFO: renamed from: x1 */
    private float m58034x1(int i, int i2, int i3) {
        return ((i + i2) + i3) / 3.0f;
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12472k4
    /* JADX INFO: renamed from: k4 */
    public void mo58019k4(int i, C1307to c1307to) {
        c1307to.mo7784k4((byte) i);
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12472k4
    /* JADX INFO: renamed from: kk */
    public int mo58020kk(int i) {
        int i2 = (i >> 16) & 255;
        int i3 = (i >> 8) & 255;
        int i4 = i & 255;
        return (m58034x1(i2, i3, i4) <= 127.0f || m58033k4(i2, i3, i4)) ? 0 : 1;
    }

    @Override // com.aspose.slides.internal.p495x7.AbstractC12472k4
    /* JADX INFO: renamed from: k4 */
    public void mo19867k4(byte[] bArr) {
        int i = this.f40616du;
        if (i % 8 == 0) {
            m58032k4(bArr, i, this.f40618h4, this.f40621m9, this.f40617dy);
        } else {
            final InterfaceC2623jd interfaceC2623jdM56945du = m56945du();
            m56955x1(bArr).m7793k4(new C1308x1.k4() { // from class: com.aspose.slides.internal.x7.rv.1
                @Override // com.aspose.slides.internal.p016a8.C1308x1.k4
                /* JADX INFO: renamed from: k4 */
                public void mo7794k4(int i2, int i3, int i4, int i5, C1307to c1307to) {
                    C12479rv.this.mo58019k4(interfaceC2623jdM56945du.mo11968k4(i4, i5, 0), c1307to);
                }
            });
        }
    }

    @Override // com.aspose.slides.internal.p477wk.AbstractC12082k4
    /* JADX INFO: renamed from: kk */
    public C1307to mo56952kk(byte[] bArr) {
        return new C1303du(this.f40621m9, this.f40620kk, bArr);
    }

    /* JADX INFO: renamed from: k4 */
    private void m58032k4(byte[] bArr, int i, int i2, int i3, int i4) {
        byte[] bArrM56953m9 = m56953m9();
        int iCeil = (int) Math.ceil(m56954to().mo11975du() / 8.0f);
        int iCeil2 = (int) Math.ceil(i3 / 8.0f);
        int i5 = i3 % 8;
        int i6 = (i2 * iCeil) + (i / 8);
        int i7 = i6;
        int i8 = 0;
        for (int i9 = 0; i9 < i4; i9++) {
            if (i5 == 0) {
                System.arraycopy(bArrM56953m9, i7, bArr, i8, iCeil2);
            } else {
                System.arraycopy(bArrM56953m9, i7, bArr, i8, iCeil2 - 1);
                bArr[(i8 + iCeil2) - 1] = (byte) (bArrM56953m9[(i7 + iCeil2) - 1] & (255 << (8 - i5)) & 255);
            }
            i7 += iCeil;
            i8 += this.f40620kk + iCeil2;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m58033k4(int i, int i2, int i3) {
        if (i < 176 && i2 < 128 && i3 < 96) {
            return true;
        }
        if (i < 176 && i2 < 96 && i3 < 128) {
            return true;
        }
        if (i3 < 176 && i2 < 128 && i < 96) {
            return true;
        }
        if (i3 < 176 && i2 < 96 && i < 128) {
            return true;
        }
        if (i2 >= 176 || i >= 128 || i3 >= 96) {
            return i2 < 176 && i < 96 && i3 < 128;
        }
        return true;
    }
}
