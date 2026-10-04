package com.aspose.slides.internal.p532yu;

import com.aspose.slides.exceptions.ArgumentNullException;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.aspose.slides.p559ms.System.C14067j2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13883dt;
import com.aspose.slides.p559ms.System.Xml.C13963qw;
import com.aspose.slides.p559ms.System.Xml.InterfaceC13980t6;

/* JADX INFO: renamed from: com.aspose.slides.internal.yu.pq */
/* JADX INFO: loaded from: classes5.dex */
public class C13157pq extends AbstractC12972ev {

    /* JADX INFO: renamed from: ak */
    private boolean f44223ak;

    /* JADX INFO: renamed from: k4 */
    private AbstractC12974ex[] f44224k4;

    /* JADX INFO: renamed from: x1 */
    private boolean f44225x1;

    public C13157pq(C12943dd c12943dd) {
        super(c12943dd);
        while (c12943dd.m60209b3() == 4) {
            c12943dd = c12943dd.m60231yd();
        }
        C13164q9[] c13164q9ArrM60618h4 = ((C12984fe) ((C13164q9) c12943dd).m61416k4()).m60618h4();
        this.f44224k4 = new AbstractC12974ex[c13164q9ArrM60618h4.length];
        for (int i = 0; i < c13164q9ArrM60618h4.length; i++) {
            this.f44224k4[i] = c13164q9ArrM60618h4[i].m60215g8();
            if (c13164q9ArrM60618h4[i].m60211bz().mo60017ck() == 1) {
                this.f44223ak = true;
            } else if (c13164q9ArrM60618h4[i].m60211bz().mo60017ck() == 0) {
                this.f44225x1 = true;
            }
        }
    }

    /* JADX INFO: renamed from: k4 */
    public static AbstractC12974ex m61408k4(C12943dd c12943dd) {
        return new C13157pq(c12943dd);
    }

    @Override // com.aspose.slides.internal.p532yu.AbstractC12974ex
    /* JADX INFO: renamed from: k4 */
    public Object mo60121k4(Object obj, AbstractC14068j5 abstractC14068j5, InterfaceC13980t6 interfaceC13980t6) {
        if (obj == null) {
            throw new ArgumentNullException("value");
        }
        if (abstractC14068j5 == null) {
            throw new ArgumentNullException("destinationType");
        }
        AbstractC14068j5 abstractC14068j5M66727k4 = C14067j2.m66727k4(obj);
        if (abstractC14068j5M66727k4 == AbstractC12972ev.f43658up && this.f44225x1) {
            return ((C12965eg) obj).mo52693k4(abstractC14068j5, interfaceC13980t6);
        }
        if (abstractC14068j5M66727k4 == AbstractC12972ev.f43643dy && this.f44223ak) {
            return C13104mi.f44112k4.mo60121k4(obj, abstractC14068j5, interfaceC13980t6);
        }
        AbstractC14068j5 abstractC14068j52 = AbstractC12972ev.f43644fa;
        if (abstractC14068j5M66727k4 != abstractC14068j52) {
            throw m60548x1(abstractC14068j5M66727k4, abstractC14068j5);
        }
        if (abstractC14068j5 == abstractC14068j52) {
            return obj;
        }
        String str = (String) obj;
        return ((C13165qa) m60503k4().m60211bz().mo60026k4(str, (AbstractC13883dt) new C13963qw(), interfaceC13980t6, true)).m61418k4().m60215g8().mo60122k4(str, abstractC14068j5, interfaceC13980t6);
    }
}
