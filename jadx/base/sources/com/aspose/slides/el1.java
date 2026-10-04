package com.aspose.slides;

import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.Collections.ObjectModel.ReadOnlyCollection;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p475wh.AbstractC12024x1;
import com.aspose.slides.internal.p475wh.C11999ar;
import com.aspose.slides.p559ms.System.IDisposable;
import java.util.Iterator;

/* JADX INFO: loaded from: classes3.dex */
abstract class el1 implements InterfaceC0851ce {

    /* JADX INFO: renamed from: c5 */
    public final IMathElement f4820c5;

    /* JADX INFO: renamed from: ck */
    final el1 f4821ck;

    /* JADX INFO: renamed from: dy */
    el1 f4822dy;

    /* JADX INFO: renamed from: jd */
    List<el1> f4823jd;

    /* JADX INFO: renamed from: kk */
    private boolean f4825kk;

    /* JADX INFO: renamed from: m9 */
    public final ReadOnlyCollection<el1> f4826m9;

    /* JADX INFO: renamed from: to */
    private final q1h f4827to;

    /* JADX INFO: renamed from: k4 */
    private h2y f4824k4 = new h2y();

    /* JADX INFO: renamed from: x1 */
    private oju f4828x1 = new oju();

    public el1(IMathElement iMathElement, InterfaceC0851ce interfaceC0851ce) {
        List<el1> list = new List<>();
        this.f4823jd = list;
        this.f4826m9 = new ReadOnlyCollection<>(list);
        this.f4827to = interfaceC0851ce.mo4555du();
        this.f4821ck = (el1) C7019kk.m27452k4((Object) interfaceC0851ce, el1.class);
        this.f4820c5 = iMathElement;
        if (C7019kk.m27469x1(interfaceC0851ce, el1.class)) {
            el1 el1Var = (el1) interfaceC0851ce;
            if (el1Var.f4826m9.size() > 0) {
                this.f4822dy = el1Var.f4826m9.get_Item(r3.size() - 1);
            }
        }
    }

    /* JADX INFO: renamed from: c5 */
    public final void m5576c5() {
        el1 el1Var = this.f4821ck;
        if (el1Var != null) {
            el1Var.f4823jd.addItem(this);
        }
    }

    @Override // com.aspose.slides.InterfaceC0851ce
    /* JADX INFO: renamed from: du */
    public final q1h mo4555du() {
        return this.f4827to;
    }

    /* JADX INFO: renamed from: dy */
    public final boolean m5577dy() {
        return this.f4825kk;
    }

    /* JADX INFO: renamed from: h4 */
    public final h2y m5578h4() {
        return this.f4824k4.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public final el1 m5579k4(IMathElement iMathElement, C14327q4 c14327q4) {
        return mo4555du().m69384k4(iMathElement, this, c14327q4.Clone());
    }

    /* JADX INFO: renamed from: k4 */
    public abstract h2y mo3934k4(oju ojuVar);

    /* JADX INFO: renamed from: kk */
    public final void m5582kk(oju ojuVar) {
        List.Enumerator<el1> it = this.f4823jd.iterator();
        while (it.hasNext()) {
            try {
                el1 next = it.next();
                next.m5585x1(oju.f47834kk.Clone());
                next.m5582kk(ojuVar.Clone());
            } finally {
                if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                    it.dispose();
                }
            }
        }
        m5574k4(mo3934k4(ojuVar.Clone()).Clone());
    }

    /* JADX INFO: renamed from: m9 */
    public final oju m5583m9() {
        return this.f4828x1.Clone();
    }

    /* JADX INFO: renamed from: x1 */
    public final void m5584x1(float f, float f2) {
        m5585x1(new oju(f, f2));
    }

    /* JADX INFO: renamed from: k4 */
    public final AbstractC12024x1 m5580k4(AbstractC12024x1 abstractC12024x1) {
        IFillFormat fillFormat;
        for (el1 el1Var = this; el1Var != null; el1Var = el1Var.f4821ck) {
            IMathElement iMathElement = el1Var.f4820c5;
            if (C7019kk.m27469x1(iMathElement, InterfaceC14876z8.class)) {
                p8h controlCharacterProperties = ((InterfaceC14876z8) C7019kk.m27452k4((Object) iMathElement, InterfaceC14876z8.class)).getControlCharacterProperties();
                IPortionFormat iPortionFormatM68977x1 = controlCharacterProperties.m68977x1() != null ? controlCharacterProperties.m68977x1() : null;
                if (iPortionFormatM68977x1 != null && (fillFormat = iPortionFormatM68977x1.getFillFormat()) != null && fillFormat.getFillType() == 1) {
                    return new C11999ar(((ColorFormat) fillFormat.getSolidFillColor()).m1084to().Clone());
                }
            }
        }
        return abstractC12024x1;
    }

    /* JADX INFO: renamed from: x1 */
    public final void m5585x1(oju ojuVar) {
        this.f4828x1 = ojuVar.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    private void m5574k4(h2y h2yVar) {
        this.f4824k4 = h2yVar.Clone();
    }

    /* JADX INFO: renamed from: k4 */
    public void mo3976k4(yvz yvzVar) {
        m5575k4(yvzVar.Clone(), this.f4823jd);
    }

    /* JADX INFO: renamed from: k4 */
    public static void m5575k4(yvz yvzVar, IGenericList<el1> iGenericList) {
        for (int i = 0; i < iGenericList.size(); i++) {
            el1 el1Var = iGenericList.get_Item(i);
            pzd pzdVar = new pzd(yvzVar.f50411k4);
            try {
                oju ojuVarClone = el1Var.m5583m9().Clone();
                yvzVar.f50411k4.m74612k4(ojuVarClone.f47836k4, ojuVarClone.f47837x1);
                el1Var.mo3976k4(yvzVar.Clone());
                pzdVar.dispose();
            } catch (Throwable th) {
                pzdVar.dispose();
                throw th;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5581k4(boolean z) {
        this.f4825kk = z;
    }
}
