package com.aspose.slides.internal.p433u1;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p213jw.C5559wl;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.u1.rv */
/* JADX INFO: loaded from: classes4.dex */
public class C11267rv extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f38837k4 = C7019kk.m27443k4((Class<?>) C5559wl.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f38838x1 = new C7017h4("get_publicId", "get_systemId", "get_notationName", "get_inputEncoding", "get_xmlEncoding", "get_xmlVersion");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        String strM22843k4;
        C5559wl c5559wl = (C5559wl) abstractC6123ca.mo24769C_();
        int iM27428k4 = f38838x1.m27428k4(str);
        if (iM27428k4 == 0) {
            strM22843k4 = c5559wl.m22843k4();
        } else if (iM27428k4 == 1) {
            strM22843k4 = c5559wl.m22846x1();
        } else if (iM27428k4 == 2) {
            strM22843k4 = c5559wl.m22844kk();
        } else if (iM27428k4 == 3) {
            strM22843k4 = c5559wl.m22845to();
        } else if (iM27428k4 == 4) {
            strM22843k4 = c5559wl.m22841du();
        } else {
            if (iM27428k4 != 5) {
                throw new C6208y2("unknown function");
            }
            strM22843k4 = c5559wl.m22842h4();
        }
        return m10085k4(strM22843k4);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: kk */
    public AbstractC14068j5 mo10034kk() {
        return C7019kk.m27443k4((Class<?>) AbstractC5535bv.class);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10033k4("publicId", 1);
        m10033k4("systemId", 1);
        m10033k4("notationName", 1);
        m10033k4("inputEncoding", 1);
        m10033k4("xmlEncoding", 1);
        m10033k4("xmlVersion", 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f38837k4;
    }
}
