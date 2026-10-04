package com.aspose.slides;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p294n9.C6765kp;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: loaded from: classes3.dex */
class bd4 extends axo {
    public bd4(Dictionary<Byte, vbz> dictionary, int i, mcc mccVar) {
        super(dictionary, i, mccVar);
    }

    @Override // com.aspose.slides.axo
    /* JADX INFO: renamed from: k4 */
    public String mo3789k4() {
        C6765kp c6765kp = new C6765kp();
        c6765kp.m26791k4((Object) m3790kk().get_Item((byte) 1).m72172k4());
        m4149k4(c6765kp);
        m4150k4(c6765kp, m3785du());
        m4150k4(c6765kp, m3787h4());
        return c6765kp.toString();
    }

    /* JADX INFO: renamed from: k4 */
    private void m4149k4(C6765kp c6765kp) {
        if (m3792to().m64827k4().containsKey(Integer.valueOf(m3786dy()))) {
            c6765kp.m26791k4((Object) m3792to().m64835x1().get_Item(Integer.valueOf(m3792to().m64827k4().get_Item(Integer.valueOf(m3786dy())).m5605k4())));
        }
    }

    /* JADX INFO: renamed from: k4 */
    private void m4150k4(C6765kp c6765kp, String str) {
        if (C14113y2.m67411k4(str)) {
            return;
        }
        if (c6765kp.m26807x1() != 0) {
            c6765kp.m26792k4(" ");
        }
        c6765kp.m26792k4(str);
    }
}
