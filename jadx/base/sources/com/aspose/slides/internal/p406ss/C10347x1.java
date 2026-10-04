package com.aspose.slides.internal.p406ss;

import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3524ks;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.p559ms.System.C14113y2;

/* JADX INFO: renamed from: com.aspose.slides.internal.ss.x1 */
/* JADX INFO: loaded from: classes4.dex */
public class C10347x1 extends AbstractC3524ks {

    /* JADX INFO: renamed from: dy */
    private int f36838dy;

    /* JADX INFO: renamed from: h4 */
    private String f36839h4;

    /* JADX INFO: renamed from: m9 */
    private String f36840m9;

    public C10347x1(AbstractC3511c5 abstractC3511c5) {
        super(abstractC3511c5);
    }

    /* JADX INFO: renamed from: e0 */
    public final String m50410e0() {
        return this.f36839h4;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ix */
    public int mo14084ix() {
        return 11;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3524ks, com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14090k4(AbstractC3533um abstractC3533um) {
        this.f36839h4 = abstractC3533um.m14402to(232).mo9926j_();
        this.f36840m9 = abstractC3533um.m14402to(73).mo9926j_();
        this.f36838dy = abstractC3533um.m14402to(204).mo17251du();
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return "color-profile";
    }

    /* JADX INFO: renamed from: ts */
    public final String m50411ts() {
        return this.f36840m9;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        if (C14113y2.m67363du("http://www.w3.org/1999/XSL/Format", str)) {
            m14103kk(interfaceC3757h4, str, str2);
        }
    }
}
