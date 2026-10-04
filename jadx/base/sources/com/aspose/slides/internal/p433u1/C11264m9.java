package com.aspose.slides.internal.p433u1;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p213jw.C5544jd;
import com.aspose.slides.internal.p213jw.C5550ne;
import com.aspose.slides.internal.p213jw.C5552rv;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.u1.m9 */
/* JADX INFO: loaded from: classes4.dex */
public class C11264m9 extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f38833k4 = C7019kk.m27443k4((Class<?>) C5544jd.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f38834x1 = new C7017h4("hasFeature", "createDocumentType", "createDocument", "getFeature");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        C5544jd c5544jd = (C5544jd) abstractC6123ca.mo24769C_();
        int iM27428k4 = f38834x1.m27428k4(str);
        if (iM27428k4 == 0) {
            if (abstractC6123caArr.length == 2) {
                return m10086k4(c5544jd.mo22735x1(abstractC6123caArr[0].toString(), abstractC6123caArr[1].toString()));
            }
            throw new C6208y2("invalid arguments count.");
        }
        if (iM27428k4 == 1) {
            if (abstractC6123caArr.length == 3) {
                return m10084k4(c5544jd.m22729k4(abstractC6123caArr[0].toString(), abstractC6123caArr[1].toString(), abstractC6123caArr[1].toString()), C7019kk.m27443k4((Class<?>) C5550ne.class));
            }
            throw new C6208y2("invalid arguments count.");
        }
        if (iM27428k4 == 2) {
            if (abstractC6123caArr.length == 3) {
                return m10084k4(c5544jd.mo22730k4(abstractC6123caArr[0].toString(), abstractC6123caArr[1].toString(), (C5550ne) abstractC6123caArr[1].mo24789D_()), C7019kk.m27443k4((Class<?>) C5552rv.class));
            }
            throw new C6208y2("invalid arguments count.");
        }
        if (iM27428k4 != 3) {
            throw new C6208y2("unknown function");
        }
        if (abstractC6123caArr.length == 2) {
            return m10083k4(c5544jd.mo22732kk(abstractC6123caArr[0].toString(), abstractC6123caArr[0].toString()));
        }
        throw new C6208y2("invalid arguments count.");
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10035kk("hasFeature");
        m10035kk("createDocumentType");
        m10035kk("createDocument");
        m10035kk("getFeature");
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f38833k4;
    }
}
