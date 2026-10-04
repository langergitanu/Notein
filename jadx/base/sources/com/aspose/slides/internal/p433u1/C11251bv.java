package com.aspose.slides.internal.p433u1;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p213jw.AbstractC5535bv;
import com.aspose.slides.internal.p213jw.C5534b3;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.google.firebase.messaging.Constants;

/* JADX INFO: renamed from: com.aspose.slides.internal.u1.bv */
/* JADX INFO: loaded from: classes4.dex */
public class C11251bv extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f38808k4 = C7019kk.m27443k4((Class<?>) C5534b3.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f38809x1 = new C7017h4("get_target", "get_data", "set_data");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        String strM22615k4;
        C5534b3 c5534b3 = (C5534b3) abstractC6123ca.mo24769C_();
        int iM27428k4 = f38809x1.m27428k4(str);
        if (iM27428k4 == 0) {
            strM22615k4 = c5534b3.m22615k4();
        } else {
            if (iM27428k4 != 1) {
                if (iM27428k4 != 2) {
                    throw new C6208y2("unknown function");
                }
                if (abstractC6123caArr.length != 1) {
                    throw new C6208y2("invalid arguments count.");
                }
                c5534b3.m22616k4(abstractC6123caArr[0].toString());
                return m10080h4();
            }
            strM22615k4 = c5534b3.m22617x1();
        }
        return m10085k4(strM22615k4);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: kk */
    public AbstractC14068j5 mo10034kk() {
        return C7019kk.m27443k4((Class<?>) AbstractC5535bv.class);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10033k4("target", 1);
        m10033k4(Constants.ScionAnalytics.MessageType.DATA_MESSAGE, 3);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f38808k4;
    }
}
