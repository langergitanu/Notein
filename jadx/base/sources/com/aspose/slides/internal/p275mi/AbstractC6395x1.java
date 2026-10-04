package com.aspose.slides.internal.p275mi;

import com.aspose.slides.internal.p080dd.C3123ar;
import com.aspose.slides.internal.p558zz.C13637dy;
import com.aspose.slides.internal.p558zz.C13641m9;

/* JADX INFO: renamed from: com.aspose.slides.internal.mi.x1 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC6395x1 {

    /* JADX INFO: renamed from: k4 */
    protected C13641m9 f18176k4;

    /* JADX INFO: renamed from: com.aspose.slides.internal.mi.x1$k4 */
    public static abstract class k4 {

        /* JADX INFO: renamed from: du */
        private boolean f18177du;

        /* JADX INFO: renamed from: k4 */
        private C13637dy f18178k4;

        /* JADX INFO: renamed from: kk */
        private boolean f18179kk;

        /* JADX INFO: renamed from: to */
        private boolean f18180to;

        /* JADX INFO: renamed from: x1 */
        private C13641m9 f18181x1;

        public k4(C13637dy c13637dy) {
            this.f18178k4 = c13637dy;
        }

        /* JADX INFO: renamed from: c5 */
        public final boolean m26242c5() {
            return this.f18180to;
        }

        /* JADX INFO: renamed from: ck */
        public abstract int mo14943ck();

        /* JADX INFO: renamed from: du */
        public final boolean m26243du() {
            return m26245h4() || m26248m9();
        }

        /* JADX INFO: renamed from: dy */
        public final boolean m26244dy() {
            return this.f18179kk;
        }

        /* JADX INFO: renamed from: fa */
        public abstract void mo14944fa();

        /* JADX INFO: renamed from: h4 */
        public final boolean m26245h4() {
            return this.f18177du;
        }

        /* JADX INFO: renamed from: jd */
        public abstract boolean mo14945jd();

        /* JADX INFO: renamed from: k4 */
        public abstract int mo14946k4(C13637dy c13637dy);

        /* JADX INFO: renamed from: k4 */
        public AbstractC6395x1 mo26221k4() {
            AbstractC6395x1 abstractC6395x1Mo14947k4;
            C13641m9 c13641m9M26247kk = m26247kk();
            if (this.f18179kk) {
                if (!mo14945jd()) {
                    return null;
                }
                C13637dy c13637dyM62959fa = C13637dy.m62959fa(mo14943ck());
                mo14946k4(c13637dyM62959fa);
                c13641m9M26247kk = c13637dyM62959fa;
            }
            if (c13641m9M26247kk != null) {
                abstractC6395x1Mo14947k4 = mo14947k4(c13641m9M26247kk);
                mo26227k4(abstractC6395x1Mo14947k4);
            } else {
                abstractC6395x1Mo14947k4 = null;
            }
            this.f18181x1 = null;
            this.f18178k4 = null;
            return abstractC6395x1Mo14947k4;
        }

        /* JADX INFO: renamed from: k4 */
        public abstract AbstractC6395x1 mo14947k4(C13641m9 c13641m9);

        /* JADX INFO: renamed from: kk */
        public final C13641m9 m26247kk() {
            C13641m9 c13641m9 = this.f18181x1;
            return c13641m9 != null ? c13641m9 : this.f18178k4;
        }

        /* JADX INFO: renamed from: m9 */
        public final boolean m26248m9() {
            return m26244dy() || m26242c5();
        }

        /* JADX INFO: renamed from: to */
        public final C13637dy m26249to() {
            if (this.f18178k4 == null) {
                C13641m9 c13641m9 = this.f18181x1;
                C13637dy c13637dyM62959fa = C13637dy.m62959fa(c13641m9 == null ? 0 : c13641m9.m63014k4());
                C13641m9 c13641m92 = this.f18181x1;
                if (c13641m92 != null) {
                    c13641m92.m63003k4(c13637dyM62959fa);
                }
                m26241k4(c13637dyM62959fa, false);
            }
            return this.f18178k4;
        }

        /* JADX INFO: renamed from: x1 */
        public final boolean m26250x1() {
            return true;
        }

        /* JADX INFO: renamed from: k4 */
        public void mo26227k4(AbstractC6395x1 abstractC6395x1) {
        }

        /* JADX INFO: renamed from: k4 */
        private void m26241k4(C13637dy c13637dy, boolean z) {
            this.f18178k4 = c13637dy;
            this.f18181x1 = null;
            if (z) {
                this.f18177du = true;
                mo14944fa();
            }
        }

        /* JADX INFO: renamed from: k4 */
        public final boolean m26246k4(boolean z) {
            boolean z2 = this.f18179kk;
            this.f18179kk = z;
            return z2;
        }
    }

    public AbstractC6395x1(C13641m9 c13641m9) {
        this.f18176k4 = c13641m9;
    }

    /* JADX INFO: renamed from: k4 */
    public final int m26238k4(C3123ar c3123ar) {
        return this.f18176k4.m63002k4(c3123ar);
    }

    /* JADX INFO: renamed from: x1 */
    public final int m26240x1() {
        return this.f18176k4.m63014k4();
    }

    /* JADX INFO: renamed from: k4 */
    public final C13641m9 m26239k4() {
        return this.f18176k4;
    }
}
