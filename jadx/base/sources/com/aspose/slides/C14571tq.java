package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.internal.p151gj.C4317dy;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p323op.C7131h4;
import com.aspose.slides.internal.p323op.C7134m9;
import com.aspose.slides.internal.p475wh.C12003du;
import com.aspose.slides.internal.p475wh.C12009k4;
import com.aspose.slides.internal.p475wh.C12015qq;
import com.aspose.slides.internal.p475wh.C12023wl;
import com.aspose.slides.internal.p479wm.C12210k4;
import com.aspose.slides.internal.p505xn.C12556ck;
import com.aspose.slides.p559ms.System.C14050ca;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.tq */
/* JADX INFO: loaded from: classes3.dex */
final class C14571tq extends kg7 {

    /* JADX INFO: renamed from: du */
    private final Dictionary<IShape, vjj> f49171du;

    /* JADX INFO: renamed from: dy */
    private final C14050ca f49172dy;

    /* JADX INFO: renamed from: h4 */
    private C12009k4 f49173h4;

    /* JADX INFO: renamed from: k4 */
    private final C12023wl f49174k4;

    /* JADX INFO: renamed from: kk */
    private final Dictionary<Paragraph, InterfaceC14169n6> f49175kk;

    /* JADX INFO: renamed from: m9 */
    private C12009k4 f49176m9;

    /* JADX INFO: renamed from: to */
    private final Dictionary<IShape, oju> f49177to;

    /* JADX INFO: renamed from: x1 */
    private final Dictionary<IShape, InterfaceC14169n6> f49178x1;

    private C14571tq(IBaseSlide iBaseSlide, C12210k4<C7134m9, C7131h4> c12210k4, C13700js c13700js, C12023wl c12023wl) {
        super(iBaseSlide, c12210k4, c13700js);
        C12023wl c12023wl2 = new C12023wl();
        this.f49174k4 = c12023wl2;
        this.f49173h4 = null;
        this.f49176m9 = null;
        c12023wl.CloneTo(c12023wl2);
        this.f49178x1 = new Dictionary<>();
        this.f49175kk = new Dictionary<>();
        this.f49177to = new Dictionary<>();
        this.f49171du = new Dictionary<>();
        this.f49172dy = new C14050ca(0);
    }

    /* JADX INFO: renamed from: k4 */
    public static C14571tq m71274k4(IBaseSlide iBaseSlide, C12023wl c12023wl) {
        C13700js c13700js = new C13700js();
        c13700js.f45563c5 = C13700js.m63539k4(c12023wl.Clone());
        return new C14571tq(iBaseSlide, new C12210k4(C7134m9.class, C7131h4.class), c13700js, c12023wl.Clone());
    }

    /* JADX INFO: renamed from: kk */
    private void m71276kk(IShape iShape, oju ojuVar) {
        vjj[] vjjVarArr = {null};
        boolean zTryGetValue = this.f49171du.tryGetValue(iShape, vjjVarArr);
        vjj vjjVar = vjjVarArr[0];
        if (zTryGetValue) {
            vjjVar.m72332k4(ojuVar.Clone());
        }
    }

    /* JADX INFO: renamed from: x1 */
    public final C14050ca m71287x1() {
        return this.f49172dy;
    }

    /* JADX INFO: renamed from: k4 */
    public final vjj m71278k4(Shape shape) {
        vjj[] vjjVarArr = {null};
        boolean zTryGetValue = this.f49171du.tryGetValue(shape, vjjVarArr);
        vjj vjjVar = vjjVarArr[0];
        if (zTryGetValue) {
            vjjVar.m72333kk();
            return vjjVar;
        }
        vjj vjjVar2 = new vjj(shape, this);
        this.f49171du.addItem(shape, vjjVar2);
        return vjjVar2;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m71288x1(IShape iShape, oju ojuVar) {
        if (((Shape) iShape).m2565k4(ojuVar.Clone())) {
            m71276kk(iShape, ojuVar.Clone());
        }
    }

    /* JADX INFO: renamed from: x1 */
    private void m71277x1(AbstractC14897zn abstractC14897zn, Shape shape, InterruptionToken interruptionToken) {
        oju ojuVar = new oju();
        oju[] ojuVarArr = {ojuVar};
        boolean zTryGetValue = this.f49177to.tryGetValue(shape, ojuVarArr);
        ojuVarArr[0].CloneTo(ojuVar);
        if (!zTryGetValue) {
            super.mo4518k4(abstractC14897zn, shape, interruptionToken);
            return;
        }
        IShapeFrame frame = shape.getFrame();
        C4317dy c4317dy = new C4317dy();
        c4317dy.m17348x1(frame.getCenterX(), frame.getCenterY());
        c4317dy.m17335k4(ojuVar.f47836k4, ojuVar.f47837x1);
        c4317dy.m17348x1(-frame.getCenterX(), -frame.getCenterY());
        abstractC14897zn.m74622kk(c4317dy);
        try {
            super.mo4518k4(abstractC14897zn, shape, interruptionToken);
        } finally {
            abstractC14897zn.m74626rv();
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71279k4() {
        this.f49178x1.clear();
        this.f49175kk.clear();
        this.f49177to.clear();
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71280k4(IShape iShape, InterfaceC14169n6 interfaceC14169n6) {
        this.f49178x1.set_Item(iShape, interfaceC14169n6);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71281k4(IShape iShape, oju ojuVar) {
        this.f49177to.set_Item(iShape, ojuVar.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71282k4(IShape iShape, boolean z, float f) {
        if (z) {
            iShape.setX(f);
        } else {
            iShape.setY(f);
        }
        IShapeFrame frame = iShape.getFrame();
        m71276kk(iShape, new oju(frame.getX(), frame.getY()));
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71283k4(Paragraph paragraph, InterfaceC14169n6 interfaceC14169n6) {
        this.f49175kk.set_Item(paragraph, interfaceC14169n6);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71284k4(Shape shape, boolean z, float f) {
        if (f < 0.0f) {
            f = -f;
        }
        IShapeFrame frame = shape.getFrame();
        oju ojuVar = new oju(frame.getX(), frame.getY());
        oju ojuVar2 = new oju(frame.getWidth(), frame.getHeight());
        float f2 = ((z ? ojuVar2.f47836k4 : ojuVar2.f47837x1) - f) / 4.0f;
        if (z) {
            ojuVar2.f47836k4 = f;
            ojuVar.f47836k4 += f2;
        } else {
            ojuVar2.f47837x1 = f;
            ojuVar.f47837x1 += f2;
        }
        shape.m2591x1(ojuVar2.Clone());
        shape.m2565k4(ojuVar.Clone());
        m71276kk(shape, ojuVar.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public final void m71285k4(vjj vjjVar) {
        this.f49171du.removeItemByKey(vjjVar.f49579kk);
    }

    @Override // com.aspose.slides.kg7
    /* JADX INFO: renamed from: k4 */
    public void mo4518k4(AbstractC14897zn abstractC14897zn, Shape shape, InterruptionToken interruptionToken) {
        InterfaceC14169n6[] interfaceC14169n6Arr = {null};
        boolean zTryGetValue = this.f49178x1.tryGetValue(shape, interfaceC14169n6Arr);
        InterfaceC14169n6 interfaceC14169n6 = interfaceC14169n6Arr[0];
        if (!zTryGetValue) {
            m71277x1(abstractC14897zn, shape, interruptionToken);
            return;
        }
        C12009k4[] c12009k4Arr = {this.f49173h4};
        m71275k4(c12009k4Arr);
        this.f49173h4 = c12009k4Arr[0];
        C12015qq c12015qqClone = ((SlideSize) m63845kk().getPresentation().getSlideSize()).m2755k4().Clone();
        omq omqVar = new omq(this.f49173h4, c12015qqClone.m56699x1(), c12015qqClone.m56697kk());
        try {
            omqVar.m74608ar().mo17517k4(C12003du.m56396k4(0).Clone());
            m71277x1(omqVar, shape, interruptionToken);
            interfaceC14169n6.mo67868k4(omqVar);
            C12556ck.m58568k4(omqVar.m74625qq());
            omqVar.dispose();
            abstractC14897zn.mo64340k4(this.f49173h4, 0, 0);
        } catch (Throwable th) {
            omqVar.dispose();
            throw th;
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m71275k4(C12009k4[] c12009k4Arr) {
        if (c12009k4Arr[0] == null) {
            C12009k4 c12009k4 = new C12009k4(this.f49174k4.m56865x1(), this.f49174k4.m56862kk(), 2498570);
            c12009k4Arr[0] = c12009k4;
            c12009k4.m56332k4(96.0f, 96.0f);
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final boolean m71286k4(IShape iShape, oju[] ojuVarArr) {
        return this.f49177to.tryGetValue(iShape, ojuVarArr);
    }

    @Override // com.aspose.slides.kg7
    /* JADX INFO: renamed from: k4 */
    public boolean mo63844k4(AbstractC14897zn abstractC14897zn, TextFrame textFrame, C4317dy c4317dy) {
        boolean z;
        IGenericEnumerator<IParagraph> it;
        if (this.f49175kk.size() > 0) {
            it = textFrame.getParagraphs().iterator();
            while (true) {
                try {
                    if (!it.hasNext()) {
                        z = false;
                        break;
                    }
                    if (this.f49175kk.containsKey((Paragraph) it.next())) {
                        z = true;
                        break;
                    }
                } finally {
                }
            }
            if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                it.dispose();
            }
        } else {
            z = false;
        }
        if (!z) {
            return super.mo63844k4(abstractC14897zn, textFrame, c4317dy);
        }
        C12009k4[] c12009k4Arr = {this.f49176m9};
        m71275k4(c12009k4Arr);
        this.f49176m9 = c12009k4Arr[0];
        C12015qq c12015qqClone = ((SlideSize) m63845kk().getPresentation().getSlideSize()).m2755k4().Clone();
        omq omqVar = new omq(this.f49176m9, c12015qqClone.m56699x1(), c12015qqClone.m56697kk());
        try {
            omqVar.m74608ar().mo17517k4(C12003du.m56396k4(0).Clone());
            boolean zMo63844k4 = super.mo63844k4(omqVar, textFrame, c4317dy);
            if (zMo63844k4) {
                it = textFrame.getParagraphs().iterator();
                while (it.hasNext()) {
                    try {
                        InterfaceC14169n6[] interfaceC14169n6Arr = {null};
                        boolean zTryGetValue = this.f49175kk.tryGetValue((Paragraph) it.next(), interfaceC14169n6Arr);
                        InterfaceC14169n6 interfaceC14169n6 = interfaceC14169n6Arr[0];
                        if (zTryGetValue) {
                            interfaceC14169n6.mo67868k4(omqVar);
                        }
                    } finally {
                    }
                }
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
            omqVar.dispose();
            if (zMo63844k4) {
                abstractC14897zn.mo64340k4(this.f49176m9, 0, 0);
            }
            return zMo63844k4;
        } catch (Throwable th) {
            omqVar.dispose();
            throw th;
        }
    }
}
