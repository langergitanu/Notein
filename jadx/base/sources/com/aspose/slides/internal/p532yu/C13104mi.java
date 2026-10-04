package com.aspose.slides.internal.p532yu;

import com.aspose.slides.Collections.IEnumerable;
import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.mi */
/* JADX INFO: loaded from: classes5.dex */
public class C13104mi extends C13012h9 {

    /* JADX INFO: renamed from: k4 */
    public static final AbstractC12974ex f44112k4 = new C13104mi((AbstractC12972ev) C13296y1.f44599k4);

    /* JADX INFO: renamed from: x1 */
    public static final AbstractC12974ex f44113x1 = new C13104mi((AbstractC12972ev) C13296y1.f44600x1);

    public C13104mi(AbstractC12972ev abstractC12972ev) {
        super(abstractC12972ev);
    }

    @Override // com.aspose.slides.internal.p532yu.C13012h9, com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: k4 */
    public Object mo60121k4(Object obj, AbstractC14068j5 abstractC14068j5, InterfaceC13980t6 interfaceC13980t6) {
        if (obj == null) {
            throw new ArgumentNullException("value");
        }
        if (abstractC14068j5 == null) {
            throw new ArgumentNullException("destinationType");
        }
        if (!C7019kk.m27469x1(obj, IEnumerable.class) || C14067j2.m66727k4(obj) == AbstractC12972ev.f43644fa || C14067j2.m66727k4(obj) == AbstractC12972ev.f43660v4) {
            obj = new Object[]{obj};
        }
        return mo60547x1(obj, abstractC14068j5, interfaceC13980t6);
    }
}
