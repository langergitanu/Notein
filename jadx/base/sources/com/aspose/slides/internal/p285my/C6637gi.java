package com.aspose.slides.internal.p285my;

import androidx.core.app.NotificationCompat;
import com.aspose.slides.internal.p055c4.AbstractC1943dy;
import com.aspose.slides.internal.p182ii.C4928t6;
import com.aspose.slides.internal.p253lm.AbstractC6123ca;
import com.aspose.slides.internal.p253lm.C6208y2;
import com.aspose.slides.internal.p314oc.C7017h4;
import com.aspose.slides.internal.p314oc.C7019kk;
import com.aspose.slides.internal.p521y9.C12804k4;
import com.aspose.slides.p559ms.System.AbstractC14068j5;
import com.huawei.hms.network.embedded.C18437z2;

/* JADX INFO: renamed from: com.aspose.slides.internal.my.gi */
/* JADX INFO: loaded from: classes4.dex */
public class C6637gi extends AbstractC1943dy {

    /* JADX INFO: renamed from: k4 */
    private static final AbstractC14068j5 f18389k4 = C7019kk.m27443k4((Class<?>) C4928t6.class);

    /* JADX INFO: renamed from: x1 */
    private static final C7017h4 f18390x1 = new C7017h4("get_text", "set_text", "get_htmlFor", "set_htmlFor", "get_event", "set_event", "get_charset", "set_charset", "get_defer", "set_defer", "get_src", "set_src", "get_type", "set_type");

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC6123ca mo10029k4(String str, AbstractC6123ca abstractC6123ca, AbstractC6123ca[] abstractC6123caArr) {
        C4928t6 c4928t6 = (C4928t6) abstractC6123ca.mo24769C_();
        switch (f18390x1.m27428k4(str)) {
            case 0:
                return m10085k4(c4928t6.m20541qw());
            case 1:
                c4928t6.m20546wl(abstractC6123caArr[0].toString());
                break;
            case 2:
                return m10085k4(c4928t6.m20542tq());
            case 3:
                c4928t6.m20540qq(abstractC6123caArr[0].toString());
                break;
            case 4:
                return m10085k4(c4928t6.m20537j2());
            case 5:
                c4928t6.m20534ar(abstractC6123caArr[0].toString());
                break;
            case 6:
                return m10085k4(c4928t6.m20545w6());
            case 7:
                c4928t6.m20543um(abstractC6123caArr[0].toString());
                break;
            case 8:
                return m10086k4(c4928t6.m20539os());
            case 9:
                c4928t6.m20538k4(abstractC6123caArr[0].mo24772k4());
                break;
            case 10:
                return m10085k4(c4928t6.m20536em());
            case 11:
                c4928t6.m20535bv(abstractC6123caArr[0].toString());
                break;
            case 12:
                return m10085k4(c4928t6.m20547zj());
            case 13:
                c4928t6.m20544v4(abstractC6123caArr[0].toString());
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
        m10033k4("text", 3);
        m10033k4("htmlFor", 3);
        m10033k4(NotificationCompat.CATEGORY_EVENT, 3);
        m10033k4("charset", 3);
        m10033k4("defer", 3);
        m10033k4("src", 3);
        m10033k4(C18437z2.f56754h, 3);
    }

    @Override // com.aspose.slides.internal.p055c4.AbstractC1943dy
    /* JADX INFO: renamed from: k4 */
    public AbstractC14068j5 mo10030k4() {
        return f18389k4;
    }
}
