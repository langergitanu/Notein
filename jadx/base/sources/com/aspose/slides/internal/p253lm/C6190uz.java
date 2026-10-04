package com.aspose.slides.internal.p253lm;

import com.aspose.slides.Collections.ArrayList;
import com.aspose.slides.p559ms.System.C14116yg;
import java.util.Comparator;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.uz */
/* JADX INFO: loaded from: classes4.dex */
public class C6190uz implements Comparator<AbstractC6123ca> {

    /* JADX INFO: renamed from: k4 */
    private InterfaceC6132em f17504k4;

    /* JADX INFO: renamed from: x1 */
    private C6198wp f17505x1;

    public C6190uz(InterfaceC6132em interfaceC6132em, C6198wp c6198wp) {
        this.f17504k4 = interfaceC6132em;
        this.f17505x1 = c6198wp;
    }

    @Override // java.util.Comparator
    /* JADX INFO: renamed from: k4, reason: merged with bridge method [inline-methods] */
    public final int compare(AbstractC6123ca abstractC6123ca, AbstractC6123ca abstractC6123ca2) {
        m25073k4().mo10048k4(m25074x1());
        ArrayList arrayList = new ArrayList();
        arrayList.addItem(new C6127dl(abstractC6123ca, 1));
        arrayList.addItem(new C6127dl(abstractC6123ca2, 1));
        new C6215yo(arrayList).mo24749k4((InterfaceC6166os) m25073k4());
        return C14116yg.m67472h4(m25073k4().mo10039c5().mo24775x1());
    }

    /* JADX INFO: renamed from: x1 */
    public final C6198wp m25074x1() {
        return this.f17505x1;
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC6132em m25073k4() {
        return this.f17504k4;
    }
}
