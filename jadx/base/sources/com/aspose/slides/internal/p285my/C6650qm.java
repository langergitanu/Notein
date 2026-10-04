package com.aspose.slides.internal.p285my;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p182ii.C4918ne;
import com.aspose.slides.internal.p182ii.C4927sv;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.google.firebase.messaging.Constants;

/* JADX INFO: renamed from: com.aspose.slides.internal.my.qm */
/* JADX INFO: loaded from: classes4.dex */
public class C6650qm extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f18414k4 = C7019kk.m27443k4((Class<?>) C4927sv.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f18415x1 = new C7017h4("get_form", "get_defaultSelected", "set_defaultSelected", "get_text", "get_index", "get_disabled", "set_disabled", "get_label", "set_label", "get_selected", "set_selected", "get_value", "set_value");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        C4927sv c4927sv = (C4927sv) abstractC6123ca.mo24769C_();
        switch (f18415x1.m27428k4(str)) {
            case 0:
                return m10084k4(c4927sv.m20528qw(), C7019kk.m27443k4((Class<?>) C4918ne.class));
            case 1:
                return m10086k4(c4927sv.m20530tq());
            case 2:
                c4927sv.m20524k4(abstractC6123caArr[0].mo24772k4());
                break;
            case 3:
                return m10085k4(c4927sv.m20523j2());
            case 4:
                return m10082k4(c4927sv.m20531w6());
            case 5:
                return m10086k4(c4927sv.m20526os());
            case 6:
                c4927sv.m20525kk(abstractC6123caArr[0].mo24772k4());
                break;
            case 7:
                return m10085k4(c4927sv.m20522em());
            case 8:
                c4927sv.m20532wl(abstractC6123caArr[0].toString());
                break;
            case 9:
                return m10086k4(c4927sv.m20533zj());
            case 10:
                c4927sv.m20529to(abstractC6123caArr[0].mo24772k4());
                break;
            case 11:
                return m10085k4(c4927sv.m20521ai());
            case 12:
                c4927sv.m20527qq(abstractC6123caArr[0].toString());
                break;
            default:
                throw new C6208y2("unknown function");
        }
        return m10080h4();
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: kk */
    public AbstractC14068j5 mo10034kk() {
        return C7019kk.m27443k4((Class<?>) C12804k4.class);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10033k4("form", 1);
        m10033k4("defaultSelected", 3);
        m10033k4("text", 1);
        m10033k4(FirebaseAnalytics.Param.INDEX, 1);
        m10033k4("disabled", 3);
        m10033k4(Constants.ScionAnalytics.PARAM_LABEL, 3);
        m10033k4("selected", 3);
        m10033k4("value", 3);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f18414k4;
    }
}
