package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p332p7.C8087kh;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
public class SmartArtShape extends GeometryShape implements ISmartArtShape {

    /* JADX INFO: renamed from: k4 */
    private final bay f3444k4;

    /* JADX INFO: renamed from: x1 */
    private TextFrame f3445x1;

    public SmartArtShape(InterfaceC14397rj interfaceC14397rj, z2c z2cVar) {
        super(interfaceC14397rj, new C0880d4(), null);
        if (z2cVar == null) {
            throw new ArgumentNullException();
        }
        this.f3444k4 = z2cVar.m74243k4();
        m2560k4(new m4s(this));
    }

    /* JADX INFO: renamed from: qq */
    private List<AbstractC0906dm> m2813qq() {
        List<AbstractC0906dm> list = new List<>();
        if (this.f3444k4.m4076h4().size() == 0) {
            list.addItem(this.f3444k4);
            return list;
        }
        List.Enumerator<C14244on> it = this.f3444k4.m4076h4().iterator();
        while (it.hasNext()) {
            try {
                list.addItem(it.next());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return list;
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: P_ */
    public nd1 mo1214P_() {
        this.f3444k4.m4099m9().m72922rv().m3357x1().m2778k4().m69206to();
        return super.mo1214P_();
    }

    @Override // com.aspose.slides.GeometryShape, com.aspose.slides.Shape
    /* JADX INFO: renamed from: R_ */
    public C12025x6[] mo1215R_() {
        return null;
    }

    @Override // com.aspose.slides.GeometryShape, com.aspose.slides.Shape
    /* JADX INFO: renamed from: S_ */
    public float[] mo1216S_() {
        return null;
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: c5 */
    public long mo275c5() {
        return ((((this.f3307jd & 4294967295L) + (((Presentation) getPresentation()).m2354jd() & 4294967295L)) & 4294967295L) + ((m2820kk() != null ? m2820kk().f3519k4.m2935ak() : 0L) & 4294967295L)) & 4294967295L;
    }

    @Override // com.aspose.slides.GeometryShape
    /* JADX INFO: renamed from: ck, reason: merged with bridge method [inline-methods] */
    public final C0880d4 mo272to() {
        return (C0880d4) super.mo272to();
    }

    @Override // com.aspose.slides.GeometryShape, com.aspose.slides.IGeometryShape
    public int getShapeType() {
        return super.getShapeType();
    }

    @Override // com.aspose.slides.ISmartArtShape
    public final ITextFrame getTextFrame() {
        this.f3444k4.m4099m9().m72922rv().m3357x1().m2778k4().m69206to();
        return this.f3445x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2815k4() {
        List.Enumerator<AbstractC0906dm> it = m2813qq().iterator();
        while (it.hasNext()) {
            try {
                C14648us c14648usM5147up = it.next().m5147up();
                c14648usM5147up.m71879x1(this);
                if (m2822wl().m71865du() != 1 && m2820kk() != null && !c14648usM5147up.m71875m9()) {
                    c14648usM5147up.m71874kk(this);
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
    }

    /* JADX INFO: renamed from: kk */
    public final TextFrame m2820kk() {
        return this.f3445x1;
    }

    @Override // com.aspose.slides.GeometryShape, com.aspose.slides.IGeometryShape
    public void setShapeType(int i) {
        if (i == -1) {
            throw new ArgumentException("Can't set a NotDefined type for SmartArtShape");
        }
        if (i == 0) {
            throw new ArgumentException("Can't set a Custom type for SmartArtShape");
        }
        super.setShapeType(i);
        this.f3444k4.m5147up().m71878x1(i);
    }

    /* JADX INFO: renamed from: up */
    public final bay m2821up() {
        return this.f3444k4;
    }

    /* JADX INFO: renamed from: wl */
    public final C14648us m2822wl() {
        return (this.f3444k4.m4076h4().size() > 0 ? this.f3444k4.m4076h4().get_Item(0) : this.f3444k4).m5147up();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2816k4(double d) {
        super.mo1214P_().m67984k4((float) d);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2817k4(int i) {
        super.setShapeType(i);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2818k4(AutoShape autoShape) {
        if (autoShape.getTextFrame() != null) {
            if (m2820kk() == null) {
                m2819k4(new TextFrame(this));
            }
            m2820kk().m2910k4((ITextFrame) autoShape.m288x1());
        }
        if (getFillFormat().getFillType() == -1 && autoShape.getFillFormat().getFillType() != -1) {
            ((FillFormat) getFillFormat()).m1456k4(autoShape.getFillFormat());
        }
        if (getLineFormat().isFormatNotDefined() && !autoShape.getLineFormat().isFormatNotDefined()) {
            ((LineFormat) getLineFormat()).m1896k4(autoShape.getLineFormat());
        }
        if (!((ThreeDFormat) getThreeDFormat()).m3009k4(true) && ((ThreeDFormat) autoShape.getThreeDFormat()).m3009k4(true)) {
            ((ThreeDFormat) getThreeDFormat()).m3007k4(autoShape.getThreeDFormat());
        }
        C8087kh c8087kh = new C8087kh();
        C0914ds.m5240x1(autoShape, c8087kh);
        C0914ds.m5230k4(this, c8087kh);
        mo272to().m4909k4(autoShape.mo268du().m4914m9());
        m2562k4(autoShape.mo1214P_());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m2819k4(TextFrame textFrame) {
        if (C14067j2.m66729x1(this.f3445x1, textFrame)) {
            return;
        }
        this.f3445x1 = textFrame;
    }

    @Override // com.aspose.slides.Shape
    /* JADX INFO: renamed from: k4 */
    public void mo2564k4(tbp tbpVar, tbp tbpVar2, C1258im c1258im) {
        double d;
        nd1 nd1Var;
        double d2;
        double d3;
        double d4;
        float f;
        double d5;
        boolean z;
        nd1 nd1VarMo1214P_ = mo1214P_();
        if (this.f3444k4.m4072du(61) == 0.0d || this.f3444k4.m4072du(15) == 0.0d) {
            this.f3444k4.m4099m9().m72922rv().m3346du();
        }
        double dM4072du = this.f3444k4.m4072du(61);
        double dM4072du2 = this.f3444k4.m4072du(15);
        tbp tbpVarClone = tbpVar2.Clone();
        double dM67988kk = ((double) nd1VarMo1214P_.m67988kk()) - (((double) this.f3444k4.m5147up().m71873kk().m28364jd()) / 60000.0d);
        if ((dM67988kk <= 45.0d || dM67988kk >= 135.0d) && (dM67988kk <= 225.0d || dM67988kk >= 315.0d)) {
            d = 0.0d;
        } else {
            double d6 = tbpVarClone.f49090k4;
            d = 0.0d;
            tbpVarClone.f49090k4 = tbpVarClone.f49091x1;
            tbpVarClone.f49091x1 = d6;
        }
        double size = 1.0d;
        if (C14116yg.m67477k4(tbpVarClone.f49090k4 / dM4072du, 3) != 1.0d) {
            d2 = tbpVarClone.f49090k4 / dM4072du;
            nd1Var = nd1VarMo1214P_;
            this.f3444k4.m5147up().m71873kk().m28382to(com.aspose.slides.Collections.Generic.OooO00o.OooO00o(d2, 100000.0d, 14));
        } else {
            nd1Var = nd1VarMo1214P_;
            d2 = 1.0d;
        }
        if (C14116yg.m67477k4(tbpVarClone.f49091x1 / dM4072du2, 3) != 1.0d) {
            d4 = tbpVarClone.f49091x1 / dM4072du2;
            d3 = dM4072du;
            this.f3444k4.m5147up().m71873kk().m28354du(com.aspose.slides.Collections.Generic.OooO00o.OooO00o(d4, 100000.0d, 14));
        } else {
            d3 = dM4072du;
            d4 = 1.0d;
        }
        this.f3444k4.m4092k4(new tbp(d2, d4));
        tbp tbpVarClone2 = tbp.m71060x1(tbpVar, nd1Var.m67982k4()).Clone();
        if (C14116yg.m67475k4(tbpVarClone2.f49090k4) > 0.05d || C14116yg.m67475k4(tbpVarClone2.f49091x1) > 0.05d) {
            if (C7019kk.m27469x1(this.f3444k4.m4077jd(), C1131g4.class) || !C7019kk.m27469x1(this.f3444k4.m4082k4().m4077jd(), C14240ok.class)) {
                f = 0.0f;
                tbp tbpVarClone3 = this.f3444k4.m4077jd().mo3648kk(this.f3444k4).Clone();
                double d7 = tbpVarClone2.f49090k4 + tbpVarClone3.f49090k4;
                tbpVarClone2.f49090k4 = d7;
                d5 = dM67988kk;
                tbpVarClone2.f49091x1 += tbpVarClone3.f49091x1;
                if (C14116yg.m67475k4(d7) > 0.05d) {
                    this.f3444k4.m5147up().m71873kk().m28357dy(0);
                    this.f3444k4.m5147up().m71873kk().m28361h4(com.aspose.slides.Collections.Generic.OooO00o.OooO00o(tbpVarClone2.f49090k4 / d3, 100000.0d, 14));
                }
                if (C14116yg.m67475k4(tbpVarClone2.f49091x1) > 0.05d) {
                    z = false;
                    this.f3444k4.m5147up().m71873kk().m28349c5(0);
                    this.f3444k4.m5147up().m71873kk().m28376m9(com.aspose.slides.Collections.Generic.OooO00o.OooO00o(tbpVarClone2.f49091x1 / dM4072du2, 100000.0d, 14));
                }
            } else {
                tbp tbpVarClone4 = this.f3444k4.m4082k4().m4077jd().mo3648kk(this.f3444k4).Clone();
                jof jofVarClone = this.f3444k4.m4074dy().m74235e0().Clone();
                f = 0.0f;
                jof jofVarClone2 = jofVarClone.m63465kk(tbpVarClone2.f49090k4, tbpVarClone2.f49091x1).Clone();
                jofVarClone.m63465kk(-tbpVarClone4.f49090k4, -tbpVarClone4.f49091x1).CloneTo(jofVarClone);
                if (this.f3444k4.m4069c5().m4074dy().m74235e0().Clone().m63466kk(jofVarClone2.Clone())) {
                    z2c z2cVarM4074dy = this.f3444k4.m4082k4().m4074dy();
                    jof jofVarClone3 = z2cVarM4074dy.m74235e0().Clone();
                    double dM74256kk = z2cVarM4074dy.m74256kk(6);
                    double dM74256kk2 = z2cVarM4074dy.m74256kk(7);
                    if (dM74256kk == d) {
                        dM74256kk = jofVarClone3.m63454ck().f49090k4;
                    }
                    if (dM74256kk2 == d) {
                        dM74256kk2 = jofVarClone3.m63454ck().f49091x1;
                    }
                    tbp tbpVar3 = new tbp(dM74256kk, dM74256kk2);
                    double dM68646dy = ((C14240ok) this.f3444k4.m4082k4().m4077jd()).m68646dy();
                    double dM63472up = new jof(tbpVar3.Clone(), jofVarClone2.m63454ck().Clone()).m63472up() - new jof(tbpVar3.Clone(), jofVarClone.m63454ck().Clone()).m63472up();
                    if (C14116yg.m67475k4(dM63472up) > 0.05d) {
                        float size2 = this.f3444k4.m4082k4().m4068bv().size();
                        if (this.f3444k4.m4082k4().m4110x1().size() > 1 && size2 > 0.0f) {
                            size = this.f3444k4.m4082k4().m4110x1().size() / size2;
                        }
                        this.f3444k4.m5147up().m71873kk().m28352ck(C7019kk.m27462to(Double.valueOf((dM63472up / dM68646dy) * size * 100000.0d), 14));
                    }
                    double dM74157k4 = yz6.m74157k4(tbpVar3.Clone(), jofVarClone2.m63454ck().Clone()) / yz6.m74157k4(tbpVar3.Clone(), jofVarClone.m63454ck().Clone());
                    if (C14116yg.m67475k4(dM74157k4) > 0.001d) {
                        this.f3444k4.m5147up().m71873kk().m28365jd(com.aspose.slides.Collections.Generic.OooO00o.OooO00o(dM74157k4, 100000.0d, 14));
                    }
                    this.f3444k4.m5147up().m71873kk().m28361h4(0);
                    this.f3444k4.m5147up().m71873kk().m28376m9(0);
                    this.f3444k4.m5147up().m71873kk().m28357dy(0);
                    this.f3444k4.m5147up().m71873kk().m28349c5(0);
                }
                d5 = dM67988kk;
            }
            z = false;
        } else {
            d5 = dM67988kk;
            z = false;
            f = 0.0f;
        }
        if (c1258im.f5734x1 != nd1Var.m67988kk()) {
            double d8 = c1258im.f5734x1;
            if (this.f3444k4.m5147up().m71873kk().m28364jd() != 0 || nd1Var.m67988kk() != f) {
                d8 -= d5;
            }
            this.f3444k4.m5147up().m71873kk().m28372kk(com.aspose.slides.Collections.Generic.OooO00o.OooO00o(d8, 60000.0d, 14));
        }
        if ((nd1Var.m67989to() == 1 ? true : z) != c1258im.f5733to) {
            this.f3444k4.m5147up().m71873kk().m28371kk(c1258im.f5733to ? (byte) 1 : (byte) 0);
        }
        if ((nd1Var.m67980du() == 1 ? true : z) != c1258im.f5732kk) {
            this.f3444k4.m5147up().m71873kk().m28389x1(c1258im.f5732kk ? (byte) 1 : (byte) 0);
        }
        super.mo2564k4(tbpVar.Clone(), tbpVar2.Clone(), c1258im.Clone());
        this.f3444k4.m4099m9().m72922rv().m3357x1().m2777ck();
    }
}
