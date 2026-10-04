package com.aspose.slides;

import com.aspose.slides.exceptions.NotSupportedException;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.C7394ca;
import com.aspose.slides.internal.p332p7.C9051vl;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class r5t {

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f48538x1 = new C7017h4("t");

    /* JADX INFO: renamed from: k4 */
    private final IPortionFormat f48539k4;

    public r5t() {
        this.f48539k4 = null;
    }

    /* JADX INFO: renamed from: k4 */
    public final C7394ca m70025k4(InterfaceC14740wj interfaceC14740wj) {
        b3y b3yVar = (b3y) interfaceC14740wj;
        String strM71587k4 = C14625ua.m71587k4(b3yVar);
        if (f48538x1.m27428k4(strM71587k4) == 0) {
            return new C7394ca(C14113y2.m67402k4("m:{0}", strM71587k4), qaz.m69505k4(b3yVar, this.f48539k4));
        }
        throw new NotSupportedException(C14113y2.m67402k4("The type {0} not yet supported", strM71587k4));
    }

    public r5t(IPortionFormat iPortionFormat) {
        this.f48539k4 = iPortionFormat;
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC14740wj m70026k4(C7394ca c7394ca) {
        String strM29539k4 = c7394ca.m29539k4();
        int iM67418kk = C14113y2.m67418kk(c7394ca.m29539k4(), ':');
        if (iM67418kk != -1) {
            strM29539k4 = C14113y2.m67422kk(c7394ca.m29539k4(), iM67418kk + 1);
        }
        if (f48538x1.m27428k4(strM29539k4) == 0) {
            return qaz.m69504k4((C9051vl) c7394ca.m29541kk());
        }
        throw new NotSupportedException(C14113y2.m67402k4("The type {0} not yet supported", c7394ca.m29539k4()));
    }
}
