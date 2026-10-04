package com.aspose.slides.internal.p071cz;

import com.aspose.slides.internal.p060ca.C2002aq;
import com.aspose.slides.internal.p060ca.C2372xo;
import com.aspose.slides.internal.p060ca.InterfaceC2251pt;
import com.aspose.slides.p559ms.System.C14117yj;

/* JADX INFO: renamed from: com.aspose.slides.internal.cz.x4 */
/* JADX INFO: loaded from: classes3.dex */
final class C2959x4 extends AbstractC2871qe {

    /* JADX INFO: renamed from: k4 */
    private final char f8796k4;

    /* JADX INFO: renamed from: kk */
    private final C2778ji f8797kk;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC2251pt f8798x1;

    public C2959x4(char c, C2778ji c2778ji, InterfaceC2251pt interfaceC2251pt) {
        this.f8796k4 = c;
        this.f8797kk = c2778ji;
        this.f8798x1 = interfaceC2251pt;
    }

    /* JADX INFO: renamed from: k4 */
    public final C2778ji m12593k4() {
        return this.f8797kk;
    }

    @Override // com.aspose.slides.internal.p071cz.AbstractC2871qe
    /* JADX INFO: renamed from: kk */
    public C2867q6 mo12122kk() {
        return new C2867q6(((m12593k4().m12371m9() * this.f8798x1.mo10258c5().mo10318x1(this.f8798x1.mo10263jd().mo10987k4(this.f8796k4))) / (this.f8798x1.mo10258c5().mo10317to() & 4294967295L)) * AbstractC2871qe.m12488du(), (m12593k4().m12371m9() - this.f8798x1.mo10258c5().mo10314k4(m12593k4().m12371m9())) * AbstractC2871qe.m12488du());
    }

    /* JADX INFO: renamed from: x1 */
    public final C2674bu m12594x1() {
        C2674bu c2674bu = new C2674bu();
        try {
            if (C14117yj.m67534ks(this.f8796k4)) {
                return c2674bu;
            }
            C2002aq c2002aq = new C2002aq(new C2854p6(c2674bu));
            double dM12371m9 = m12593k4().m12371m9();
            C2372xo c2372xo = new C2372xo(new double[]{dM12371m9, 0.0d, 0.0d, -dM12371m9, 0.0d, 0.0d});
            InterfaceC2251pt interfaceC2251pt = this.f8798x1;
            c2002aq.mo11458k4(interfaceC2251pt, interfaceC2251pt.mo10263jd().mo10987k4(this.f8796k4), c2372xo);
            float fM12488du = (float) AbstractC2871qe.m12488du();
            c2674bu.m12156kk();
            double d = fM12488du * 4.0f;
            c2674bu.m12160x1(d, d, false);
            c2674bu.m12144du();
            c2674bu.m12157m9();
            c2674bu.m12160x1(0.25d, 0.25d, false);
            c2674bu.m12152k4(m12490to().m12210k4(), m12490to().m12212x1(), false);
            c2674bu.m12144du();
            return c2674bu;
        } catch (RuntimeException e) {
            c2674bu.m12149k4();
            throw e;
        }
    }
}
