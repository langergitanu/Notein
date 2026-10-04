package com.aspose.slides;

import com.aspose.slides.Collections.Generic.List;
import com.aspose.slides.internal.p464vq.C11791os;

/* JADX INFO: renamed from: com.aspose.slides.e4 */
/* JADX INFO: loaded from: classes3.dex */
class C0926e4 extends ywb {
    public C0926e4(C11791os c11791os, gnb gnbVar) {
        super(c11791os, gnbVar);
    }

    /* JADX INFO: renamed from: k4 */
    public final void m5341k4(List<String> list) {
        mo3469k4(new String[0]);
        while (m55443jd().mo65026h4()) {
            if (m55443jd().mo65028jd() == 1) {
                while (m55443jd().mo65047to()) {
                    if ("xmlns".equals(m55443jd().mo65060yj()) || ("".equals(m55443jd().mo65060yj()) && "xmlns".equals(m55443jd().mo65019ck()))) {
                        String strMo65042rv = m55443jd().mo65042rv();
                        if (!list.containsItem(strMo65042rv)) {
                            list.addItem(strMo65042rv);
                        }
                    }
                }
            }
        }
        mo55330fa();
    }
}
