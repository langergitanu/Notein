package com.aspose.slides.internal.p425tq;

import com.aspose.slides.internal.p523yd.C12814to;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.tq.k4 */
/* JADX INFO: loaded from: classes4.dex */
public abstract class AbstractC11086k4 {

    /* JADX INFO: renamed from: k4 */
    protected C12814to f38416k4;

    public AbstractC11086k4(C12814to c12814to) {
        this.f38416k4 = c12814to;
    }

    /* JADX INFO: renamed from: k4 */
    public final InterfaceC11078c5 m53576k4(String str) {
        InterfaceC11078c5 interfaceC11078c5M59547x6 = this.f38416k4.m59556du().m59547x6();
        if (interfaceC11078c5M59547x6 == null) {
            return null;
        }
        String strMo53572k4 = mo53572k4();
        InterfaceC11078c5[] interfaceC11078c5ArrM53537x1 = interfaceC11078c5M59547x6.m53535k4(C14113y2.m67408k4(strMo53572k4, "s")).m53537x1(strMo53572k4);
        for (InterfaceC11078c5 interfaceC11078c5 : interfaceC11078c5ArrM53537x1) {
            if (C14113y2.m67363du(interfaceC11078c5.m53536kk("mime"), str)) {
                return interfaceC11078c5;
            }
        }
        return null;
    }

    /* JADX INFO: renamed from: k4 */
    public abstract String mo53572k4();
}
