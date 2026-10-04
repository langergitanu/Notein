package com.aspose.slides.internal.p406ss;

import com.aspose.slides.Collections.Generic.Dictionary;
import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ss.to */
/* JADX INFO: loaded from: classes4.dex */
public class C10341to extends AbstractC3524ks {

    /* JADX INFO: renamed from: h4 */
    private Dictionary<String, C10347x1> f36819h4;

    public C10341to(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
        this.f36819h4 = null;
        ((C10345uz) abstractC3511c5).m50405k4(this);
    }

    /* JADX INFO: renamed from: du */
    public final C10347x1 m50391du(String str) {
        Dictionary<String, C10347x1> dictionary = this.f36819h4;
        if (dictionary == null) {
            return null;
        }
        C10347x1[] c10347x1Arr = {null};
        dictionary.tryGetValue(str, c10347x1Arr);
        return c10347x1Arr[0];
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        if (this.f9851to != null) {
            AbstractC3511c5.k4 k4VarMo14080ck = mo14080ck();
            while (k4VarMo14080ck.mo9764x1()) {
                AbstractC3511c5 abstractC3511c5Mo14128dy = k4VarMo14080ck.mo14128dy();
                if (C14113y2.m67363du(abstractC3511c5Mo14128dy.m14105ks(), "fo:color-profile")) {
                    C10347x1 c10347x1 = (C10347x1) abstractC3511c5Mo14128dy;
                    if (C14113y2.m67411k4(c10347x1.m50411ts())) {
                        m14118up().mo14349k4(this, c10347x1.m14105ks(), "color-profile-name", this.f9753kk);
                    } else {
                        m50390k4(c10347x1);
                    }
                }
            }
        }
        this.f9851to = null;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 13;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "declarations";
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (!C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str) || C14113y2.m67363du(str2, "color-profile")) {
            return;
        }
        m14103kk(interfaceC3757h4, str, str2);
    }

    /* JADX INFO: renamed from: k4 */
    private void m50390k4(C10347x1 c10347x1) {
        if (this.f36819h4 == null) {
            this.f36819h4 = new Dictionary<>();
        }
        if (this.f36819h4.containsKey(c10347x1.m50411ts())) {
            m14118up().mo14362x1(this, c10347x1.m14105ks(), c10347x1.m50411ts(), this.f9753kk);
        }
        this.f36819h4.addItem(c10347x1.m50411ts(), c10347x1);
    }
}
