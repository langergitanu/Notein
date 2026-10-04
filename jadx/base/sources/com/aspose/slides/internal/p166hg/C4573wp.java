package com.aspose.slides.internal.p166hg;

import com.aspose.slides.internal.p174hz.AbstractC4703bz;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14058fa;

/* JADX INFO: renamed from: com.aspose.slides.internal.hg.wp */
/* JADX INFO: loaded from: classes.dex */
class C4573wp extends AbstractC4570vj {

    /* JADX INFO: renamed from: kk */
    private final Object f12786kk;

    /* JADX INFO: renamed from: x1 */
    private byte[] f12787x1;

    public C4573wp(short s, String str, int i, int i2, int i3, boolean z, boolean z2, byte b, byte b2, short s2, byte b3, byte b4) {
        super(s, str, i, i2, i3, z, z2, b, b2, s2, b3, b4);
        this.f12786kk = new Object();
    }

    @Override // com.aspose.slides.internal.p166hg.AbstractC4570vj
    /* JADX INFO: renamed from: k4 */
    public void mo18733k4() {
        C4540gi c4540gi = new C4540gi(m18893k4(m18903x6().m18672um(), "key expansion", m18903x6().m18626ar(), m18904yj()));
        m18903x6().m18684xk().m18756k4(c4540gi.m18744k4(m18897m9()));
        m18903x6().m18684xk().m18759x1(c4540gi.m18744k4(m18897m9()));
        m18903x6().m18662m9(c4540gi.m18744k4(C7019kk.m27462to(Byte.valueOf(m18901up()), 6)));
        m18903x6().m18638dy(c4540gi.m18744k4(C7019kk.m27462to(Byte.valueOf(m18901up()), 6)));
        if (m18884fa()) {
            byte[] bArrM18893k4 = m18893k4(m18903x6().m18628bv(), "client write key", m18903x6().m18664qq(), C7019kk.m27462to(Byte.valueOf(m18896ks()), 6));
            byte[] bArrM18893k42 = m18893k4(m18903x6().m18675v4(), "server write key", m18903x6().m18664qq(), C7019kk.m27462to(Byte.valueOf(m18896ks()), 6));
            m18903x6().m18662m9(bArrM18893k4);
            m18903x6().m18638dy(bArrM18893k42);
            if (C7019kk.m27462to(Byte.valueOf(m18899rv()), 6) > 0) {
                byte[] bArrM18893k43 = m18893k4(AbstractC4570vj.f12762k4, "IV block", m18903x6().m18664qq(), C7019kk.m27462to(Byte.valueOf(m18899rv()), 6) * 2);
                m18903x6().m18629c5(new byte[m18899rv()]);
                C14058fa.m66596k4(bArrM18893k43, 0, m18903x6().m18660lr(), 0, m18903x6().m18660lr().length);
                m18903x6().m18645jd(new byte[m18899rv()]);
                C14058fa.m66596k4(bArrM18893k43, C7019kk.m27462to(Byte.valueOf(m18899rv()), 6), m18903x6().m18685yd(), 0, m18903x6().m18685yd().length);
            } else {
                m18903x6().m18629c5(AbstractC4570vj.f12762k4);
                m18903x6().m18645jd(AbstractC4570vj.f12762k4);
            }
        } else if (C7019kk.m27462to(Byte.valueOf(m18899rv()), 6) != 0) {
            m18903x6().m18629c5(c4540gi.m18744k4(C7019kk.m27462to(Byte.valueOf(m18899rv()), 6)));
            m18903x6().m18645jd(c4540gi.m18744k4(C7019kk.m27462to(Byte.valueOf(m18899rv()), 6)));
        } else {
            m18903x6().m18629c5(AbstractC4570vj.f12762k4);
            m18903x6().m18645jd(AbstractC4570vj.f12762k4);
        }
        C4571w6.m18907k4(m18903x6());
        c4540gi.m18738du();
    }

    @Override // com.aspose.slides.internal.p166hg.AbstractC4570vj
    /* JADX INFO: renamed from: x1 */
    public byte[] mo18736x1(byte b, byte[] bArr) {
        byte[] bArrM19584fa;
        synchronized (this.f12786kk) {
            try {
                if (this.f12787x1 == null) {
                    this.f12787x1 = new byte[13];
                }
                m18889k4(this.f12787x1, 0, C7019kk.m27469x1(m18903x6(), C4562tq.class) ? m18903x6().m18643ix() : m18903x6().m18671u4());
                byte[] bArr2 = this.f12787x1;
                bArr2[8] = b;
                m18890k4(bArr2, 9, m18903x6().m18637dy());
                m18890k4(this.f12787x1, 11, C7019kk.m27468x1(Integer.valueOf(bArr.length), 9));
                AbstractC4703bz abstractC4703bzM18900to = m18900to();
                byte[] bArr3 = this.f12787x1;
                abstractC4703bzM18900to.mo19562k4(bArr3, 0, bArr3.length, bArr3, 0);
                abstractC4703bzM18900to.mo19562k4(bArr, 0, bArr.length, bArr, 0);
                abstractC4703bzM18900to.mo19564k4(AbstractC4570vj.f12762k4, 0, 0);
                bArrM19584fa = abstractC4703bzM18900to.m19584fa();
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrM19584fa;
    }

    @Override // com.aspose.slides.internal.p166hg.AbstractC4570vj
    /* JADX INFO: renamed from: k4 */
    public void mo18734k4(byte[] bArr) {
        m18903x6().m18642h4(new byte[bArr.length]);
        m18903x6().m18642h4(m18893k4(bArr, "master secret", m18903x6().m18664qq(), 48));
    }

    @Override // com.aspose.slides.internal.p166hg.AbstractC4570vj
    /* JADX INFO: renamed from: k4 */
    public byte[] mo18735k4(byte b, byte[] bArr) {
        byte[] bArrM19584fa;
        synchronized (this.f12786kk) {
            try {
                if (this.f12787x1 == null) {
                    this.f12787x1 = new byte[13];
                }
                m18889k4(this.f12787x1, 0, C7019kk.m27469x1(m18903x6(), C4562tq.class) ? m18903x6().m18671u4() : m18903x6().m18643ix());
                byte[] bArr2 = this.f12787x1;
                bArr2[8] = b;
                m18890k4(bArr2, 9, m18903x6().m18637dy());
                m18890k4(this.f12787x1, 11, C7019kk.m27468x1(Integer.valueOf(bArr.length), 9));
                AbstractC4703bz abstractC4703bzM18882du = m18882du();
                byte[] bArr3 = this.f12787x1;
                abstractC4703bzM18882du.mo19562k4(bArr3, 0, bArr3.length, bArr3, 0);
                abstractC4703bzM18882du.mo19562k4(bArr, 0, bArr.length, bArr, 0);
                abstractC4703bzM18882du.mo19564k4(AbstractC4570vj.f12762k4, 0, 0);
                bArrM19584fa = abstractC4703bzM18882du.m19584fa();
            } catch (Throwable th) {
                throw th;
            }
        }
        return bArrM19584fa;
    }
}
