package com.aspose.slides.internal.p294n9;

import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14069jd;

/* JADX INFO: renamed from: com.aspose.slides.internal.n9.x1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6785x1 extends AbstractC6749bv {

    /* JADX INFO: renamed from: c5 */
    protected int f18777c5;

    /* JADX INFO: renamed from: dy */
    protected int f18778dy;

    /* JADX INFO: renamed from: k4 */
    protected int f18779k4;

    /* JADX INFO: renamed from: kk */
    protected char[] f18780kk;

    /* JADX INFO: renamed from: m9 */
    protected byte[] f18781m9;

    /* JADX INFO: renamed from: to */
    protected char[] f18782to;

    /* JADX INFO: renamed from: x1 */
    protected int f18783x1;

    /* JADX INFO: renamed from: jd */
    private static byte[] f18776jd = new byte[44];

    /* JADX INFO: renamed from: du */
    protected static AbstractC3150x6 f18774du = m26852x1("codepages.nlp");

    /* JADX INFO: renamed from: h4 */
    protected static final Object f18775h4 = new Object();

    public AbstractC6785x1(int i, int i2) {
        super(i, new C6752c6(null), new C6754dq(null));
        this.f18783x1 = 0;
        this.f18781m9 = new byte[48];
        m26848b3();
        this.f18779k4 = i2;
        m26851wy();
    }

    /* JADX INFO: renamed from: b3 */
    private void m26848b3() {
        ((C6752c6) C7019kk.m27452k4((Object) m26654ck(), C6752c6.class)).f18638k4 = this;
        ((C6754dq) C7019kk.m27452k4((Object) m26656fa(), C6754dq.class)).f18644k4 = this;
    }

    /* JADX INFO: renamed from: du */
    private boolean m26849du(int i) {
        byte[] bArr = new byte[40];
        synchronized (f18775h4) {
            try {
                f18774du.seek(44L, 0);
                int iM66782to = C14069jd.m66782to(f18776jd, 40);
                for (int i2 = 0; i2 < iM66782to; i2++) {
                    f18774du.read(bArr, 0, 40);
                    if (C14069jd.m66782to(bArr, 32) == i) {
                        long position = f18774du.getPosition();
                        int iM66765du = C14069jd.m66765du(bArr, 36);
                        long j = iM66765du;
                        f18774du.seek(j, 0);
                        AbstractC3150x6 abstractC3150x6 = f18774du;
                        byte[] bArr2 = this.f18781m9;
                        abstractC3150x6.read(bArr2, 0, bArr2.length);
                        this.f18778dy = (int) f18774du.getPosition();
                        if (i2 == iM66782to - 1) {
                            this.f18777c5 = (int) ((f18774du.getLength() - j) - ((long) this.f18781m9.length));
                        } else {
                            f18774du.seek(position, 0);
                            f18774du.read(bArr, 0, 40);
                            this.f18777c5 = (C14069jd.m66765du(bArr, 36) - iM66765du) - this.f18781m9.length;
                        }
                        return true;
                    }
                }
                return false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    public static int m26850kk(int i) {
        byte[] bArr = new byte[40];
        synchronized (f18775h4) {
            try {
                f18774du.seek(44L, 0);
                int iM66782to = C14069jd.m66782to(f18776jd, 40);
                for (int i2 = 0; i2 < iM66782to; i2++) {
                    f18774du.read(bArr, 0, 40);
                    if (C14069jd.m66782to(bArr, 32) == i) {
                        return C14069jd.m66782to(bArr, 34);
                    }
                }
                return 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: wy */
    private void m26851wy() {
        if (!m26849du(this.f18779k4)) {
            throw new NotSupportedException(C6770qm.m26823k4("No data is available for encoding {0}. For information on defining a custom encoding, see the documentation for the Encoding.RegisterProvider method.", Integer.valueOf(mo26673ks())));
        }
        mo26723to();
    }

    /* JADX INFO: renamed from: x1 */
    public static AbstractC3150x6 m26852x1(String str) {
        AbstractC3150x6 abstractC3150x6FromJava = AbstractC3150x6.fromJava(AbstractC6785x1.class.getResourceAsStream(str));
        if (abstractC3150x6FromJava == null) {
            throw new InvalidOperationException();
        }
        byte[] bArr = f18776jd;
        abstractC3150x6FromJava.read(bArr, 0, bArr.length);
        return abstractC3150x6FromJava;
    }

    /* JADX INFO: renamed from: du */
    public abstract void mo26731du();

    /* JADX INFO: renamed from: to */
    public abstract void mo26723to();

    public AbstractC6785x1(int i, int i2, AbstractC6769ne abstractC6769ne, AbstractC6751c5 abstractC6751c5) {
        super(i, abstractC6769ne, abstractC6751c5);
        this.f18783x1 = 0;
        this.f18781m9 = new byte[48];
        this.f18779k4 = i2;
        m26851wy();
    }
}
