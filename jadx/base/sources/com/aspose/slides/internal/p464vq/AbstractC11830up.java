package com.aspose.slides.internal.p464vq;

import com.aspose.slides.OooO0OO;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p080dd.C3152yj;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p456v5.C11610to;
import com.aspose.slides.internal.p482wr.C12249c5;
import com.aspose.slides.internal.p482wr.C12262lr;
import com.aspose.slides.internal.p541z6.C13449m9;
import com.aspose.slides.internal.p541z6.InterfaceC13443dy;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.vq.up */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11830up {

    /* JADX INFO: renamed from: du */
    private AbstractC11760jd f39890du;

    /* JADX INFO: renamed from: h4 */
    private boolean f39891h4;

    /* JADX INFO: renamed from: k4 */
    private long f39892k4;

    /* JADX INFO: renamed from: kk */
    private InterfaceC13443dy f39893kk;

    /* JADX INFO: renamed from: to */
    private C12262lr f39894to;

    /* JADX INFO: renamed from: x1 */
    private String f39895x1;

    public AbstractC11830up(AbstractC11760jd abstractC11760jd, C12262lr c12262lr) {
        this.f39892k4 = Long.MIN_VALUE;
        this.f39894to = null;
        this.f39891h4 = false;
        this.f39890du = abstractC11760jd;
        this.f39895x1 = C14113y2.m67408k4("/", c12262lr.m57356to());
        this.f39894to = c12262lr;
        this.f39892k4 = c12262lr.m57335jd();
    }

    /* JADX INFO: renamed from: fa */
    private void m55411fa() {
        if (this.f39893kk != null) {
            return;
        }
        this.f39893kk = m55412k4(this.f39894to);
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m55413c5() {
        return this.f39891h4;
    }

    /* JADX INFO: renamed from: ck */
    public final void m55414ck() {
        this.f39893kk = null;
        this.f39894to = null;
    }

    /* JADX INFO: renamed from: du */
    public final String m55415du() {
        return AbstractC6747ar.m26635ix().m26681x1(m55426to());
    }

    /* JADX INFO: renamed from: dy */
    public final C12262lr m55416dy() {
        return this.f39894to;
    }

    /* JADX INFO: renamed from: h4 */
    public final C3152yj m55417h4() {
        if (this.f39893kk != null) {
            return new C3152yj(this.f39893kk.mo18611k4());
        }
        if (this.f39894to == null) {
            return null;
        }
        C3152yj c3152yj = new C3152yj();
        this.f39894to.m57338k4(c3152yj);
        c3152yj.seek(0L, 0);
        return c3152yj;
    }

    /* JADX INFO: renamed from: jd */
    public final AbstractC11760jd m55418jd() {
        return this.f39890du;
    }

    /* JADX INFO: renamed from: k4 */
    public final long m55419k4() {
        if (this.f39892k4 == Long.MIN_VALUE) {
            InterfaceC13443dy interfaceC13443dy = this.f39893kk;
            this.f39892k4 = interfaceC13443dy != null ? 4294967295L & C11610to.m54691k4(interfaceC13443dy.mo18611k4()) : Long.MIN_VALUE;
        }
        return this.f39892k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m55424kk() {
        String str = this.f39895x1;
        return OooO0OO.OooO00o(1, 1, str, str);
    }

    /* JADX INFO: renamed from: m9 */
    public final AbstractC3150x6 m55425m9() {
        InterfaceC13443dy interfaceC13443dy = this.f39893kk;
        if (interfaceC13443dy != null) {
            return interfaceC13443dy.mo18614x1();
        }
        if (this.f39894to == null) {
            return null;
        }
        C3152yj c3152yj = new C3152yj();
        this.f39894to.m57338k4(c3152yj);
        c3152yj.seek(0L, 0);
        return c3152yj;
    }

    /* JADX INFO: renamed from: to */
    public final byte[] m55426to() {
        if (this.f39893kk == null) {
            m55411fa();
        }
        return this.f39893kk.mo18611k4();
    }

    public String toString() {
        return this.f39895x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final String m55427x1() {
        return this.f39895x1;
    }

    public AbstractC11830up(AbstractC11760jd abstractC11760jd, String str, byte[] bArr) {
        this.f39892k4 = Long.MIN_VALUE;
        this.f39894to = null;
        this.f39891h4 = false;
        this.f39890du = abstractC11760jd;
        this.f39895x1 = str;
        this.f39893kk = C13449m9.m62563k4(bArr);
    }

    /* JADX INFO: renamed from: k4 */
    private static InterfaceC13443dy m55412k4(C12262lr c12262lr) {
        int iM57328c5 = (int) c12262lr.m57328c5();
        byte[] bArr = new byte[iM57328c5];
        C12249c5 c12249c5M57327bv = c12262lr.m57327bv();
        int i = 0;
        while (i < iM57328c5) {
            try {
                int i2 = c12249c5M57327bv.read(bArr, i, iM57328c5 - i);
                if (i2 == 0 && i > 0 && i != c12262lr.m57328c5()) {
                    break;
                }
                i += i2;
            } finally {
                if (c12249c5M57327bv != null) {
                    c12249c5M57327bv.dispose();
                }
            }
        }
        return C13449m9.m62563k4(bArr);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m55420k4(AbstractC11760jd abstractC11760jd) {
        this.f39890du = abstractC11760jd;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m55421k4(InterfaceC13443dy interfaceC13443dy) {
        this.f39893kk = interfaceC13443dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m55422k4(boolean z) {
        this.f39891h4 = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m55423k4(byte[] bArr) {
        this.f39893kk = C13449m9.m62563k4(bArr);
        this.f39894to = null;
        this.f39892k4 = Long.MIN_VALUE;
    }
}
