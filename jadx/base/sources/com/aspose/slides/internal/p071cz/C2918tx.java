package com.aspose.slides.internal.p071cz;

import androidx.core.content.OooO0O0;
import com.aspose.slides.OooO0OO;
import com.aspose.slides.internal.p060ca.InterfaceC2251pt;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.tx */
/* JADX INFO: loaded from: classes3.dex */
final class C2918tx extends AbstractC2876qp {

    /* JADX INFO: renamed from: du */
    private C2798kx f8761du;

    /* JADX INFO: renamed from: h4 */
    private final C2778ji f8762h4;

    /* JADX INFO: renamed from: k4 */
    private final double f8763k4;

    /* JADX INFO: renamed from: kk */
    private double f8764kk;

    /* JADX INFO: renamed from: to */
    private InterfaceC2251pt f8765to;

    /* JADX INFO: renamed from: x1 */
    private String f8766x1;

    public C2918tx(C2778ji c2778ji, C2867q6 c2867q6) {
        this.f8762h4 = c2778ji.cloneT();
        m12542ck();
        m12543jd();
        this.f8764kk = 0.0d;
        this.f8763k4 = (m12547k4().m12371m9() - this.f8765to.mo10258c5().mo10314k4(m12547k4().m12371m9())) * AbstractC2871qe.m12488du();
        this.f8766x1 = C14113y2.f47374k4;
    }

    /* JADX INFO: renamed from: ck */
    private void m12542ck() {
        this.f8761du = m12547k4().m12366kk();
    }

    /* JADX INFO: renamed from: jd */
    private void m12543jd() {
        this.f8765to = C2862pr.m12466k4().m12467k4(this.f8761du.m12395k4(), m12547k4().m12376to(), m12547k4().m12352du());
    }

    /* JADX INFO: renamed from: k4 */
    private double m12544k4(char c, char c2) {
        return ((m12547k4().m12371m9() * this.f8765to.mo10258c5().mo10315k4(this.f8765to.mo10263jd().mo10987k4(c), this.f8765to.mo10263jd().mo10987k4(c2))) / (this.f8765to.mo10258c5().mo10317to() & 4294967295L)) * AbstractC2871qe.m12488du();
    }

    /* JADX INFO: renamed from: c5 */
    public final char m12545c5() {
        char cOooO00o = OooO0O0.OooO00o(1, this.f8766x1);
        if (this.f8766x1.length() > 1) {
            this.f8764kk -= m12544k4(OooO0O0.OooO00o(2, this.f8766x1), cOooO00o);
        }
        this.f8764kk -= new C2959x4(cOooO00o, m12547k4(), this.f8765to).mo12122kk().m12482k4();
        String str = this.f8766x1;
        this.f8766x1 = OooO0OO.OooO00o(1, 0, str, str);
        return cOooO00o;
    }

    /* JADX INFO: renamed from: dy */
    public final String m12546dy() {
        return this.f8766x1;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2871qe
    /* JADX INFO: renamed from: kk */
    public C2867q6 mo12122kk() {
        return new C2867q6(this.f8764kk, this.f8763k4);
    }

    /* JADX INFO: renamed from: x1 */
    public final void m12549x1() {
        double dM12482k4 = 0.0d;
        for (int i = 0; i < this.f8766x1.length(); i++) {
            char cCharAt = this.f8766x1.charAt(i);
            if (i > 0) {
                dM12482k4 += m12544k4(this.f8766x1.charAt(i - 1), cCharAt);
            }
            C2959x4 c2959x4 = new C2959x4(cCharAt, m12547k4(), this.f8765to);
            c2959x4.m12489k4(new C2706dw(dM12482k4, 0.0d));
            m12492k4(c2959x4);
            dM12482k4 += c2959x4.mo12122kk().m12482k4();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final C2778ji m12547k4() {
        return this.f8762h4;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m12548k4(char c) {
        if (this.f8766x1.length() > 0) {
            this.f8764kk += m12544k4(OooO0O0.OooO00o(1, this.f8766x1), c);
        }
        this.f8764kk = m12547k4().m12354h4() + new C2959x4(c, m12547k4(), this.f8765to).mo12122kk().m12482k4() + this.f8764kk;
        this.f8766x1 = C14113y2.m67407k4(this.f8766x1, Character.valueOf(c));
    }
}
