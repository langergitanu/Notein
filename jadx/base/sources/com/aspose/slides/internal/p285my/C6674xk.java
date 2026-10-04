package com.aspose.slides.internal.p285my;

import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p182ii.C4892c6;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.google.firebase.analytics.FirebaseAnalytics;

/* JADX INFO: renamed from: com.aspose.slides.internal.my.xk */
/* JADX INFO: loaded from: classes4.dex */
public class C6674xk extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f18462k4 = C7019kk.m27443k4((Class<?>) C4892c6.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f18463x1 = new C7017h4("get_content", "set_content", "get_httpEquiv", "set_httpEquiv", "get_name", "set_name", "get_scheme", "set_scheme");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        String strM20304qw;
        C4892c6 c4892c6 = (C4892c6) abstractC6123ca.mo24769C_();
        switch (f18463x1.m27428k4(str)) {
            case 0:
                strM20304qw = c4892c6.m20304qw();
                return m10085k4(strM20304qw);
            case 1:
                c4892c6.m20308wl(abstractC6123caArr[0].toString());
                return m10080h4();
            case 2:
                strM20304qw = c4892c6.m20305tq();
                return m10085k4(strM20304qw);
            case 3:
                c4892c6.m20303qq(abstractC6123caArr[0].toString());
                return m10080h4();
            case 4:
                strM20304qw = c4892c6.m20302j2();
                return m10085k4(strM20304qw);
            case 5:
                c4892c6.m20301ar(abstractC6123caArr[0].toString());
                return m10080h4();
            case 6:
                strM20304qw = c4892c6.m20307w6();
                return m10085k4(strM20304qw);
            case 7:
                c4892c6.m20306um(abstractC6123caArr[0].toString());
                return m10080h4();
            default:
                throw new C6208y2("unknown function");
        }
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: kk */
    public AbstractC14068j5 mo10034kk() {
        return C7019kk.m27443k4((Class<?>) C12804k4.class);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1946kk
    /* JADX INFO: renamed from: x1 */
    public void mo10027x1() {
        m10033k4(FirebaseAnalytics.Param.CONTENT, 3);
        m10033k4("httpEquiv", 3);
        m10033k4("name", 3);
        m10033k4("scheme", 3);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f18462k4;
    }
}
