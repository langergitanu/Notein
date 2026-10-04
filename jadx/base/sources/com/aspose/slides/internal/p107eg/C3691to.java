package com.aspose.slides.internal.p107eg;

import com.aspose.slides.internal.p275mi.AbstractC6389dy;
import com.aspose.slides.internal.p275mi.AbstractC6395x1;
import com.aspose.slides.internal.p275mi.C6393m9;
import com.aspose.slides.internal.p275mi.C6394to;
import com.aspose.slides.internal.p558zz.C13637dy;
import com.aspose.slides.internal.p558zz.C13641m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.eg.to */
/* JADX INFO: loaded from: classes3.dex */
public class C3691to extends C6393m9 {

    /* JADX INFO: renamed from: kk */
    private static final int[] f10256kk = {0, 8, 12};

    /* JADX INFO: renamed from: com.aspose.slides.internal.eg.to$k4 */
    public static class k4 extends AbstractC6389dy {

        /* JADX INFO: renamed from: k4 */
        private boolean f10257k4;

        /* JADX INFO: renamed from: x1 */
        private long f10258x1;

        public k4(C6394to c6394to, C13637dy c13637dy) {
            super(c6394to, c13637dy);
            this.f10257k4 = false;
            this.f10258x1 = 0L;
            c13637dy.m63004k4(new int[]{0, 8, 12});
        }

        /* JADX INFO: renamed from: k4 */
        public static k4 m15002k4(C6394to c6394to, C13637dy c13637dy) {
            return new k4(c6394to, c13637dy);
        }

        @Override // com.aspose.slides.internal.p275mi.AbstractC6389dy, com.aspose.slides.internal.p275mi.AbstractC6395x1.k4
        /* JADX INFO: renamed from: jd */
        public boolean mo14945jd() {
            if (m26245h4()) {
                m26247kk().m63004k4(C3691to.f10256kk);
            }
            if (this.f10257k4) {
                C13641m9 c13641m9M26247kk = m26247kk();
                c13641m9M26247kk.m63004k4(C3691to.f10256kk);
                m15005x1(2981146554L - (c13641m9M26247kk.m63006kk() + this.f10258x1));
            }
            return super.mo14945jd();
        }

        /* JADX INFO: renamed from: ks */
        public final int m15004ks() {
            return ((C3691to) m26222yj()).m14999dy();
        }

        /* JADX INFO: renamed from: x1 */
        public final void m15005x1(long j) {
            m26249to().m62962k4(8, j);
        }

        @Override // com.aspose.slides.internal.p275mi.AbstractC6395x1.k4
        /* JADX INFO: renamed from: k4 */
        public AbstractC6395x1 mo14947k4(C13641m9 c13641m9) {
            return new C3691to(m26228up(), c13641m9);
        }

        /* JADX INFO: renamed from: k4 */
        public final void m15003k4(long j) {
            if (this.f10257k4) {
                return;
            }
            this.f10257k4 = true;
            this.f10258x1 = j;
        }
    }

    private C3691to(C6394to c6394to, C13641m9 c13641m9) {
        super(c6394to, c13641m9);
        c13641m9.m63004k4(new int[]{0, 8, 12});
    }

    /* JADX INFO: renamed from: du */
    public final long m14998du() {
        return this.f18176k4.m63007m9(8);
    }

    /* JADX INFO: renamed from: dy */
    public final int m14999dy() {
        return m15001m9();
    }

    /* JADX INFO: renamed from: h4 */
    public final int m15000h4() {
        return this.f18176k4.m62997du(18);
    }

    /* JADX INFO: renamed from: m9 */
    public final int m15001m9() {
        return this.f18176k4.m62999h4(50);
    }
}
