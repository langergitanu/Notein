package com.aspose.slides.internal.p357qc;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p416tb.AbstractC10914up;
import com.aspose.slides.internal.p416tb.C10894bv;
import com.aspose.slides.internal.p416tb.C10898dy;
import com.aspose.slides.internal.p416tb.C10922yj;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.qc.dy */
/* JADX INFO: loaded from: classes4.dex */
public class C9832dy extends C10894bv {

    /* JADX INFO: renamed from: c5 */
    private final String f35620c5;

    /* JADX INFO: renamed from: ck */
    private final List<AbstractC10914up> f35621ck;

    /* JADX INFO: renamed from: du */
    private C12007ix f35622du;

    /* JADX INFO: renamed from: dy */
    private final String f35623dy;

    /* JADX INFO: renamed from: h4 */
    private String f35624h4;

    /* JADX INFO: renamed from: jd */
    private C9832dy f35625jd;

    /* JADX INFO: renamed from: k4 */
    private String f35626k4;

    /* JADX INFO: renamed from: kk */
    private String f35627kk;

    /* JADX INFO: renamed from: m9 */
    private final String f35628m9;

    /* JADX INFO: renamed from: to */
    private String f35629to;

    public C9832dy(C10898dy c10898dy, String str, C9832dy c9832dy, String str2) {
        super(c10898dy);
        this.f35622du = new C12007ix();
        this.f35628m9 = str;
        this.f35623dy = c9832dy.m52565c5();
        this.f35625jd = c9832dy;
        this.f35620c5 = str2;
        this.f35621ck = new List<>();
        m48494k4(C12007ix.f40519k4.Clone());
    }

    /* JADX INFO: renamed from: c5 */
    public final C9832dy m48483c5(String str) {
        C9832dy c9832dy = new C9832dy(m52569m9(), "/Slide", this, str);
        this.f35621ck.addItem(c9832dy);
        return c9832dy;
    }

    /* JADX INFO: renamed from: ck */
    public final C9832dy m48484ck(String str) {
        C9832dy c9832dy = new C9832dy(m52569m9(), "/Link", this, this.f35620c5);
        c9832dy.f35621ck.addItem(new C9831du(m52569m9(), str, this.f35620c5));
        c9832dy.m48487dy("/Block");
        this.f35621ck.addItem(c9832dy);
        return c9832dy;
    }

    /* JADX INFO: renamed from: du */
    public final String m48485du() {
        return this.f35628m9;
    }

    /* JADX INFO: renamed from: dy */
    public final void m48487dy(String str) {
        this.f35624h4 = str;
    }

    /* JADX INFO: renamed from: h4 */
    public final String m48488h4() {
        return this.f35626k4;
    }

    /* JADX INFO: renamed from: ix */
    public final C9832dy m48490ix() {
        return this.f35625jd;
    }

    /* JADX INFO: renamed from: jd */
    public final C9832dy m48491jd(String str) {
        C9832dy c9832dy = new C9832dy(m52569m9(), str, this, this.f35620c5);
        this.f35621ck.addItem(c9832dy);
        return c9832dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final C9832dy m48492k4(String str, C12007ix c12007ix) {
        C9832dy c9832dy = new C9832dy(m52569m9(), "/Figure", this, this.f35620c5);
        c9832dy.m48486du(str);
        c9832dy.m48494k4(c12007ix.Clone());
        c9832dy.m48487dy("/Block");
        this.f35621ck.addItem(c9832dy);
        return c9832dy;
    }

    /* JADX INFO: renamed from: ks */
    public final String m48495ks() {
        return this.f35627kk;
    }

    /* JADX INFO: renamed from: m9 */
    public final void m48496m9(String str) {
        this.f35629to = str;
    }

    /* JADX INFO: renamed from: ne */
    public final String m48497ne() {
        return this.f35624h4;
    }

    /* JADX INFO: renamed from: rv */
    public final String m48498rv() {
        return this.f35629to;
    }

    /* JADX INFO: renamed from: x6 */
    public final C12007ix m48499x6() {
        return this.f35622du.Clone();
    }

    public C9832dy(C10898dy c10898dy, String str, String str2, String str3) {
        super(c10898dy);
        this.f35622du = new C12007ix();
        this.f35628m9 = str;
        this.f35623dy = str2;
        this.f35620c5 = str3;
        this.f35621ck = new List<>();
        m48494k4(C12007ix.f40519k4.Clone());
    }

    /* JADX INFO: renamed from: du */
    public final void m48486du(String str) {
        this.f35626k4 = str;
    }

    /* JADX INFO: renamed from: h4 */
    public final void m48489h4(String str) {
        this.f35627kk = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final C9832dy m48493k4(String str, String str2) {
        C9832dy c9832dy = new C9832dy(m52569m9(), str, this, this.f35620c5);
        c9832dy.m48489h4(str2);
        this.f35621ck.addItem(c9832dy);
        return c9832dy;
    }

    @Override // com.aspose.slides.internal.p416tb.C10894bv, com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: k4 */
    public void mo9082k4(C10922yj c10922yj) {
        c10922yj.m52676k4(this);
        c10922yj.m52643dy();
        c10922yj.m52666kk("/Type", "/StructElem");
        c10922yj.m52666kk("/S", this.f35628m9);
        c10922yj.m52666kk("/P", this.f35623dy);
        if (!C14113y2.m67411k4(this.f35620c5)) {
            c10922yj.m52666kk("/Pg", this.f35620c5);
        }
        if (C12007ix.m56548to(m48499x6(), C12007ix.f40519k4) || !C14113y2.m67411k4(m48497ne())) {
            c10922yj.m52650k4("/A");
            c10922yj.m52643dy();
            if (C12007ix.m56548to(m48499x6(), C12007ix.f40519k4)) {
                c10922yj.m52654k4("/BBox", m48499x6().Clone());
            }
            c10922yj.m52666kk("/O", "/Layout");
            if (!C14113y2.m67411k4(m48497ne())) {
                c10922yj.m52666kk("/Placement", m48497ne());
            }
            c10922yj.m52640c5();
        }
        if (m48488h4() != null) {
            c10922yj.m52670to("/Alt", m48488h4());
        }
        if (m48495ks() != null) {
            c10922yj.m52670to("/ActualText", m48495ks());
        }
        c10922yj.m52650k4("/K");
        c10922yj.m52650k4("[");
        for (int i = 0; i < this.f35621ck.size(); i++) {
            c10922yj.m52650k4(this.f35621ck.get_Item(i).m52565c5());
            c10922yj.m52644h4();
        }
        c10922yj.m52650k4("]");
        if (!C14113y2.m67411k4(m48498rv())) {
            c10922yj.m52670to("/Lang", m48498rv());
        }
        c10922yj.m52640c5();
        c10922yj.m52678x1();
        for (int i2 = 0; i2 < this.f35621ck.size(); i2++) {
            this.f35621ck.get_Item(i2).mo9082k4(c10922yj);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m48494k4(C12007ix c12007ix) {
        this.f35622du = c12007ix.Clone();
    }
}
