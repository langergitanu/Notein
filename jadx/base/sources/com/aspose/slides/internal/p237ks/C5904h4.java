package com.aspose.slides.internal.p237ks;

import com.aspose.slides.Collections.Generic.IGenericEnumerator;
import com.aspose.slides.Collections.Generic.IGenericList;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p231kk.AbstractC5788h4;
import com.aspose.slides.internal.p231kk.C5796m9;
import com.aspose.slides.internal.p231kk.C5813x1;
import com.aspose.slides.internal.p231kk.InterfaceC5817yj;
import com.aspose.slides.internal.p270m9.AbstractC6355x1;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p423to.C11071kk;
import com.aspose.slides.internal.p447up.C11543x6;
import com.aspose.slides.internal.p453uz.C11589u4;
import com.aspose.slides.internal.p478wl.C12187wp;
import com.aspose.slides.p559ms.System.IDisposable;
import com.aspose.words.StyleIdentifier;
import java.util.Iterator;

/* JADX INFO: renamed from: com.aspose.slides.internal.ks.h4 */
/* JADX INFO: loaded from: classes.dex */
public class C5904h4 implements InterfaceC5901c5 {

    /* JADX INFO: renamed from: k4 */
    private String f16689k4;

    /* JADX INFO: renamed from: kk */
    private int f16690kk = 0;

    /* JADX INFO: renamed from: to */
    private C11589u4 f16691to;

    /* JADX INFO: renamed from: x1 */
    private IGenericList<C5908m9> f16692x1;

    /* JADX INFO: renamed from: k4 */
    private static AbstractC5788h4 m23773k4(AbstractC5788h4 abstractC5788h4) {
        return abstractC5788h4 == C5813x1.k4.f16504wy ? C5813x1.k4.f16552yj : abstractC5788h4 == C5813x1.k4.f16241nh ? C5813x1.k4.f16512x6 : (abstractC5788h4 == C5813x1.k4.f16574zb || abstractC5788h4 == C5813x1.k4.f16116j6) ? C5813x1.k4.f16552yj : abstractC5788h4;
    }

    /* JADX INFO: renamed from: kk */
    public final int m23775kk() {
        return this.f16690kk;
    }

    /* JADX INFO: renamed from: to */
    public final C11589u4 m23776to() {
        return this.f16691to;
    }

    @Override // com.aspose.slides.internal.p237ks.InterfaceC5901c5
    /* JADX INFO: renamed from: x1 */
    public final IGenericList<C5908m9> mo23765x1() {
        return this.f16692x1;
    }

    /* JADX INFO: renamed from: k4 */
    public static C5904h4 m23774k4(InterfaceC5817yj interfaceC5817yj) {
        boolean zM27456k4;
        AbstractC6355x1 abstractC6355x1 = (AbstractC6355x1) interfaceC5817yj.mo23713kk();
        C5904h4 c5904h4 = new C5904h4();
        AbstractC5788h4 abstractC5788h4M26039x1 = abstractC6355x1.m26039x1(114);
        if (abstractC5788h4M26039x1 != null) {
            c5904h4.f16689k4 = abstractC5788h4M26039x1.mo23414h4();
        }
        AbstractC5788h4 abstractC5788h4M23773k4 = m23773k4(abstractC6355x1.m26039x1(127));
        if (abstractC5788h4M23773k4 != null) {
            c5904h4.f16691to = new C11589u4(abstractC5788h4M23773k4);
        } else {
            c5904h4.f16691to = new C11589u4(C5813x1.k4.f16552yj);
        }
        AbstractC5788h4 abstractC5788h4M26039x12 = abstractC6355x1.m26039x1(119);
        c5904h4.f16690kk = abstractC5788h4M26039x12 != null ? C11071kk.m53502k4(C7019kk.m27443k4((Class<?>) C12187wp.class), abstractC5788h4M26039x12.mo23414h4()) : 0;
        c5904h4.f16692x1 = new List();
        AbstractC5788h4 abstractC5788h4M26039x13 = abstractC6355x1.m26039x1(StyleIdentifier.GRID_TABLE_5_DARK_ACCENT_3);
        if (abstractC5788h4M26039x13 != null) {
            IGenericEnumerator<AbstractC5788h4> it = ((C5796m9) abstractC5788h4M26039x13).iterator();
            while (it.hasNext()) {
                try {
                    AbstractC5788h4 next = it.next();
                    if (C7019kk.m27469x1(next, C11543x6.class)) {
                        C5908m9 c5908m9 = new C5908m9();
                        c5908m9.m23797k4(((C11543x6) next).mo23706x1());
                        c5904h4.f16692x1.addItem(c5908m9);
                    }
                } finally {
                    if (C7019kk.m27456k4((Iterator) it, (Class<IDisposable>) IDisposable.class)) {
                        it.dispose();
                    }
                }
            }
            if (zM27456k4) {
                return c5904h4;
            }
        }
        return c5904h4;
    }

    @Override // com.aspose.slides.internal.p237ks.InterfaceC5901c5
    /* JADX INFO: renamed from: k4 */
    public final String mo23764k4() {
        return this.f16689k4;
    }
}
