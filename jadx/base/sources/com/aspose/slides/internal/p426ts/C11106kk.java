package com.aspose.slides.internal.p426ts;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.exceptions.ArgumentException;
import com.aspose.slides.exceptions.Exception;
import com.aspose.slides.internal.p034b3.C1598to;
import com.aspose.slides.internal.p034b3.InterfaceC1607x6;
import com.aspose.slides.internal.p097e0.InterfaceC3527ne;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p393s7.InterfaceC10165yj;
import com.aspose.slides.internal.p481wp.C12231qq;
import com.aspose.slides.internal.p481wp.InterfaceC12218ck;
import com.aspose.slides.internal.p513xw.InterfaceC12731um;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ts.kk */
/* JADX INFO: loaded from: classes4.dex */
public class C11106kk implements InterfaceC11104h4 {

    /* JADX INFO: renamed from: x1 */
    private static final List<Object> f38434x1 = new List<>();

    /* JADX INFO: renamed from: k4 */
    protected C11109x1 f38435k4 = new C11109x1();

    /* JADX INFO: renamed from: kk */
    private final Dictionary<Integer, InterfaceC11103dy> f38436kk = new Dictionary<>();

    /* JADX INFO: renamed from: k4 */
    public InterfaceC11101c5 mo53637k4() {
        return null;
    }

    @Override // com.aspose.slides.internal.p426ts.InterfaceC11104h4
    /* JADX INFO: renamed from: k4 */
    public final InterfaceC11103dy mo53627k4(AbstractC14068j5 abstractC14068j5) {
        if (!C7019kk.m27443k4((Class<?>) InterfaceC11103dy.class).m66761x1(abstractC14068j5)) {
            throw new ArgumentException(C14113y2.m67408k4("Class must be an implementation of the EventProducer interface: ", abstractC14068j5.mo48629x6()));
        }
        InterfaceC11103dy[] interfaceC11103dyArr = {null};
        boolean zTryGetValue = this.f38436kk.tryGetValue(Integer.valueOf(abstractC14068j5.hashCode()), interfaceC11103dyArr);
        InterfaceC11103dy interfaceC11103dy = interfaceC11103dyArr[0];
        if (zTryGetValue) {
            return interfaceC11103dy;
        }
        InterfaceC11103dy interfaceC11103dyM53638k4 = m53638k4(abstractC14068j5, mo53637k4());
        this.f38436kk.addItem(Integer.valueOf(abstractC14068j5.hashCode()), interfaceC11103dyM53638k4);
        return interfaceC11103dyM53638k4;
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC11103dy m53638k4(AbstractC14068j5 abstractC14068j5, InterfaceC11101c5 interfaceC11101c5) {
        if (abstractC14068j5 == C7019kk.m27443k4((Class<?>) InterfaceC12731um.class)) {
            return new C11105k4();
        }
        if (abstractC14068j5 == C7019kk.m27443k4((Class<?>) InterfaceC10165yj.class)) {
            return new C11102du();
        }
        if (abstractC14068j5 == C7019kk.m27443k4((Class<?>) InterfaceC3527ne.class)) {
            return new C11108to(interfaceC11101c5);
        }
        if (abstractC14068j5 == C7019kk.m27443k4((Class<?>) InterfaceC12218ck.class)) {
            return new C12231qq();
        }
        if (abstractC14068j5 == C7019kk.m27443k4((Class<?>) InterfaceC1607x6.class)) {
            return new C1598to();
        }
        throw new Exception("Unspecified event producer");
    }
}
