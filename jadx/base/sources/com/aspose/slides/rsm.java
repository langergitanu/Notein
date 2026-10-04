package com.aspose.slides;

import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p332p7.C7585en;
import com.aspose.slides.p559ms.System.C14113y2;
import com.aspose.slides.p559ms.System.Xml.AbstractC13912i5;

/* JADX INFO: loaded from: classes3.dex */
final class rsm extends C7585en {

    /* JADX INFO: renamed from: k4 */
    private static final C7017h4 f48686k4 = new C7017h4("clrMapOvr");

    public rsm() {
    }

    /* JADX INFO: renamed from: k4 */
    public static rsm m70337k4(AbstractC13912i5 abstractC13912i5) {
        String strMo65023fa = abstractC13912i5.mo65023fa();
        if (abstractC13912i5.mo65048u4()) {
            return new rsm();
        }
        rsm rsmVar = null;
        loop0: while (true) {
            boolean z = false;
            while (true) {
                if (((z && !abstractC13912i5.mo65015ar()) || abstractC13912i5.mo65026h4()) && (abstractC13912i5.mo65028jd() != 15 || !C14113y2.m67363du(abstractC13912i5.mo65023fa(), strMo65023fa))) {
                    if (abstractC13912i5.mo65028jd() == 1) {
                        if (f48686k4.m27428k4(abstractC13912i5.mo65023fa()) == 0) {
                            rsmVar = new rsm(abstractC13912i5);
                            break;
                        }
                        abstractC13912i5.mo65208bv();
                        z = true;
                    } else {
                        break;
                    }
                } else {
                    break loop0;
                }
            }
        }
        return rsmVar == null ? new rsm() : rsmVar;
    }

    private rsm(AbstractC13912i5 abstractC13912i5) {
        super(abstractC13912i5);
    }
}
