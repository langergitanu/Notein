package com.aspose.slides.internal.p166hg;

import com.aspose.slides.PatternStyle;
import com.aspose.slides.internal.p174hz.AbstractC4705c6;
import com.aspose.slides.internal.p174hz.AbstractC4715g8;
import com.aspose.slides.internal.p174hz.AbstractC4739nv;
import com.aspose.slides.internal.p294n9.AbstractC6747ar;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.C14058fa;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14117yj;
import com.huawei.hms.network.embedded.C18385v2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hg.fa */
/* JADX INFO: loaded from: classes.dex */
class C4538fa extends AbstractC4570vj {

    /* JADX INFO: renamed from: kk */
    private byte[] f12668kk;

    /* JADX INFO: renamed from: to */
    private byte[] f12669to;

    /* JADX INFO: renamed from: x1 */
    private byte[] f12670x1;

    public C4538fa(short s, String str, int i, int i2, int i3, boolean z, boolean z2, byte b, byte b2, short s2, byte b3, byte b4) {
        super(s, str, i, i2, i3, z, z2, b, b2, s2, b3, b4);
        int i4 = i2 == 0 ? 48 : 40;
        this.f12670x1 = new byte[i4];
        this.f12668kk = new byte[i4];
        for (int i5 = 0; i5 < i4; i5++) {
            this.f12670x1[i5] = PatternStyle.DiagonalCross;
            this.f12668kk[i5] = 92;
        }
    }

    @Override // com.aspose.slides.internal.p166hg.AbstractC4570vj
    /* JADX INFO: renamed from: k4 */
    public void mo18733k4() {
        C4540gi c4540gi = new C4540gi();
        char c = 'A';
        int i = 1;
        while (c4540gi.getLength() < m18904yj()) {
            String strM67400k4 = C14113y2.f47374k4;
            for (int i2 = 0; i2 < i; i2++) {
                strM67400k4 = C14113y2.m67400k4(strM67400k4, C14117yj.m67537ne(c));
            }
            byte[] bArrM18732k4 = m18732k4(m18903x6().m18672um(), strM67400k4.toString(), m18903x6().m18626ar());
            c4540gi.write(bArrM18732k4, 0, c4540gi.getLength() + ((long) bArrM18732k4.length) > ((long) m18904yj()) ? m18904yj() - C7019kk.m27462to(Long.valueOf(c4540gi.getLength()), 11) : bArrM18732k4.length);
            c = (char) (c + 1);
            i++;
        }
        C4540gi c4540gi2 = new C4540gi(c4540gi.m18739h4());
        m18903x6().m18684xk().m18756k4(c4540gi2.m18744k4(m18897m9()));
        m18903x6().m18684xk().m18759x1(c4540gi2.m18744k4(m18897m9()));
        m18903x6().m18662m9(c4540gi2.m18744k4(C7019kk.m27462to(Byte.valueOf(m18901up()), 6)));
        m18903x6().m18638dy(c4540gi2.m18744k4(C7019kk.m27462to(Byte.valueOf(m18901up()), 6)));
        if (m18884fa()) {
            AbstractC4715g8 abstractC4715g8M19610du = AbstractC4715g8.m19610du();
            byte[] bArr = new byte[abstractC4715g8M19610du.m19587up() >> 3];
            abstractC4715g8M19610du.mo19562k4(m18903x6().m18628bv(), 0, m18903x6().m18628bv().length, bArr, 0);
            abstractC4715g8M19610du.mo19564k4(m18903x6().m18664qq(), 0, m18903x6().m18664qq().length);
            byte[] bArr2 = new byte[m18896ks()];
            C14058fa.m66596k4(abstractC4715g8M19610du.m19584fa(), 0, bArr2, 0, C7019kk.m27462to(Byte.valueOf(m18896ks()), 6));
            abstractC4715g8M19610du.mo18846c5();
            abstractC4715g8M19610du.mo19562k4(m18903x6().m18675v4(), 0, m18903x6().m18675v4().length, bArr, 0);
            abstractC4715g8M19610du.mo19564k4(m18903x6().m18626ar(), 0, m18903x6().m18626ar().length);
            byte[] bArr3 = new byte[m18896ks()];
            C14058fa.m66596k4(abstractC4715g8M19610du.m19584fa(), 0, bArr3, 0, C7019kk.m27462to(Byte.valueOf(m18896ks()), 6));
            m18903x6().m18662m9(bArr2);
            m18903x6().m18638dy(bArr3);
            if (C7019kk.m27462to(Byte.valueOf(m18899rv()), 6) > 0) {
                abstractC4715g8M19610du.mo18846c5();
                byte[] bArrM19586kk = abstractC4715g8M19610du.m19586kk(m18903x6().m18664qq(), 0, m18903x6().m18664qq().length);
                m18903x6().m18629c5(new byte[m18899rv()]);
                C14058fa.m66596k4(bArrM19586kk, 0, m18903x6().m18660lr(), 0, C7019kk.m27462to(Byte.valueOf(m18899rv()), 6));
                abstractC4715g8M19610du.mo18846c5();
                byte[] bArrM19586kk2 = abstractC4715g8M19610du.m19586kk(m18903x6().m18626ar(), 0, m18903x6().m18626ar().length);
                m18903x6().m18645jd(new byte[m18899rv()]);
                C14058fa.m66596k4(bArrM19586kk2, 0, m18903x6().m18685yd(), 0, C7019kk.m27462to(Byte.valueOf(m18899rv()), 6));
            } else {
                m18903x6().m18629c5(AbstractC4570vj.f12762k4);
                m18903x6().m18645jd(AbstractC4570vj.f12762k4);
            }
        } else if (C7019kk.m27462to(Byte.valueOf(m18899rv()), 6) != 0) {
            m18903x6().m18629c5(c4540gi2.m18744k4(C7019kk.m27462to(Byte.valueOf(m18899rv()), 6)));
            m18903x6().m18645jd(c4540gi2.m18744k4(C7019kk.m27462to(Byte.valueOf(m18899rv()), 6)));
        } else {
            m18903x6().m18629c5(AbstractC4570vj.f12762k4);
            m18903x6().m18645jd(AbstractC4570vj.f12762k4);
        }
        C4571w6.m18907k4(m18903x6());
        c4540gi2.m18738du();
        c4540gi.m18738du();
    }

    @Override // com.aspose.slides.internal.p166hg.AbstractC4570vj
    /* JADX INFO: renamed from: x1 */
    public byte[] mo18736x1(byte b, byte[] bArr) {
        AbstractC4705c6 abstractC4705c6M18885h4 = m18885h4();
        byte[] bArrM18760x1 = m18903x6().m18633dq().m18760x1();
        abstractC4705c6M18885h4.mo19562k4(bArrM18760x1, 0, bArrM18760x1.length, bArrM18760x1, 0);
        byte[] bArr2 = this.f12670x1;
        abstractC4705c6M18885h4.mo19562k4(bArr2, 0, bArr2.length, bArr2, 0);
        if (this.f12669to == null) {
            this.f12669to = new byte[11];
        }
        m18889k4(this.f12669to, 0, C7019kk.m27469x1(m18903x6(), C4562tq.class) ? m18903x6().m18643ix() : m18903x6().m18671u4());
        byte[] bArr3 = this.f12669to;
        bArr3[8] = b;
        m18890k4(bArr3, 9, C7019kk.m27468x1(Integer.valueOf(bArr.length), 9));
        byte[] bArr4 = this.f12669to;
        abstractC4705c6M18885h4.mo19562k4(bArr4, 0, bArr4.length, bArr4, 0);
        abstractC4705c6M18885h4.mo19562k4(bArr, 0, bArr.length, bArr, 0);
        abstractC4705c6M18885h4.mo19564k4(AbstractC4570vj.f12762k4, 0, 0);
        byte[] bArrM19584fa = abstractC4705c6M18885h4.m19584fa();
        abstractC4705c6M18885h4.mo18846c5();
        abstractC4705c6M18885h4.mo19562k4(bArrM18760x1, 0, bArrM18760x1.length, bArrM18760x1, 0);
        byte[] bArr5 = this.f12668kk;
        abstractC4705c6M18885h4.mo19562k4(bArr5, 0, bArr5.length, bArr5, 0);
        abstractC4705c6M18885h4.mo19562k4(bArrM19584fa, 0, bArrM19584fa.length, bArrM19584fa, 0);
        abstractC4705c6M18885h4.mo19564k4(AbstractC4570vj.f12762k4, 0, 0);
        return abstractC4705c6M18885h4.m19584fa();
    }

    @Override // com.aspose.slides.internal.p166hg.AbstractC4570vj
    /* JADX INFO: renamed from: k4 */
    public void mo18734k4(byte[] bArr) {
        C4540gi c4540gi = new C4540gi();
        c4540gi.m18742k4(m18732k4(bArr, C18385v2.f56336h, m18903x6().m18664qq()));
        c4540gi.m18742k4(m18732k4(bArr, "BB", m18903x6().m18664qq()));
        c4540gi.m18742k4(m18732k4(bArr, "CCC", m18903x6().m18664qq()));
        m18903x6().m18642h4(c4540gi.m18739h4());
    }

    @Override // com.aspose.slides.internal.p166hg.AbstractC4570vj
    /* JADX INFO: renamed from: k4 */
    public byte[] mo18735k4(byte b, byte[] bArr) {
        AbstractC4705c6 abstractC4705c6M18885h4 = m18885h4();
        byte[] bArrM18757kk = m18903x6().m18631c6().m18757kk();
        abstractC4705c6M18885h4.mo19562k4(bArrM18757kk, 0, bArrM18757kk.length, bArrM18757kk, 0);
        byte[] bArr2 = this.f12670x1;
        abstractC4705c6M18885h4.mo19562k4(bArr2, 0, bArr2.length, bArr2, 0);
        if (this.f12669to == null) {
            this.f12669to = new byte[11];
        }
        m18889k4(this.f12669to, 0, C7019kk.m27469x1(m18903x6(), C4562tq.class) ? m18903x6().m18671u4() : m18903x6().m18643ix());
        byte[] bArr3 = this.f12669to;
        bArr3[8] = b;
        m18890k4(bArr3, 9, C7019kk.m27468x1(Integer.valueOf(bArr.length), 9));
        byte[] bArr4 = this.f12669to;
        abstractC4705c6M18885h4.mo19562k4(bArr4, 0, bArr4.length, bArr4, 0);
        abstractC4705c6M18885h4.mo19562k4(bArr, 0, bArr.length, bArr, 0);
        abstractC4705c6M18885h4.mo19564k4(AbstractC4570vj.f12762k4, 0, 0);
        byte[] bArrM19584fa = abstractC4705c6M18885h4.m19584fa();
        abstractC4705c6M18885h4.mo18846c5();
        abstractC4705c6M18885h4.mo19562k4(bArrM18757kk, 0, bArrM18757kk.length, bArrM18757kk, 0);
        byte[] bArr5 = this.f12668kk;
        abstractC4705c6M18885h4.mo19562k4(bArr5, 0, bArr5.length, bArr5, 0);
        abstractC4705c6M18885h4.mo19562k4(bArrM19584fa, 0, bArrM19584fa.length, bArrM19584fa, 0);
        abstractC4705c6M18885h4.mo19564k4(AbstractC4570vj.f12762k4, 0, 0);
        return abstractC4705c6M18885h4.m19584fa();
    }

    /* JADX INFO: renamed from: k4 */
    private byte[] m18732k4(byte[] bArr, String str, byte[] bArr2) {
        AbstractC4715g8 abstractC4715g8M19610du = AbstractC4715g8.m19610du();
        AbstractC4739nv abstractC4739nvM19710du = AbstractC4739nv.m19710du();
        C4540gi c4540gi = new C4540gi();
        c4540gi.m18742k4(AbstractC6747ar.m26650yj().mo26677to(str));
        c4540gi.m18742k4(bArr);
        c4540gi.m18742k4(bArr2);
        byte[] bArrM19586kk = abstractC4739nvM19710du.m19586kk(c4540gi.m18739h4(), 0, C7019kk.m27462to(Long.valueOf(c4540gi.getLength()), 11));
        c4540gi.m18738du();
        c4540gi.m18742k4(bArr);
        c4540gi.m18742k4(bArrM19586kk);
        byte[] bArrM19586kk2 = abstractC4715g8M19610du.m19586kk(c4540gi.m18739h4(), 0, C7019kk.m27462to(Long.valueOf(c4540gi.getLength()), 11));
        c4540gi.m18738du();
        return bArrM19586kk2;
    }
}
