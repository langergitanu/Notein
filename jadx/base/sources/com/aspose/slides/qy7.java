package com.aspose.slides;

import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p243l6.C6005k4;
import com.aspose.slides.internal.p314oc.AbstractC7020m9;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.internal.p505xn.C12569rv;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14093tq;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;

/* JADX INFO: loaded from: classes3.dex */
final class qy7 implements IGenericCloneable<qy7>, Cloneable {

    /* JADX INFO: renamed from: ak */
    private byte f48458ak;

    /* JADX INFO: renamed from: ar */
    private float f48459ar;

    /* JADX INFO: renamed from: b3 */
    private C14093tq<Boolean> f48460b3;

    /* JADX INFO: renamed from: bv */
    private C0962es f48461bv;

    /* JADX INFO: renamed from: c5 */
    IGlowEffectiveData f48462c5;

    /* JADX INFO: renamed from: c6 */
    private final C1197hf f48463c6;

    /* JADX INFO: renamed from: ck */
    IOuterShadowEffectiveData f48464ck;

    /* JADX INFO: renamed from: dq */
    private int f48465dq;

    /* JADX INFO: renamed from: du */
    public lrb f48466du;

    /* JADX INFO: renamed from: dy */
    IReflectionEffectiveData f48467dy;

    /* JADX INFO: renamed from: fa */
    IGlowEffectiveData f48468fa;

    /* JADX INFO: renamed from: h4 */
    boolean f48469h4;

    /* JADX INFO: renamed from: ix */
    private byte f48470ix;

    /* JADX INFO: renamed from: jd */
    IOuterShadowEffectiveData f48471jd;

    /* JADX INFO: renamed from: k4 */
    public oju f48472k4;

    /* JADX INFO: renamed from: kk */
    final String f48473kk;

    /* JADX INFO: renamed from: ks */
    private boolean f48474ks;

    /* JADX INFO: renamed from: lr */
    private byte f48475lr;

    /* JADX INFO: renamed from: m9 */
    ShapeFrame f48476m9;

    /* JADX INFO: renamed from: ne */
    private boolean f48477ne;

    /* JADX INFO: renamed from: qq */
    private float f48478qq;

    /* JADX INFO: renamed from: rv */
    private boolean f48479rv;

    /* JADX INFO: renamed from: to */
    public Portion f48480to;

    /* JADX INFO: renamed from: ts */
    private float[] f48481ts;

    /* JADX INFO: renamed from: u4 */
    private C14251ot f48482u4;

    /* JADX INFO: renamed from: um */
    private azo f48483um;

    /* JADX INFO: renamed from: up */
    IInnerShadowEffectiveData f48484up;

    /* JADX INFO: renamed from: uz */
    private short f48485uz;

    /* JADX INFO: renamed from: v4 */
    private byte f48486v4;

    /* JADX INFO: renamed from: wl */
    private float f48487wl;

    /* JADX INFO: renamed from: wy */
    private C14093tq<Boolean> f48488wy;

    /* JADX INFO: renamed from: x1 */
    public final C12003du f48489x1;

    /* JADX INFO: renamed from: x6 */
    private C14366k4 f48490x6;

    /* JADX INFO: renamed from: xk */
    private byte[] f48491xk;

    /* JADX INFO: renamed from: yd */
    private String f48492yd;

    /* JADX INFO: renamed from: yj */
    IBaseSlide f48493yj;

    /* JADX INFO: renamed from: com.aspose.slides.qy7$k4 */
    public static class C14366k4 extends AbstractC7020m9<C14366k4> {

        /* JADX INFO: renamed from: du */
        public boolean f48494du;

        /* JADX INFO: renamed from: k4 */
        public String f48495k4;

        /* JADX INFO: renamed from: kk */
        public boolean f48496kk;

        /* JADX INFO: renamed from: to */
        public boolean f48497to;

        /* JADX INFO: renamed from: x1 */
        public float f48498x1;

        /* JADX INFO: renamed from: x1 */
        private boolean m69934x1(C14366k4 c14366k4) {
            return C14067j2.m66728k4(c14366k4.f48495k4, this.f48495k4) && c14366k4.f48498x1 == this.f48498x1 && c14366k4.f48496kk == this.f48496kk && c14366k4.f48497to == this.f48497to && c14366k4.f48494du == this.f48494du;
        }

        public Object clone() {
            return Clone();
        }

        public boolean equals(Object obj) {
            if (C14067j2.m66729x1(null, obj)) {
                return false;
            }
            if (C14067j2.m66729x1(this, obj)) {
                return true;
            }
            if (obj instanceof C14366k4) {
                return m69934x1((C14366k4) obj);
            }
            return false;
        }

        public int hashCode() {
            return C12569rv.m58664k4(this.f48495k4, Float.valueOf(this.f48498x1), Boolean.valueOf(this.f48496kk), Boolean.valueOf(this.f48497to), Boolean.valueOf(this.f48494du));
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public C14366k4 Clone() {
            C14366k4 c14366k4 = new C14366k4();
            CloneTo(c14366k4);
            return c14366k4;
        }

        /* JADX INFO: renamed from: k4 */
        public final void m69936k4(lrb lrbVar, String str) {
            if (lrbVar != null) {
                if (C14064he.m66715kk(this.f48498x1)) {
                    this.f48498x1 = lrbVar.m4837m9();
                }
                this.f48496kk = lrbVar.getFontBold();
                this.f48497to = lrbVar.getFontItalic();
            }
            if (str == null && "arial black".equals(C14113y2.m67368h4(this.f48495k4))) {
                this.f48496kk = false;
            }
        }

        @Override // com.aspose.slides.p559ms.System.AbstractC14079na
        /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
        public void CloneTo(C14366k4 c14366k4) {
            c14366k4.f48495k4 = this.f48495k4;
            c14366k4.f48498x1 = this.f48498x1;
            c14366k4.f48496kk = this.f48496kk;
            c14366k4.f48497to = this.f48497to;
            c14366k4.f48494du = this.f48494du;
        }
    }

    public qy7(Portion portion, lrb lrbVar, C14366k4 c14366k4, byte b, byte b2, byte[] bArr, String str, oju ojuVar, BaseSlide baseSlide, kg7 kg7Var, byte b3) {
        this.f48472k4 = new oju();
        this.f48489x1 = new C12003du();
        this.f48490x6 = new C14366k4();
        this.f48470ix = (byte) 0;
        this.f48482u4 = null;
        this.f48487wl = Float.NaN;
        this.f48478qq = 0.0f;
        this.f48459ar = 576.0f;
        this.f48486v4 = (byte) 0;
        this.f48460b3 = new C14093tq<>();
        this.f48488wy = new C14093tq<>();
        c14366k4.CloneTo(this.f48490x6);
        this.f48477ne = false;
        this.f48485uz = (short) 0;
        this.f48461bv = new C0962es(C12003du.m56460uz().Clone());
        this.f48480to = portion;
        this.f48463c6 = baseSlide.m403rv().m2385ks();
        this.f48459ar = 72.0f;
        this.f48492yd = c14366k4.f48495k4;
        this.f48473kk = str;
        this.f48475lr = b;
        this.f48465dq = b2 & 255;
        this.f48491xk = bArr;
        this.f48458ak = b3;
        ojuVar.CloneTo(this.f48472k4);
        this.f48466du = lrbVar;
        if (lrbVar != null) {
            this.f48478qq = lrbVar.getSpacing();
            this.f48470ix = lrbVar.getTextCapType();
            this.f48485uz = C7019kk.m27468x1(Double.valueOf(C14116yg.m67497to(lrbVar.getEscapement() + (lrbVar.getEscapement() >= 0.0f ? 0.001f : -0.001f))), 14);
            ShapeFrame shapeFrame = new ShapeFrame(0.0f, 0.0f, ojuVar.f47836k4, ojuVar.f47837x1, (byte) 0, (byte) 0, 0.0f);
            this.f48461bv = C0962es.m5660k4(new ajz(shapeFrame.cloneT(), null, null, baseSlide, kg7Var), lrbVar.getFillFormat(), (byte) 1, null);
            this.f48483um = new azo(new ajz(shapeFrame.cloneT(), null, null, baseSlide, kg7Var), lrbVar.getLineFormat(), 0);
            if (lrbVar.getStrikethroughType() > 0) {
                this.f48486v4 = lrbVar.getStrikethroughType();
            }
            this.f48471jd = lrbVar.getEffectFormat().getOuterShadowEffect();
            this.f48464ck = ((AbstractC0872cw) lrbVar).f4458du.getOuterShadowEffect();
            this.f48467dy = lrbVar.getEffectFormat().getReflectionEffect();
            this.f48462c5 = lrbVar.getEffectFormat().getGlowEffect();
            this.f48468fa = ((AbstractC0872cw) lrbVar).f4458du.getGlowEffect();
            this.f48484up = lrbVar.getEffectFormat().getInnerShadowEffect();
            GroupShape[] groupShapeArr = {null};
            kke.m63959k4(GroupShape.class, portion, groupShapeArr);
            GroupShape groupShape = groupShapeArr[0];
            IEffectFormatEffectiveData effective = groupShape != null ? groupShape.getEffectFormat().getEffective() : null;
            IOuterShadowEffectiveData iOuterShadowEffectiveData = this.f48471jd;
            if (iOuterShadowEffectiveData != null || this.f48464ck != null) {
                if (iOuterShadowEffectiveData == null) {
                    IOuterShadowEffectiveData iOuterShadowEffectiveData2 = this.f48464ck;
                }
                this.f48477ne = true;
                if (effective != null && effective.getOuterShadowEffect() != null) {
                    this.f48479rv = groupShape.getShapes().size() > 1;
                }
            }
            if ((this.f48462c5 != null || this.f48468fa != null) && effective != null && effective.getGlowEffect() != null) {
                this.f48479rv = groupShape.getShapes().size() > 1;
            }
            if (lrbVar.f4471qm) {
                this.f48467dy = ((AbstractC0872cw) lrbVar).f4458du.getReflectionEffect();
                GeometryShape[] geometryShapeArr = {null};
                kke.m63959k4(GeometryShape.class, portion, geometryShapeArr);
                this.f48476m9 = geometryShapeArr[0].m2546bz().m5631fa();
                this.f48469h4 = true;
            }
        }
        this.f48493yj = baseSlide;
    }

    /* JADX INFO: renamed from: ak */
    public final float m69880ak() {
        return m69906kk(this.f48459ar);
    }

    /* JADX INFO: renamed from: ar */
    public final C14093tq<Boolean> m69881ar() {
        return this.f48488wy;
    }

    /* JADX INFO: renamed from: b3 */
    public final C14251ot m69882b3() {
        if (this.f48482u4 == null) {
            float fM69906kk = m69906kk(this.f48459ar);
            boolean z = this.f48470ix == 1;
            try {
                this.f48482u4 = this.f48463c6.m7124k4(m69912ne(), this.f48475lr, this.f48465dq, fM69906kk, C14735wf.m72694k4(m69912ne(), m69931xk()), z);
            } catch (RuntimeException e) {
                C3085sv.m13082k4(e);
                this.f48482u4 = this.f48463c6.m7124k4("Arial", this.f48475lr, this.f48465dq, fM69906kk, m69931xk(), z);
            }
        }
        return this.f48482u4;
    }

    /* JADX INFO: renamed from: bv */
    public final float m69883bv() {
        return this.f48487wl;
    }

    /* JADX INFO: renamed from: bz */
    public final boolean m69884bz() {
        return this.f48464ck != null;
    }

    /* JADX INFO: renamed from: c5 */
    public final boolean m69885c5() {
        return this.f48490x6.f48497to;
    }

    /* JADX INFO: renamed from: c6 */
    public final boolean m69886c6() {
        return this.f48467dy != null;
    }

    /* JADX INFO: renamed from: ck */
    public final boolean m69887ck() {
        return this.f48474ks;
    }

    /* JADX INFO: renamed from: dq */
    public final float m69888dq() {
        C12004dy c12004dy;
        try {
            c12004dy = new C12004dy(m69912ne());
        } catch (RuntimeException e) {
            C3085sv.m13082k4(e);
            try {
                c12004dy = new C12004dy("Arial");
            } catch (RuntimeException e2) {
                C3085sv.m13082k4(e2);
                return m69882b3().m68819x1().m23116jd() / 2.0f;
            }
        }
        int iM69931xk = m69931xk();
        float fM69925wy = (m69925wy() * c12004dy.m56532kk(iM69931xk)) / c12004dy.m56535to(iM69931xk);
        c12004dy.m56528h4();
        return fM69925wy / 2.0f;
    }

    /* JADX INFO: renamed from: du */
    public final C12003du m69889du() {
        return this.f48461bv.m5676k4();
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m69890dy() {
        return this.f48490x6.f48496kk;
    }

    /* JADX INFO: renamed from: e0 */
    public final boolean m69891e0() {
        return this.f48484up != null;
    }

    /* JADX INFO: renamed from: fa */
    public final boolean m69892fa() {
        return this.f48490x6.f48494du;
    }

    /* JADX INFO: renamed from: g8 */
    public final boolean m69893g8() {
        return ((Fonts) this.f48493yj.getPresentation().getMasterTheme().getFontScheme().getMinor()).m1527x1();
    }

    /* JADX INFO: renamed from: h4 */
    public final C12003du m69894h4() {
        IOuterShadowEffectiveData iOuterShadowEffectiveData = this.f48471jd;
        if (iOuterShadowEffectiveData != null) {
            return ((vmd) iOuterShadowEffectiveData).m72367x1();
        }
        IOuterShadowEffectiveData iOuterShadowEffectiveData2 = this.f48464ck;
        return iOuterShadowEffectiveData2 != null ? ((vmd) iOuterShadowEffectiveData2).m72367x1() : C12003du.m56460uz().Clone();
    }

    /* JADX INFO: renamed from: ix */
    public final byte m69895ix() {
        return this.f48475lr;
    }

    /* JADX INFO: renamed from: jd */
    public final boolean m69896jd() {
        return this.f48477ne;
    }

    /* JADX INFO: renamed from: k4 */
    public final byte m69897k4() {
        return this.f48458ak;
    }

    /* JADX INFO: renamed from: kk */
    public final float m69906kk(float f) {
        return (((m69926x1() == 0 ? 1.0f : 0.66f) * m69915rv()) * f) / 96.0f;
    }

    /* JADX INFO: renamed from: ks */
    public final short m69909ks() {
        return C7019kk.m27468x1(Float.valueOf(this.f48490x6.f48498x1), 13);
    }

    /* JADX INFO: renamed from: lr */
    public final boolean m69910lr() {
        String str = this.f48492yd;
        return (str == null || C14113y2.m67363du(str, this.f48490x6.f48495k4)) ? false : true;
    }

    /* JADX INFO: renamed from: m9 */
    public final C12003du m69911m9() {
        return m69889du();
    }

    /* JADX INFO: renamed from: ne */
    public final String m69912ne() {
        return this.f48490x6.f48495k4;
    }

    /* JADX INFO: renamed from: qm */
    public final boolean m69913qm() {
        return this.f48479rv;
    }

    /* JADX INFO: renamed from: qq */
    public final C14093tq<Boolean> m69914qq() {
        return this.f48460b3;
    }

    /* JADX INFO: renamed from: rv */
    public final float m69915rv() {
        return this.f48490x6.f48498x1;
    }

    /* JADX INFO: renamed from: sv */
    public Object m69916sv() {
        try {
            qy7 qy7Var = (qy7) clone();
            azo azoVar = this.f48483um;
            if (azoVar != null) {
                qy7Var.f48483um = azoVar.cloneT();
            }
            C0962es c0962es = this.f48461bv;
            if (c0962es != null) {
                qy7Var.f48461bv = c0962es.cloneT();
            }
            C14366k4 c14366k4 = this.f48490x6;
            if (c14366k4 != null) {
                qy7Var.f48490x6 = c14366k4.Clone();
            }
            C14251ot c14251ot = this.f48482u4;
            if (c14251ot != null) {
                qy7Var.f48482u4 = c14251ot;
            }
            qy7Var.f48492yd = new String(this.f48492yd);
            C14093tq<Boolean> c14093tq = this.f48460b3;
            if (c14093tq != null) {
                qy7Var.f48460b3 = c14093tq.Clone();
            }
            C14093tq<Boolean> c14093tq2 = this.f48488wy;
            if (c14093tq2 != null) {
                qy7Var.f48488wy = c14093tq2.Clone();
            }
            oju ojuVar = this.f48472k4;
            if (ojuVar != null) {
                qy7Var.f48472k4 = ojuVar.Clone();
            }
            return qy7Var;
        } catch (CloneNotSupportedException e) {
            throw new IllegalStateException(e);
        }
    }

    /* JADX INFO: renamed from: to */
    public final azo m69917to() {
        return this.f48483um;
    }

    /* JADX INFO: renamed from: ts */
    public final boolean m69918ts() {
        return (this.f48462c5 == null && this.f48468fa == null) ? false : true;
    }

    /* JADX INFO: renamed from: u4 */
    public final int m69919u4() {
        return this.f48465dq;
    }

    @Override // com.aspose.slides.IGenericCloneable
    /* JADX INFO: renamed from: um, reason: merged with bridge method [inline-methods] */
    public final qy7 cloneT() {
        return (qy7) m69916sv();
    }

    /* JADX INFO: renamed from: up */
    public final byte m69921up() {
        return this.f48470ix;
    }

    /* JADX INFO: renamed from: uz */
    public final byte[] m69922uz() {
        return this.f48491xk;
    }

    /* JADX INFO: renamed from: v4 */
    public final String m69923v4() {
        return this.f48492yd;
    }

    /* JADX INFO: renamed from: wl */
    public final float[] m69924wl() {
        return this.f48481ts;
    }

    /* JADX INFO: renamed from: wy */
    public final float m69925wy() {
        return ((m69915rv() * 1.2f) * this.f48459ar) / 72.0f;
    }

    /* JADX INFO: renamed from: x1 */
    public final short m69926x1() {
        return this.f48485uz;
    }

    /* JADX INFO: renamed from: x6 */
    public final float m69930x6() {
        return this.f48478qq;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [int] */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX INFO: renamed from: xk */
    public final int m69931xk() {
        boolean zM69890dy = m69890dy();
        ?? r0 = zM69890dy;
        if (m69885c5()) {
            r0 = (zM69890dy ? 1 : 0) | 2;
        }
        return m69892fa() ? r0 | 4 : r0;
    }

    /* JADX INFO: renamed from: yd */
    public final void m69932yd() {
        this.f48490x6.f48495k4 = this.f48492yd;
    }

    /* JADX INFO: renamed from: yj */
    public final byte m69933yj() {
        C6005k4.m24261k4(this.f48486v4 != -1);
        return this.f48486v4;
    }

    public qy7(Presentation presentation, float f, C14366k4 c14366k4) {
        this.f48472k4 = new oju();
        C12003du c12003du = new C12003du();
        this.f48489x1 = c12003du;
        this.f48490x6 = new C14366k4();
        this.f48470ix = (byte) 0;
        this.f48482u4 = null;
        this.f48487wl = Float.NaN;
        this.f48478qq = 0.0f;
        this.f48459ar = 576.0f;
        this.f48486v4 = (byte) 0;
        this.f48460b3 = new C14093tq<>();
        this.f48488wy = new C14093tq<>();
        c14366k4.CloneTo(this.f48490x6);
        this.f48477ne = false;
        this.f48485uz = (short) 0;
        this.f48461bv = new C0962es(C12003du.m56460uz().Clone());
        this.f48463c6 = presentation.m2385ks();
        this.f48473kk = presentation.m2349du().getDefaultRegularFont();
        this.f48492yd = c14366k4.f48495k4;
        this.f48459ar = f;
        C12003du.m56385i5().CloneTo(c12003du);
    }

    /* JADX INFO: renamed from: k4 */
    public final qy7 m69898k4(float f) {
        if (this.f48490x6.f48498x1 == f) {
            return cloneT();
        }
        qy7 qy7Var = (qy7) m69916sv();
        qy7Var.f48490x6.f48498x1 = f;
        qy7Var.f48482u4 = null;
        return qy7Var;
    }

    /* JADX INFO: renamed from: kk */
    public final C0962es m69907kk() {
        return this.f48461bv;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m69927x1(float f) {
        this.f48487wl = f;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69899k4(byte b) {
        this.f48486v4 = b;
    }

    /* JADX INFO: renamed from: kk */
    public final boolean m69908kk(String str) {
        return this.f48463c6.m7134x1(str) != null;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m69928x1(C14093tq<Boolean> c14093tq) {
        c14093tq.CloneTo(this.f48488wy);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69900k4(C0962es c0962es) {
        this.f48461bv = c0962es;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m69929x1(String str) {
        C14366k4 c14366k4 = this.f48490x6;
        this.f48492yd = c14366k4.f48495k4;
        c14366k4.f48495k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69901k4(C12003du c12003du) {
        this.f48461bv = new C0962es(c12003du.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69902k4(C14093tq<Boolean> c14093tq) {
        c14093tq.CloneTo(this.f48460b3);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69903k4(String str) {
        if (!C14113y2.m67363du(this.f48490x6.f48495k4, str)) {
            this.f48482u4 = null;
        }
        this.f48490x6.f48495k4 = str;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69904k4(boolean z) {
        this.f48474ks = z;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m69905k4(float[] fArr) {
        this.f48481ts = fArr;
    }
}
