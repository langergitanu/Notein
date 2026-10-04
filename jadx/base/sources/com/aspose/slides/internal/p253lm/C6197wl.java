package com.aspose.slides.internal.p253lm;

import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.p559ms.System.C14044b3;
import com.aspose.slides.p559ms.System.C14051ck;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.lm.wl */
/* JADX INFO: loaded from: classes4.dex */
public class C6197wl extends C6198wp {

    /* JADX INFO: renamed from: du */
    private static final C7017h4 f17515du = new C7017h4("String", "Number", "Boolean");

    /* JADX INFO: renamed from: to */
    private InterfaceC6173qw f17516to;

    public C6197wl(InterfaceC6173qw interfaceC6173qw) {
        super(interfaceC6173qw);
        this.f17516to = interfaceC6173qw;
    }

    @Override // com.aspose.slides.internal.p253lm.C6198wp
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10037k4(InterfaceC6132em interfaceC6132em, AbstractC6211yd abstractC6211yd, AbstractC6123ca[] abstractC6123caArr) {
        C6212yg c6212ygMo24977um;
        int iM67366h4;
        int iM27428k4 = f17515du.m27428k4(abstractC6123caArr[0].mo24774to());
        if (iM27428k4 == 0) {
            c6212ygMo24977um = this.f17516to.mo24977um();
            iM67366h4 = C14113y2.m67366h4(abstractC6123caArr[0].toString(), abstractC6123caArr[1].toString());
        } else if (iM27428k4 == 1) {
            c6212ygMo24977um = this.f17516to.mo24977um();
            iM67366h4 = C14044b3.m66430k4(abstractC6123caArr[0].mo24775x1(), abstractC6123caArr[1].mo24775x1());
        } else {
            if (iM27428k4 != 2) {
                return super.mo10037k4(interfaceC6132em, abstractC6211yd, abstractC6123caArr);
            }
            c6212ygMo24977um = this.f17516to.mo24977um();
            iM67366h4 = C14051ck.m66554k4(abstractC6123caArr[0].mo24772k4(), abstractC6123caArr[1].mo24772k4());
        }
        interfaceC6132em.mo10079x1(c6212ygMo24977um.m25186k4(iM67366h4));
        return C6163nh.f17403k4;
    }
}
