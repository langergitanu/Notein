package com.aspose.slides.p559ms.System.Xml;

import com.aspose.slides.exceptions.XmlException;
import com.aspose.slides.internal.p080dd.AbstractC3150x6;
import com.aspose.slides.internal.p103eb.C3592kk;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p474wg.InterfaceC11926c6;
import com.aspose.slides.internal.p474wg.InterfaceC11968sv;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14062gk;
import com.aspose.slides.p559ms.System.C14113y2;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: com.aspose.slides.ms.System.Xml.x0 */
/* JADX INFO: loaded from: classes5.dex */
public class C14010x0 extends AbstractC13943n5 {

    /* JADX INFO: renamed from: k4 */
    private static AtomicReference<Object> f47063k4 = new AtomicReference<>();

    /* JADX INFO: renamed from: kk */
    private InterfaceC11968sv f47064kk;

    /* JADX INFO: renamed from: to */
    private C3592kk f47065to;

    /* JADX INFO: renamed from: x1 */
    private InterfaceC11926c6 f47066x1;

    /* JADX INFO: renamed from: k4 */
    private static C13885dw m66293k4() {
        if (f47063k4.get() == null) {
            f47063k4.set(new C13885dw());
        }
        return (C13885dw) f47063k4.get();
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13943n5
    /* JADX INFO: renamed from: k4 */
    public C14062gk mo65674k4(C14062gk c14062gk, String str) {
        return super.mo65674k4(c14062gk, str);
    }

    @Override // com.aspose.slides.p559ms.System.Xml.AbstractC13943n5
    /* JADX INFO: renamed from: k4 */
    public Object mo5312k4(C14062gk c14062gk, String str, AbstractC14068j5 abstractC14068j5) {
        if (abstractC14068j5 == null || abstractC14068j5 == C7019kk.m27443k4((Class<?>) AbstractC3150x6.class) || abstractC14068j5 == C7019kk.m27443k4((Class<?>) Object.class)) {
            return m66293k4().m65271k4(c14062gk, this.f47066x1, this.f47064kk, this.f47065to);
        }
        throw new XmlException("Object type is not supported.", C14113y2.f47374k4);
    }
}
