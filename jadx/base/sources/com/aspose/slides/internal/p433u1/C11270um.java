package com.aspose.slides.internal.p433u1;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p213jw.C5548lr;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.u1.um */
/* JADX INFO: loaded from: classes4.dex */
public class C11270um extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f38842k4 = C7019kk.m27443k4((Class<?>) C5548lr.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f38843x1 = new C7017h4("get_publicId", "get_systemId");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        String strM22762k4;
        C5548lr c5548lr = (C5548lr) abstractC6123ca.mo24769C_();
        int iM27428k4 = f38843x1.m27428k4(str);
        if (iM27428k4 == 0) {
            strM22762k4 = c5548lr.m22762k4();
        } else {
            if (iM27428k4 != 1) {
                throw new C6208y2("unknown function");
            }
            strM22762k4 = c5548lr.m22763x1();
        }
        return m10085k4(strM22762k4);
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
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f38842k4;
    }
}
