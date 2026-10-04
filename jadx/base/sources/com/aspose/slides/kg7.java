package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.KeyValuePair;
import com.aspose.slides.exceptions.OperationCanceledException;
import com.aspose.slides.internal.p077d8.C3065k4;
import com.aspose.slides.internal.p077d8.C3085sv;
import com.aspose.slides.internal.p077d8.C3100wp;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p323op.C7131h4;
import com.aspose.slides.internal.p323op.C7134m9;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.C12007ix;
import com.aspose.slides.internal.p479wm.C12210k4;
import com.aspose.slides.p559ms.System.C14057f9;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
class kg7 {

    /* JADX INFO: renamed from: c5 */
    private final boolean f45709c5;

    /* JADX INFO: renamed from: ck */
    private final float f45710ck;

    /* JADX INFO: renamed from: du */
    private int f45711du;

    /* JADX INFO: renamed from: dy */
    private final IBaseSlide f45712dy;

    /* JADX INFO: renamed from: fa */
    private final int f45713fa;

    /* JADX INFO: renamed from: h4 */
    private float f45714h4;

    /* JADX INFO: renamed from: jd */
    private final boolean f45715jd;

    /* JADX INFO: renamed from: k4 */
    private C12007ix f45716k4 = new C12007ix();

    /* JADX INFO: renamed from: kk */
    private final IWarningCallback f45717kk;

    /* JADX INFO: renamed from: ks */
    private final boolean f45718ks;

    /* JADX INFO: renamed from: m9 */
    private final boolean f45719m9;

    /* JADX INFO: renamed from: ne */
    private InkOptions f45720ne;

    /* JADX INFO: renamed from: rv */
    private final boolean f45721rv;

    /* JADX INFO: renamed from: to */
    private final C12210k4<C7134m9, C7131h4> f45722to;

    /* JADX INFO: renamed from: up */
    private final float f45723up;

    /* JADX INFO: renamed from: x1 */
    private C1223ht f45724x1;

    /* JADX INFO: renamed from: x6 */
    private IHyperlink f45725x6;

    /* JADX INFO: renamed from: yj */
    private final int f45726yj;

    public kg7(IBaseSlide iBaseSlide, C12210k4<C7134m9, C7131h4> c12210k4, C13700js c13700js) {
        this.f45712dy = iBaseSlide;
        this.f45722to = c12210k4;
        this.f45719m9 = c13700js.f45570k4;
        this.f45717kk = c13700js.f45575to;
        this.f45710ck = c13700js.f45571kk;
        this.f45709c5 = c13700js.f45577x1;
        this.f45715jd = c13700js.f45573m9;
        this.f45713fa = c13700js.f45565du & 255;
        this.f45723up = c13700js.f45568h4;
        this.f45726yj = c13700js.f45563c5;
        this.f45718ks = c13700js.f45569jd;
        this.f45721rv = c13700js.f45567fa;
        InkOptions inkOptions = new InkOptions();
        this.f45720ne = inkOptions;
        inkOptions.setHideInk(c13700js.f45578yj.getHideInk());
        this.f45720ne.setInterpretMaskOpAsOpacity(c13700js.f45578yj.getInterpretMaskOpAsOpacity());
        this.f45714h4 = c13700js.f45572ks;
        this.f45711du = c13700js.f45574rv;
    }

    /* JADX INFO: renamed from: k4 */
    public static C7131h4 m63829k4(kg7 kg7Var, C7134m9 c7134m9, PPImage pPImage) {
        C7131h4 c7131h4 = null;
        if (kg7Var != null) {
            C7131h4[] c7131h4Arr = {null};
            kg7Var.m63846ks().m56973k4(c7134m9, c7131h4Arr);
            c7131h4 = c7131h4Arr[0];
        }
        return (c7131h4 == null || !(c7131h4.m27679to() || c7131h4.m27680x1())) ? new C7131h4(pPImage.m2126dy(), pPImage.getBinaryData()) : c7131h4;
    }

    /* JADX INFO: renamed from: x1 */
    public static C7131h4 m63830x1(kg7 kg7Var, C7134m9 c7134m9, PPImage pPImage) {
        C7131h4 c7131h4;
        if (kg7Var != null) {
            C7131h4[] c7131h4Arr = {null};
            kg7Var.m63846ks().m56973k4(c7134m9, c7131h4Arr);
            c7131h4 = c7131h4Arr[0];
        } else {
            c7131h4 = null;
        }
        if (c7131h4 == null || !(c7131h4.m27679to() || c7131h4.m27680x1())) {
            return null;
        }
        return c7131h4;
    }

    /* JADX INFO: renamed from: c5 */
    public final float m63831c5() {
        return this.f45710ck;
    }

    /* JADX INFO: renamed from: ck */
    public final float m63832ck() {
        return this.f45723up;
    }

    /* JADX INFO: renamed from: du */
    public final boolean m63833du() {
        return this.f45709c5;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m63834dy() {
        return this.f45721rv;
    }

    /* JADX INFO: renamed from: fa */
    public final IHyperlink m63835fa() {
        return this.f45725x6;
    }

    /* JADX INFO: renamed from: h4 */
    public final boolean m63836h4() {
        return this.f45715jd;
    }

    /* JADX INFO: renamed from: ix */
    public final int m63837ix() {
        return this.f45711du;
    }

    /* JADX INFO: renamed from: jd */
    public final int m63838jd() {
        return this.f45713fa;
    }

    /* JADX INFO: renamed from: kk */
    public final IBaseSlide m63845kk() {
        return this.f45712dy;
    }

    /* JADX INFO: renamed from: ks */
    public final C12210k4<C7134m9, C7131h4> m63846ks() {
        return this.f45722to;
    }

    /* JADX INFO: renamed from: m9 */
    public final IInkOptions m63847m9() {
        return this.f45720ne;
    }

    /* JADX INFO: renamed from: ne */
    public final float m63848ne() {
        return this.f45714h4;
    }

    /* JADX INFO: renamed from: rv */
    public final C12007ix m63849rv() {
        return this.f45716k4.Clone();
    }

    /* JADX INFO: renamed from: to */
    public final boolean m63850to() {
        return this.f45719m9;
    }

    /* JADX INFO: renamed from: up */
    public final int m63851up() {
        return this.f45726yj;
    }

    /* JADX INFO: renamed from: x6 */
    public final C1223ht m63852x6() {
        return this.f45724x1;
    }

    /* JADX INFO: renamed from: yj */
    public final boolean m63853yj() {
        return this.f45718ks;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7134m9 m63839k4(AbstractC12002ck abstractC12002ck) {
        Dictionary.Enumerator<C7134m9, C7131h4> it = this.f45722to.m56976x1().iterator();
        while (it.hasNext()) {
            try {
                KeyValuePair next = it.next();
                if (((C7131h4) next.getValue()).m27680x1() && C14067j2.m66729x1(abstractC12002ck, ((C7131h4) next.getValue()).m27678kk())) {
                    return (C7134m9) next.getKey();
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        if (!C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
            return null;
        }
        it.dispose();
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63840k4(IHyperlink iHyperlink) {
        this.f45725x6 = iHyperlink;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63841k4(C1223ht c1223ht) {
        this.f45724x1 = c1223ht;
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63842k4(C12007ix c12007ix) {
        this.f45716k4 = c12007ix.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo4517k4(vhx vhxVar, Portion portion, TextFrame textFrame) {
    }

    /* JADX INFO: renamed from: k4 */
    public void mo4518k4(AbstractC14897zn abstractC14897zn, Shape shape, InterruptionToken interruptionToken) {
        try {
            boolean[] zArr = {false};
            C1223ht c1223htM5716k4 = C0964eu.m5716k4(shape, this, abstractC14897zn, zArr);
            if (zArr[0] && m63852x6() == null) {
                m63841k4(c1223htM5716k4);
            }
            shape.m2546bz().mo4131k4(abstractC14897zn, this, interruptionToken);
            if (m63852x6() == null || !m63852x6().m7289k4(shape)) {
                return;
            }
            m63841k4((C1223ht) null);
        } catch (OperationCanceledException e) {
            throw e;
        } catch (C3065k4 e2) {
            if (!C7019kk.m27469x1(abstractC14897zn, omq.class)) {
                throw e2;
            }
            throw new PptxException("Thumbnail drawing aborted.", e2);
        } catch (RuntimeException e3) {
            Slide slide = (Slide) C7019kk.m27452k4((Object) shape.getSlide(), Slide.class);
            m63843k4(C14113y2.m67402k4("Shape #{0} at {1} at position {2}x{3} cannot be drawn", Long.valueOf(shape.m2584wp()), slide != null ? C14113y2.m67408k4("Slide #", C14057f9.m66591x1(slide.m2709qq() + 1)) : C14113y2.m67408k4(C14067j2.m66727k4(shape.getSlide()).mo48540du(), " \"", shape.getSlide().getName(), "\""), Float.valueOf(shape.getX()), Float.valueOf(shape.getY())), 1);
            C3085sv.m13082k4(e3);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m63843k4(String str, int i) {
        new C3100wp(str, i).sendWarning(this.f45717kk);
    }

    /* JADX INFO: renamed from: k4 */
    public boolean mo63844k4(AbstractC14897zn abstractC14897zn, TextFrame textFrame, C4317dy c4317dy) {
        abstractC14897zn.m74622kk(c4317dy);
        try {
            return textFrame.f3523to.mo64295k4(abstractC14897zn, this);
        } finally {
            abstractC14897zn.m74626rv();
        }
    }
}
