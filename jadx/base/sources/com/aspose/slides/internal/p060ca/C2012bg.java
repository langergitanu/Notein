package com.aspose.slides.internal.p060ca;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3134k4;
import com.aspose.words.WarningType;

/* JADX INFO: renamed from: com.aspose.slides.internal.ca.bg */
/* JADX INFO: loaded from: classes3.dex */
public class C2012bg {

    /* JADX INFO: renamed from: k4 */
    private C2155k5 f6998k4;

    /* JADX INFO: renamed from: kk */
    private byte[] f6999kk;

    /* JADX INFO: renamed from: x1 */
    private byte[] f7000x1;

    public C2012bg(AbstractC3150x6 abstractC3150x6) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("Input stream can not be null", "input");
        }
        m10246k4(new C2155k5());
        m10250x1(abstractC3150x6);
    }

    /* JADX INFO: renamed from: kk */
    private static void m10248kk(byte[] bArr) {
        for (int i = 0; i < bArr.length; i++) {
            bArr[i] = (byte) ((bArr[i] & 255) ^ 80);
        }
    }

    /* JADX INFO: renamed from: to */
    private static byte[] m10249to(byte[] bArr) {
        return new C2340vt(new C2292sl(bArr)).m11567k4();
    }

    /* JADX INFO: renamed from: x1 */
    private void m10250x1(AbstractC3150x6 abstractC3150x6) {
        C3134k4 c3134k4 = new C3134k4(abstractC3150x6);
        m10252k4().m10887k4(c3134k4);
        if ((m10252k4().m10901x1().m10350k4() & 65535) == 2 && (m10252k4().m10901x1().m10353x1() & 65535) == 2) {
            m10247k4(c3134k4.m13372dy((int) m10252k4().m10878dy()));
        }
        m10251x1(c3134k4.m13372dy((int) m10252k4().m10882k4()));
    }

    /* JADX INFO: renamed from: k4 */
    public final C2155k5 m10252k4() {
        return this.f6998k4;
    }

    /* JADX INFO: renamed from: k4 */
    private void m10246k4(C2155k5 c2155k5) {
        this.f6998k4 = c2155k5;
    }

    /* JADX INFO: renamed from: x1 */
    private void m10251x1(byte[] bArr) {
        this.f6999kk = bArr;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m10253k4(AbstractC3150x6 abstractC3150x6) {
        if (abstractC3150x6 == null) {
            throw new ArgumentNullException("Output stream can not be null", "output");
        }
        byte[] bArrM10249to = new byte[m10254x1().length];
        System.arraycopy(m10254x1(), 0, bArrM10249to, 0, m10254x1().length);
        if ((m10252k4().m10891kk() & WarningType.HINT) == 268435456) {
            m10248kk(bArrM10249to);
        }
        if ((m10252k4().m10891kk() & 4) == 4) {
            bArrM10249to = m10249to(bArrM10249to);
        }
        abstractC3150x6.write(bArrM10249to, 0, bArrM10249to.length);
    }

    /* JADX INFO: renamed from: x1 */
    public final byte[] m10254x1() {
        return this.f6999kk;
    }

    /* JADX INFO: renamed from: k4 */
    private void m10247k4(byte[] bArr) {
        this.f7000x1 = bArr;
    }
}
