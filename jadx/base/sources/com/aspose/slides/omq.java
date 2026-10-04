package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.InvalidOperationException;
import com.aspose.slides.internal.p077d8.C3047dy;
import com.aspose.slides.internal.p077d8.C3099wl;
import com.aspose.slides.internal.p077d8.C3108y2;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p353q7.C9797wp;
import com.aspose.slides.internal.p463vm.C11687fa;
import com.aspose.slides.internal.p463vm.C11689jd;
import com.aspose.slides.internal.p472w8.C11896dy;
import com.aspose.slides.internal.p472w8.C11901k4;
import com.aspose.slides.internal.p472w8.C11913yj;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12004dy;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12010kk;
import com.aspose.slides.internal.p475wh.C12012lr;
import com.aspose.slides.internal.p475wh.C12013m9;
import com.aspose.slides.internal.p475wh.C12018u4;
import com.aspose.slides.internal.p475wh.C12025x6;
import com.aspose.slides.internal.p475wh.C12026yj;
import com.aspose.slides.internal.p505xn.C12556ck;
import com.aspose.slides.p559ms.System.AbstractC14092to;
import com.aspose.slides.p559ms.System.C14064he;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.C14116yg;
import com.aspose.slides.p559ms.System.C14117yj;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
final class omq extends AbstractC14897zn {

    /* JADX INFO: renamed from: c5 */
    private final float f47868c5;

    /* JADX INFO: renamed from: ck */
    private final float f47869ck;

    /* JADX INFO: renamed from: dy */
    private final float f47870dy;

    /* JADX INFO: renamed from: fa */
    private float f47871fa;

    /* JADX INFO: renamed from: jd */
    private final float f47872jd;

    /* JADX INFO: renamed from: ks */
    private boolean f47873ks;

    /* JADX INFO: renamed from: ne */
    private C4317dy f47874ne;

    /* JADX INFO: renamed from: rv */
    private float f47875rv;

    /* JADX INFO: renamed from: up */
    private float f47876up;

    /* JADX INFO: renamed from: x6 */
    private float f47877x6;

    /* JADX INFO: renamed from: yj */
    private float f47878yj;

    public omq(AbstractC12008jd abstractC12008jd, int i, int i2, float f, float f2) {
        super(abstractC12008jd);
        float f3 = i;
        this.f47870dy = f3;
        float f4 = i2;
        this.f47868c5 = f4;
        this.f47872jd = (f3 * 576.0f) / f;
        this.f47869ck = (f4 * 576.0f) / f2;
        float[] fArrM55776k4 = abstractC12008jd.mo17577u4().m55776k4();
        this.f47871fa = fArrM55776k4[4];
        this.f47876up = fArrM55776k4[5];
        this.f47878yj = -((float) (C14116yg.m67498to(fArrM55776k4[2], fArrM55776k4[0]) * 57.29577951308232d));
        mo67710k4(new C4317dy(fArrM55776k4[0], fArrM55776k4[1], fArrM55776k4[2], fArrM55776k4[3], fArrM55776k4[4], fArrM55776k4[5]));
    }

    /* JADX INFO: renamed from: k4 */
    private void m68695k4(IOuterShadowEffectiveData iOuterShadowEffectiveData, C11896dy c11896dy, AbstractC12024x1 abstractC12024x1, C12026yj c12026yj, C14251ot c14251ot, qy7 qy7Var, AbstractC12008jd abstractC12008jd) {
        if (iOuterShadowEffectiveData == null) {
            return;
        }
        float fM69915rv = qy7Var.m69915rv();
        o6h o6hVar = new o6h(iOuterShadowEffectiveData);
        if (iOuterShadowEffectiveData.getBlurRadius() > 2.0d && (fM69915rv > 18.0f || iOuterShadowEffectiveData.getBlurRadius() >= 4.0d)) {
            o6hVar.m68351k4(this, c11896dy, qy7Var);
            return;
        }
        C11896dy c11896dy2 = (C11896dy) C7019kk.m27452k4(c11896dy.deepClone(), C11896dy.class);
        try {
            boolean z = true;
            c11896dy2.m55577x1(o6hVar.m68350k4(qy7Var, c11896dy2.m55523c5().Clone(), fM69915rv, true));
            if (abstractC12024x1 != null) {
                C11999ar c11999ar = (C11999ar) C7019kk.m27452k4((Object) abstractC12024x1, C11999ar.class);
                C12003du c12003duM56514v6 = ((vmd) iOuterShadowEffectiveData).m72367x1().Clone();
                if (c11999ar != null) {
                    C14381rb.m70046k4(((vmd) iOuterShadowEffectiveData).m72367x1().Clone(), c11999ar.m56305h4().m56501c5()).CloneTo(c12003duM56514v6);
                }
                C11999ar c11999ar2 = new C11999ar(c12003duM56514v6.Clone());
                try {
                    if (c14251ot.m68810h4()) {
                        C12026yj c12026yj2 = new C12026yj(c11999ar2, c14251ot.m68817m9() * 0.02f);
                        try {
                            abstractC12008jd.mo17540k4(c12026yj2, c11896dy2);
                            c12026yj2.dispose();
                        } catch (Throwable th) {
                            c12026yj2.dispose();
                            throw th;
                        }
                    }
                    if (c11999ar == null || (c11999ar.m56305h4().m56501c5() & 255) > 0) {
                        abstractC12008jd.mo17527k4(c11999ar2, c11896dy2);
                    }
                    c11999ar2.dispose();
                } catch (Throwable th2) {
                    c11999ar2.dispose();
                    throw th2;
                }
            } else {
                z = false;
            }
            if (c12026yj != null && c12026yj.m56930ne() > 0.0f) {
                C12003du c12003duM56514v62 = ((vmd) iOuterShadowEffectiveData).m72367x1().Clone();
                if (c12026yj.m56931rv() == 0) {
                    C14381rb.m70046k4(((vmd) iOuterShadowEffectiveData).m72367x1().Clone(), c12026yj.m56925kk().m56501c5()).CloneTo(c12003duM56514v62);
                }
                if (z && (c12003duM56514v62.m56501c5() & 255) <= 200) {
                    AbstractC14897zn.m74600k4(c12003duM56514v62.Clone()).CloneTo(c12003duM56514v62);
                }
                C12026yj c12026yj3 = new C12026yj(c12003duM56514v62.Clone(), c12026yj.m56930ne());
                try {
                    abstractC12008jd.mo17540k4(c12026yj3, c11896dy2);
                    c12026yj3.dispose();
                } catch (Throwable th3) {
                    c12026yj3.dispose();
                    throw th3;
                }
            }
            c11896dy2.dispose();
        } catch (Throwable th4) {
            if (c11896dy2 != null) {
                c11896dy2.dispose();
            }
            throw th4;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m68704x1(C11896dy c11896dy, C12025x6 c12025x6, AbstractC12024x1 abstractC12024x1, C12026yj c12026yj, C14251ot c14251ot, qy7 qy7Var, AbstractC12008jd abstractC12008jd) {
        if (qy7Var.m69891e0()) {
            new zz0(qy7Var.f48484up).m74891k4(this, c11896dy, qy7Var);
        }
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: c5 */
    public C4317dy mo67706c5() {
        return this.f47874ne;
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: du */
    public float mo67707du() {
        return this.f47872jd;
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: dy */
    public int mo67708dy() {
        return C22208OooOo0.OooO00o(((double) this.f47868c5) * 576.0d, this.f47869ck, 14);
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: fa */
    public C12007ix mo64335fa() {
        return this.f50624x1.mo17568m9();
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: h4 */
    public float mo67709h4() {
        return this.f47869ck;
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: m9 */
    public int mo67711m9() {
        return C22208OooOo0.OooO00o(((double) this.f47870dy) * 576.0d, this.f47872jd, 14);
    }

    public omq(C12009k4 c12009k4, float f, float f2) {
        this(c12009k4, f, f2, false);
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo64337k4(IPPImage iPPImage, C12007ix c12007ix, C12007ix c12007ix2, qta qtaVar) {
        PPImage pPImage = (PPImage) iPPImage;
        if (C3099wl.m13195m9(pPImage.m2134m9())) {
            C3099wl.m13186k4(this.f50624x1, pPImage.m2134m9(), c12007ix);
            return;
        }
        AbstractC12002ck abstractC12002ckM2126dy = pPImage.m2126dy();
        try {
            this.f50624x1.mo17507k4(abstractC12002ckM2126dy, c12007ix.Clone(), c12007ix2, 2);
        } finally {
            if (abstractC12002ckM2126dy != null) {
                abstractC12002ckM2126dy.dispose();
            }
        }
    }

    public omq(C12009k4 c12009k4, float f, float f2, boolean z) {
        super(c12009k4, z);
        this.f47870dy = c12009k4.mo15760yj();
        this.f47868c5 = c12009k4.mo15757m9();
        this.f47872jd = (c12009k4.mo15760yj() * 576.0f) / f;
        this.f47869ck = (c12009k4.mo15757m9() * 576.0f) / f2;
        mo67710k4(new C4317dy());
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo67710k4(C4317dy c4317dy) {
        if (c4317dy != null) {
            this.f47874ne = c4317dy.m17345kk();
            this.f50624x1.mo17588x1(C3108y2.m13229x1(c4317dy.m17345kk()));
            this.f50624x1.mo17494k4(-this.f47878yj, 1);
            this.f50624x1.mo17493k4(mo67707du() / 576.0f, mo67709h4() / 576.0f, 1);
            this.f50624x1.mo17494k4(this.f47878yj, 1);
            if (!this.f47873ks) {
                this.f47875rv = this.f50624x1.mo17577u4().m55776k4()[4] - this.f47871fa;
                this.f47877x6 = this.f50624x1.mo17577u4().m55776k4()[5] - this.f47876up;
                this.f47873ks = true;
            }
            this.f50624x1.mo17585x1(-this.f47875rv, -this.f47877x6, 1);
        } else {
            this.f47874ne = null;
            this.f50624x1.mo17588x1(new C11913yj(mo67707du() / 576.0f, 0.0f, 0.0f, mo67709h4() / 576.0f, 0.0f, 0.0f));
        }
        mo68798to();
    }

    /* JADX INFO: renamed from: k4 */
    private void m68696k4(C11896dy c11896dy, byte b, C12026yj c12026yj) {
        if (b != 5) {
            this.f50624x1.mo17527k4(c12026yj.m56935x1(), c11896dy);
            return;
        }
        c12026yj.m56932to(2);
        c12026yj.m56909du(2);
        c12026yj.m56927kk(0);
        c12026yj.m56914h4(0);
        C12556ck.m58567k4(this.f50624x1, c12026yj, c11896dy);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00ea  */
    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo64338k4(C11896dy c11896dy, azo azoVar, C0962es c0962es) throws Throwable {
        IDisposable iDisposable;
        AbstractC12024x1 abstractC12024x1M73546k4;
        PictureFillFormat pictureFillFormatM4857um;
        AbstractC12024x1 abstractC12024x1 = null;
        c12026yjM3930x6 = null;
        C12026yj c12026yjM3930x6 = null;
        if (c0962es != null) {
            try {
                if (c0962es.m5681to() == 0) {
                    abstractC12024x1M73546k4 = null;
                } else {
                    Object[] objArr = C7019kk.m27469x1(c0962es, cxj.class) && (pictureFillFormatM4857um = ((cxj) C7019kk.m27452k4((Object) c0962es, cxj.class)).m4857um()) != null && c0962es.m5672du().m27130k4() && tta.m71309k4(pictureFillFormatM4857um.getPicture().getImageTransform());
                    if (!C7019kk.m27469x1(c0962es, cxj.class) || !((cxj) C7019kk.m27452k4((Object) c0962es, cxj.class)).m4860v4() || objArr == false) {
                        abstractC12024x1M73546k4 = C14814xq.m73546k4(c0962es, this);
                        try {
                            if (C7019kk.m27469x1(abstractC12024x1M73546k4, C12012lr.class) && C7019kk.m27469x1(c0962es, b2l.class) && ((b2l) C7019kk.m27452k4((Object) c0962es, b2l.class)).m3943jd() != -1) {
                                float[] fArrM55776k4 = this.f50624x1.mo17577u4().m55776k4();
                                C11913yj c11913yj = new C11913yj(fArrM55776k4[0], fArrM55776k4[1], fArrM55776k4[2], fArrM55776k4[3], 0.0f, 0.0f);
                                if (!c11913yj.m55789x1() && c11913yj.m55778kk()) {
                                    c11913yj.m55780m9();
                                    ((C12012lr) abstractC12024x1M73546k4).m56629x1(c11913yj, 0);
                                }
                            }
                            this.f50624x1.mo17527k4(abstractC12024x1M73546k4, c11896dy);
                        } catch (Throwable th) {
                            th = th;
                            iDisposable = null;
                            abstractC12024x1 = abstractC12024x1M73546k4;
                            if (abstractC12024x1 != null) {
                                abstractC12024x1.dispose();
                            }
                            if (iDisposable != null) {
                                iDisposable.dispose();
                            }
                            throw th;
                        }
                    } else {
                        cxj cxjVar = (cxj) c0962es;
                        C12018u4 c12018u4Mo17480h4 = this.f50624x1.mo17480h4();
                        if (cxjVar.m4847ck() != null) {
                            this.f50624x1.mo17590x1(new C12018u4(cxjVar.m4847ck()));
                        }
                        C3099wl.m13186k4(this.f50624x1, cxjVar.m4865yd(), cxjVar.m71131xk().Clone());
                        this.f50624x1.mo17590x1(c12018u4Mo17480h4);
                        abstractC12024x1M73546k4 = null;
                    }
                }
            } catch (Throwable th2) {
                th = th2;
                iDisposable = null;
            }
        }
        if (azoVar != null && azoVar.m3903h4()) {
            if (azoVar.m3906k4() > 3.0d) {
                c11896dy.m55526dy();
            }
            c12026yjM3930x6 = azoVar.m3930x6();
            if ((azoVar.m3897c5() != 0 || azoVar.m3905jd() != 0) && !m74619k4(c11896dy)) {
                m68697k4(c11896dy, azoVar, c12026yjM3930x6);
            } else {
                C12556ck.m58567k4(this.f50624x1, c12026yjM3930x6, c11896dy);
            }
        }
        if (abstractC12024x1M73546k4 != null) {
            abstractC12024x1M73546k4.dispose();
        }
        if (c12026yjM3930x6 != null) {
            c12026yjM3930x6.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m68697k4(C11896dy c11896dy, azo azoVar, C12026yj c12026yj) {
        C11896dy[] c11896dyArr = {null};
        C11896dy[] c11896dyArr2 = {null};
        C11896dy c11896dyM74609k4 = m74609k4(c11896dy, azoVar, c11896dyArr, c11896dyArr2);
        C11896dy c11896dy2 = c11896dyArr[0];
        C11896dy c11896dy3 = c11896dyArr2[0];
        if (c11896dy2 != null) {
            c12026yj.m56938x1(new C11901k4(0.0f, 0.0f));
            c12026yj.m56932to(0);
            m68696k4(c11896dy2, azoVar.m3897c5(), c12026yj);
        }
        if (c11896dy3 != null) {
            c12026yj.m56921k4(new C11901k4(0.0f, 0.0f));
            c12026yj.m56909du(0);
            m68696k4(c11896dy3, azoVar.m3905jd(), c12026yj);
        }
        C12556ck.m58567k4(this.f50624x1, c12026yj, c11896dyM74609k4);
    }

    /* JADX INFO: renamed from: k4 */
    private void m68698k4(C11896dy c11896dy, AbstractC12024x1 abstractC12024x1, C12003du c12003du, float f, AbstractC12008jd abstractC12008jd) {
        if (c11896dy == null) {
            return;
        }
        C11896dy c11896dy2 = (C11896dy) C7019kk.m27452k4(c11896dy.deepClone(), C11896dy.class);
        C12025x6 c12025x6M56896to = m74627u4().Clone();
        C11913yj c11913yj = new C11913yj();
        c11913yj.m55777kk((c12025x6M56896to.m56897x1() * f) / 15.0f, (c12025x6M56896to.m56895kk() * f) / 15.0f);
        c11896dy2.m55577x1(c11913yj);
        C11999ar c11999ar = new C11999ar(AbstractC14897zn.m74600k4(c12003du.Clone()).Clone().Clone());
        try {
            C11999ar c11999ar2 = (C11999ar) C7019kk.m27452k4((Object) abstractC12024x1, C11999ar.class);
            if (c11999ar2 != null && (c11999ar2.m56305h4().m56501c5() & 255) > 0) {
                abstractC12008jd.mo17527k4(c11999ar, c11896dy2);
            }
        } finally {
            c11999ar.dispose();
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m68699k4(C11896dy c11896dy, C12025x6 c12025x6, AbstractC12024x1 abstractC12024x1, C12026yj c12026yj, C14251ot c14251ot, qy7 qy7Var, AbstractC12008jd abstractC12008jd) {
        if (qy7Var.m69918ts() || qy7Var.m69886c6() || qy7Var.m69896jd() || qy7Var.m69887ck()) {
            if (qy7Var.m69918ts() && !qy7Var.m69913qm()) {
                IGlowEffectiveData iGlowEffectiveData = qy7Var.f48462c5;
                if (iGlowEffectiveData != null) {
                    new C13763l5(iGlowEffectiveData).m64308k4(this, c11896dy, qy7Var);
                }
                IGlowEffectiveData iGlowEffectiveData2 = qy7Var.f48468fa;
                if (iGlowEffectiveData2 != null) {
                    new C14871z3(iGlowEffectiveData2).m74297k4(this, c11896dy, qy7Var.m69907kk(), (azo) null);
                }
            }
            if (qy7Var.m69886c6()) {
                new pz4(qy7Var.f48467dy).m69343k4(this, c11896dy, qy7Var, c12025x6.Clone());
            }
            if (qy7Var.m69896jd() && !qy7Var.m69913qm()) {
                m68695k4(qy7Var.f48464ck, c11896dy, abstractC12024x1, c12026yj, c14251ot, qy7Var, abstractC12008jd);
                m68695k4(qy7Var.f48471jd, c11896dy, abstractC12024x1, c12026yj, c14251ot, qy7Var, abstractC12008jd);
            }
            if (qy7Var.m69887ck()) {
                m68698k4(c11896dy, abstractC12024x1, qy7Var.m69894h4().Clone(), qy7Var.m69915rv(), abstractC12008jd);
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m68700k4(C11896dy c11896dy, String str, C12004dy c12004dy, int i, float f, qy7 qy7Var, C12025x6 c12025x6) {
        m68701k4(c11896dy, str, c12004dy, i, f, qy7Var, c12025x6.Clone(), null);
    }

    /* JADX INFO: renamed from: k4 */
    private void m68701k4(C11896dy c11896dy, String str, C12004dy c12004dy, int i, float f, qy7 qy7Var, C12025x6 c12025x6, float[] fArr) {
        if (fArr == null) {
            c11896dy.m55552k4(str, c12004dy, i, f, c12025x6.Clone(), this.f50616du);
        } else {
            if (str.length() != fArr.length) {
                throw new InvalidOperationException();
            }
            for (int i2 = 0; i2 < fArr.length; i2++) {
                c11896dy.m55552k4(C14117yj.m67537ne(str.charAt(i2)), c12004dy, i, f, new C12025x6(fArr[i2], c12025x6.m56895kk()).Clone(), this.f50616du);
            }
        }
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo64339k4(AbstractC12002ck abstractC12002ck, float f, float f2, float f3, float f4) {
        this.f50624x1.mo17502k4(abstractC12002ck, f, f2, f3, f4);
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo64340k4(AbstractC12002ck abstractC12002ck, int i, int i2) {
        this.f50624x1.mo17503k4(abstractC12002ck, i, i2);
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo64341k4(AbstractC12002ck abstractC12002ck, int i, int i2, int i3, int i4) {
        this.f50624x1.mo17504k4(abstractC12002ck, i, i2, i3, i4);
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo64342k4(C12007ix c12007ix) {
        this.f50624x1.mo17518k4(c12007ix.Clone());
    }

    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    public void mo64343k4(String str, C12007ix c12007ix, qy7 qy7Var) {
        if (C14113y2.m67411k4(str)) {
            return;
        }
        byte bM69921up = qy7Var.m69921up();
        C12007ix c12007ixM56555fa = c12007ix.Clone();
        if (bM69921up != 1) {
            mo68705k4(str, c12007ixM56555fa, qy7Var, qy7Var.m69882b3());
        } else {
            m74633x1(str, c12007ixM56555fa, qy7Var);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:122:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02e9  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x033c  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x034f A[LOOP:5: B:113:0x0260->B:137:0x034f, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:141:0x03a2  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x03a5  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x05aa  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x05b6  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x05e3  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x05f0  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0344 A[EDGE_INSN: B:216:0x0344->B:135:0x0344 BREAK  A[LOOP:5: B:113:0x0260->B:137:0x034f], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:218:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00a1 A[LOOP:2: B:42:0x009b->B:44:0x00a1, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020d  */
    @Override // com.aspose.slides.AbstractC14897zn
    /* JADX INFO: renamed from: k4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void mo68705k4(String str, C12007ix c12007ix, qy7 qy7Var, C14251ot c14251ot) {
        boolean z;
        C12026yj c12026yjM3928x1;
        C12025x6 c12025x6;
        C12013m9 c12013m9;
        String str2;
        C11896dy c11896dy;
        omq omqVar;
        C12025x6 c12025x62;
        AbstractC12024x1 abstractC12024x1;
        AbstractC12024x1 abstractC12024x12;
        C12026yj c12026yj;
        AbstractC12024x1 abstractC12024x13;
        int i;
        C12004dy c12004dy;
        AbstractC12024x1 abstractC12024x14;
        char c;
        float f;
        C12013m9 c12013m92;
        C11913yj c11913yj;
        int i2;
        C6765kp c6765kp;
        int i3;
        int i4;
        C11896dy c11896dy2;
        C12025x6 c12025x63;
        C11896dy c11896dy3;
        C11687fa c11687faM55122x1;
        qy7 qy7Var2 = qy7Var;
        String strM68812k4 = c14251ot.m68812k4(str);
        if (strM68812k4.length() <= 2 || !((strM68812k4.charAt(0) == 8237 || strM68812k4.charAt(0) == 8235) && androidx.core.content.OooO0O0.OooO00o(1, strM68812k4) == 8236)) {
            z = true;
        } else {
            C6765kp c6765kp2 = new C6765kp();
            for (int i5 = 0; i5 < strM68812k4.length(); i5++) {
                if (strM68812k4.charAt(i5) == 8205 || strM68812k4.charAt(i5) == 8237 || strM68812k4.charAt(i5) == 8238 || strM68812k4.charAt(i5) == 8236 || strM68812k4.charAt(i5) == 8236) {
                    for (int i6 = 0; i6 < strM68812k4.length(); i6++) {
                        if (strM68812k4.charAt(i6) != 8205 && strM68812k4.charAt(i6) != 8237 && strM68812k4.charAt(i6) != 8238 && strM68812k4.charAt(i6) != 8236 && strM68812k4.charAt(i6) != 8236) {
                            c6765kp2.m26780k4(strM68812k4.charAt(i6));
                        }
                    }
                    strM68812k4 = c6765kp2.toString();
                    C6765kp c6765kp3 = new C6765kp();
                    c11687faM55122x1 = C11689jd.m55122x1(strM68812k4);
                    while (c11687faM55122x1.hasNext()) {
                        c6765kp3.m26786k4(0, (String) c11687faM55122x1.next());
                    }
                    strM68812k4 = c6765kp3.toString();
                    z = false;
                }
            }
            C6765kp c6765kp32 = new C6765kp();
            c11687faM55122x1 = C11689jd.m55122x1(strM68812k4);
            while (c11687faM55122x1.hasNext()) {
            }
            strM68812k4 = c6765kp32.toString();
            z = false;
        }
        C12013m9 c12013m9M68811k4 = c14251ot.m68811k4();
        int iM56642jd = c12013m9M68811k4.m56642jd();
        C12004dy c12004dyM56651x1 = c12013m9M68811k4.m56651x1();
        float fM69915rv = qy7Var2.m69915rv();
        String strReplaceAll = strM68812k4.replaceAll("\u000b", "");
        AbstractC12024x1 abstractC12024x1M73548kk = qy7Var2.m69907kk() != null ? C14814xq.m73548kk(qy7Var2.m69907kk()) : C12010kk.m56611kk();
        int iM27462to = C7019kk.m27462to(Float.valueOf((72.0f / C3099wl.m13174k4(this.f47870dy, this.f47868c5)) * 72.0f), 13);
        if (iM27462to < 72 && c14251ot.m68810h4()) {
            float f2 = iM27462to;
            iM27462to = C7019kk.m27462to(Float.valueOf((f2 / 72.0f) * f2), 13);
        }
        if (qy7Var2.m69917to() == null) {
            c12026yjM3928x1 = null;
        } else if (qy7Var2.m69917to().m3903h4()) {
            c12026yjM3928x1 = qy7Var2.m69917to().m3930x6();
            if (fM69915rv <= 18.0f) {
                float fMo67707du = mo67707du() / 576.0f;
                float fMo67709h4 = mo67709h4() / 576.0f;
                if (fMo67707du <= fMo67709h4) {
                    fMo67707du = fMo67709h4;
                }
                if (c12026yjM3928x1.m56930ne() >= 1.0f && fMo67707du >= 1.0f) {
                    c12026yjM3928x1.m56926kk(c12026yjM3928x1.m56930ne() * 0.8f);
                }
            }
        } else {
            c12026yjM3928x1 = qy7Var2.m69917to().m3928x1(iM27462to);
        }
        C12026yj c12026yj2 = c12026yjM3928x1;
        float fM56536x1 = (c12004dyM56651x1.m56536x1(iM56642jd) / c12004dyM56651x1.m56526du(iM56642jd)) * c12013m9M68811k4.m56643k4(96.0f);
        C12025x6 c12025x6M56896to = c12007ix.m56552du().Clone();
        c12007ix.m56572to(c12007ix.m56551ck() - (((qy7Var2.m69926x1() * fM69915rv) / 100.0f) + fM56536x1));
        if (qy7Var2.m69926x1() != 0) {
            fM69915rv *= 0.66f;
        }
        C12025x6 c12025x6M56896to2 = c12007ix.m56552du().Clone();
        C11896dy c11896dy4 = new C11896dy(1);
        int i7 = 1;
        if (strReplaceAll.length() > 0) {
            c12025x6 = c12025x6M56896to2;
            i2 = (((double) C14116yg.m67480k4(qy7Var2.m69930x6())) > 0.005d || !C14064he.m66715kk(qy7Var2.m69883bv())) ? 2 : 2;
            c6765kp = new C6765kp();
            int[] iArr = {0};
            int[] iArr2 = {0};
            m68702k4(strReplaceAll, iArr, iArr2);
            int i8 = iArr[0];
            i3 = iArr2[0];
            if (C3047dy.m12853fa(strReplaceAll.charAt(0)) == i2) {
                C6765kp c6765kp4 = new C6765kp();
                C11687fa c11687faM55122x12 = C11689jd.m55122x1(strReplaceAll);
                List list = new List();
                while (c11687faM55122x12.hasNext()) {
                    C11687fa c11687fa = c11687faM55122x12;
                    list.addItem(c11687fa.m55107k4());
                    c11687faM55122x12 = c11687fa;
                }
                list.reverse();
                List.Enumerator it = list.iterator();
                while (it.hasNext()) {
                    try {
                        c6765kp4.m26792k4((String) it.next());
                    } finally {
                        if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                            it.dispose();
                        }
                    }
                }
                strReplaceAll = c6765kp4.toString();
            }
            i4 = i8;
            int length = 0;
            while (true) {
                if (!(i4 == i3 && C3047dy.m12849ck(strReplaceAll.charAt(i4))) && c6765kp.m26807x1() > 0) {
                    C12013m9 c12013m93 = c12013m9M68811k4;
                    String string = c6765kp.toString();
                    c6765kp.m26809x1(0, c6765kp.m26807x1());
                    if (qy7Var2.m69924wl() != null) {
                        float[] fArr = new float[string.length()];
                        c12013m9 = c12013m93;
                        AbstractC14092to.m67216k4(AbstractC14092to.m67208k4(qy7Var2.m69924wl()), length, AbstractC14092to.m67208k4(fArr), 0, string.length());
                        c11896dy2 = c11896dy4;
                        c12004dyM56651x1 = c12004dyM56651x1;
                        m68701k4(c11896dy2, string, c12004dyM56651x1, iM56642jd, fM69915rv, qy7Var2, c12025x6.Clone(), fArr);
                        length += string.length();
                        c12025x63 = c12025x6;
                        qy7Var2 = qy7Var;
                    } else {
                        c12013m9 = c12013m93;
                        c11896dy2 = c11896dy4;
                        qy7Var2 = qy7Var;
                        m68700k4(c11896dy2, string, c12004dyM56651x1, iM56642jd, fM69915rv, qy7Var2, c12025x6.Clone());
                        c12025x63 = c12025x6;
                        c12025x63.m56891k4(m74611k4(string, qy7Var2).m56699x1() + c12025x6.m56897x1());
                    }
                } else {
                    c12013m9 = c12013m9M68811k4;
                    c11896dy2 = c11896dy4;
                    c12025x63 = c12025x6;
                }
                if (i4 >= i3) {
                    c11896dy3 = c11896dy2;
                } else if (C3047dy.m12856jd(strReplaceAll.charAt(i4)) == 4) {
                    c6765kp.m26780k4((char) 8205);
                    c6765kp.m26780k4(strReplaceAll.charAt(i4));
                    c6765kp.m26780k4((char) 8205);
                    c11896dy3 = c11896dy2;
                    i4++;
                } else if (C14117yj.m67514du(strReplaceAll.charAt(i4))) {
                    c11896dy3 = c11896dy2;
                    c6765kp.m26798k4(new char[]{strReplaceAll.charAt(i4), strReplaceAll.charAt(i4 + 1)});
                    i4 += 2;
                } else {
                    c11896dy3 = c11896dy2;
                    c6765kp.m26780k4(strReplaceAll.charAt(i4));
                    i4++;
                }
                if (c6765kp.m26807x1() <= 0) {
                    break;
                }
                C12025x6 c12025x64 = c12025x63;
                c11896dy4 = c11896dy3;
                c12025x6 = c12025x64;
                c12013m9M68811k4 = c12013m9;
            }
            omqVar = this;
            c11896dy = c11896dy3;
            str2 = strReplaceAll;
            c12025x62 = c12025x63;
            z = false;
            C12004dy c12004dy2 = c12004dyM56651x1;
            float f3 = fM69915rv;
            omqVar.m68699k4(c11896dy, c12025x6M56896to.Clone(), abstractC12024x1M73548kk, c12026yj2, c14251ot, qy7Var, omqVar.f50624x1);
            abstractC12024x1 = abstractC12024x1M73548kk;
            C9797wp c9797wpM48107x1 = c14251ot.m68819x1().m23120k4().m48221m9().m48107x1(72);
            float f4 = qy7Var.m69897k4() == 4 ? 15.0f : 17.0f;
            if (!z || !C7019kk.m27469x1(abstractC12024x1, C11999ar.class) || c9797wpM48107x1.m48285kk() >= 300 || f3 >= f4) {
                abstractC12024x12 = abstractC12024x1;
                omqVar.f50624x1.mo17527k4(abstractC12024x12, c11896dy);
                if (c14251ot.m68810h4()) {
                    C12026yj c12026yj3 = new C12026yj(abstractC12024x12, c14251ot.m68817m9() * 0.02f);
                    try {
                        omqVar.f50624x1.mo17540k4(c12026yj3, c11896dy);
                    } finally {
                        c12026yj3.dispose();
                    }
                }
                c12026yj = c12026yj2;
                omqVar.m68704x1(c11896dy, c12025x6M56896to.Clone(), abstractC12024x12, c12026yj, c14251ot, qy7Var, omqVar.f50624x1);
            } else {
                char c2 = 3;
                omqVar.f50624x1.mo17478dy(3);
                c11896dy.m55527fa();
                int i9 = c14251ot.m68810h4() ? iM56642jd | 1 : iM56642jd;
                if (omqVar.f50624x1.mo17577u4().m55776k4()[0] > 0.0f && omqVar.f50624x1.mo17577u4().m55776k4()[3] > 0.0f && omqVar.f50624x1.mo17577u4().m55776k4()[1] == 0.0f && omqVar.f50624x1.mo17577u4().m55776k4()[2] == 0.0f && c14251ot.m68810h4()) {
                    C12013m9 c12013m9M56630k4 = C12013m9.m56630k4(c12004dy2, C14116yg.m67504x1(omqVar.f50624x1.mo17577u4().m55776k4()[0], omqVar.f50624x1.mo17577u4().m55776k4()[3]) * c12013m9.m56639dy(), i9);
                    C11913yj c11913yjMo17577u4 = omqVar.f50624x1.mo17577u4();
                    omqVar.f50624x1.mo17475du();
                    omqVar.f50624x1.mo17588x1(new C11913yj(1.0f, c11913yjMo17577u4.m55776k4()[1], c11913yjMo17577u4.m55776k4()[2], 1.0f, c11913yjMo17577u4.m55783to(), c11913yjMo17577u4.m55757du()));
                    C11687fa c11687faM55122x13 = C11689jd.m55122x1(str2);
                    int i10 = 0;
                    while (c11687faM55122x13.hasNext()) {
                        int i11 = i7;
                        String strM67443x1 = C14113y2.m67443x1(str2, i10, i11);
                        if (qy7Var.m69924wl() != null) {
                            float[] fArr2 = new float[strM67443x1.length()];
                            c = c2;
                            AbstractC14092to.m67216k4(AbstractC14092to.m67208k4(qy7Var.m69924wl()), i10, AbstractC14092to.m67208k4(fArr2), 0, i11);
                            C12025x6 c12025x65 = new C12025x6(fArr2[0] * c11913yjMo17577u4.m55776k4()[0], c12025x62.m56895kk() * c11913yjMo17577u4.m55776k4()[c]);
                            C11913yj c11913yj2 = c11913yjMo17577u4;
                            String strM55107k4 = c11687faM55122x13.m55107k4();
                            C12025x6 c12025x6M56896to3 = c12025x65.Clone();
                            C12004dy c12004dy3 = c12004dy2;
                            i = i10;
                            c12004dy = c12004dy3;
                            f = f3;
                            c11913yj = c11913yj2;
                            omqVar.m68701k4(c11896dy, strM55107k4, c12004dy, i9, f, qy7Var, c12025x6M56896to3, fArr2);
                            abstractC12024x14 = abstractC12024x1;
                            c12013m92 = c12013m9M56630k4;
                            omqVar.f50624x1.mo17557k4(c11687faM55122x13.m55107k4(), c12013m92, abstractC12024x14, c12025x65.Clone(), omqVar.f50616du);
                        } else {
                            C12004dy c12004dy4 = c12004dy2;
                            i = i10;
                            c12004dy = c12004dy4;
                            abstractC12024x14 = abstractC12024x1;
                            c = c2;
                            f = f3;
                            c12013m92 = c12013m9M56630k4;
                            c11913yj = c11913yjMo17577u4;
                            omqVar.m68700k4(c11896dy, c11687faM55122x13.m55107k4(), c12004dy, i9, f, qy7Var, c12025x62.Clone());
                            omqVar.f50624x1.mo17557k4(c11687faM55122x13.m55107k4(), c12013m92, abstractC12024x14, new C12025x6(c12025x62.m56897x1() * c11913yj.m55776k4()[0], c12025x62.m56895kk() * c11913yj.m55776k4()[c]), omqVar.f50616du);
                            c12025x62.m56891k4(omqVar.m74611k4(strM67443x1, qy7Var).m56699x1() + c12025x62.m56897x1());
                        }
                        i7 = 1;
                        int i12 = i + 1;
                        c12004dy2 = c12004dy;
                        f3 = f;
                        c12013m9M56630k4 = c12013m92;
                        abstractC12024x1 = abstractC12024x14;
                        i10 = i12;
                        c11913yjMo17577u4 = c11913yj;
                        c2 = c;
                    }
                    abstractC12024x13 = abstractC12024x1;
                    omqVar.f50624x1.mo17588x1(c11913yjMo17577u4);
                } else {
                    abstractC12024x13 = abstractC12024x1;
                    C12013m9 c12013m9M56630k42 = C12013m9.m56630k4(c12004dy2, c12013m9.m56639dy(), i9);
                    String str3 = str2;
                    omqVar.m68701k4(c11896dy, str3, c12004dy2, i9, f3, qy7Var, c12025x62.Clone(), qy7Var.m69924wl());
                    if (qy7Var.m69924wl() == null) {
                        omqVar.f50624x1.mo17557k4(str3, c12013m9M56630k42, abstractC12024x13, c12025x62.Clone(), omqVar.f50616du);
                    } else {
                        abstractC12024x12 = abstractC12024x13;
                        omqVar.f50624x1.mo17527k4(abstractC12024x12, c11896dy);
                        omqVar.f50624x1.mo17478dy(4);
                        c12026yj = c12026yj2;
                    }
                }
                abstractC12024x12 = abstractC12024x13;
                omqVar.f50624x1.mo17478dy(4);
                c12026yj = c12026yj2;
            }
            AbstractC12024x1 abstractC12024x15 = abstractC12024x12;
            if (c12026yj != null) {
                omqVar.f50624x1.mo17540k4(c12026yj, c11896dy);
            }
            c11896dy.dispose();
            abstractC12024x15.dispose();
            if (c12026yj != null) {
                c12026yj.dispose();
                return;
            }
            return;
        }
        c12025x6 = c12025x6M56896to2;
        if (m68703k4(qy7Var2)) {
            if (C3047dy.m12881to((int) strReplaceAll.charAt(0)) != 2) {
                c6765kp = new C6765kp();
                int[] iArr3 = {0};
                int[] iArr22 = {0};
                m68702k4(strReplaceAll, iArr3, iArr22);
                int i82 = iArr3[0];
                i3 = iArr22[0];
                if (C3047dy.m12853fa(strReplaceAll.charAt(0)) == i2) {
                }
                i4 = i82;
                int length2 = 0;
                while (true) {
                    if (i4 == i3) {
                        C12013m9 c12013m932 = c12013m9M68811k4;
                        String string2 = c6765kp.toString();
                        c6765kp.m26809x1(0, c6765kp.m26807x1());
                        if (qy7Var2.m69924wl() != null) {
                        }
                        if (i4 >= i3) {
                        }
                        if (c6765kp.m26807x1() <= 0) {
                        }
                    } else {
                        C12013m9 c12013m9322 = c12013m9M68811k4;
                        String string22 = c6765kp.toString();
                        c6765kp.m26809x1(0, c6765kp.m26807x1());
                        if (qy7Var2.m69924wl() != null) {
                        }
                        if (i4 >= i3) {
                        }
                        if (c6765kp.m26807x1() <= 0) {
                        }
                    }
                    C12025x6 c12025x642 = c12025x63;
                    c11896dy4 = c11896dy3;
                    c12025x6 = c12025x642;
                    c12013m9M68811k4 = c12013m9;
                }
                omqVar = this;
                c11896dy = c11896dy3;
                str2 = strReplaceAll;
                c12025x62 = c12025x63;
                z = false;
            }
            C12004dy c12004dy22 = c12004dyM56651x1;
            float f32 = fM69915rv;
            omqVar.m68699k4(c11896dy, c12025x6M56896to.Clone(), abstractC12024x1M73548kk, c12026yj2, c14251ot, qy7Var, omqVar.f50624x1);
            abstractC12024x1 = abstractC12024x1M73548kk;
            C9797wp c9797wpM48107x12 = c14251ot.m68819x1().m23120k4().m48221m9().m48107x1(72);
            if (qy7Var.m69897k4() == 4) {
            }
            if (z) {
                abstractC12024x12 = abstractC12024x1;
                omqVar.f50624x1.mo17527k4(abstractC12024x12, c11896dy);
                if (c14251ot.m68810h4()) {
                }
                c12026yj = c12026yj2;
                omqVar.m68704x1(c11896dy, c12025x6M56896to.Clone(), abstractC12024x12, c12026yj, c14251ot, qy7Var, omqVar.f50624x1);
            }
            AbstractC12024x1 abstractC12024x152 = abstractC12024x12;
            if (c12026yj != null) {
            }
            c11896dy.dispose();
            abstractC12024x152.dispose();
            if (c12026yj != null) {
            }
        }
        C12025x6 c12025x66 = c12025x6;
        c12013m9 = c12013m9M68811k4;
        c11896dy = c11896dy4;
        c12025x62 = c12025x66;
        omqVar = this;
        omqVar.m68701k4(c11896dy, strReplaceAll, c12004dyM56651x1, iM56642jd, fM69915rv, qy7Var2, c12025x66.Clone(), qy7Var2.m69924wl());
        str2 = strReplaceAll;
        C12004dy c12004dy222 = c12004dyM56651x1;
        float f322 = fM69915rv;
        omqVar.m68699k4(c11896dy, c12025x6M56896to.Clone(), abstractC12024x1M73548kk, c12026yj2, c14251ot, qy7Var, omqVar.f50624x1);
        abstractC12024x1 = abstractC12024x1M73548kk;
        C9797wp c9797wpM48107x122 = c14251ot.m68819x1().m23120k4().m48221m9().m48107x1(72);
        if (qy7Var.m69897k4() == 4) {
        }
        if (z) {
        }
        AbstractC12024x1 abstractC12024x1522 = abstractC12024x12;
        if (c12026yj != null) {
        }
        c11896dy.dispose();
        abstractC12024x1522.dispose();
        if (c12026yj != null) {
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m68702k4(String str, int[] iArr, int[] iArr2) {
        iArr[0] = 0;
        iArr2[0] = str.length();
        if (str.charAt(0) == 8237) {
            iArr[0] = iArr[0] + 1;
        }
        if (androidx.core.content.OooO0O0.OooO00o(1, str) == 8236) {
            iArr2[0] = iArr2[0] - 1;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private boolean m68703k4(qy7 qy7Var) {
        lrb lrbVar = qy7Var.f48466du;
        return (qy7Var.f48466du == null || ((float) qy7Var.m69909ks()) >= qy7Var.f48466du.getKerningMinimalSize() || "Arab".equals(Fonts.m1521k4((lrbVar == null || lrbVar.getLanguageId() == null) ? "en-US" : qy7Var.f48466du.getLanguageId())) || qy7Var.f48466du.getKumimoji()) ? false : true;
    }
}
