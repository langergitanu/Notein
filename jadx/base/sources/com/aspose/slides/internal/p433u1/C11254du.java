package com.aspose.slides.internal.p433u1;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p213jw.C5547ks;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p517y2.C12771k4;
import com.aspose.slides.p559ms.System.AbstractC14068j5;

/* JADX INFO: renamed from: com.aspose.slides.internal.u1.du */
/* JADX INFO: loaded from: classes4.dex */
public class C11254du extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f38814k4 = C7019kk.m27443k4((Class<?>) C12771k4.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f38815x1 = new C7017h4("setParameter", "getParameter", "canSetParameter", "get_parameterNames");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        C12771k4 c12771k4 = (C12771k4) abstractC6123ca.mo24769C_();
        int iM27428k4 = f38815x1.m27428k4(str);
        if (iM27428k4 == 0) {
            if (abstractC6123caArr.length != 2) {
                throw new C6208y2("invalid arguments count.");
            }
            c12771k4.m59454k4(abstractC6123caArr[0].toString(), abstractC6123caArr[1].mo24789D_());
            return m10080h4();
        }
        if (iM27428k4 == 1) {
            if (abstractC6123caArr.length == 1) {
                return m10083k4(c12771k4.mo59451k4(abstractC6123caArr[0].toString()));
            }
            throw new C6208y2("invalid arguments count.");
        }
        if (iM27428k4 != 2) {
            if (iM27428k4 == 3) {
                return m10084k4(c12771k4.m59453k4(), C7019kk.m27443k4((Class<?>) C5547ks.class));
            }
            throw new C6208y2("unknown function");
        }
        if (abstractC6123caArr.length == 2) {
            return m10086k4(c12771k4.m59455x1(abstractC6123caArr[0].toString(), abstractC6123caArr[1].mo24789D_()));
        }
        throw new C6208y2("invalid arguments count.");
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10035kk("setParameter");
        m10035kk("getParameter");
        m10035kk("canSetParameter");
        m10033k4("parameterNames", 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f38814k4;
    }
}
