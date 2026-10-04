package com.aspose.slides.internal.p166hg;

import com.aspose.slides.PatternStyle;
import com.aspose.slides.exceptions.CryptographicUnexpectedOperationException;
import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p174hz.AbstractC4715g8;
import com.aspose.slides.internal.p174hz.AbstractC4739nv;
import com.aspose.slides.internal.p174hz.AbstractC4751tq;
import com.aspose.slides.internal.p525yi.C12821du;
import com.aspose.slides.internal.p525yi.C12822dy;
import com.aspose.slides.p559ms.System.C14058fa;

/* JADX INFO: renamed from: com.aspose.slides.internal.hg.ts */
/* JADX INFO: loaded from: classes.dex */
public class C4563ts extends AbstractC4705c6 {

    /* JADX INFO: renamed from: c5 */
    private byte[] f12734c5;

    /* JADX INFO: renamed from: ck */
    private byte[] f12735ck;

    /* JADX INFO: renamed from: dy */
    private byte[] f12737dy;

    /* JADX INFO: renamed from: h4 */
    private boolean f12738h4;

    /* JADX INFO: renamed from: jd */
    private byte[] f12739jd;

    /* JADX INFO: renamed from: m9 */
    private byte[] f12741m9;

    /* JADX INFO: renamed from: k4 */
    private AbstractC4705c6 f12740k4 = AbstractC4715g8.m19610du();

    /* JADX INFO: renamed from: du */
    private AbstractC4705c6 f12736du = AbstractC4739nv.m19710du();

    public C4563ts(byte[] bArr) {
        this.f13126kk = this.f12736du.m19587up() + this.f12740k4.m19587up();
        this.f12741m9 = bArr;
        mo18846c5();
    }

    /* JADX INFO: renamed from: du */
    private void m18845du() {
        this.f12737dy = new byte[48];
        this.f12734c5 = new byte[48];
        for (int i = 0; i < 48; i++) {
            this.f12737dy[i] = PatternStyle.DiagonalCross;
            this.f12734c5[i] = 92;
        }
        this.f12739jd = new byte[40];
        this.f12735ck = new byte[40];
        for (int i2 = 0; i2 < 40; i2++) {
            this.f12739jd[i2] = PatternStyle.DiagonalCross;
            this.f12735ck[i2] = 92;
        }
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: c5 */
    public void mo18846c5() {
        this.f12740k4.mo18846c5();
        this.f12736du.mo18846c5();
        m18845du();
        this.f12738h4 = false;
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: dy */
    public byte[] mo18847dy() {
        if (!this.f12738h4) {
            this.f12738h4 = true;
        }
        AbstractC4705c6 abstractC4705c6 = this.f12740k4;
        byte[] bArr = this.f12741m9;
        abstractC4705c6.mo19562k4(bArr, 0, bArr.length, bArr, 0);
        AbstractC4705c6 abstractC4705c62 = this.f12740k4;
        byte[] bArr2 = this.f12737dy;
        abstractC4705c62.mo19564k4(bArr2, 0, bArr2.length);
        byte[] bArrM19584fa = this.f12740k4.m19584fa();
        this.f12740k4.mo18846c5();
        AbstractC4705c6 abstractC4705c63 = this.f12740k4;
        byte[] bArr3 = this.f12741m9;
        abstractC4705c63.mo19562k4(bArr3, 0, bArr3.length, bArr3, 0);
        AbstractC4705c6 abstractC4705c64 = this.f12740k4;
        byte[] bArr4 = this.f12734c5;
        abstractC4705c64.mo19562k4(bArr4, 0, bArr4.length, bArr4, 0);
        this.f12740k4.mo19564k4(bArrM19584fa, 0, bArrM19584fa.length);
        AbstractC4705c6 abstractC4705c65 = this.f12736du;
        byte[] bArr5 = this.f12741m9;
        abstractC4705c65.mo19562k4(bArr5, 0, bArr5.length, bArr5, 0);
        AbstractC4705c6 abstractC4705c66 = this.f12736du;
        byte[] bArr6 = this.f12739jd;
        abstractC4705c66.mo19564k4(bArr6, 0, bArr6.length);
        byte[] bArrM19584fa2 = this.f12736du.m19584fa();
        this.f12736du.mo18846c5();
        AbstractC4705c6 abstractC4705c67 = this.f12736du;
        byte[] bArr7 = this.f12741m9;
        abstractC4705c67.mo19562k4(bArr7, 0, bArr7.length, bArr7, 0);
        AbstractC4705c6 abstractC4705c68 = this.f12736du;
        byte[] bArr8 = this.f12735ck;
        abstractC4705c68.mo19562k4(bArr8, 0, bArr8.length, bArr8, 0);
        this.f12736du.mo19564k4(bArrM19584fa2, 0, bArrM19584fa2.length);
        mo18846c5();
        byte[] bArr9 = new byte[36];
        C14058fa.m66596k4(this.f12740k4.m19584fa(), 0, bArr9, 0, 16);
        C14058fa.m66596k4(this.f12736du.m19584fa(), 0, bArr9, 16, 20);
        return bArr9;
    }

    /* JADX INFO: renamed from: k4 */
    public byte[] m18848k4(AbstractC4751tq abstractC4751tq) {
        if (abstractC4751tq == null) {
            throw new CryptographicUnexpectedOperationException("missing key");
        }
        C12822dy c12822dy = new C12822dy(abstractC4751tq);
        c12822dy.mo19579k4(C12821du.class.getName());
        return c12822dy.mo19581k4(m19584fa());
    }

    @Override // com.aspose.slides.internal.p174hz.AbstractC4705c6
    /* JADX INFO: renamed from: x1 */
    public void mo18849x1(byte[] bArr, int i, int i2) {
        if (!this.f12738h4) {
            this.f12738h4 = true;
        }
        this.f12740k4.mo19562k4(bArr, i, i2, bArr, i);
        this.f12736du.mo19562k4(bArr, i, i2, bArr, i);
    }
}
