package com.aspose.slides.internal.p433u1;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p213jw.C5536c5;
import com.aspose.slides.internal.p213jw.C5556up;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.u1.h4 */
/* JADX INFO: loaded from: classes4.dex */
public class C11257h4 extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f38820k4 = C7019kk.m27443k4((Class<?>) C5536c5.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f38821x1 = new C7017h4("get_severity", "get_message", "get_type", "get_relatedException", "get_relatedData", "get_location");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        C5536c5 c5536c5 = (C5536c5) abstractC6123ca.mo24769C_();
        int iM27428k4 = f38821x1.m27428k4(str);
        if (iM27428k4 == 0) {
            return m10082k4(c5536c5.m22677k4() & 255);
        }
        if (iM27428k4 == 1) {
            return m10085k4(c5536c5.m22680x1());
        }
        if (iM27428k4 == 2) {
            return m10085k4(c5536c5.m22678kk());
        }
        if (iM27428k4 == 3) {
            return m10083k4(c5536c5.m22679to());
        }
        if (iM27428k4 == 4) {
            return m10083k4(c5536c5.m22675du());
        }
        if (iM27428k4 == 5) {
            return m10084k4(c5536c5.m22676h4(), C7019kk.m27443k4((Class<?>) C5556up.class));
        }
        throw new C6208y2("unknown function");
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10033k4("severity", 1);
        m10033k4("message", 1);
        m10033k4(C18437z2.f56754h, 1);
        m10033k4("relatedException", 1);
        m10033k4("relatedData", 1);
        m10033k4("location", 1);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f38820k4;
    }
}
