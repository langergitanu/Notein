package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12002ck;
import com.aspose.slides.internal.p475wh.AbstractC12008jd;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.bc */
/* JADX INFO: loaded from: classes3.dex */
class C0812bc extends er8 {
    public C0812bc(GroupShape groupShape) {
        super(groupShape);
    }

    /* JADX INFO: renamed from: kk */
    private void m4127kk(AbstractC14897zn abstractC14897zn, kg7 kg7Var, InterruptionToken interruptionToken) {
        IAutoShape iAutoShape;
        interruptionToken.throwIfInterruptionRequested();
        if (m5629du().getHidden()) {
            return;
        }
        if (m5629du().getHyperlinkClick() != null) {
            abstractC14897zn.mo68801x1(m5629du().getHyperlinkClick());
        }
        boolean z = C7019kk.m27469x1(m5642m9(), Slide.class) || C7019kk.m27469x1(m5642m9(), NotesSlide.class) || C7019kk.m27469x1(m5642m9(), MasterHandoutSlide.class);
        ShapeCollection shapeCollection = m4130k4().f2428k4;
        for (int i = 0; i < shapeCollection.size(); i++) {
            Shape shape = (Shape) shapeCollection.get_Item(i);
            IShapeFrame frame = shape.getFrame();
            if ((frame.getWidth() != 0.0f || frame.getHeight() != 0.0f || ((iAutoShape = (IAutoShape) C7019kk.m27452k4((Object) shape, IAutoShape.class)) != null && iAutoShape.getTextFrame() != null && !C14113y2.m67411k4(((TextFrame) iAutoShape.getTextFrame()).m2901c5()))) && (z || !shape.isTextHolder())) {
                kg7Var.mo4518k4(abstractC14897zn, shape, interruptionToken);
            }
        }
        if (m5629du().getHyperlinkClick() != null) {
            abstractC14897zn.mo68800x1();
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m4128x1(AbstractC14897zn abstractC14897zn, kg7 kg7Var, InterruptionToken interruptionToken) {
        IEffectFormatEffectiveData effective = m4130k4().getEffectFormat().getEffective();
        if (effective != null) {
            if ((effective.getOuterShadowEffect() == null && effective.getGlowEffect() == null) || m4129x1()) {
                return;
            }
            if (effective.getOuterShadowEffect() == null && effective.getGlowEffect() == null) {
                return;
            }
            if (!C7019kk.m27469x1(abstractC14897zn, vhx.class)) {
                m4126k4(abstractC14897zn, kg7Var, effective, interruptionToken);
                return;
            }
            kg7 kg7Var2 = new kg7(kg7Var.m63845kk(), kg7Var.m63846ks(), new C13700js());
            C12009k4 c12009k4 = new C12009k4(abstractC14897zn.mo67711m9(), abstractC14897zn.mo67708dy());
            try {
                omq omqVar = new omq(c12009k4, c12009k4.mo15760yj(), c12009k4.mo15757m9());
                try {
                    AbstractC12008jd abstractC12008jdM56582k4 = AbstractC12008jd.m56582k4((AbstractC12002ck) c12009k4);
                    try {
                        abstractC12008jdM56582k4.mo17517k4(C12003du.m56458up().Clone());
                        abstractC12008jdM56582k4.dispose();
                        m4126k4(omqVar, kg7Var2, effective, interruptionToken);
                        abstractC14897zn.mo64340k4(c12009k4, 0, 0);
                    } catch (Throwable th) {
                        if (abstractC12008jdM56582k4 != null) {
                            abstractC12008jdM56582k4.dispose();
                        }
                        throw th;
                    }
                } finally {
                    omqVar.dispose();
                }
            } finally {
                c12009k4.dispose();
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final GroupShape m4130k4() {
        return (GroupShape) m5629du();
    }

    /* JADX INFO: renamed from: k4 */
    private void m4126k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, IEffectFormatEffectiveData iEffectFormatEffectiveData, InterruptionToken interruptionToken) {
        lbk lbkVar = new lbk(abstractC14897zn.mo67711m9(), abstractC14897zn.mo67708dy(), abstractC14897zn.mo67707du() / 8.0f, abstractC14897zn.mo67709h4() / 8.0f);
        try {
            m4127kk(lbkVar, kg7Var, interruptionToken);
            if (iEffectFormatEffectiveData.getOuterShadowEffect() != null) {
                new nv2(iEffectFormatEffectiveData.getOuterShadowEffect()).m68228k4(abstractC14897zn, lbkVar.m64344um());
            }
            if (iEffectFormatEffectiveData.getGlowEffect() != null) {
                new C14871z3(iEffectFormatEffectiveData.getGlowEffect()).m74298k4(abstractC14897zn, lbkVar.m64344um());
            }
            lbkVar.dispose();
        } catch (Throwable th) {
            lbkVar.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: x1 */
    private boolean m4129x1() {
        if (m4130k4().getThreeDFormat().getCamera().getCameraType() != -1) {
            return true;
        }
        IGenericEnumerator<IShape> it = m4130k4().getShapes().iterator();
        while (it.hasNext()) {
            try {
                if (it.next().getThreeDFormat().getCamera().getCameraType() == -1) {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                    return false;
                }
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        return true;
    }

    @Override // com.aspose.slides.er8
    /* JADX INFO: renamed from: k4 */
    public void mo4131k4(AbstractC14897zn abstractC14897zn, kg7 kg7Var, InterruptionToken interruptionToken) {
        m4128x1(abstractC14897zn, kg7Var, interruptionToken);
        m4127kk(abstractC14897zn, kg7Var, interruptionToken);
    }
}
