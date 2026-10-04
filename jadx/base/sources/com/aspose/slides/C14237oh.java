package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.oh */
/* JADX INFO: loaded from: classes3.dex */
class C14237oh extends AbstractC14770x9 {

    /* JADX INFO: renamed from: ak */
    private hqr f47776ak;

    /* JADX INFO: renamed from: ar */
    private C14729w9 f47777ar;

    /* JADX INFO: renamed from: bv */
    private C14729w9 f47779bv;

    /* JADX INFO: renamed from: c5 */
    private C13683jf f47780c5;

    /* JADX INFO: renamed from: ck */
    private C13683jf f47781ck;

    /* JADX INFO: renamed from: du */
    private AbstractC14763x3 f47782du;

    /* JADX INFO: renamed from: dy */
    private C13683jf f47783dy;

    /* JADX INFO: renamed from: fa */
    private C13683jf f47784fa;

    /* JADX INFO: renamed from: h4 */
    private AbstractC14763x3 f47785h4;

    /* JADX INFO: renamed from: ix */
    private C14262p0 f47786ix;

    /* JADX INFO: renamed from: jd */
    private C13683jf f47787jd;

    /* JADX INFO: renamed from: k4 */
    private AbstractC14763x3 f47788k4;

    /* JADX INFO: renamed from: kk */
    private AbstractC14763x3 f47789kk;

    /* JADX INFO: renamed from: ks */
    private C14262p0 f47790ks;

    /* JADX INFO: renamed from: lr */
    private C0974f2 f47791lr;

    /* JADX INFO: renamed from: m9 */
    private AbstractC14763x3 f47792m9;

    /* JADX INFO: renamed from: ne */
    private C14262p0 f47793ne;

    /* JADX INFO: renamed from: qq */
    private C0831bu f47794qq;

    /* JADX INFO: renamed from: rv */
    private C14262p0 f47795rv;

    /* JADX INFO: renamed from: to */
    private AbstractC14763x3 f47796to;

    /* JADX INFO: renamed from: u4 */
    private C0831bu f47797u4;

    /* JADX INFO: renamed from: um */
    private C14729w9 f47798um;

    /* JADX INFO: renamed from: up */
    private C13683jf f47799up;

    /* JADX INFO: renamed from: uz */
    private C0831bu f47800uz;

    /* JADX INFO: renamed from: v4 */
    private C14729w9 f47801v4;

    /* JADX INFO: renamed from: wl */
    private C0831bu f47802wl;

    /* JADX INFO: renamed from: x1 */
    private AbstractC14763x3 f47804x1;

    /* JADX INFO: renamed from: x6 */
    private C14262p0 f47805x6;

    /* JADX INFO: renamed from: yd */
    private C0960eq f47806yd;

    /* JADX INFO: renamed from: yj */
    private C14262p0 f47807yj;

    /* JADX INFO: renamed from: b3 */
    private float f47778b3 = 2.0f;

    /* JADX INFO: renamed from: wy */
    private float f47803wy = 8.0f;

    public C14237oh(C0974f2 c0974f2) {
        this.f47791lr = c0974f2;
        m68532k4(c0974f2.m7149to());
        m68546yj();
        m68538rv();
        m68535ks();
        if (!((ChartPlotArea) C7019kk.m27452k4((Object) this.f47791lr.m7149to().m69834fa().getPlotArea(), ChartPlotArea.class)).isLocationAutocalculated() && this.f47791lr.m7149to().m69834fa().getPlotArea().getLayoutTargetType() == 0) {
            this.f47776ak = new hqr(this, c0974f2);
        }
        if (this.f47791lr.m7149to().m69834fa().hasDataTable()) {
            if (this.f47804x1 == null && this.f47788k4 == null) {
                return;
            }
            this.f47806yd = ChartTypeCharacterizer.m762k4(this.f47791lr.m7149to().m69865up().get_Item(0).m64945h4().getType()) == 4 ? new C0960eq(this.f47791lr.m7149to().m69838jd(), this.f47804x1) : new C0960eq(this.f47791lr.m7149to().m69838jd(), this.f47788k4);
            m73215k4(this.f47806yd);
        }
    }

    /* JADX INFO: renamed from: h4 */
    private float m68526h4(int i) {
        C14729w9 c14729w9 = this.f47777ar;
        float fM73203ak = 0.0f;
        if (c14729w9 != null && c14729w9.m72667m9() == i) {
            fM73203ak = 0.0f + this.f47777ar.m73225wy();
        }
        C14729w9 c14729w92 = this.f47798um;
        if (c14729w92 != null && c14729w92.m72667m9() == i) {
            fM73203ak += this.f47798um.m73225wy();
        }
        C14729w9 c14729w93 = this.f47779bv;
        if (c14729w93 != null && c14729w93.m72667m9() == i) {
            fM73203ak += this.f47779bv.m73203ak();
        }
        C14729w9 c14729w94 = this.f47801v4;
        return (c14729w94 == null || c14729w94.m72667m9() != i) ? fM73203ak : fM73203ak + this.f47801v4.m73203ak();
    }

    /* JADX INFO: renamed from: ks */
    private void m68535ks() {
        AbstractC14763x3 abstractC14763x3 = this.f47788k4;
        if (abstractC14763x3 != null && abstractC14763x3.mo3221T_() && this.f47788k4.m73026k4().m73384dy().m327x1().m71458kk()) {
            this.f47779bv = new C14729w9(this.f47788k4.m73026k4());
        }
        AbstractC14763x3 abstractC14763x32 = this.f47804x1;
        if (abstractC14763x32 != null && abstractC14763x32.mo3221T_() && this.f47804x1.m73026k4().m73384dy().m327x1().m71458kk()) {
            this.f47777ar = new C14729w9(this.f47804x1.m73026k4());
        }
        AbstractC14763x3 abstractC14763x33 = this.f47789kk;
        if (abstractC14763x33 != null && abstractC14763x33.mo3221T_() && this.f47789kk.m73026k4().m73384dy().m327x1().m71458kk()) {
            this.f47801v4 = new C14729w9(this.f47789kk.m73026k4());
        }
        AbstractC14763x3 abstractC14763x34 = this.f47796to;
        if (abstractC14763x34 != null && abstractC14763x34.mo3221T_() && this.f47796to.m73026k4().m73384dy().m327x1().m71458kk()) {
            this.f47798um = new C14729w9(this.f47796to.m73026k4());
        }
        C14729w9 c14729w9 = this.f47779bv;
        if (c14729w9 != null) {
            m73215k4(c14729w9);
        }
        C14729w9 c14729w92 = this.f47777ar;
        if (c14729w92 != null) {
            m73215k4(c14729w92);
        }
        C14729w9 c14729w93 = this.f47801v4;
        if (c14729w93 != null) {
            m73215k4(c14729w93);
        }
        C14729w9 c14729w94 = this.f47798um;
        if (c14729w94 != null) {
            m73215k4(c14729w94);
        }
    }

    /* JADX INFO: renamed from: rv */
    private void m68538rv() {
        AbstractC14763x3 abstractC14763x3 = this.f47788k4;
        if (abstractC14763x3 != null && abstractC14763x3.m73026k4().m73384dy().hasTitle()) {
            this.f47797u4 = new C0831bu(this.f47788k4.m73026k4());
        }
        AbstractC14763x3 abstractC14763x32 = this.f47804x1;
        if (abstractC14763x32 != null && abstractC14763x32.m73026k4().m73384dy().hasTitle()) {
            this.f47800uz = new C0831bu(this.f47804x1.m73026k4());
        }
        AbstractC14763x3 abstractC14763x33 = this.f47789kk;
        if (abstractC14763x33 != null && abstractC14763x33.m73026k4().m73384dy().hasTitle()) {
            this.f47802wl = new C0831bu(this.f47789kk.m73026k4());
        }
        AbstractC14763x3 abstractC14763x34 = this.f47796to;
        if (abstractC14763x34 != null && abstractC14763x34.m73026k4().m73384dy().hasTitle()) {
            this.f47794qq = new C0831bu(this.f47796to.m73026k4());
        }
        C0831bu c0831bu = this.f47797u4;
        if (c0831bu != null) {
            m73215k4(c0831bu);
        }
        C0831bu c0831bu2 = this.f47800uz;
        if (c0831bu2 != null) {
            m73215k4(c0831bu2);
        }
        C0831bu c0831bu3 = this.f47802wl;
        if (c0831bu3 != null) {
            m73215k4(c0831bu3);
        }
        C0831bu c0831bu4 = this.f47794qq;
        if (c0831bu4 != null) {
            m73215k4(c0831bu4);
        }
    }

    /* JADX INFO: renamed from: x6 */
    private float m68545x6() {
        if (this.f47806yd != null && this.f47791lr.m7149to().m69834fa().hasDataTable()) {
            return this.f47806yd.m73203ak() + (this.f47806yd.m5617to() ? 0.0f : 8.0f);
        }
        return 0.0f;
    }

    /* JADX INFO: renamed from: yj */
    private void m68546yj() {
        if (this.f47791lr.m7149to().m69865up().get_Item(0).m64945h4().getType() == 80) {
            return;
        }
        AbstractC14763x3 abstractC14763x3 = this.f47804x1;
        if (abstractC14763x3 != null) {
            C14262p0 c14262p0 = new C14262p0(abstractC14763x3);
            this.f47807yj = c14262p0;
            m73215k4(c14262p0);
        }
        AbstractC14763x3 abstractC14763x32 = this.f47796to;
        if (abstractC14763x32 != null) {
            C14262p0 c14262p02 = new C14262p0(abstractC14763x32);
            this.f47790ks = c14262p02;
            m73215k4(c14262p02);
        }
        AbstractC14763x3 abstractC14763x33 = this.f47788k4;
        if (abstractC14763x33 != null) {
            C14262p0 c14262p03 = new C14262p0(abstractC14763x33);
            this.f47795rv = c14262p03;
            m73215k4(c14262p03);
        }
        AbstractC14763x3 abstractC14763x34 = this.f47789kk;
        if (abstractC14763x34 != null) {
            C14262p0 c14262p04 = new C14262p0(abstractC14763x34);
            this.f47805x6 = c14262p04;
            m73215k4(c14262p04);
        }
        AbstractC14763x3 abstractC14763x35 = this.f47785h4;
        if (abstractC14763x35 != null) {
            C14262p0 c14262p05 = new C14262p0(abstractC14763x35);
            this.f47793ne = c14262p05;
            m73215k4(c14262p05);
        }
        AbstractC14763x3 abstractC14763x36 = this.f47792m9;
        if (abstractC14763x36 != null) {
            C14262p0 c14262p06 = new C14262p0(abstractC14763x36);
            this.f47786ix = c14262p06;
            m73215k4(c14262p06);
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final AbstractC14763x3 m68548c5() {
        return this.f47785h4;
    }

    /* JADX INFO: renamed from: ck */
    public final C0960eq m68549ck() {
        return this.f47806yd;
    }

    /* JADX INFO: renamed from: du */
    public final float m68550du(int i) {
        C0960eq c0960eq;
        float fM67481k4 = C14116yg.m67481k4(m68556k4(i), m68558kk(i));
        return (i != 1 || (c0960eq = this.f47806yd) == null) ? fM67481k4 : C14116yg.m67481k4(fM67481k4, c0960eq.m5615dy());
    }

    /* JADX INFO: renamed from: dy */
    public final AbstractC14763x3 m68552dy() {
        return this.f47782du;
    }

    /* JADX INFO: renamed from: fa */
    public final hqr m68553fa() {
        return this.f47776ak;
    }

    /* JADX INFO: renamed from: jd */
    public final AbstractC14763x3 m68555jd() {
        return this.f47792m9;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x001a A[PHI: r1 r5
      0x001a: PHI (r1v7 com.aspose.slides.x3) = (r1v6 com.aspose.slides.x3), (r1v9 com.aspose.slides.x3) binds: [B:24:0x002a, B:16:0x0018] A[DONT_GENERATE, DONT_INLINE]
      0x001a: PHI (r5v18 float) = (r5v16 float), (r5v21 float) binds: [B:24:0x002a, B:16:0x0018] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0039 A[PHI: r1 r5
      0x0039: PHI (r1v2 com.aspose.slides.x3) = (r1v0 com.aspose.slides.x3), (r1v4 com.aspose.slides.x3) binds: [B:43:0x004f, B:31:0x0037] A[DONT_GENERATE, DONT_INLINE]
      0x0039: PHI (r5v5 float) = (r5v3 float), (r5v12 float) binds: [B:43:0x004f, B:31:0x0037] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final float m68556k4(int i) {
        float f;
        AbstractC14763x3 abstractC14763x3;
        float f2;
        AbstractC14763x3 abstractC14763x32;
        float f3 = 0.0f;
        if (i != 0) {
            if (i == 1) {
                AbstractC14763x3 abstractC14763x33 = this.f47788k4;
                f = abstractC14763x33 != null ? abstractC14763x33.f49907to : 0.0f;
                abstractC14763x3 = this.f47789kk;
                if (abstractC14763x3 != null) {
                    f3 = abstractC14763x3.f49907to;
                }
            } else if (i == 2) {
                AbstractC14763x3 abstractC14763x34 = this.f47788k4;
                f = abstractC14763x34 != null ? abstractC14763x34.f49900du : 0.0f;
                abstractC14763x32 = this.f47789kk;
                if (abstractC14763x32 != null) {
                }
            } else if (i != 3) {
                f2 = 0.0f;
            } else {
                AbstractC14763x3 abstractC14763x35 = this.f47804x1;
                f = abstractC14763x35 != null ? abstractC14763x35.f49900du : 0.0f;
                abstractC14763x32 = this.f47796to;
                if (abstractC14763x32 != null) {
                    f3 = abstractC14763x32.f49900du;
                }
            }
            float f4 = f3;
            f3 = f;
            f2 = f4;
        } else {
            AbstractC14763x3 abstractC14763x36 = this.f47804x1;
            f = (abstractC14763x36 == null || this.f47806yd != null) ? 0.0f : abstractC14763x36.f49907to;
            abstractC14763x3 = this.f47796to;
            if (abstractC14763x3 != null && this.f47806yd == null) {
            }
            float f42 = f3;
            f3 = f;
            f2 = f42;
        }
        return C14116yg.m67481k4(f3, f2);
    }

    /* JADX INFO: renamed from: kk */
    public final float m68558kk(int i) {
        AbstractC14763x3 abstractC14763x3 = this.f47804x1;
        float fM56697kk = 0.0f;
        if (abstractC14763x3 != null && abstractC14763x3.m73022ix() == i) {
            fM56697kk = 0.0f + this.f47804x1.mo4966ks().m56699x1();
        }
        AbstractC14763x3 abstractC14763x32 = this.f47796to;
        if (abstractC14763x32 != null && abstractC14763x32.m73022ix() == i) {
            fM56697kk += this.f47796to.mo4966ks().m56699x1();
        }
        AbstractC14763x3 abstractC14763x33 = this.f47788k4;
        if (abstractC14763x33 != null && abstractC14763x33.m73022ix() == i) {
            fM56697kk += this.f47788k4.mo4966ks().m56697kk();
        }
        AbstractC14763x3 abstractC14763x34 = this.f47789kk;
        return (abstractC14763x34 == null || abstractC14763x34.m73022ix() != i) ? fM56697kk : this.f47789kk.mo4966ks().m56697kk() + fM56697kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final AbstractC14763x3 m68559m9() {
        return this.f47796to;
    }

    /* JADX INFO: renamed from: to */
    public final float m68560to(int i) {
        C0960eq c0960eq;
        float fM67481k4 = C14116yg.m67481k4(m68556k4(i), m68563x1(i) + m68558kk(i) + m68526h4(i));
        return (i != 1 || (c0960eq = this.f47806yd) == null) ? fM67481k4 : C14116yg.m67481k4(fM67481k4, c0960eq.m5615dy());
    }

    /* JADX INFO: renamed from: up */
    public final C14713vw m68562up() {
        float fM73225wy = (m73225wy() - m68560to(1)) - m68560to(2);
        float fM73203ak = (m73203ak() - m68560to(3)) - m68560to(0);
        if (this.f47806yd != null) {
            fM73203ak -= m68545x6();
        }
        return this.f47782du != null ? new C14713vw(this.f47782du.m73225wy(), this.f47782du.m73203ak()) : new C14713vw(fM73225wy, fM73203ak);
    }

    /* JADX INFO: renamed from: x1 */
    public final float m68563x1(int i) {
        float fM73203ak = 0.0f;
        if (this.f47800uz != null && this.f47804x1.m73022ix() == i) {
            fM73203ak = 0.0f + this.f47800uz.m73225wy() + this.f47778b3;
        }
        if (this.f47794qq != null && this.f47796to.m73022ix() == i) {
            fM73203ak += this.f47794qq.m73225wy() + this.f47778b3;
        }
        if (this.f47794qq != null && this.f47800uz != null && this.f47804x1.m73022ix() == i && this.f47794qq.m4320kk() == this.f47800uz.m4320kk()) {
            fM73203ak += this.f47803wy - this.f47778b3;
        }
        if (this.f47797u4 != null && this.f47788k4.m73022ix() == i) {
            fM73203ak += this.f47797u4.m73203ak() + this.f47778b3;
        }
        if (this.f47802wl != null && this.f47789kk.m73022ix() == i) {
            fM73203ak += this.f47802wl.m73203ak() + this.f47778b3;
        }
        return (this.f47797u4 == null || this.f47802wl == null || this.f47788k4.m73022ix() != i || this.f47797u4.m4320kk() != this.f47802wl.m4320kk()) ? fM73203ak : (this.f47803wy - this.f47778b3) + fM73203ak;
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0125  */
    /* JADX INFO: renamed from: c5 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m68521c5(C14713vw c14713vw) {
        AbstractC14763x3 abstractC14763x3;
        float fM73219qm;
        C13683jf c13683jf;
        float fM73219qm2;
        C13683jf c13683jf2;
        float fM68556k4;
        float fM68560to;
        float fMo63718up;
        int iM73022ix = this.f47789kk.m73022ix();
        if (iM73022ix != 0) {
            if (iM73022ix == 3) {
                if (this.f47789kk.m73021fa().mo63718up() == 0.0f) {
                    this.f47789kk.m73212h4(m68563x1(3));
                    c13683jf = this.f47784fa;
                    fM68560to = this.f47789kk.m73219qm();
                    fMo63718up = this.f47789kk.m73203ak();
                    fM73219qm2 = fM68560to + fMo63718up;
                    c13683jf.m73212h4(fM73219qm2);
                } else if (this.f47789kk.m73026k4().m73384dy().getTickLabelPosition() == 2) {
                    abstractC14763x3 = this.f47789kk;
                    fM73219qm = (m68560to(3) + this.f47789kk.m73021fa().mo63718up()) - this.f47789kk.m73203ak();
                } else {
                    abstractC14763x3 = this.f47789kk;
                    fM73219qm = m68563x1(3);
                }
            }
            if (m68560to(1) <= m68556k4(1)) {
                this.f47789kk.m73208du(m68560to(1));
                c13683jf2 = this.f47784fa;
                fM68556k4 = m68560to(1);
            } else {
                this.f47789kk.m73208du(m68556k4(1));
                c13683jf2 = this.f47784fa;
                fM68556k4 = m68556k4(1);
            }
            c13683jf2.m73208du(fM68556k4);
        }
        if (this.f47789kk.m73021fa().mo63718up() == this.f47789kk.m73021fa().m73203ak()) {
            this.f47789kk.m73212h4((m73203ak() - m68563x1(0)) - this.f47789kk.m73203ak());
            c13683jf = this.f47784fa;
            fM73219qm2 = this.f47789kk.m73219qm();
            c13683jf.m73212h4(fM73219qm2);
            if (m68560to(1) <= m68556k4(1)) {
            }
            c13683jf2.m73208du(fM68556k4);
        }
        if (this.f47789kk.m73026k4().m73384dy().getTickLabelPosition() != 2) {
            this.f47789kk.m73212h4((m73203ak() - m68563x1(0)) - this.f47789kk.m73203ak());
            C0960eq c0960eq = this.f47806yd;
            if (c0960eq != null && !c0960eq.m5617to()) {
                abstractC14763x3 = this.f47789kk;
                fM73219qm = abstractC14763x3.m73219qm() - this.f47806yd.m73203ak();
            }
            c13683jf = this.f47784fa;
            fM68560to = m68560to(3);
            fMo63718up = this.f47789kk.m73021fa().mo63718up();
            fM73219qm2 = fM68560to + fMo63718up;
            c13683jf.m73212h4(fM73219qm2);
            if (m68560to(1) <= m68556k4(1)) {
            }
            c13683jf2.m73208du(fM68556k4);
        }
        abstractC14763x3 = this.f47789kk;
        fM73219qm = m68560to(3) + this.f47789kk.m73021fa().mo63718up();
        abstractC14763x3.m73212h4(fM73219qm);
        c13683jf = this.f47784fa;
        fM68560to = m68560to(3);
        fMo63718up = this.f47789kk.m73021fa().mo63718up();
        fM73219qm2 = fM68560to + fMo63718up;
        c13683jf.m73212h4(fM73219qm2);
        if (m68560to(1) <= m68556k4(1)) {
        }
        c13683jf2.m73208du(fM68556k4);
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00a5  */
    /* JADX INFO: renamed from: ck */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m68522ck(C14713vw c14713vw) {
        AbstractC14763x3 abstractC14763x3;
        float fM73203ak;
        C13683jf c13683jf;
        float fM68556k4;
        float fM68560to;
        int iM73022ix = this.f47788k4.m73022ix();
        if (iM73022ix != 0) {
            if (iM73022ix == 3) {
                if (this.f47788k4.m73026k4().m73384dy().getTickLabelPosition() == 2) {
                    abstractC14763x3 = this.f47788k4;
                    fM68560to = m68560to(3) + this.f47788k4.m73021fa().mo63718up();
                } else {
                    abstractC14763x3 = this.f47788k4;
                    fM68560to = m68560to(3);
                }
                fM73203ak = fM68560to - this.f47788k4.m73203ak();
            }
            if (m68560to(1) <= m68556k4(1)) {
                this.f47788k4.m73208du(m68560to(1));
                c13683jf = this.f47787jd;
                fM68556k4 = m68560to(1);
            } else {
                this.f47788k4.m73208du(m68556k4(1));
                c13683jf = this.f47787jd;
                fM68556k4 = m68556k4(1);
            }
            c13683jf.m73208du(fM68556k4);
        }
        if (this.f47788k4.m73026k4().m73384dy().getTickLabelPosition() == 2) {
            abstractC14763x3 = this.f47788k4;
            fM73203ak = m68560to(3) + this.f47788k4.m73021fa().mo63718up();
        } else {
            abstractC14763x3 = this.f47788k4;
            fM73203ak = m73203ak() - m68560to(0);
        }
        abstractC14763x3.m73212h4(fM73203ak);
        this.f47787jd.m73212h4(m68560to(3) + this.f47788k4.m73021fa().mo63718up());
        if (m68560to(1) <= m68556k4(1)) {
        }
        c13683jf.m73208du(fM68556k4);
    }

    /* JADX INFO: renamed from: dy */
    private void m68525dy(C14713vw c14713vw) {
        AbstractC14763x3 abstractC14763x3;
        AbstractC14763x3 abstractC14763x32;
        float fM72556x1;
        AbstractC14763x3 abstractC14763x33;
        if (this.f47782du != null) {
            if (((ChartPlotArea) C7019kk.m27452k4((Object) this.f47791lr.m7149to().m69834fa().getPlotArea(), ChartPlotArea.class)).isLocationAutocalculated()) {
                this.f47782du.m73208du((c14713vw.m72555k4() / 2.0f) - (this.f47782du.m73225wy() / 2.0f));
                abstractC14763x33 = this.f47782du;
                fM72556x1 = (c14713vw.m72556x1() / 2.0f) - (this.f47782du.m73203ak() / 2.0f);
            } else {
                fM72556x1 = 0.0f;
                this.f47782du.m73208du(0.0f);
                abstractC14763x33 = this.f47782du;
            }
            abstractC14763x33.m73212h4(fM72556x1);
        }
        AbstractC14763x3 abstractC14763x34 = this.f47785h4;
        if (abstractC14763x34 != null && (abstractC14763x32 = this.f47782du) != null) {
            abstractC14763x34.m73208du(((this.f47782du.m73225wy() / 2.0f) + abstractC14763x32.m73205bz()) - this.f47785h4.m73225wy());
            this.f47785h4.m73212h4(((this.f47782du.m73203ak() / 2.0f) + this.f47782du.m73219qm()) - this.f47785h4.m73203ak());
            this.f47783dy.m73208du(((this.f47782du.m73225wy() / 2.0f) + this.f47782du.m73205bz()) - (this.f47783dy.m73225wy() / 2.0f));
            this.f47783dy.m73212h4(((this.f47782du.m73203ak() / 2.0f) + this.f47782du.m73219qm()) - (this.f47783dy.m73203ak() / 2.0f));
        }
        AbstractC14763x3 abstractC14763x35 = this.f47792m9;
        if (abstractC14763x35 != null && (abstractC14763x3 = this.f47782du) != null) {
            abstractC14763x35.m73208du(((this.f47782du.m73225wy() / 2.0f) + abstractC14763x3.m73205bz()) - this.f47792m9.m73225wy());
            this.f47792m9.m73212h4(((this.f47782du.m73203ak() / 2.0f) + this.f47782du.m73219qm()) - this.f47792m9.m73203ak());
            this.f47780c5.m73208du(((this.f47782du.m73225wy() / 2.0f) + this.f47782du.m73205bz()) - (this.f47780c5.m73225wy() / 2.0f));
            this.f47780c5.m73212h4(((this.f47782du.m73203ak() / 2.0f) + this.f47782du.m73219qm()) - (this.f47780c5.m73203ak() / 2.0f));
        }
        if (this.f47804x1 != null) {
            m68541up(c14713vw);
        }
        if (this.f47788k4 != null) {
            m68522ck(c14713vw);
        }
        if (this.f47789kk != null) {
            m68521c5(c14713vw);
        }
        if (this.f47796to != null) {
            m68528jd(c14713vw);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0140  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0153  */
    /* JADX INFO: renamed from: jd */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m68528jd(C14713vw c14713vw) {
        AbstractC14763x3 abstractC14763x3;
        float fM68563x1;
        C13683jf c13683jf;
        float fM73205bz;
        float fM73225wy;
        float fM73205bz2;
        if (this.f47796to.f49908x1.get_Item(0).m64945h4().getType() == 77) {
            this.f47796to.m73208du(((m73225wy() - m68563x1(2)) - m68526h4(2)) - this.f47796to.m73225wy());
            this.f47799up.m73208du(this.f47796to.m73205bz());
            return;
        }
        int iM73022ix = this.f47796to.m73022ix();
        if (iM73022ix != 1) {
            if (iM73022ix == 2) {
                if (this.f47796to.m73021fa().mo63718up() == this.f47796to.m73021fa().m73225wy()) {
                    this.f47796to.m73208du(((m73225wy() - m68563x1(2)) - m68526h4(2)) - this.f47796to.m73225wy());
                    c13683jf = this.f47799up;
                    fM73205bz2 = this.f47796to.m73205bz();
                    c13683jf.m73208du(fM73205bz2);
                } else if (this.f47796to.m73026k4().m73384dy().getTickLabelPosition() == 2) {
                    abstractC14763x3 = this.f47796to;
                    fM68563x1 = m68560to(1) + this.f47796to.m73021fa().mo63718up();
                } else {
                    this.f47796to.m73208du((m73225wy() - m68563x1(2)) - this.f47796to.m73225wy());
                    c13683jf = this.f47799up;
                    fM73205bz = m68560to(1);
                    fM73225wy = this.f47796to.m73021fa().mo63718up();
                    fM73205bz2 = fM73205bz + fM73225wy;
                    c13683jf.m73208du(fM73205bz2);
                }
            }
            if (m68560to(3) > m68556k4(3)) {
                this.f47796to.m73212h4(m68560to(3));
                this.f47799up.m73212h4(m68560to(3));
                return;
            } else {
                this.f47796to.m73212h4(m68556k4(3));
                this.f47799up.m73212h4(m68556k4(3));
                return;
            }
        }
        if (this.f47796to.m73021fa().mo63718up() == 0.0f) {
            this.f47796to.m73208du(m68563x1(1) + m68526h4(1));
            c13683jf = this.f47799up;
            fM73205bz = this.f47796to.m73205bz();
            fM73225wy = this.f47796to.m73225wy();
            fM73205bz2 = fM73205bz + fM73225wy;
            c13683jf.m73208du(fM73205bz2);
            if (m68560to(3) > m68556k4(3)) {
            }
        } else if (this.f47796to.m73026k4().m73384dy().getTickLabelPosition() == 2) {
            abstractC14763x3 = this.f47796to;
            fM68563x1 = (m68560to(1) + this.f47796to.m73021fa().mo63718up()) - this.f47796to.m73225wy();
        } else {
            abstractC14763x3 = this.f47796to;
            fM68563x1 = m68563x1(1);
        }
        abstractC14763x3.m73208du(fM68563x1);
        c13683jf = this.f47799up;
        fM73205bz = m68560to(1);
        fM73225wy = this.f47796to.m73021fa().mo63718up();
        fM73205bz2 = fM73205bz + fM73225wy;
        c13683jf.m73208du(fM73205bz2);
        if (m68560to(3) > m68556k4(3)) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private float m68529k4(AbstractC14763x3 abstractC14763x3, C13683jf c13683jf, float f, float f2) {
        abstractC14763x3.m73210fa(new C14713vw(f, f2));
        c13683jf.m73210fa(new C14713vw(f, f2));
        return f - abstractC14763x3.m73225wy();
    }

    /* JADX INFO: renamed from: kk */
    private void m68533kk(mxy mxyVar) {
        float fM73219qm;
        AbstractC14763x3 abstractC14763x3;
        AbstractC14763x3 abstractC14763x32;
        if (this.f47806yd == null) {
            return;
        }
        boolean z = ChartTypeCharacterizer.m762k4(this.f47791lr.m7149to().m69865up().get_Item(0).m64945h4().getType()) == 4;
        C0960eq c0960eq = this.f47806yd;
        if (z) {
            fM73219qm = this.f47788k4.m73219qm();
            abstractC14763x3 = this.f47788k4;
        } else {
            fM73219qm = this.f47804x1.m73219qm();
            abstractC14763x3 = this.f47804x1;
        }
        c0960eq.m73212h4(fM73219qm + abstractC14763x3.m73203ak());
        float fM68560to = m68560to(1);
        if (fM68560to > this.f47806yd.m5615dy() && !z) {
            C0960eq c0960eq2 = this.f47806yd;
            c0960eq2.m73208du(fM68560to - c0960eq2.m5615dy());
        }
        if (!z && C7019kk.m27469x1(m68561to(), AbstractC14464sp.class) && m68561to().m73225wy() > 0.0f && this.f47806yd.m73205bz() + this.f47806yd.m73225wy() > m68561to().m73225wy() + fM68560to) {
            C0960eq c0960eq3 = this.f47806yd;
            c0960eq3.m73208du(c0960eq3.m73205bz() - ((this.f47806yd.m73205bz() + this.f47806yd.m73225wy()) - (fM68560to + m68561to().m73225wy())));
        }
        if (this.f47806yd.m5617to() && (abstractC14763x32 = this.f47789kk) != null && abstractC14763x32.m73022ix() == 0) {
            C0960eq c0960eq4 = this.f47806yd;
            c0960eq4.m73212h4(c0960eq4.m73219qm() - this.f47789kk.mo4966ks().m56697kk());
        }
    }

    /* JADX INFO: renamed from: ks */
    private void m68536ks(C14713vw c14713vw) {
        float fM72555k4 = c14713vw.m72555k4();
        float fM72556x1 = c14713vw.m72556x1();
        C0831bu c0831bu = this.f47797u4;
        if (c0831bu != null) {
            c0831bu.m73210fa(new C14713vw(fM72555k4, fM72556x1));
        }
        C0831bu c0831bu2 = this.f47800uz;
        if (c0831bu2 != null) {
            c0831bu2.m73210fa(new C14713vw(fM72555k4, fM72556x1));
        }
        C0831bu c0831bu3 = this.f47794qq;
        if (c0831bu3 != null) {
            c0831bu3.m73210fa(new C14713vw(fM72555k4, fM72556x1));
        }
        C0831bu c0831bu4 = this.f47802wl;
        if (c0831bu4 != null) {
            c0831bu4.m73210fa(new C14713vw(fM72555k4, fM72556x1));
        }
    }

    /* JADX INFO: renamed from: m9 */
    private void m68537m9(C14713vw c14713vw) {
        float fM72555k4;
        float fM72556x1;
        float fM68550du;
        if (((ChartPlotArea) C7019kk.m27452k4((Object) this.f47791lr.m7149to().m69834fa().getPlotArea(), ChartPlotArea.class)).isLocationAutocalculated()) {
            fM72555k4 = (c14713vw.m72555k4() - m68560to(1)) - m68560to(2);
            fM72556x1 = c14713vw.m72556x1() - m68560to(0);
            fM68550du = m68560to(3);
        } else {
            fM72555k4 = (c14713vw.m72555k4() - m68550du(1)) - m68550du(2);
            fM72556x1 = c14713vw.m72556x1() - m68550du(0);
            fM68550du = m68550du(3);
        }
        float fM68545x6 = fM72556x1 - fM68550du;
        if (this.f47806yd != null) {
            fM68545x6 -= m68545x6();
        }
        AbstractC14763x3 abstractC14763x3 = this.f47804x1;
        if (abstractC14763x3 != null && !C7019kk.m27469x1(abstractC14763x3, vfb.class)) {
            m68529k4(this.f47804x1, this.f47781ck, c14713vw.m72555k4(), fM68545x6);
        }
        AbstractC14763x3 abstractC14763x32 = this.f47796to;
        if (abstractC14763x32 != null && !C7019kk.m27469x1(abstractC14763x32, vfb.class)) {
            m68529k4(this.f47796to, this.f47799up, c14713vw.m72555k4(), fM68545x6);
        }
        AbstractC14763x3 abstractC14763x33 = this.f47788k4;
        if (abstractC14763x33 != null && !C7019kk.m27469x1(abstractC14763x33, vfb.class)) {
            m68542x1(this.f47788k4, this.f47787jd, fM72555k4, c14713vw.m72556x1() / 2.0f);
        }
        AbstractC14763x3 abstractC14763x34 = this.f47789kk;
        if (abstractC14763x34 != null && !C7019kk.m27469x1(abstractC14763x34, vfb.class)) {
            m68542x1(this.f47789kk, this.f47784fa, fM72555k4, c14713vw.m72556x1() / 2.0f);
        }
        if (C7019kk.m27469x1(this.f47804x1, vfb.class)) {
            m68529k4(this.f47804x1, this.f47781ck, c14713vw.m72555k4(), fM68545x6);
        }
        if (C7019kk.m27469x1(this.f47796to, vfb.class)) {
            m68529k4(this.f47796to, this.f47799up, c14713vw.m72555k4(), fM68545x6);
        }
        if (C7019kk.m27469x1(this.f47788k4, vfb.class)) {
            m68542x1(this.f47788k4, this.f47787jd, fM72555k4, c14713vw.m72556x1());
        }
        if (C7019kk.m27469x1(this.f47789kk, vfb.class)) {
            m68542x1(this.f47789kk, this.f47784fa, fM72555k4, c14713vw.m72556x1());
        }
        C0960eq c0960eq = this.f47806yd;
        if (c0960eq == null || !c0960eq.m5617to()) {
            return;
        }
        this.f47806yd.m73210fa(c14713vw);
    }

    /* JADX INFO: renamed from: rv */
    private void m68539rv(C14713vw c14713vw) {
        C14729w9 c14729w9 = this.f47779bv;
        if (c14729w9 != null) {
            c14729w9.m73210fa(c14713vw);
        }
        C14729w9 c14729w92 = this.f47777ar;
        if (c14729w92 != null) {
            c14729w92.m73210fa(c14713vw);
        }
        C14729w9 c14729w93 = this.f47798um;
        if (c14729w93 != null) {
            c14729w93.m73210fa(c14713vw);
        }
        C14729w9 c14729w94 = this.f47801v4;
        if (c14729w94 != null) {
            c14729w94.m73210fa(c14713vw);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00c4  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00d7  */
    /* JADX INFO: renamed from: up */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m68541up(C14713vw c14713vw) {
        AbstractC14763x3 abstractC14763x3;
        float fM68560to;
        float fM73225wy;
        C13683jf c13683jf;
        float fM68556k4;
        float fMo63718up = this.f47804x1.m73021fa() == null ? 0.0f : this.f47804x1.m73021fa().mo63718up();
        float fM73225wy2 = this.f47804x1.m73021fa() == null ? 0.0f : this.f47804x1.m73021fa().m73225wy();
        int iM73022ix = this.f47804x1.m73022ix();
        if (iM73022ix != 1) {
            if (iM73022ix == 2) {
                if (fMo63718up == 0.0f) {
                    this.f47804x1.m73208du(((m73225wy() - m68563x1(2)) - m68526h4(2)) - this.f47804x1.m73225wy());
                    this.f47781ck.m73208du(this.f47804x1.m73205bz());
                } else if (this.f47804x1.m73026k4().m73384dy().getTickLabelPosition() == 2) {
                    abstractC14763x3 = this.f47804x1;
                    fM73225wy = m68560to(1) + fMo63718up;
                } else {
                    this.f47804x1.m73208du(m68560to(1) + fM73225wy2);
                    this.f47781ck.m73208du(m68560to(1) + fMo63718up);
                }
            }
            if (m68560to(3) <= m68556k4(3)) {
                this.f47804x1.m73212h4(m68560to(3));
                c13683jf = this.f47781ck;
                fM68556k4 = m68560to(3);
            } else {
                this.f47804x1.m73212h4(m68556k4(3));
                c13683jf = this.f47781ck;
                fM68556k4 = m68556k4(3);
            }
            c13683jf.m73212h4(fM68556k4);
        }
        if (this.f47804x1.m73026k4().m73384dy().getTickLabelPosition() == 2) {
            abstractC14763x3 = this.f47804x1;
            fM68560to = m68560to(1) + fMo63718up;
        } else {
            abstractC14763x3 = this.f47804x1;
            fM68560to = m68560to(1);
        }
        fM73225wy = fM68560to - this.f47804x1.m73225wy();
        abstractC14763x3.m73208du(fM73225wy);
        this.f47781ck.m73208du(m68560to(1) + fMo63718up);
        if (m68560to(3) <= m68556k4(3)) {
        }
        c13683jf.m73212h4(fM68556k4);
    }

    /* JADX INFO: renamed from: x1 */
    private float m68542x1(AbstractC14763x3 abstractC14763x3, C13683jf c13683jf, float f, float f2) {
        abstractC14763x3.m73210fa(new C14713vw(f, f2));
        c13683jf.m73210fa(new C14713vw(f, f2));
        return f2 - abstractC14763x3.m73203ak();
    }

    /* JADX INFO: renamed from: yj */
    private void m68547yj(C14713vw c14713vw) {
        float fM67481k4 = C14116yg.m67481k4(m68556k4(1), m68560to(1));
        float fM67481k42 = C14116yg.m67481k4(m68556k4(3), m68560to(3));
        C14262p0 c14262p0 = this.f47807yj;
        if (c14262p0 != null) {
            c14262p0.m73208du(fM67481k4);
            this.f47807yj.m73212h4(fM67481k42);
        }
        C14262p0 c14262p02 = this.f47795rv;
        if (c14262p02 != null) {
            c14262p02.m73208du(fM67481k4);
            this.f47795rv.m73212h4(fM67481k42);
        }
        C14262p0 c14262p03 = this.f47805x6;
        if (c14262p03 != null) {
            c14262p03.m73208du(fM67481k4);
            this.f47805x6.m73212h4(fM67481k42);
        }
        C14262p0 c14262p04 = this.f47790ks;
        if (c14262p04 != null) {
            c14262p04.m73208du(fM67481k4);
            this.f47790ks.m73212h4(fM67481k42);
        }
        C14262p0 c14262p05 = this.f47793ne;
        if (c14262p05 != null) {
            c14262p05.m73208du(((this.f47782du.m73225wy() / 2.0f) + this.f47782du.m73205bz()) - (this.f47793ne.m73225wy() / 2.0f));
            this.f47793ne.m73212h4(((this.f47782du.m73203ak() / 2.0f) + this.f47782du.m73219qm()) - (this.f47793ne.m73203ak() / 2.0f));
        }
        C14262p0 c14262p06 = this.f47786ix;
        if (c14262p06 != null) {
            c14262p06.m73208du(((this.f47782du.m73225wy() / 2.0f) + this.f47782du.m73205bz()) - (this.f47786ix.m73225wy() / 2.0f));
            this.f47786ix.m73212h4(((this.f47782du.m73203ak() / 2.0f) + this.f47782du.m73219qm()) - (this.f47786ix.m73203ak() / 2.0f));
        }
    }

    /* JADX INFO: renamed from: du */
    public final AbstractC14763x3 m68551du() {
        return this.f47804x1;
    }

    /* JADX INFO: renamed from: h4 */
    public final AbstractC14763x3 m68554h4() {
        return this.f47789kk;
    }

    /* JADX INFO: renamed from: to */
    public final AbstractC14763x3 m68561to() {
        return this.f47788k4;
    }

    /* JADX INFO: renamed from: du */
    private void m68523du(mxy mxyVar) {
        AbstractC14763x3 abstractC14763x3;
        C14729w9 c14729w9;
        C14729w9 c14729w92;
        float fM73219qm;
        C14729w9 c14729w93;
        float fM73219qm2;
        C14729w9 c14729w94;
        float fM73205bz;
        C14729w9 c14729w95;
        float fM73205bz2;
        C14729w9 c14729w96 = this.f47777ar;
        if (c14729w96 != null) {
            c14729w96.m73212h4(this.f47804x1.m73219qm());
            if (this.f47804x1.m73022ix() == 1) {
                c14729w95 = this.f47777ar;
                fM73205bz2 = this.f47804x1.m73205bz() - this.f47777ar.m73225wy();
            } else {
                c14729w95 = this.f47777ar;
                fM73205bz2 = this.f47804x1.m73205bz() + this.f47804x1.m73225wy();
            }
            c14729w95.m73208du(fM73205bz2);
            m68531k4(this.f47804x1.m73026k4().m73384dy().m327x1(), this.f47777ar, mxyVar);
        }
        C14729w9 c14729w97 = this.f47798um;
        if (c14729w97 != null) {
            c14729w97.m73212h4(this.f47796to.m73219qm());
            if (this.f47796to.m73022ix() == 1) {
                c14729w94 = this.f47798um;
                fM73205bz = this.f47796to.m73205bz() - this.f47798um.m73225wy();
            } else {
                c14729w94 = this.f47798um;
                fM73205bz = this.f47796to.m73205bz() + this.f47796to.m73225wy();
            }
            c14729w94.m73208du(fM73205bz);
            m68531k4(this.f47796to.m73026k4().m73384dy().m327x1(), this.f47798um, mxyVar);
        }
        C14729w9 c14729w98 = this.f47779bv;
        if (c14729w98 != null) {
            c14729w98.m73208du((this.f47788k4.m73205bz() + this.f47788k4.m73225wy()) - this.f47779bv.m73225wy());
            if (this.f47788k4.m73022ix() == 3) {
                c14729w93 = this.f47779bv;
                fM73219qm2 = this.f47788k4.m73219qm() - this.f47779bv.m73203ak();
            } else {
                c14729w93 = this.f47779bv;
                fM73219qm2 = this.f47788k4.m73219qm() + this.f47788k4.m73203ak();
            }
            c14729w93.m73212h4(fM73219qm2);
            m68531k4(this.f47788k4.m73026k4().m73384dy().m327x1(), this.f47779bv, mxyVar);
        }
        if (this.f47801v4 == null || (abstractC14763x3 = this.f47789kk) == null || (c14729w9 = this.f47779bv) == null) {
            return;
        }
        c14729w9.m73208du((abstractC14763x3.m73205bz() + this.f47789kk.m73225wy()) - this.f47801v4.m73225wy());
        if (this.f47789kk.m73022ix() == 3) {
            c14729w92 = this.f47801v4;
            fM73219qm = this.f47789kk.m73219qm() - this.f47779bv.m73203ak();
        } else {
            c14729w92 = this.f47779bv;
            fM73219qm = this.f47789kk.m73219qm() + this.f47789kk.m73203ak();
        }
        c14729w92.m73212h4(fM73219qm);
        m68531k4(this.f47789kk.m73026k4().m73384dy().m327x1(), this.f47779bv, mxyVar);
    }

    /* JADX INFO: renamed from: h4 */
    private void m68527h4(C14713vw c14713vw) {
        if (this.f47804x1 != null) {
            this.f47781ck.m73210fa(new C14713vw(c14713vw.m72555k4(), this.f47804x1.m73203ak()));
        }
        C13683jf c13683jf = this.f47787jd;
        if (c13683jf != null) {
            c13683jf.m73210fa(new C14713vw(this.f47788k4.m73225wy(), c14713vw.m72556x1()));
        }
        if (this.f47796to != null) {
            this.f47799up.m73210fa(new C14713vw(c14713vw.m72555k4(), this.f47796to.m73203ak()));
        }
        C13683jf c13683jf2 = this.f47784fa;
        if (c13683jf2 != null) {
            c13683jf2.m73210fa(new C14713vw(this.f47789kk.m73225wy(), c14713vw.m72556x1()));
        }
        if (this.f47785h4 != null) {
            this.f47783dy.m73210fa(new C14713vw(this.f47782du.m73225wy(), this.f47782du.m73203ak()));
        }
        if (this.f47792m9 != null) {
            this.f47780c5.m73210fa(new C14713vw(this.f47782du.m73225wy(), this.f47782du.m73203ak()));
        }
    }

    /* JADX INFO: renamed from: kk */
    private void m68534kk(C14713vw c14713vw) {
        C14262p0 c14262p0 = this.f47807yj;
        if (c14262p0 != null) {
            c14262p0.m73210fa(new C14713vw(this.f47804x1.m73021fa().m73225wy(), this.f47804x1.m73203ak()));
        }
        C14262p0 c14262p02 = this.f47795rv;
        if (c14262p02 != null) {
            c14262p02.m73210fa(new C14713vw(this.f47788k4.m73225wy(), this.f47788k4.m73021fa().m73203ak()));
        }
        C14262p0 c14262p03 = this.f47805x6;
        if (c14262p03 != null) {
            c14262p03.m73210fa(new C14713vw(this.f47789kk.m73225wy(), this.f47789kk.m73021fa().m73203ak()));
        }
        C14262p0 c14262p04 = this.f47790ks;
        if (c14262p04 != null) {
            c14262p04.m73210fa(new C14713vw(this.f47796to.m73021fa().m73225wy(), this.f47796to.m73203ak()));
        }
        if (this.f47782du != null) {
            C14713vw c14713vw2 = new C14713vw(this.f47782du.m73225wy(), this.f47782du.m73203ak());
            C14262p0 c14262p05 = this.f47793ne;
            if (c14262p05 != null) {
                c14262p05.m73210fa(c14713vw2);
            }
            C14262p0 c14262p06 = this.f47786ix;
            if (c14262p06 != null) {
                c14262p06.m73210fa(c14713vw2);
            }
        }
    }

    /* JADX INFO: renamed from: to */
    private void m68540to(mxy mxyVar) {
        C0831bu c0831bu;
        float fM73225wy;
        C0831bu c0831bu2;
        float fM73203ak;
        float fM68563x1;
        if (this.f47797u4 != null) {
            if (this.f47788k4.m73022ix() == 3) {
                c0831bu2 = this.f47797u4;
                fM73203ak = m68563x1(3);
                fM68563x1 = this.f47788k4.m73203ak();
            } else {
                c0831bu2 = this.f47797u4;
                fM73203ak = m73203ak();
                fM68563x1 = m68563x1(0);
            }
            c0831bu2.m73212h4(fM73203ak - fM68563x1);
            this.f47797u4.m73208du(((this.f47788k4.m73225wy() / 2.0f) + this.f47788k4.m73205bz()) - (this.f47797u4.m73225wy() / 2.0f));
            m68531k4(this.f47788k4.m73026k4().m73384dy().getTitle(), this.f47797u4, mxyVar);
        }
        if (this.f47802wl != null) {
            if (this.f47789kk.m73022ix() == 3) {
                this.f47802wl.m73212h4(0.0f);
            } else {
                this.f47802wl.m73212h4(m73203ak() - this.f47802wl.m73203ak());
            }
            this.f47802wl.m73208du(((this.f47789kk.m73225wy() / 2.0f) + this.f47789kk.m73205bz()) - (this.f47802wl.m73225wy() / 2.0f));
            m68531k4(this.f47789kk.m73026k4().m73384dy().getTitle(), this.f47802wl, mxyVar);
        }
        if (this.f47800uz != null) {
            if (this.f47804x1.m73022ix() == 1) {
                c0831bu = this.f47800uz;
                fM73225wy = m68563x1(1);
            } else {
                c0831bu = this.f47800uz;
                fM73225wy = m73225wy();
            }
            c0831bu.m73208du(fM73225wy - this.f47800uz.m73225wy());
            this.f47800uz.m73212h4(((this.f47804x1.m73203ak() / 2.0f) + this.f47804x1.m73219qm()) - (this.f47800uz.m73203ak() / 2.0f));
            m68531k4(this.f47804x1.m73026k4().m73384dy().getTitle(), this.f47800uz, mxyVar);
        }
        if (this.f47794qq != null) {
            if (this.f47796to.m73022ix() == 1) {
                this.f47794qq.m73208du(0.0f);
            } else {
                this.f47794qq.m73208du(m73225wy() - this.f47794qq.m73225wy());
            }
            this.f47794qq.m73212h4(((this.f47796to.m73203ak() / 2.0f) + this.f47796to.m73219qm()) - (this.f47794qq.m73203ak() / 2.0f));
            m68531k4(this.f47796to.m73026k4().m73384dy().getTitle(), this.f47794qq, mxyVar);
        }
    }

    /* JADX INFO: renamed from: x1 */
    private AbstractC14763x3 m68543x1(C14787xi c14787xi, boolean z) {
        return z ? c14787xi.m73384dy().getCategoryAxisType() == 1 ? new f2h(c14787xi) : new d6s(c14787xi) : c14787xi.m73384dy().getCategoryAxisType() == 1 ? new C1195hd(c14787xi) : new C13785ll(c14787xi);
    }

    /* JADX INFO: renamed from: k4 */
    public final mxy m68557k4(mxy mxyVar) {
        boolean z;
        boolean z2;
        boolean z3;
        C0960eq c0960eq;
        float fM72555k4 = mxyVar.m72555k4();
        float fM72556x1 = mxyVar.m72556x1();
        float fM67814to = mxyVar.m67814to();
        float fM67811du = mxyVar.m67811du();
        AbstractC14763x3 abstractC14763x3 = this.f47804x1;
        boolean z4 = false;
        if (abstractC14763x3 == null || abstractC14763x3.m73026k4().m73384dy().hasTitle() || this.f47777ar != null || this.f47804x1.mo4966ks().m56699x1() <= 0.0f) {
            z = false;
            z2 = false;
        } else {
            z = this.f47804x1.m73022ix() == 1 && ((c0960eq = this.f47806yd) == null || c0960eq.m5615dy() + 6.0f <= this.f47804x1.m73225wy());
            z2 = this.f47804x1.m73022ix() == 2;
        }
        AbstractC14763x3 abstractC14763x32 = this.f47796to;
        if (abstractC14763x32 != null && !abstractC14763x32.m73026k4().m73384dy().hasTitle() && this.f47798um == null && this.f47796to.mo4966ks().m56699x1() > 0.0f) {
            if (this.f47796to.m73022ix() == 1) {
                C0960eq c0960eq2 = this.f47806yd;
                z = c0960eq2 == null || c0960eq2.m5615dy() + 6.0f <= this.f47796to.m73225wy();
            }
            if (this.f47796to.m73022ix() == 2) {
                z2 = true;
            }
        }
        AbstractC14763x3 abstractC14763x33 = this.f47788k4;
        if (abstractC14763x33 == null || abstractC14763x33.m73026k4().m73384dy().hasTitle() || this.f47779bv != null || this.f47788k4.mo4966ks().m56697kk() <= 0.0f) {
            z3 = false;
        } else {
            boolean z5 = this.f47788k4.m73022ix() == 3;
            if (this.f47788k4.m73022ix() == 0) {
                z4 = z5;
                z3 = true;
            } else {
                z4 = z5;
                z3 = false;
            }
        }
        AbstractC14763x3 abstractC14763x34 = this.f47789kk;
        if (abstractC14763x34 != null && !abstractC14763x34.m73026k4().m73384dy().hasTitle() && this.f47801v4 == null && this.f47789kk.mo4966ks().m56697kk() > 0.0f) {
            if (this.f47789kk.m73022ix() == 3) {
                z4 = true;
            }
            if (this.f47789kk.m73022ix() == 0) {
                z3 = true;
            }
        }
        boolean z6 = (!this.f47791lr.m7149to().m69834fa().hasDataTable() || this.f47806yd == null) ? z3 : true;
        if (z4) {
            fM72556x1 += 6.0f;
            fM67811du -= 6.0f;
        }
        if (z6) {
            fM72556x1 += 6.0f;
        }
        if (z) {
            fM72555k4 += 6.0f;
            fM67814to -= 6.0f;
        }
        if (z2) {
            fM72555k4 += 6.0f;
        }
        if (!z && this.f47791lr.m7149to().m69834fa().hasDataTable() && this.f47806yd != null) {
            fM72555k4 -= 6.0f;
            fM67814to += 6.0f;
        }
        return new mxy(fM72555k4, fM72556x1, fM67814to, fM67811du);
    }

    /* JADX INFO: renamed from: du */
    private void m68524du(C14713vw c14713vw) {
        AbstractC14763x3 abstractC14763x3 = this.f47782du;
        if (abstractC14763x3 != null) {
            abstractC14763x3.m73210fa(c14713vw);
        }
        AbstractC14763x3 abstractC14763x32 = this.f47785h4;
        if (abstractC14763x32 != null && this.f47782du != null) {
            abstractC14763x32.m73210fa(new C14713vw(this.f47782du.m73225wy(), this.f47782du.m73203ak() / 2.0f));
            this.f47783dy.m73210fa(new C14713vw(this.f47782du.m73225wy(), this.f47782du.m73203ak()));
        }
        AbstractC14763x3 abstractC14763x33 = this.f47792m9;
        if (abstractC14763x33 == null || this.f47782du == null) {
            return;
        }
        abstractC14763x33.m73210fa(new C14713vw(this.f47782du.m73225wy(), this.f47782du.m73203ak() / 2.0f));
        this.f47780c5.m73210fa(new C14713vw(this.f47782du.m73225wy(), this.f47782du.m73203ak()));
    }

    /* JADX INFO: renamed from: k4 */
    private AbstractC14763x3 m68530k4(C14787xi c14787xi, boolean z) {
        return z ? c14787xi.m73384dy().isLogarithmic() ? new iuf(c14787xi) : new tsh(c14787xi) : c14787xi.m73384dy().isLogarithmic() ? new C14568tn(c14787xi) : new C1113fn(c14787xi);
    }

    /* JADX INFO: renamed from: x1 */
    private void m68544x1(mxy mxyVar) {
        float fM72555k4 = (mxyVar.m72555k4() - m68563x1(1)) - m68563x1(2);
        float fM72556x1 = (mxyVar.m72556x1() - m68563x1(3)) - m68563x1(0);
        if (C7019kk.m27469x1(this.f47804x1, vfb.class)) {
            fM72555k4 = m68529k4(this.f47804x1, this.f47781ck, fM72555k4, fM72556x1);
        }
        if (C7019kk.m27469x1(this.f47796to, vfb.class)) {
            fM72555k4 = m68529k4(this.f47796to, this.f47799up, fM72555k4, fM72556x1);
        }
        if (C7019kk.m27469x1(this.f47788k4, vfb.class)) {
            fM72556x1 = m68542x1(this.f47788k4, this.f47787jd, fM72555k4, fM72556x1);
        }
        if (C7019kk.m27469x1(this.f47789kk, vfb.class)) {
            fM72556x1 = m68542x1(this.f47789kk, this.f47784fa, fM72555k4, fM72556x1);
        }
        AbstractC14763x3 abstractC14763x3 = this.f47804x1;
        if (abstractC14763x3 != null && !C7019kk.m27469x1(abstractC14763x3, vfb.class)) {
            fM72555k4 = m68529k4(this.f47804x1, this.f47781ck, fM72555k4, fM72556x1);
        }
        AbstractC14763x3 abstractC14763x32 = this.f47796to;
        if (abstractC14763x32 != null && !C7019kk.m27469x1(abstractC14763x32, vfb.class)) {
            fM72555k4 = m68529k4(this.f47796to, this.f47799up, fM72555k4, fM72556x1);
        }
        AbstractC14763x3 abstractC14763x33 = this.f47788k4;
        if (abstractC14763x33 != null && !C7019kk.m27469x1(abstractC14763x33, vfb.class)) {
            fM72556x1 = m68542x1(this.f47788k4, this.f47787jd, fM72555k4, fM72556x1 / 2.0f);
        }
        AbstractC14763x3 abstractC14763x34 = this.f47789kk;
        if (abstractC14763x34 != null && !C7019kk.m27469x1(abstractC14763x34, vfb.class)) {
            m68542x1(this.f47789kk, this.f47784fa, fM72555k4, fM72556x1 / 2.0f);
        }
        m68524du((C14713vw) mxyVar);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: to */
    public void mo3230to(C14713vw c14713vw) {
    }

    /* JADX INFO: renamed from: k4 */
    private void m68531k4(ILayoutable iLayoutable, AbstractC14770x9 abstractC14770x9, mxy mxyVar) {
        C12025x6 c12025x6 = new C12025x6(Float.NaN, Float.NaN);
        C12015qq c12015qq = new C12015qq();
        C12025x6[] c12025x6Arr = {c12025x6};
        C12015qq[] c12015qqArr = {c12015qq};
        this.f47791lr.m5807k4(iLayoutable, c12025x6Arr, c12015qqArr);
        c12025x6Arr[0].CloneTo(c12025x6);
        c12015qqArr[0].CloneTo(c12015qq);
        if (C14064he.m66715kk(c12025x6.m56897x1()) || C14064he.m66715kk(c12025x6.m56895kk())) {
            return;
        }
        if (((ChartPlotArea) C7019kk.m27452k4((Object) this.f47791lr.m7149to().m69834fa().getPlotArea(), ChartPlotArea.class)).isLocationAutocalculated()) {
            abstractC14770x9.m73208du(c12025x6.m56897x1() - mxyVar.m67814to());
            abstractC14770x9.m73212h4(c12025x6.m56895kk() - mxyVar.m67811du());
            return;
        }
        mxy mxyVarM5808kk = this.f47791lr.m5808kk((C14713vw) mxyVar);
        float fM67814to = mxyVarM5808kk.m67814to() - m68560to(1);
        float fM67811du = mxyVarM5808kk.m67811du() - m68560to(3);
        abstractC14770x9.m73208du(c12025x6.m56897x1() - fM67814to);
        abstractC14770x9.m73212h4(c12025x6.m56895kk() - fM67811du);
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: x1 */
    public void mo3231x1(C14713vw c14713vw) {
        mxy mxyVarM68557k4 = (mxy) c14713vw;
        if (((ChartPlotArea) C7019kk.m27452k4((Object) this.f47791lr.m7149to().m69834fa().getPlotArea(), ChartPlotArea.class)).isLocationAutocalculated() || this.f47791lr.m7149to().m69834fa().getPlotArea().getLayoutTargetType() == 1) {
            mxyVarM68557k4 = m68557k4(mxyVarM68557k4);
        }
        m68525dy(c14713vw);
        m68540to(mxyVarM68557k4);
        m68523du(mxyVarM68557k4);
        m68533kk(mxyVarM68557k4);
        m68547yj(c14713vw);
        for (AbstractC14770x9 abstractC14770x9 : m73204b3()) {
            abstractC14770x9.m73220ss();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m68532k4(C14365qy c14365qy) {
        C13683jf c13683jf;
        C13683jf c13683jf2;
        List<C13847mr> list;
        List<C13847mr> list2;
        List.Enumerator<C13847mr> it = c14365qy.m69865up().iterator();
        while (it.hasNext()) {
            try {
                C13847mr next = it.next();
                switch (ChartTypeCharacterizer.m762k4(next.m64945h4().getType())) {
                    case 1:
                        if (this.f47804x1 == null) {
                            AbstractC14763x3 abstractC14763x3M68543x1 = m68543x1(c14365qy.m69854ne(), true);
                            this.f47804x1 = abstractC14763x3M68543x1;
                            c13683jf = new C13683jf(abstractC14763x3M68543x1);
                            this.f47781ck = c13683jf;
                        }
                        break;
                    case 2:
                        if (!next.m64945h4().getPlotOnSecondAxis()) {
                            if (this.f47788k4 == null) {
                                AbstractC14763x3 abstractC14763x3M68543x12 = m68543x1(c14365qy.m69854ne(), false);
                                this.f47788k4 = abstractC14763x3M68543x12;
                                this.f47787jd = new C13683jf(abstractC14763x3M68543x12);
                            }
                            if (this.f47804x1 == null) {
                                AbstractC14763x3 abstractC14763x3M68530k4 = m68530k4(c14365qy.m69863u4(), true);
                                this.f47804x1 = abstractC14763x3M68530k4;
                                c13683jf = new C13683jf(abstractC14763x3M68530k4);
                                this.f47781ck = c13683jf;
                            }
                        } else {
                            if (this.f47789kk == null) {
                                AbstractC14763x3 abstractC14763x3M68543x13 = m68543x1(c14365qy.m69837ix(), false);
                                this.f47789kk = abstractC14763x3M68543x13;
                                this.f47784fa = new C13683jf(abstractC14763x3M68543x13);
                            }
                            if (this.f47796to == null) {
                                AbstractC14763x3 abstractC14763x3M68530k42 = m68530k4(c14365qy.m69866uz(), true);
                                this.f47796to = abstractC14763x3M68530k42;
                                c13683jf2 = new C13683jf(abstractC14763x3M68530k42);
                                this.f47799up = c13683jf2;
                            }
                        }
                        break;
                    case 3:
                        if (this.f47782du == null) {
                            this.f47782du = new nzw(c14365qy.m69854ne());
                        }
                        if (next.m64945h4().getPlotOnSecondAxis()) {
                            if (this.f47792m9 == null) {
                                AbstractC14763x3 abstractC14763x3M68530k43 = m68530k4(c14365qy.m69866uz(), true);
                                this.f47792m9 = abstractC14763x3M68530k43;
                                this.f47780c5 = new p9k(abstractC14763x3M68530k43);
                            }
                            list = this.f47792m9.f49908x1;
                        } else {
                            if (this.f47785h4 == null) {
                                AbstractC14763x3 abstractC14763x3M68530k44 = m68530k4(c14365qy.m69863u4(), true);
                                this.f47785h4 = abstractC14763x3M68530k44;
                                this.f47783dy = new p9k(abstractC14763x3M68530k44);
                            }
                            list = this.f47785h4.f49908x1;
                        }
                        list.addItem(next);
                        this.f47782du.f49908x1.addItem(next);
                        break;
                    case 4:
                        if (!next.m64945h4().getPlotOnSecondAxis()) {
                            if (this.f47788k4 == null) {
                                AbstractC14763x3 abstractC14763x3M68530k45 = m68530k4(c14365qy.m69863u4(), false);
                                this.f47788k4 = abstractC14763x3M68530k45;
                                this.f47787jd = new C13683jf(abstractC14763x3M68530k45);
                            }
                            if (this.f47804x1 == null) {
                                AbstractC14763x3 abstractC14763x3M68543x14 = m68543x1(c14365qy.m69854ne(), true);
                                this.f47804x1 = abstractC14763x3M68543x14;
                                c13683jf = new C13683jf(abstractC14763x3M68543x14);
                                this.f47781ck = c13683jf;
                            }
                        } else {
                            if (this.f47789kk == null) {
                                AbstractC14763x3 abstractC14763x3M68530k46 = m68530k4(c14365qy.m69866uz(), false);
                                this.f47789kk = abstractC14763x3M68530k46;
                                this.f47784fa = new C13683jf(abstractC14763x3M68530k46);
                            }
                            if (this.f47796to == null) {
                                AbstractC14763x3 abstractC14763x3M68543x15 = m68543x1(c14365qy.m69837ix(), true);
                                this.f47796to = abstractC14763x3M68543x15;
                                c13683jf2 = new C13683jf(abstractC14763x3M68543x15);
                                this.f47799up = c13683jf2;
                            }
                        }
                        break;
                    case 5:
                        if (!next.m64945h4().getPlotOnSecondAxis()) {
                            if (this.f47788k4 == null) {
                                AbstractC14763x3 abstractC14763x3M68530k47 = m68530k4(c14365qy.m69854ne(), false);
                                this.f47788k4 = abstractC14763x3M68530k47;
                                this.f47787jd = new C13683jf(abstractC14763x3M68530k47);
                            }
                            if (this.f47804x1 == null) {
                                AbstractC14763x3 abstractC14763x3M68530k48 = m68530k4(c14365qy.m69863u4(), true);
                                this.f47804x1 = abstractC14763x3M68530k48;
                                c13683jf = new C13683jf(abstractC14763x3M68530k48);
                                this.f47781ck = c13683jf;
                            }
                        } else {
                            if (this.f47789kk == null) {
                                AbstractC14763x3 abstractC14763x3M68530k49 = m68530k4(c14365qy.m69837ix(), false);
                                this.f47789kk = abstractC14763x3M68530k49;
                                this.f47784fa = new C13683jf(abstractC14763x3M68530k49);
                            }
                            if (this.f47796to == null) {
                                AbstractC14763x3 abstractC14763x3M68530k410 = m68530k4(c14365qy.m69866uz(), true);
                                this.f47796to = abstractC14763x3M68530k410;
                                c13683jf2 = new C13683jf(abstractC14763x3M68530k410);
                                this.f47799up = c13683jf2;
                            }
                        }
                        break;
                    case 7:
                        if (this.f47788k4 == null) {
                            this.f47788k4 = ChartTypeCharacterizer.m767to(c14365qy.m69865up().get_Item(0).m64945h4().getType()) ? new C14421rw(c14365qy.m69854ne()) : m68543x1(c14365qy.m69854ne(), false);
                            this.f47787jd = new C13683jf(this.f47788k4);
                        }
                        if (this.f47804x1 == null) {
                            AbstractC14763x3 abstractC14763x3M68530k411 = m68530k4(c14365qy.m69863u4(), true);
                            this.f47804x1 = abstractC14763x3M68530k411;
                            c13683jf = new C13683jf(abstractC14763x3M68530k411);
                            this.f47781ck = c13683jf;
                        }
                        break;
                    case 8:
                        if (this.f47788k4 == null) {
                            this.f47788k4 = new C14421rw(c14365qy.m69854ne());
                            this.f47788k4 = m68543x1(c14365qy.m69854ne(), false);
                        }
                        if (this.f47796to == null) {
                            AbstractC14763x3 abstractC14763x3M68530k412 = m68530k4(c14365qy.m69866uz(), true);
                            this.f47796to = abstractC14763x3M68530k412;
                            c13683jf2 = new C13683jf(abstractC14763x3M68530k412);
                            this.f47799up = c13683jf2;
                        }
                        break;
                }
                if (next.m64944dy().size() > 0 || (next.m64945h4().m719c5() != null && next.m64945h4().m719c5().m72973k4() > 0)) {
                    if (next.m64945h4().getType() == 77) {
                        AbstractC14763x3 abstractC14763x3 = this.f47788k4;
                        if (abstractC14763x3 != null) {
                            abstractC14763x3.f49908x1.addItem(next);
                        }
                        AbstractC14763x3 abstractC14763x32 = this.f47796to;
                        if (abstractC14763x32 != null) {
                            list2 = abstractC14763x32.f49908x1;
                            list2.addItem(next);
                        }
                    } else if (next.m64945h4().getPlotOnSecondAxis()) {
                        AbstractC14763x3 abstractC14763x33 = this.f47789kk;
                        if (abstractC14763x33 != null) {
                            abstractC14763x33.f49908x1.addItem(next);
                        }
                        AbstractC14763x3 abstractC14763x34 = this.f47796to;
                        if (abstractC14763x34 != null) {
                            list2 = abstractC14763x34.f49908x1;
                            list2.addItem(next);
                        }
                    } else {
                        AbstractC14763x3 abstractC14763x35 = this.f47788k4;
                        if (abstractC14763x35 != null) {
                            abstractC14763x35.f49908x1.addItem(next);
                        }
                        AbstractC14763x3 abstractC14763x36 = this.f47804x1;
                        if (abstractC14763x36 != null) {
                            list2 = abstractC14763x36.f49908x1;
                            list2.addItem(next);
                        }
                    }
                }
            } catch (Throwable th) {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
                throw th;
            }
        }
        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            it.dispose();
        }
        AbstractC14763x3 abstractC14763x37 = this.f47788k4;
        if (abstractC14763x37 != null) {
            m73215k4(abstractC14763x37);
            m73215k4(this.f47787jd);
            this.f47788k4.m73029k4(this.f47804x1);
        }
        AbstractC14763x3 abstractC14763x38 = this.f47804x1;
        if (abstractC14763x38 != null) {
            m73215k4(abstractC14763x38);
            m73215k4(this.f47781ck);
            this.f47804x1.m73029k4(this.f47788k4);
        }
        AbstractC14763x3 abstractC14763x39 = this.f47789kk;
        if (abstractC14763x39 != null) {
            m73215k4(abstractC14763x39);
            m73215k4(this.f47784fa);
            this.f47789kk.m73029k4(this.f47796to);
        }
        AbstractC14763x3 abstractC14763x310 = this.f47796to;
        if (abstractC14763x310 != null) {
            m73215k4(abstractC14763x310);
            m73215k4(this.f47799up);
            this.f47796to.m73029k4(this.f47789kk);
            if (this.f47796to.f49908x1.size() > 0 && this.f47796to.f49908x1.get_Item(0).m64945h4().getType() == 77) {
                this.f47796to.m73029k4(this.f47788k4);
            }
        }
        AbstractC14763x3 abstractC14763x311 = this.f47782du;
        if (abstractC14763x311 != null) {
            m73215k4(abstractC14763x311);
        }
        AbstractC14763x3 abstractC14763x312 = this.f47785h4;
        if (abstractC14763x312 != null) {
            m73215k4(abstractC14763x312);
            m73215k4(this.f47783dy);
            this.f47785h4.m73029k4(this.f47782du);
        }
        AbstractC14763x3 abstractC14763x313 = this.f47792m9;
        if (abstractC14763x313 != null) {
            m73215k4(abstractC14763x313);
            m73215k4(this.f47780c5);
            this.f47792m9.m73029k4(this.f47782du);
        }
    }

    @Override // com.aspose.slides.AbstractC14770x9
    /* JADX INFO: renamed from: k4 */
    public void mo3225k4(C14713vw c14713vw) {
        float fM56697kk;
        float fM68560to;
        float fM72556x1;
        boolean zIsLocationAutocalculated = ((ChartPlotArea) C7019kk.m27452k4((Object) this.f47791lr.m7149to().m69834fa().getPlotArea(), ChartPlotArea.class)).isLocationAutocalculated();
        mxy mxyVar = (mxy) c14713vw;
        m68536ks(mxyVar);
        m68539rv(c14713vw);
        if (zIsLocationAutocalculated || this.f47791lr.m7149to().m69834fa().getPlotArea().getLayoutTargetType() == 1) {
            m68544x1(mxyVar);
        } else {
            C0960eq c0960eq = this.f47806yd;
            if (c0960eq != null) {
                c0960eq.m73210fa(c14713vw);
            }
            this.f47776ak.m7280k4(c14713vw);
            m68527h4(c14713vw);
        }
        C0960eq c0960eq2 = this.f47806yd;
        if (c0960eq2 != null) {
            c0960eq2.m73210fa(c14713vw);
        }
        if (zIsLocationAutocalculated) {
            mxy mxyVarM68557k4 = m68557k4(mxyVar);
            m68537m9(mxyVarM68557k4);
            m68537m9(mxyVarM68557k4);
            m73217kk(mxyVarM68557k4.m72555k4());
            fM72556x1 = mxyVarM68557k4.m72556x1();
        } else {
            if (this.f47791lr.m7149to().m69834fa().getPlotArea().getLayoutTargetType() == 1) {
                m68537m9(c14713vw);
                m73217kk(c14713vw.m72555k4() + m68563x1(1) + m68563x1(2));
                fM56697kk = c14713vw.m72556x1() + m68563x1(3);
                fM68560to = m68563x1(0);
            } else {
                C12025x6 c12025x6 = new C12025x6();
                C12015qq c12015qq = new C12015qq();
                C12025x6[] c12025x6Arr = {c12025x6};
                C12015qq[] c12015qqArr = {c12015qq};
                C0974f2 c0974f2 = this.f47791lr;
                c0974f2.m5807k4(c0974f2.m7149to().m69834fa().getPlotArea(), c12025x6Arr, c12015qqArr);
                c12025x6Arr[0].CloneTo(c12025x6);
                c12015qqArr[0].CloneTo(c12015qq);
                m73217kk(c12015qq.m56699x1() + m68560to(1) + m68560to(2));
                fM56697kk = c12015qq.m56697kk() + m68560to(3);
                fM68560to = m68560to(0);
            }
            fM72556x1 = fM56697kk + fM68560to;
        }
        m73222to(fM72556x1);
        m68534kk(c14713vw);
    }
}
