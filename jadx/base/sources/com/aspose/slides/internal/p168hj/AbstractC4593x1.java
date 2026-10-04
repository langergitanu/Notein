package com.aspose.slides.internal.p168hj;

import com.aspose.slides.internal.p039be.AbstractC1689x1;
import com.aspose.slides.internal.p039be.C1682dy;
import com.aspose.slides.internal.p039be.C1684jd;
import com.aspose.slides.internal.p223ka.C5656k4;
import com.aspose.slides.internal.p223ka.C5659x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p416tb.AbstractC10914up;
import com.aspose.slides.internal.p416tb.C10896ck;
import com.aspose.slides.internal.p416tb.C10912u4;
import com.aspose.slides.internal.p416tb.C10921yd;
import com.aspose.slides.internal.p416tb.C10922yj;
import com.aspose.slides.internal.p420th.AbstractC10981yj;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.hj.x1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC4593x1 extends AbstractC10914up {

    /* JADX INFO: renamed from: du */
    private boolean f12834du;

    /* JADX INFO: renamed from: h4 */
    private C12007ix f12835h4;

    /* JADX INFO: renamed from: k4 */
    protected final C10912u4 f12836k4;

    /* JADX INFO: renamed from: kk */
    private final String f12837kk;

    /* JADX INFO: renamed from: m9 */
    private int f12838m9;

    /* JADX INFO: renamed from: to */
    private final C12025x6 f12839to;

    public AbstractC4593x1(C10912u4 c10912u4, AbstractC10981yj abstractC10981yj) {
        super(c10912u4.m52569m9());
        C12025x6 c12025x6Clone = C12025x6.f40591k4.Clone();
        this.f12839to = c12025x6Clone;
        this.f12834du = true;
        this.f12835h4 = C12007ix.f40519k4.Clone();
        this.f12837kk = C14113y2.m67402k4("{0}_{1}", abstractC10981yj.m53145m9(), Integer.valueOf(m52567dy()));
        abstractC10981yj.m53142h4().CloneTo(c12025x6Clone);
        this.f12834du = abstractC10981yj.m53141dy();
        abstractC10981yj.mo52867to().CloneTo(this.f12835h4);
        this.f12836k4 = c10912u4;
    }

    /* JADX INFO: renamed from: h4 */
    private boolean m18974h4() {
        return this.f12838m9 != 0;
    }

    /* JADX INFO: renamed from: du */
    public final C10912u4 m18984du() {
        return this.f12836k4;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract int mo18954k4();

    /* JADX INFO: renamed from: k4 */
    public final AbstractC1689x1 m18985k4(C10921yd c10921yd, C5659x1 c5659x1) {
        c10921yd.m52650k4("/");
        AbstractC1689x1 abstractC1689x1M18964k4 = this.f37962x1.m52453dy().m18964k4(c5659x1);
        c10921yd.m52650k4(abstractC1689x1M18964k4.m52566ck());
        c10921yd.m52644h4();
        c10921yd.m52646k4(c5659x1.m23114dy());
        c10921yd.m52650k4(" Tf ");
        return abstractC1689x1M18964k4;
    }

    /* JADX INFO: renamed from: kk */
    public final String m18988kk() {
        return this.f12837kk;
    }

    /* JADX INFO: renamed from: kk */
    public abstract void mo18955kk(C10922yj c10922yj);

    /* JADX INFO: renamed from: to */
    public final C12007ix m18989to() {
        return this.f12835h4;
    }

    /* JADX INFO: renamed from: x1 */
    public int mo18956x1() {
        return !this.f12834du ? 1 : 0;
    }

    /* JADX INFO: renamed from: x1 */
    public abstract void mo18957x1(C10922yj c10922yj);

    /* JADX INFO: renamed from: x1 */
    public static void m18983x1(C10921yd c10921yd) {
        c10921yd.m52650k4("\r\n   ET\r\n  Q\r\n EMC");
    }

    /* JADX INFO: renamed from: k4 */
    public final String m18986k4(C5659x1 c5659x1, C5656k4 c5656k4) {
        return C14113y2.m67402k4("{0} rg /{1} {2} Tf ", C10921yd.m52637k4(c5656k4), this.f37962x1.m52453dy().m18964k4(c5659x1).m52566ck(), C10921yd.m52639x1(c5659x1.m23114dy()));
    }

    /* JADX INFO: renamed from: k4 */
    public static void m18975k4(C10921yd c10921yd) {
        c10921yd.m52650k4(" /Tx BMC\r\n  q\r\n   BT\r\n    ");
    }

    /* JADX INFO: renamed from: k4 */
    public static void m18976k4(C10921yd c10921yd, float f) {
        c10921yd.m52650k4("1 0 0 1 2 ");
        c10921yd.m52646k4(f);
        c10921yd.m52650k4(" Tm ");
    }

    /* JADX INFO: renamed from: k4 */
    public static void m18977k4(C10921yd c10921yd, float f, float f2) {
        c10921yd.m52644h4();
        c10921yd.m52646k4(f);
        c10921yd.m52644h4();
        c10921yd.m52646k4(f2);
        c10921yd.m52650k4(" Td ");
    }

    /* JADX INFO: renamed from: k4 */
    public static void m18978k4(C10921yd c10921yd, C5656k4 c5656k4) {
        c10921yd.m52650k4(C10921yd.m52637k4(c5656k4));
        c10921yd.m52650k4(" rg ");
    }

    /* JADX INFO: renamed from: k4 */
    public static void m18979k4(C10921yd c10921yd, C12007ix c12007ix) {
        c10921yd.m52650k4("0 g ");
        c10921yd.m52646k4(c12007ix.m56571to());
        c10921yd.m52644h4();
        c10921yd.m52646k4(c12007ix.m56554dy());
        c10921yd.m52644h4();
        c10921yd.m52646k4(c12007ix.m56556h4());
        c10921yd.m52644h4();
        c10921yd.m52646k4(c12007ix.m56558k4());
        c10921yd.m52650k4(" re f ");
        c10921yd.m52650k4("1 g ");
        c10921yd.m52646k4(c12007ix.m56571to() + 1.0f);
        c10921yd.m52644h4();
        c10921yd.m52646k4(c12007ix.m56554dy() + 1.0f);
        c10921yd.m52644h4();
        c10921yd.m52646k4(c12007ix.m56556h4() - 2.0f);
        c10921yd.m52644h4();
        c10921yd.m52646k4(c12007ix.m56558k4() - 2.0f);
        c10921yd.m52650k4(" re f ");
    }

    /* JADX INFO: renamed from: k4 */
    public static void m18980k4(C10921yd c10921yd, String str, C1682dy c1682dy) {
        c10921yd.m52650k4("(");
        c1682dy.mo9088k4(str);
        c10921yd.m52650k4(str);
        c10921yd.m52650k4(") Tj ");
    }

    /* JADX INFO: renamed from: k4 */
    public static void m18981k4(C10921yd c10921yd, String str, C1684jd c1684jd) {
        c10921yd.m52650k4("[");
        c10921yd.m52650k4("(");
        c1684jd.m9098k4(str, c10921yd, true);
        c10921yd.m52672x1(")");
        c10921yd.m52672x1("]");
        c10921yd.m52672x1("TJ");
    }

    /* JADX INFO: renamed from: k4 */
    public static void m18982k4(C10921yd c10921yd, String str, AbstractC1689x1 abstractC1689x1) {
        C1684jd c1684jd = (C1684jd) C7019kk.m27452k4((Object) abstractC1689x1, C1684jd.class);
        if (c1684jd != null) {
            m18981k4(c10921yd, str, c1684jd);
        } else {
            m18980k4(c10921yd, str, (C1682dy) abstractC1689x1);
        }
    }

    @Override // com.aspose.slides.internal.p416tb.AbstractC10914up
    /* JADX INFO: renamed from: k4 */
    public void mo9082k4(C10922yj c10922yj) {
        c10922yj.m52649k4(m52570yj());
        c10922yj.m52676k4(this);
        c10922yj.m52643dy();
        c10922yj.m52666kk("/Type", "/Annot");
        c10922yj.m52666kk("/Subtype", "/Widget");
        c10922yj.m52666kk("/P", this.f12836k4.m52565c5());
        c10922yj.m52666kk("/FT", C10896ck.m52442to(mo18954k4()));
        c10922yj.m52652k4("/F", 4);
        c10922yj.m52654k4("/Rect", new C12007ix(this.f12835h4.m56557jd(), this.f12836k4.m52545kk() - this.f12835h4.m56551ck(), this.f12835h4.m56550c5(), this.f12835h4.m56575x1()).Clone());
        this.f12838m9 |= mo18956x1();
        if (m18974h4()) {
            c10922yj.m52652k4("/Ff", this.f12838m9);
        }
        c10922yj.m52670to("/T", this.f12837kk);
        mo18957x1(c10922yj);
        c10922yj.m52640c5();
        c10922yj.m52678x1();
        mo18955kk(c10922yj);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m18987k4(C12007ix c12007ix) {
        c12007ix.CloneTo(this.f12835h4);
    }
}
