package com.aspose.slides.internal.p145g8;

import com.aspose.slides.internal.p097e0.AbstractC3511c5;
import com.aspose.slides.internal.p097e0.AbstractC3533um;
import com.aspose.slides.internal.p111em.InterfaceC3757h4;
import com.aspose.slides.internal.p111em.InterfaceC3760kk;
import com.aspose.slides.internal.p406ss.C10345uz;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: renamed from: com.aspose.slides.internal.g8.k4 */
/* JADX INFO: loaded from: classes.dex */
public class C4226k4 extends AbstractC3511c5 {

    /* JADX INFO: renamed from: du */
    private C10345uz f11528du;

    /* JADX INFO: renamed from: to */
    private String f11529to;

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: dy */
    public void mo14081dy() {
        this.f11528du.m50402k4(this);
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14094k4(InterfaceC3757h4 interfaceC3757h4, String str, String str2) {
        m14103kk(interfaceC3757h4, str, str2);
    }

    /* JADX INFO: renamed from: m9 */
    public final String m17024m9() {
        return this.f11529to;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: ne */
    public String mo14108ne() {
        return "http://xmlgraphics.apache.org/fop/extensions";
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: rv */
    public String mo14114rv() {
        return FirebaseAnalytics.Param.DESTINATION;
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: x6 */
    public String mo14125x6() {
        return "fox";
    }

    @Override // com.aspose.slides.internal.p097e0.AbstractC3511c5
    /* JADX INFO: renamed from: k4 */
    public void mo14098k4(String str, InterfaceC3757h4 interfaceC3757h4, InterfaceC3760kk interfaceC3760kk, AbstractC3533um abstractC3533um) {
        String strMo15082to = interfaceC3760kk.mo15082to("internal-destination");
        this.f11529to = strMo15082to;
        if (strMo15082to == null || strMo15082to.length() == 0) {
            m14104kk("internal-destination");
        }
    }
}
